package com.zhiqiang.mall.user.controller;

import com.zhiqiang.mall.bean.UmsMember;
import com.zhiqiang.mall.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UmsMemberService umsMemberService;

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember>  getAllUser()
    {
       List<UmsMember> umsMembers= umsMemberService.getAllUser();
        return umsMembers;
    }
    @RequestMapping("index")
    @ResponseBody
    public String  index()
    {

        return "hello user";
    }
}
