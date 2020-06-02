package com.zhiqiang.mall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.PmsProduct;
import com.zhiqiang.mall.commonbean.CommonPage;
import com.zhiqiang.mall.commonbean.CommonResult;
import com.zhiqiang.mall.model.PmsProductResult;
import com.zhiqiang.mall.model.ProductQueryParams;
import com.zhiqiang.mall.service.PmsProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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

        //System.out.println(productQueryParam.toString());
       // System.out.println("pageSize"+pageSize+"pageNum"+pageNum);
        PageInfo<PmsProduct> List = pmsProductService.listAll(productQueryParam, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(List));
    }

    @ApiOperation("根据商品名称或货号模糊查询")
    @RequestMapping(value = "/simpleList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsProduct>> getList(String keyword) {

        List<PmsProduct> productList = pmsProductService.list(keyword);
        return CommonResult.success(productList);
    }


//    @ApiOperation("添加商品")
//    @RequestMapping(value = "/create", method = RequestMethod.POST)
//    @ResponseBody
//    public CommonResult create(@RequestBody PmsProductParam productParam, BindingResult bindingResult) {
//        int count = pmsProductService.create(productParam);
//        if (count > 0) {
//            return CommonResult.success(count);
//        } else {
//            return CommonResult.failed();
//        }
//    }


    @ApiOperation("批量上下架")
    @RequestMapping(value = "/update/publishStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updatePublishStatus(@RequestParam("ids") List<Long> ids,
                                            @RequestParam("publishStatus") Integer publishStatus) {
        int count = pmsProductService.updatePublishStatus(ids, publishStatus);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("批量推荐商品")
    @RequestMapping(value = "/update/recommendStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateRecommendStatus(@RequestParam("ids") List<Long> ids,
                                              @RequestParam("recommendStatus") Integer recommendStatus) {
        int count = pmsProductService.updateRecommendStatus(ids, recommendStatus);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("批量设为新品")
    @RequestMapping(value = "/update/newStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateNewStatus(@RequestParam("ids") List<Long> ids,
                                        @RequestParam("newStatus") Integer newStatus) {
        int count = pmsProductService.updateNewStatus(ids, newStatus);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("批量修改删除状态")
    @RequestMapping(value = "/update/deleteStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateDeleteStatus(@RequestParam("ids") List<Long> ids,
                                           @RequestParam("deleteStatus") Integer deleteStatus) {
        int count = pmsProductService.updateDeleteStatus(ids, deleteStatus);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("根据商品id获取商品编辑信息")
    @RequestMapping(value = "/updateInfo/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<PmsProductResult> getUpdateInfo(@PathVariable Long id) {
        PmsProductResult productResult = pmsProductService.getUpdateInfo(id);
        return CommonResult.success(productResult);
    }

}
