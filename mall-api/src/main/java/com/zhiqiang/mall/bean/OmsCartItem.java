package com.zhiqiang.mall.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "oms_cart_item")
public class OmsCartItem implements Serializable {
    @Id
    @Column(name = "cart_id")
    private Long cartId;

    /**
     * 商品的id
     */
    @Column(name = "product_id")
    private Long productId;

    /**
     * sku的id
     */
    @Column(name = "sku_id")
    private Long skuId;

    /**
     * 用户id
     */
    @Column(name = "member_id")
    private Long memberId;

    /**
     * 购买数量
     */
    private Integer quantity;

    /**
     * 添加到购物车的价格
     */
    private BigDecimal price;

    /**
     * 商品主图
     */
    @Column(name = "product_pic")
    private String productPic;

    /**
     * 商品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 商品品牌
     */
    @Column(name = "brand_name")
    private String brandName;

    /**
     * 商品的条码
     */
    @Column(name = "product_sn")
    private String productSn;

    /**
     * 商品关键字（卖点）
     */
    private String keywords;

    /**
     * 商品sku条码
     */
    @Column(name = "sku_sn")
    private Long skuSn;

    /**
     * 会员昵称
     */
    @Column(name = "member_name")
    private String memberName;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 修改时间
     */
    @Column(name = "modify_date")
    private Date modifyDate;

    /**
     * 是否删除
     */
    @Column(name = "delete_status")
    private Integer deleteStatus;

    /**
     * 商品的分类
     */
    @Column(name = "product_classify_id")
    private Long productClassifyId;

    /**
     * 商品销售属性:[{"key":"颜色","value":"银色"},{"key":"容量","value":"4G"}]
     */
    @Column(name = "product_attribute")
    private String productAttribute;

    private static final long serialVersionUID = 1L;

    public OmsCartItem(Long cartId, Long productId, Long skuId, Long memberId, Integer quantity, BigDecimal price, String productPic, String productName, String brandName, String productSn, String keywords, Long skuSn, String memberName, Date createDate, Date modifyDate, Integer deleteStatus, Long productClassifyId, String productAttribute) {
        this.cartId = cartId;
        this.productId = productId;
        this.skuId = skuId;
        this.memberId = memberId;
        this.quantity = quantity;
        this.price = price;
        this.productPic = productPic;
        this.productName = productName;
        this.brandName = brandName;
        this.productSn = productSn;
        this.keywords = keywords;
        this.skuSn = skuSn;
        this.memberName = memberName;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.deleteStatus = deleteStatus;
        this.productClassifyId = productClassifyId;
        this.productAttribute = productAttribute;
    }

    public OmsCartItem() {
        super();
    }

    /**
     * @return cart_id
     */
    public Long getCartId() {
        return cartId;
    }

    /**
     * @param cartId
     */
    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    /**
     * 获取商品的id
     *
     * @return product_id - 商品的id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 设置商品的id
     *
     * @param productId 商品的id
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 获取sku的id
     *
     * @return sku_id - sku的id
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * 设置sku的id
     *
     * @param skuId sku的id
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * 获取用户id
     *
     * @return member_id - 用户id
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * 设置用户id
     *
     * @param memberId 用户id
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * 获取购买数量
     *
     * @return quantity - 购买数量
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 设置购买数量
     *
     * @param quantity 购买数量
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 获取添加到购物车的价格
     *
     * @return price - 添加到购物车的价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置添加到购物车的价格
     *
     * @param price 添加到购物车的价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取商品主图
     *
     * @return product_pic - 商品主图
     */
    public String getProductPic() {
        return productPic;
    }

    /**
     * 设置商品主图
     *
     * @param productPic 商品主图
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
     * 获取商品的条码
     *
     * @return product_sn - 商品的条码
     */
    public String getProductSn() {
        return productSn;
    }

    /**
     * 设置商品的条码
     *
     * @param productSn 商品的条码
     */
    public void setProductSn(String productSn) {
        this.productSn = productSn == null ? null : productSn.trim();
    }

    /**
     * 获取商品关键字（卖点）
     *
     * @return keywords - 商品关键字（卖点）
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * 设置商品关键字（卖点）
     *
     * @param keywords 商品关键字（卖点）
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    /**
     * 获取商品sku条码
     *
     * @return sku_sn - 商品sku条码
     */
    public Long getSkuSn() {
        return skuSn;
    }

    /**
     * 设置商品sku条码
     *
     * @param skuSn 商品sku条码
     */
    public void setSkuSn(Long skuSn) {
        this.skuSn = skuSn;
    }

    /**
     * 获取会员昵称
     *
     * @return member_name - 会员昵称
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * 设置会员昵称
     *
     * @param memberName 会员昵称
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取修改时间
     *
     * @return modify_date - 修改时间
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * 设置修改时间
     *
     * @param modifyDate 修改时间
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * 获取是否删除
     *
     * @return delete_status - 是否删除
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * 设置是否删除
     *
     * @param deleteStatus 是否删除
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * 获取商品的分类
     *
     * @return product_classify_id - 商品的分类
     */
    public Long getProductClassifyId() {
        return productClassifyId;
    }

    /**
     * 设置商品的分类
     *
     * @param productClassifyId 商品的分类
     */
    public void setProductClassifyId(Long productClassifyId) {
        this.productClassifyId = productClassifyId;
    }

    /**
     * 获取商品销售属性:[{"key":"颜色","value":"银色"},{"key":"容量","value":"4G"}]
     *
     * @return product_attribute - 商品销售属性:[{"key":"颜色","value":"银色"},{"key":"容量","value":"4G"}]
     */
    public String getProductAttribute() {
        return productAttribute;
    }

    /**
     * 设置商品销售属性:[{"key":"颜色","value":"银色"},{"key":"容量","value":"4G"}]
     *
     * @param productAttribute 商品销售属性:[{"key":"颜色","value":"银色"},{"key":"容量","value":"4G"}]
     */
    public void setProductAttribute(String productAttribute) {
        this.productAttribute = productAttribute == null ? null : productAttribute.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cartId=").append(cartId);
        sb.append(", productId=").append(productId);
        sb.append(", skuId=").append(skuId);
        sb.append(", memberId=").append(memberId);
        sb.append(", quantity=").append(quantity);
        sb.append(", price=").append(price);
        sb.append(", productPic=").append(productPic);
        sb.append(", productName=").append(productName);
        sb.append(", brandName=").append(brandName);
        sb.append(", productSn=").append(productSn);
        sb.append(", keywords=").append(keywords);
        sb.append(", skuSn=").append(skuSn);
        sb.append(", memberName=").append(memberName);
        sb.append(", createDate=").append(createDate);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", productClassifyId=").append(productClassifyId);
        sb.append(", productAttribute=").append(productAttribute);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}