package com.zhiqiang.mall.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "oms_order_item")
public class OmsOrderItem implements Serializable {
    /**
     * 订单商品条目id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_item_id")
    private Long orderItemId;

    /**
     * 订单id
     */
    @Column(name = "order_id")
    private Long orderId;

    /**
     * 订单编号
     */
    @Column(name = "order_sn")
    private String orderSn;

    /**
     * 商品id
     */
    @Column(name = "product_id")
    private Long productId;

    /**
     * 商品图片
     */
    @Column(name = "product_pic")
    private String productPic;

    /**
     * 商品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 商品货号（条码）
     */
    @Column(name = "product_sn")
    private String productSn;

    /**
     * 分类id
     */
    @Column(name = "product_classify_id")
    private Long productClassifyId;

    /**
     * 商品品牌
     */
    @Column(name = "brand_name")
    private String brandName;

    /**
     * sku编号
     */
    @Column(name = "sku_id")
    private Long skuId;

    /**
     * sku条码
     */
    @Column(name = "sku_sn")
    private Long skuSn;

    /**
     * sku价格
     */
    private BigDecimal price;

    /**
     * 购买数量
     */
    @Column(name = "product_quantity")
    private Integer productQuantity;

    /**
     * 商品促销信息
     */
    @Column(name = "promotion_info")
    private String promotionInfo;

    /**
     * 单件商品促销金额
     */
    @Column(name = "promotion_amount")
    private BigDecimal promotionAmount;

    /**
     * 单件商品优惠券金额
     */
    @Column(name = "coupon_amount")
    private BigDecimal couponAmount;

    /**
     * 单件商品积分优惠金额
     */
    @Column(name = "points_amount")
    private BigDecimal pointsAmount;

    /**
     * 单件商品实际应付金额
     */
    @Column(name = "real_amount")
    private BigDecimal realAmount;

    /**
     * 商品可获得积分
     */
    @Column(name = "get_points")
    private Integer getPoints;

    /**
     * 商品可获得成长值
     */
    @Column(name = "get_growth")
    private Integer getGrowth;

    /**
     * 商品销售属性[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     */
    @Column(name = "product_attribute")
    private String productAttribute;

    public OmsOrderItem(Long orderItemId, Long orderId, String orderSn, Long productId, String productPic, String productName, String productSn, Long productClassifyId, String brandName, Long skuId, Long skuSn, BigDecimal price, Integer productQuantity, String promotionInfo, BigDecimal promotionAmount, BigDecimal couponAmount, BigDecimal pointsAmount, BigDecimal realAmount, Integer getPoints, Integer getGrowth, String productAttribute) {
        this.orderItemId = orderItemId;
        this.orderId = orderId;
        this.orderSn = orderSn;
        this.productId = productId;
        this.productPic = productPic;
        this.productName = productName;
        this.productSn = productSn;
        this.productClassifyId = productClassifyId;
        this.brandName = brandName;
        this.skuId = skuId;
        this.skuSn = skuSn;
        this.price = price;
        this.productQuantity = productQuantity;
        this.promotionInfo = promotionInfo;
        this.promotionAmount = promotionAmount;
        this.couponAmount = couponAmount;
        this.pointsAmount = pointsAmount;
        this.realAmount = realAmount;
        this.getPoints = getPoints;
        this.getGrowth = getGrowth;
        this.productAttribute = productAttribute;
    }

    public OmsOrderItem() {
        super();
    }

    /**
     * 获取订单商品条目id
     *
     * @return order_item_id - 订单商品条目id
     */
    public Long getOrderItemId() {
        return orderItemId;
    }

