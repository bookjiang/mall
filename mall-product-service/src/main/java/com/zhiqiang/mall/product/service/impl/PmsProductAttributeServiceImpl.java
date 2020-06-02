package com.zhiqiang.mall.product.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.zhiqiang.mall.bean.PmsProduct;
import com.zhiqiang.mall.bean.PmsProductAttribute;
import com.zhiqiang.mall.bean.PmsProductAttributeExample;
import com.zhiqiang.mall.service.PmsProductAttributeService;

import com.zhiqiang.mall.user.mapper.PmsProductAttributeMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName: PmsProductAttributeServiceImpl
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/29 13:09
 */
@Service
public class PmsProductAttributeServiceImpl implements PmsProductAttributeService {
    @Autowired
   private PmsProductAttributeMapper pmsAttributeMapper;

    @Override
    public PageInfo<PmsProductAttribute> getList(Long cid, Integer type, Integer pageSize, Integer pageNum) {


        PageHelper.startPage(pageNum, pageSize);
        PmsProductAttributeExample example = new PmsProductAttributeExample();
        //example.setOrderByClause("sort desc");
        //example.createCriteria().andClassifyAttributeIdEqualTo(cid);
        example.createCriteria().andProductAttributeCategoryIdEqualTo(cid).andTypeEqualTo(type);
        List<PmsProductAttribute> list=pmsAttributeMapper.selectByExample(example);
        PageInfo<PmsProductAttribute> pageInfo = new PageInfo<PmsProductAttribute>(list);
        return pageInfo;
    }
}
