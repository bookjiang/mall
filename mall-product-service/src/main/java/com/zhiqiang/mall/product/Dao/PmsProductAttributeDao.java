package com.zhiqiang.mall.product.Dao;

import com.zhiqiang.mall.model.ProductAttrInfo;

import java.util.List;

/**
 * @ClassName: PmsProductAttributeDao
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/3 10:48
 */
public interface PmsProductAttributeDao {

    List<ProductAttrInfo> getProductAttrInfo(Long productCategoryId);
}
