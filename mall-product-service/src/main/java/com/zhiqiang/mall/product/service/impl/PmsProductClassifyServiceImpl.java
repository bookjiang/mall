package com.zhiqiang.mall.product.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhiqiang.mall.bean.PmsProductCategoryWithChildrenItem;
import com.zhiqiang.mall.product.Dao.PmsProductCategoryDao;
import com.zhiqiang.mall.service.PmsProductClassifyService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName: PmsProductClassifyServiceImpl
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/2 18:18
 */
@Service
public class PmsProductClassifyServiceImpl implements PmsProductClassifyService {
    @Autowired
    private PmsProductCategoryDao productCategoryDao;
    @Override
    public List<PmsProductCategoryWithChildrenItem> listWithChildren() {
        return productCategoryDao.listWithChildren();
    }
}
