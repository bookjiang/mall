package com.zhiqiang.mall.product.Dao;

import com.zhiqiang.mall.bean.PmsProductCategoryWithChildrenItem;

import java.util.List;

/**
 * @ClassName: PmsProductCategoryDao
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/2 18:59
 */
public interface PmsProductCategoryDao {
    /**
     * 获取商品分类及其子分类
     */
    List<PmsProductCategoryWithChildrenItem> listWithChildren();

}
