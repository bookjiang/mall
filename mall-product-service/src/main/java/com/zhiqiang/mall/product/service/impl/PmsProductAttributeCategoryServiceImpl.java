package com.zhiqiang.mall.product.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.PmsProductAttributeCategory;
import com.zhiqiang.mall.bean.PmsProductAttributeCategoryExample;
import com.zhiqiang.mall.model.PmsProductAttributeCategoryItem;
import com.zhiqiang.mall.product.Dao.PmsProductAttributeCategoryDao;
import com.zhiqiang.mall.service.PmsProductAttributeCategoryService;
import com.zhiqiang.mall.user.mapper.PmsProductAttributeCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName: PmsProductAttributeCategoryServiceImpl
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/2 14:19
 */
@Service
public class PmsProductAttributeCategoryServiceImpl implements PmsProductAttributeCategoryService {
    @Autowired
    PmsProductAttributeCategoryMapper pmsProductAttributeCategoryMapper;
    @Autowired
    private PmsProductAttributeCategoryDao productAttributeCategoryDao;
    @Override
    public PageInfo<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        List<PmsProductAttributeCategory> pmsProductAttributeCategoryList=pmsProductAttributeCategoryMapper.selectByExample(new PmsProductAttributeCategoryExample());
        PageInfo<PmsProductAttributeCategory> pageInfo=new PageInfo<>(pmsProductAttributeCategoryList);
        return pageInfo;
    }

    @Override
    public List<PmsProductAttributeCategoryItem> getListWithAttr() {
        return productAttributeCategoryDao.getListWithAttr();
    }

    @Override
    public int update(Long id, String name) {
        PmsProductAttributeCategory productAttributeCategory = new PmsProductAttributeCategory();
        productAttributeCategory.setName(name);
        productAttributeCategory.setId(id);
        return pmsProductAttributeCategoryMapper.updateByPrimaryKeySelective(productAttributeCategory);

    }
}
