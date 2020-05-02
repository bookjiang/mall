package com.zhiqiang.mall.product.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.PmsProduct;
import com.zhiqiang.mall.bean.PmsProductExample;
import com.zhiqiang.mall.bean.ProductQueryParams;
import com.zhiqiang.mall.bean.UmsAdmin;
import com.zhiqiang.mall.service.PmsProductService;
import com.zhiqiang.mall.user.mapper.PmsProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @ClassName: PmsProductServiceImpl
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/1 22:09
 */
@Service
public class PmsProductServiceImpl implements PmsProductService {
    @Autowired
    PmsProductMapper pmsProductMapper;
    @Override
    public PageInfo<PmsProduct> listAll(ProductQueryParams productQueryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        PmsProductExample pmsProductExample = new PmsProductExample();
        PmsProductExample.Criteria criteria = pmsProductExample.createCriteria();
        criteria.andDeleteStatusEqualTo(0);
        if (productQueryParam.getPublishStatus() != null) {
            criteria.andPublishStatusEqualTo(productQueryParam.getPublishStatus());
        }
        if (productQueryParam.getVerifyStatus() != null) {
            criteria.andCheckStatusEqualTo((productQueryParam.getVerifyStatus()));
        }
        if (!StringUtils.isEmpty(productQueryParam.getKeyword())) {
            criteria.andNameLike("%" + productQueryParam.getKeyword() + "%");
        }
        if (!StringUtils.isEmpty(productQueryParam.getProductSn())) {
            criteria.andProductSnEqualTo(productQueryParam.getProductSn());
        }
        if (productQueryParam.getBrandId() != null) {
            criteria.andBrandIdEqualTo(productQueryParam.getBrandId());
        }
        if (productQueryParam.getProductCategoryId() != null) {
            criteria.andProductClassifyIdEqualTo(productQueryParam.getProductCategoryId());
        }
        List<PmsProduct> list=pmsProductMapper.selectByExample(pmsProductExample);
        //开始调试只有俩个数据是因为deletestatus为0表示未删除，而自动生成的测试数据只有俩个为0；
//        for (int i=0;i<pmsProductExample.getOredCriteria().size();i++)
//        { System.out.println(pmsProductExample.getOredCriteria().get(i).toString());}
        PageInfo<PmsProduct> pageInfo = new PageInfo<PmsProduct>(list);
        return pageInfo;

    }



}
