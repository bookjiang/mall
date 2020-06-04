package com.zhiqiang.mall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhiqiang.mall.bean.OmsOrderSetting;
import com.zhiqiang.mall.commonbean.CommonResult;
import com.zhiqiang.mall.service.OmsOrderService;
import com.zhiqiang.mall.service.OmsOrderSettingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: OmsOrderSettingController订单设置
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/3 22:42
 */
@CrossOrigin
@Controller
@Api(tags = "OmsOrderSettingController", description = "订单设置管理")
@RequestMapping("/orderSetting")
public class OmsOrderSettingController {
    @Reference
    private OmsOrderSettingService orderSettingService;
    @ApiOperation("获取指定订单设置")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<OmsOrderSetting> getItem(@PathVariable Long id) {
        OmsOrderSetting orderSetting = orderSettingService.getItem(id);
        return CommonResult.success(orderSetting);
    }

    @ApiOperation("修改指定订单设置")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable Long id, @RequestBody OmsOrderSetting orderSetting) {
        int count = orderSettingService.update(id,orderSetting);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }
}
