package com.zhiqiang.mall.sale.dao;

import com.zhiqiang.mall.bean.SmsCouponProductRelation;

import java.util.List;

/**
 * @ClassName: SmsCouponProductRelationDao
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/4 21:40
 */
public interface SmsCouponProductRelationDao {
    void insertList(List<SmsCouponProductRelation> productRelationList);
}
