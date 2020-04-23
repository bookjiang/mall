package com.zhiqiang.mall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhiqiang.mall.bean.UmsAdmin;
import com.zhiqiang.mall.commonbean.CommonResult;
import com.zhiqiang.mall.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * @description: 后台用户管理接口
 * @param:
 * @return:
 * @author: zhiqiang
 * @time: 2020/4/20 23:12
 */

@Api(value = "AdminController-后台管理员接口")
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Reference
    private UmsAdminService umsAdminService;


    @ApiOperation(value = "新增管理员")
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<UmsAdmin> register(@Valid @RequestBody  UmsAdmin umsAdmin, BindingResult result)
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




}
