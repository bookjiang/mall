package com.zhiqiang.mall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhiqiang.mall.commonbean.CommonResult;
import com.zhiqiang.mall.model.PmsProductCategoryWithChildrenItem;
import com.zhiqiang.mall.service.PmsProductClassifyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName: PmsProductClassifyController
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/2 18:15
 */
@CrossOrigin
@Api(value = "PmsProductClassifyController-后台商品分类管理接口")
@Controller
@RequestMapping("/productCategory")
public class PmsProductClassifyController {
    @Reference
    PmsProductClassifyService pmsProductClassifyService;

    @ApiOperation("查询所有一级分类及子分类")
    @RequestMapping(value = "/list/withChildren", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsProductCategoryWithChildrenItem>> listWithChildren() {
        List<PmsProductCategoryWithChildrenItem> list = pmsProductClassifyService.listWithChildren();
        return CommonResult.success(list);
    }

}
