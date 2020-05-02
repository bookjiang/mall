package com.zhiqiang.mall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.PmsProduct;
import com.zhiqiang.mall.bean.ProductQueryParams;
import com.zhiqiang.mall.commonbean.CommonPage;
import com.zhiqiang.mall.commonbean.CommonResult;
import com.zhiqiang.mall.service.PmsProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: PmsProductController
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/1 21:32
 */
@CrossOrigin
@Api(value = "PmsProductController-后台商品接口")
@Controller
@RequestMapping("/product")
public class PmsProductController {
    @Reference
    private PmsProductService pmsProductService;

//    public CommonResult<CommonPage<PmsProduct>> getList(@RequestParam(value = "publishStatus", required = false) int publishStatus,
//                                                        @RequestParam(value = "verifyStatus", required = false) int verifyStatus,
//                                                        @RequestParam(value = "keyword", required = false) String keyword,
//                                                        @RequestParam(value = "productSn", required = false) String productSn,
//                                                        @RequestParam(value = "productCategoryId", required = false) Long productCategoryId,
//                                                        @RequestParam(value = "brandId", required = false) Long brandId,
//                                                        @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
//                                                        @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
//用类简便些

    @ApiOperation("商品列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<PmsProduct>> getList(ProductQueryParams productQueryParam,
                                                        @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                        @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {

       // System.out.println(productQueryParam.toString());
       // System.out.println("pageSize"+pageSize+"pageNum"+pageNum);
        PageInfo<PmsProduct> List = pmsProductService.listAll(productQueryParam, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(List));
    }


}
