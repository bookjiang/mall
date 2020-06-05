package com.zhiqiang.mall.model;


import com.zhiqiang.mall.bean.SmsCoupon;
import com.zhiqiang.mall.bean.SmsCouponProductCategoryRelation;
import com.zhiqiang.mall.bean.SmsCouponProductRelation;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 优惠券信息封装，包括绑定商品和绑定分类
 * Created by macro on 2018/8/28.
 */
public class SmsCouponParam extends SmsCoupon {
    public SmsCouponParam(Long id, Integer type, String name, Integer platform, Integer count, BigDecimal amount, Integer perLimit, BigDecimal minPoint, Date startTime, Date endTime, Integer useType, String note, Integer publishCount, Integer useCount, Integer receiveCount, Date enableTime, String code, Integer memberLevel, List<SmsCouponProductRelation> productRelationList, List<SmsCouponProductCategoryRelation> productCategoryRelationList) {
        super(id, type, name, platform, count, amount, perLimit, minPoint, startTime, endTime, useType, note, publishCount, useCount, receiveCount, enableTime, code, memberLevel);
        this.productRelationList = productRelationList;
        this.productCategoryRelationList = productCategoryRelationList;
    }

    public SmsCouponParam(List<SmsCouponProductRelation> productRelationList, List<SmsCouponProductCategoryRelation> productCategoryRelationList) {
        this.productRelationList = productRelationList;
        this.productCategoryRelationList = productCategoryRelationList;
    }
    public SmsCouponParam(Long id, Integer type, String name, Integer platform, Integer count, BigDecimal amount, Integer perLimit, BigDecimal minPoint, Date startTime, Date endTime, Integer useType, String note, Integer publishCount, Integer useCount, Integer receiveCount, Date enableTime, String code, Integer memberLevel) {
        super(id, type, name, platform, count, amount, perLimit, minPoint, startTime, endTime, useType, note, publishCount, useCount, receiveCount, enableTime, code, memberLevel);
    }
    //优惠券绑定的商品
    private List<SmsCouponProductRelation> productRelationList;
    //优惠券绑定的商品分类
    private List<SmsCouponProductCategoryRelation> productCategoryRelationList;

    public List<SmsCouponProductRelation> getProductRelationList() {
        return productRelationList;
    }

    public void setProductRelationList(List<SmsCouponProductRelation> productRelationList) {
        this.productRelationList = productRelationList;
    }

    public List<SmsCouponProductCategoryRelation> getProductCategoryRelationList() {
        return productCategoryRelationList;
    }

    public void setProductCategoryRelationList(List<SmsCouponProductCategoryRelation> productCategoryRelationList) {
        this.productCategoryRelationList = productCategoryRelationList;
    }
}
