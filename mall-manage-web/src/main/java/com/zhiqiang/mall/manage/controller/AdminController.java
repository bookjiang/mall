package com.zhiqiang.mall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhiqiang.mall.bean.UmsAdmin;
import com.zhiqiang.mall.bean.UmsAdminLogin;
import com.zhiqiang.mall.bean.UmsRole;
import com.zhiqiang.mall.commonbean.CommonPage;
import com.zhiqiang.mall.commonbean.CommonResult;
import com.zhiqiang.mall.service.UmsAdminService;
import com.zhiqiang.mall.util.JwtTokenUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 后台用户管理接口
 * @param:
 * @return:
 * @author: zhiqiang
 * @time: 2020/4/20 23:12
 */
@CrossOrigin
@Api(value = "AdminController-后台管理员接口")
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Reference
    private UmsAdminService umsAdminService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    JwtTokenUtil jwtTokenUtil=new JwtTokenUtil();


    @ApiOperation(value = "新增管理员")
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<UmsAdmin> register(@Valid @RequestBody  UmsAdmin umsAdmin, BindingResult result)
    {
        //返回参数检验错误信息
        if(result.hasErrors())
        {
            System.out.println("df"+umsAdmin.toString());
            String notes="总共有"+result.getErrorCount()+"处错误，分别为";
            for(int i=0;i<result.getErrorCount();i++)
            {

                notes=notes+result.getFieldErrors().get(i).getDefaultMessage()+";";
            }
            return CommonResult.validateFailed(notes);
        }
        int t=umsAdminService.register(umsAdmin);
        if(t==0)//0表示注册失败，1表示用户已存在，2表示成功
        {
            return CommonResult.failed();
        }
        else if(t==1)
        {
            return CommonResult.failed("用户已存在");
        }

        return CommonResult.success(null,"success");
    }

    @ApiOperation(value = "登录，并返回Token")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestBody UmsAdminLogin umsAdminLogin, BindingResult result)
    {
        if(result.hasErrors())
        {
            String notes="总共有"+result.getErrorCount()+"处错误，分别为";
            for(int i=0;i<result.getErrorCount();i++)
            {

                notes=notes+result.getFieldErrors().get(i).getDefaultMessage()+";";
            }
            return CommonResult.validateFailed(notes);
        }

        //因为在service中无法获得，所以这里获取然后传入
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //requst又无法序列化
        Map<String, String> tokenMap1 = new HashMap<>();
        tokenMap1.put("ip",request.getRemoteAddr());
        tokenMap1.put("addr",request.getRequestURI());
        tokenMap1.put("agent",request.getRemoteUser());
        String token=umsAdminService.login(umsAdminLogin.getUsername(),umsAdminLogin.getPassword(),tokenMap1);
        if(token==null)
        {
            return CommonResult.validateFailed("用户名或密码错误");

        }

        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);

    }


    @ApiOperation(value = "获取当前登录用户信息")
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAdminInfo(@RequestHeader(name="Authorization") String authorization) {
        String [] arr= authorization.split("\\s+");
        String token=arr[1];
        //System.out.println(token);
        Principal principal=null;
        if(token==null){
            return CommonResult.unauthorized(null);
        }
        String username = jwtTokenUtil.getUserNameFromToken(token);
        UmsAdmin umsAdmin = umsAdminService.getAdminByUsername(username);
        Map<String, Object> data = new HashMap<>();
        data.put("username", umsAdmin.getUsername());
        data.put("roles", new String[]{"TEST"});
        //List<UmsRole> umsRoleList;
        //UmsRole umsRole1=new UmsRole();
        //data.put("menus", roleService.getMenuList(umsAdmin.getId()));
        //String menus=[{"id":1,"parentId":0,"createTime":"2020-02-02T06:50:36.000+0000","title":"商品","level":0,"sort":0,"name":"pms","icon":"product","hidden":0},{"id":2,"parentId":1,"createTime":"2020-02-02T06:51:50.000+0000","title":"商品列表","level":1,"sort":0,"name":"product","icon":"product-list","hidden":0},{"id":3,"parentId":1,"createTime":"2020-02-02T06:52:44.000+0000","title":"添加商品","level":1,"sort":0,"name":"addProduct","icon":"product-add","hidden":0},{"id":4,"parentId":1,"createTime":"2020-02-02T06:53:51.000+0000","title":"商品分类","level":1,"sort":0,"name":"productCate","icon":"product-cate","hidden":0},{"id":5,"parentId":1,"createTime":"2020-02-02T06:54:51.000+0000","title":"商品类型","level":1,"sort":0,"name":"productAttr","icon":"product-attr","hidden":0},{"id":6,"parentId":1,"createTime":"2020-02-02T06:56:29.000+0000","title":"品牌管理","level":1,"sort":0,"name":"brand","icon":"product-brand","hidden":0},{"id":7,"parentId":0,"createTime":"2020-02-02T08:54:07.000+0000","title":"订单","level":0,"sort":0,"name":"oms","icon":"order","hidden":0},{"id":8,"parentId":7,"createTime":"2020-02-02T08:55:18.000+0000","title":"订单列表","level":1,"sort":0,"name":"order","icon":"product-list","hidden":0},{"id":9,"parentId":7,"createTime":"2020-02-02T08:56:46.000+0000","title":"订单设置","level":1,"sort":0,"name":"orderSetting","icon":"order-setting","hidden":0},{"id":10,"parentId":7,"createTime":"2020-02-02T08:57:39.000+0000","title":"退货申请处理","level":1,"sort":0,"name":"returnApply","icon":"order-return","hidden":0},{"id":11,"parentId":7,"createTime":"2020-02-02T08:59:40.000+0000","title":"退货原因设置","level":1,"sort":0,"name":"returnReason","icon":"order-return-reason","hidden":0},{"id":12,"parentId":0,"createTime":"2020-02-04T08:18:00.000+0000","title":"营销","level":0,"sort":0,"name":"sms","icon":"sms","hidden":0},{"id":13,"parentId":12,"createTime":"2020-02-04T08:19:22.000+0000","title":"秒杀活动列表","level":1,"sort":0,"name":"flash","icon":"sms-flash","hidden":0},{"id":14,"parentId":12,"createTime":"2020-02-04T08:20:16.000+0000","title":"优惠券列表","level":1,"sort":0,"name":"coupon","icon":"sms-coupon","hidden":0},{"id":16,"parentId":12,"createTime":"2020-02-07T08:22:38.000+0000","title":"品牌推荐","level":1,"sort":0,"name":"homeBrand","icon":"product-brand","hidden":0},{"id":17,"parentId":12,"createTime":"2020-02-07T08:23:14.000+0000","title":"新品推荐","level":1,"sort":0,"name":"homeNew","icon":"sms-new","hidden":0},{"id":18,"parentId":12,"createTime":"2020-02-07T08:26:38.000+0000","title":"人气推荐","level":1,"sort":0,"name":"homeHot","icon":"sms-hot","hidden":0},{"id":19,"parentId":12,"createTime":"2020-02-07T08:28:16.000+0000","title":"专题推荐","level":1,"sort":0,"name":"homeSubject","icon":"sms-subject","hidden":0},{"id":20,"parentId":12,"createTime":"2020-02-07T08:28:42.000+0000","title":"广告列表","level":1,"sort":0,"name":"homeAdvertise","icon":"sms-ad","hidden":0},{"id":21,"parentId":0,"createTime":"2020-02-07T08:29:13.000+0000","title":"权限","level":0,"sort":0,"name":"ums","icon":"ums","hidden":0},{"id":22,"parentId":21,"createTime":"2020-02-07T08:29:51.000+0000","title":"用户列表","level":1,"sort":0,"name":"admin","icon":"ums-admin","hidden":0},{"id":23,"parentId":21,"createTime":"2020-02-07T08:30:13.000+0000","title":"角色列表","level":1,"sort":0,"name":"role","icon":"ums-role","hidden":0},{"id":24,"parentId":21,"createTime":"2020-02-07T08:30:53.000+0000","title":"菜单列表","level":1,"sort":0,"name":"menu","icon":"ums-menu","hidden":0},{"id":25,"parentId":21,"createTime":"2020-02-07T08:31:13.000+0000","title":"资源列表","level":1,"sort":0,"name":"resource","icon":"ums-resource","hidden":0}]";
        data.put("menus", "");
        data.put("icon", umsAdmin.getIcon());
        return CommonResult.success(data);
    }

    @ApiOperation(value = "刷新token")
    @RequestMapping(value = "/refreshToken", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult refreshToken(HttpServletRequest request) {
        String token = request.getHeader(tokenHeader);
        //System.out.println(token);
        String refreshToken = umsAdminService.refreshToken(token);
        if (refreshToken == null) {
            return CommonResult.failed("token过期");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", refreshToken);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }

    @ApiOperation(value = "登出功能")
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult logout() {
        return CommonResult.success(null);
    }


    @ApiOperation("获取指定用户信息")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<UmsAdmin> getItem(@PathVariable Long id) {
        UmsAdmin admin = umsAdminService.getItem(id);
        return CommonResult.success(admin);
    }

    @ApiOperation("根据用户名分页获取用户列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<UmsAdmin>> list(@RequestParam(value = "keyword", required = false) String keyword,
                                                   @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                   @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<UmsAdmin> adminList = umsAdminService.list(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(adminList));
    }
}
