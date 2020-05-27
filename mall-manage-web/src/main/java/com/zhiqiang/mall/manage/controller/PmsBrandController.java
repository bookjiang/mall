package com.zhiqiang.mall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.PmsBrand;
import com.zhiqiang.mall.bean.PmsProduct;
import com.zhiqiang.mall.commonbean.CommonPage;
import com.zhiqiang.mall.commonbean.CommonResult;
import com.zhiqiang.mall.service.PmsBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: PmsBrandController品牌功能
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/2 17:48
 */
@CrossOrigin
@Api(value = "PmsBrandController-后台品牌管理接口")
@Controller
@RequestMapping("/brand")
public class PmsBrandController {
    @Reference
    private PmsBrandService pmsBrandService;

    @ApiOperation(value = "根据品牌名称分页获取品牌列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<PmsBrand>> getList(@RequestParam(value = "keyword", required = false) String keyword,
                                                      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                      @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {

        PageInfo<PmsBrand> List = pmsBrandService.listBrand(keyword, pageNum, pageSize);
        //System.out.println(List.getList().get(1).toString());
        return CommonResult.success(CommonPage.restPage(List));
    }


}
