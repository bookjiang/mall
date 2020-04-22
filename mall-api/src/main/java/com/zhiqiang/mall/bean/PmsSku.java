package com.zhiqiang.mall.bean;

import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
@ToString
@Table(name = "pms_sku")
public class PmsSku implements Serializable {
    /**
     * 商品sku编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sku_id")
    private Long skuId;

    /**
     * 货品id
     */
    @Column(name = "product_id")
    private Long productId;

    /**
     * sku条码
     */
    @Column(name = "sku_sn")
    private String skuSn;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 优惠方式(0;无优惠;1:促销价;2:会员价;3:积分兑换优惠)4:满减
     */
    @Column(name = "discount_type")
    private Integer discountType;

    /**
     * 促销价
     */
    @Column(name = "promotion_price")
    private BigDecimal promotionPrice;

    /**
     * 会员价格
     */
    @Column(name = "member_price")
    private BigDecimal memberPrice;

    /**
     * 积分兑换限额（百分比，表示只能抵扣价格的百分比）（100积分抵扣1元）
     */
    @Column(name = "point_limit")
    private BigDecimal pointLimit;

    /**
     * 满减中满足金额
     */
    @Column(name = "full_price")
    private BigDecimal fullPrice;

    /**
     * 减少金额
     */
    @Column(name = "reduction_money")
    private BigDecimal reductionMoney;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 预警库存
     */
    @Column(name = "warning_stock")
    private Integer warningStock;

    /**
     * 图片
     */
    private String picture;

    /**
     * 销量
     */
    private Integer sale;

    public PmsSku(Long skuId, Long productId, String skuSn, BigDecimal price, Integer discountType, BigDecimal promotionPrice, BigDecimal memberPrice, BigDecimal pointLimit, BigDecimal fullPrice, BigDecimal reductionMoney, Integer stock, Integer warningStock, String picture, Integer sale) {
        this.skuId = skuId;
        this.productId = productId;
        this.skuSn = skuSn;
        this.price = price;
        this.discountType = discountType;
        this.promotionPrice = promotionPrice;
        this.memberPrice = memberPrice;
        this.pointLimit = pointLimit;
        this.fullPrice = fullPrice;
        this.reductionMoney = reductionMoney;
        this.stock = stock;
        this.warningStock = warningStock;
        this.picture = picture;
        this.sale = sale;
    }

    public PmsSku() {
        super();
    }

    /**
     * 获取商品sku编号
     *
     * @return sku_id - 商品sku编号
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * 设置商品sku编号
     *
     * @param skuId 商品sku编号
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * 获取货品id
     *
     * @return product_id - 货品id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 设置货品id
     *
     * @param productId 货品id
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 获取sku条码
     *
     * @return sku_sn - sku条码
     */
    public String getSkuSn() {
        return skuSn;
    }

    /**
     * 设置sku条码
     *
     * @param skuSn sku条码
     */
    public void setSkuSn(String skuSn) {
        this.skuSn = skuSn == null ? null : skuSn.trim();
    }

    /**
     * 获取价格
     *
     * @return price - 价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取优惠方式(0;无优惠;1:促销价;2:会员价;3:积分兑换优惠)4:满减
     *
     * @return discount_type - 优惠方式(0;无优惠;1:促销价;2:会员价;3:积分兑换优惠)4:满减
     */
    public Integer getDiscountType() {
        return discountType;
    }

    /**
     * 设置优惠方式(0;无优惠;1:促销价;2:会员价;3:积分兑换优惠)4:满减
     *
     * @param discountType 优惠方式(0;无优惠;1:促销价;2:会员价;3:积分兑换优惠)4:满减
     */
    public void setDiscountType(Integer discountType) {
        this.discountType = discountType;
    }

    /**
     * 获取促销价
     *
     * @return promotion_price - 促销价
     */
    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    /**
     * 设置促销价
     *
     * @param promotionPrice 促销价
     */
    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    /**
     * 获取会员价格
     *
     * @return member_price - 会员价格
     */
    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    /**
     * 设置会员价格
     *
     * @param memberPrice 会员价格
     */
    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    /**
     * 获取积分兑换限额（百分比，表示只能抵扣价格的百分比）（100积分抵扣1元）
     *
     * @return point_limit - 积分兑换限额（百分比，表示只能抵扣价格的百分比）（100积分抵扣1元）
     */
    public BigDecimal getPointLimit() {
        return pointLimit;
    }

    /**
     * 设置积分兑换限额（百分比，表示只能抵扣价格的百分比）（100积分抵扣1元）
     *
     * @param pointLimit 积分兑换限额（百分比，表示只能抵扣价格的百分比）（100积分抵扣1元）
     */
    public void setPointLimit(BigDecimal pointLimit) {
        this.pointLimit = pointLimit;
    }

    /**
     * 获取满减中满足金额
     *
     * @return full_price - 满减中满足金额
     */
    public BigDecimal getFullPrice() {
        return fullPrice;
    }

    /**
     * 设置满减中满足金额
     *
     * @param fullPrice 满减中满足金额
     */
    public void setFullPrice(BigDecimal fullPrice) {
        this.fullPrice = fullPrice;
    }

    /**
     * 获取减少金额
     *
     * @return reduction_money - 减少金额
     */
    public BigDecimal getReductionMoney() {
        return reductionMoney;
    }

    /**
     * 设置减少金额
     *
     * @param reductionMoney 减少金额
     */
    public void setReductionMoney(BigDecimal reductionMoney) {
        this.reductionMoney = reductionMoney;
    }

    /**
     * 获取库存
     *
     * @return stock - 库存
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 设置库存
     *
     * @param stock 库存
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 获取预警库存
     *
     * @return warning_stock - 预警库存
     */
    public Integer getWarningStock() {
        return warningStock;
    }

    /**
     * 设置预警库存
     *
     * @param warningStock 预警库存
     */
    public void setWarningStock(Integer warningStock) {
        this.warningStock = warningStock;
    }

    /**
     * 获取图片
     *
     * @return picture - 图片
     */
    public String getPicture() {
        return picture;
    }

    /**
     * 设置图片
     *
     * @param picture 图片
     */
    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    /**
     * 获取销量
     *
     * @return sale - 销量
     */
    public Integer getSale() {
        return sale;
    }

    /**
     * 设置销量
     *
     * @param sale 销量
     */
    public void setSale(Integer sale) {
        this.sale = sale;
    }
}