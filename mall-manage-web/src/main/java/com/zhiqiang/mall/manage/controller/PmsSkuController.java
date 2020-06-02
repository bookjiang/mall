package com.zhiqiang.mall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;

import com.zhiqiang.mall.bean.PmsSkuStock;
import com.zhiqiang.mall.commonbean.CommonResult;
import com.zhiqiang.mall.service.PmsSkuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: PmsSkuController
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/21 10:00
 */
@CrossOrigin
@Api(value = "PmsSkuController-后台商品sku接口")
@Controller
@RequestMapping("/sku")
public class PmsSkuController {
    @Reference
    private PmsSkuService pmsSkuService;

    @ApiOperation("根据商品编号及编号模糊搜索sku库存")
    @RequestMapping(value = "/{pid}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsSkuStock>> getList(@PathVariable Long pid, @RequestParam(value = "keyword",required = false) String keyword) {
        List<PmsSkuStock> skuList = pmsSkuService.getList(pid, keyword);
        return CommonResult.success(skuList);
    }



}
