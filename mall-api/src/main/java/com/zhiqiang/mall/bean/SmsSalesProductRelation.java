package com.zhiqiang.mall.bean;

import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
@ToString
@Table(name = "sms_sales_product_relation")
public class SmsSalesProductRelation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 日限时购id
     */
    @Column(name = "sales_id")
    private Long salesId;

    /**
     * 具体场次编号
     */
    @Column(name = "sales_session_id")
    private Long salesSessionId;

    /**
     * 商品id
     */
    @Column(name = "product_id")
    private Long productId;

    /**
     * 限时购价格
     */
    @Column(name = "flash_promotion_price")
    private BigDecimal flashPromotionPrice;

    /**
     * 限时购数量
     */
    @Column(name = "flash_promotion_count")
    private Integer flashPromotionCount;

    /**
     * 每人限购数量
     */
    @Column(name = "flash_promotion_limit")
    private Integer flashPromotionLimit;

    public SmsSalesProductRelation(Long id, Long salesId, Long salesSessionId, Long productId, BigDecimal flashPromotionPrice, Integer flashPromotionCount, Integer flashPromotionLimit) {
        this.id = id;
        this.salesId = salesId;
        this.salesSessionId = salesSessionId;
        this.productId = productId;
        this.flashPromotionPrice = flashPromotionPrice;
        this.flashPromotionCount = flashPromotionCount;
        this.flashPromotionLimit = flashPromotionLimit;
    }

    public SmsSalesProductRelation() {
        super();
    }

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取日限时购id
     *
     * @return sales_id - 日限时购id
     */
    public Long getSalesId() {
        return salesId;
    }

    /**
     * 设置日限时购id
     *
     * @param salesId 日限时购id
     */
    public void setSalesId(Long salesId) {
        this.salesId = salesId;
    }

    /**
     * 获取具体场次编号
     *
     * @return sales_session_id - 具体场次编号
     */
    public Long getSalesSessionId() {
        return salesSessionId;
    }

    /**
     * 设置具体场次编号
     *
     * @param salesSessionId 具体场次编号
     */
    public void setSalesSessionId(Long salesSessionId) {
        this.salesSessionId = salesSessionId;
    }

    /**
     * 获取商品id
     *
     * @return product_id - 商品id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 设置商品id
     *
     * @param productId 商品id
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 获取限时购价格
     *
     * @return flash_promotion_price - 限时购价格
     */
    public BigDecimal getFlashPromotionPrice() {
        return flashPromotionPrice;
    }

    /**
     * 设置限时购价格
     *
     * @param flashPromotionPrice 限时购价格
     */
    public void setFlashPromotionPrice(BigDecimal flashPromotionPrice) {
        this.flashPromotionPrice = flashPromotionPrice;
    }

    /**
     * 获取限时购数量
     *
     * @return flash_promotion_count - 限时购数量
     */
    public Integer getFlashPromotionCount() {
        return flashPromotionCount;
    }

    /**
     * 设置限时购数量
     *
     * @param flashPromotionCount 限时购数量
     */
    public void setFlashPromotionCount(Integer flashPromotionCount) {
        this.flashPromotionCount = flashPromotionCount;
    }

    /**
     * 获取每人限购数量
     *
     * @return flash_promotion_limit - 每人限购数量
     */
    public Integer getFlashPromotionLimit() {
        return flashPromotionLimit;
    }

    /**
     * 设置每人限购数量
     *
     * @param flashPromotionLimit 每人限购数量
     */
    public void setFlashPromotionLimit(Integer flashPromotionLimit) {
        this.flashPromotionLimit = flashPromotionLimit;
    }
}