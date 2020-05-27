package com.zhiqiang.mall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhiqiang.mall.bean.UmsMemberLevel;
import com.zhiqiang.mall.commonbean.CommonResult;
import com.zhiqiang.mall.service.UmsMemberLevelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: UmsMemberLevelController会员等级管理
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/3 11:09
 */
@CrossOrigin
@Api(value = "UmsMemberLevelController-会员等级管理")
@Controller
@RequestMapping("/memberLevel")
public class UmsMemberLevelController {
    @Reference
    private UmsMemberLevelService memberLevelService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ApiOperation("查询所有会员等级")
    @ResponseBody
    public CommonResult<List<UmsMemberLevel>> list(@RequestParam("defaultStatus") Integer defaultStatus) {
        List<UmsMemberLevel> memberLevelList = memberLevelService.list(defaultStatus);
        return CommonResult.success(memberLevelList);
    }
}
