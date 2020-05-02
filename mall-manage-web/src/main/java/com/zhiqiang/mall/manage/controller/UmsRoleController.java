package com.zhiqiang.mall.manage.controller;

import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.UmsAdmin;
import com.zhiqiang.mall.commonbean.CommonPage;
import com.zhiqiang.mall.commonbean.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: UmsRoleController
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/1 21:10
 */
@CrossOrigin
@Api(value = "UmsRoleController-用户权限管理员接口")//TODO
@Controller
@RequestMapping("/role")
public class UmsRoleController {
    @ApiOperation("获取用户权限")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<UmsAdmin>> list() {

        return CommonResult.success(null);
    }

}
