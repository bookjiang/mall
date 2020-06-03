package com.zhiqiang.mall.product.Dao;

import com.zhiqiang.mall.model.PmsProductAttributeCategoryItem;

import java.util.List;

/**
 * @ClassName: PmsProductAttributeCategoryDao
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/3 11:22
 */
public interface PmsProductAttributeCategoryDao {
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
