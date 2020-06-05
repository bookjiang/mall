package com.zhiqiang.mall.sale.dao;

import com.zhiqiang.mall.bean.SmsCouponProductCategoryRelation;

import java.util.List;

/**
 * @ClassName: SmsCouponProductCategoryRelationDao
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/4 21:40
 */
public interface SmsCouponProductCategoryRelationDao {
    void insertList(List<SmsCouponProductCategoryRelation> productCategoryRelationList);
}