    /**
     * 设置订单商品条目id
     *
     * @param orderItemId 订单商品条目id
     */
    public void setOrderItemId(Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * 获取订单id
     *
     * @return order_id - 订单id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id
     *
     * @param orderId 订单id
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取订单编号
     *
     * @return order_sn - 订单编号
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * 设置订单编号
     *
     * @param orderSn 订单编号
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
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
     * 获取商品图片
     *
     * @return product_pic - 商品图片
     */
    public String getProductPic() {
        return productPic;
    }

    /**
     * 设置商品图片
     *
     * @param productPic 商品图片
     */
    public void setProductPic(String productPic) {
        this.productPic = productPic == null ? null : productPic.trim();
    }

    /**
     * 获取商品名称
     *
     * @return product_name - 商品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置商品名称
     *
     * @param productName 商品名称
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * 获取商品货号（条码）
     *
     * @return product_sn - 商品货号（条码）
     */
    public String getProductSn() {
        return productSn;
    }

    /**
     * 设置商品货号（条码）
     *
     * @param productSn 商品货号（条码）
     */
    public void setProductSn(String productSn) {
        this.productSn = productSn == null ? null : productSn.trim();
    }

    /**
     * 获取分类id
     *
     * @return product_classify_id - 分类id
     */
    public Long getProductClassifyId() {
        return productClassifyId;
    }

    /**
     * 设置分类id
     *
     * @param productClassifyId 分类id
     */
    public void setProductClassifyId(Long productClassifyId) {
        this.productClassifyId = productClassifyId;
    }

    /**
     * 获取商品品牌
     *
     * @return brand_name - 商品品牌
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * 设置商品品牌
     *
     * @param brandName 商品品牌
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    /**
     * 获取sku编号
     *
     * @return sku_id - sku编号
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * 设置sku编号
     *
     * @param skuId sku编号
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * 获取sku条码
     *
     * @return sku_sn - sku条码
     */
    public Long getSkuSn() {
        return skuSn;
    }

    /**
     * 设置sku条码
     *
     * @param skuSn sku条码
     */
    public void setSkuSn(Long skuSn) {
        this.skuSn = skuSn;
    }

    /**
     * 获取sku价格
     *
     * @return price - sku价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置sku价格
     *
     * @param price sku价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取购买数量
     *
     * @return product_quantity - 购买数量
     */
    public Integer getProductQuantity() {
        return productQuantity;
    }

    /**
     * 设置购买数量
     *
     * @param productQuantity 购买数量
     */
    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    /**
     * 获取商品促销信息
     *
     * @return promotion_info - 商品促销信息
     */
    public String getPromotionInfo() {
        return promotionInfo;
    }

    /**
     * 设置商品促销信息
     *
     * @param promotionInfo 商品促销信息
     */
    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo == null ? null : promotionInfo.trim();
    }

    /**
     * 获取单件商品促销金额
     *
     * @return promotion_amount - 单件商品促销金额
     */
    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    /**
     * 设置单件商品促销金额
     *
     * @param promotionAmount 单件商品促销金额
     */
    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    /**
     * 获取单件商品优惠券金额
     *
     * @return coupon_amount - 单件商品优惠券金额
     */
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    /**
     * 设置单件商品优惠券金额
     *
     * @param couponAmount 单件商品优惠券金额
     */
    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * 获取单件商品积分优惠金额
     *
     * @return points_amount - 单件商品积分优惠金额
     */
    public BigDecimal getPointsAmount() {
        return pointsAmount;
    }

    /**
     * 设置单件商品积分优惠金额
     *
     * @param pointsAmount 单件商品积分优惠金额
     */
    public void setPointsAmount(BigDecimal pointsAmount) {
        this.pointsAmount = pointsAmount;
    }

    /**
     * 获取单件商品实际应付金额
     *
     * @return real_amount - 单件商品实际应付金额
     */
    public BigDecimal getRealAmount() {
        return realAmount;
    }

    /**
     * 设置单件商品实际应付金额
     *
     * @param realAmount 单件商品实际应付金额
     */
    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    /**
     * 获取商品可获得积分
     *
     * @return get_points - 商品可获得积分
     */
    public Integer getGetPoints() {
        return getPoints;
    }

    /**
     * 设置商品可获得积分
     *
     * @param getPoints 商品可获得积分
     */
    public void setGetPoints(Integer getPoints) {
        this.getPoints = getPoints;
    }

    /**
     * 获取商品可获得成长值
     *
     * @return get_growth - 商品可获得成长值
     */
    public Integer getGetGrowth() {
        return getGrowth;
    }

    /**
     * 设置商品可获得成长值
     *
     * @param getGrowth 商品可获得成长值
     */
    public void setGetGrowth(Integer getGrowth) {
        this.getGrowth = getGrowth;
    }

    /**
     * 获取商品销售属性[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     *
     * @return product_attribute - 商品销售属性[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     */
    public String getProductAttribute() {
        return productAttribute;
    }

    /**
     * 设置商品销售属性[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     *
     * @param productAttribute 商品销售属性[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     */
    public void setProductAttribute(String productAttribute) {
        this.productAttribute = productAttribute == null ? null : productAttribute.trim();
    }
}