package com.zhiqiang.mall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sun.xml.internal.bind.v2.TODO;
import com.zhiqiang.mall.bean.UmsMember;
import com.zhiqiang.mall.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(value = "User用户管理接口")
public class UserController {
   @Reference
    UmsMemberService umsMemberService;

    /**
     * @description: TODO

     * @return:
     * @author: zhiqiang
     * @time: 2020/4/20 22:37
     */
    @RequestMapping("getAllUser")
    @ResponseBody
    @ApiOperation(value = "获得所有用户")
    public List<UmsMember>  getAllUser()
    {
       List<UmsMember> umsMembers= umsMemberService.getAllUser();
        return umsMembers;
    }
    @RequestMapping("index")
    @ResponseBody
    @ApiOperation(value = "默认界面")
    public String  index()
    {

        return "hello user";
    }
}
