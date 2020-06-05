package com.zhiqiang.mall.model;


import com.zhiqiang.mall.bean.PmsProduct;
import com.zhiqiang.mall.bean.SmsFlashPromotionProductRelation;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 限时购及商品信息封装
 */
public class SmsFlashPromotionProduct extends SmsFlashPromotionProductRelation {
    @Getter
    @Setter
    private PmsProduct product;

    public SmsFlashPromotionProduct(Long id, Long flashPromotionId, Long flashPromotionSessionId, Long productId, BigDecimal flashPromotionPrice, Integer flashPromotionCount, Integer flashPromotionLimit, Integer sort, PmsProduct product) {
        super(id, flashPromotionId, flashPromotionSessionId, productId, flashPromotionPrice, flashPromotionCount, flashPromotionLimit, sort);
        this.product = product;
    }

    public SmsFlashPromotionProduct(PmsProduct product) {
        this.product = product;
    }
    public SmsFlashPromotionProduct(Long id, Long flashPromotionId, Long flashPromotionSessionId, Long productId, BigDecimal flashPromotionPrice, Integer flashPromotionCount, Integer flashPromotionLimit, Integer sort) {
        super(id, flashPromotionId, flashPromotionSessionId, productId, flashPromotionPrice, flashPromotionCount, flashPromotionLimit, sort);

    }
}
