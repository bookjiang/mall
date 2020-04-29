package com.zhiqiang.mall.bean;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "sms_coupon_product_classify_relation")
public class SmsCouponProductClassifyRelation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 优惠券id
     */
    @Column(name = "coupon_id")
    private Long couponId;

    /**
     * 商品分类id
     */
    @Column(name = "product_category_id")
    private Long productCategoryId;

    /**
     * 商品分类名称
     */
    @Column(name = "product_category_name")
    private String productCategoryName;

    /**
     * 父分类名称
     */
    @Column(name = "parent_category_name")
    private String parentCategoryName;

    private static final long serialVersionUID = 1L;

    public SmsCouponProductClassifyRelation(Long id, Long couponId, Long productCategoryId, String productCategoryName, String parentCategoryName) {
        this.id = id;
        this.couponId = couponId;
        this.productCategoryId = productCategoryId;
        this.productCategoryName = productCategoryName;
        this.parentCategoryName = parentCategoryName;
    }

    public SmsCouponProductClassifyRelation() {
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
     * 获取优惠券id
     *
     * @return coupon_id - 优惠券id
     */
    public Long getCouponId() {
        return couponId;
    }

    /**
     * 设置优惠券id
     *
     * @param couponId 优惠券id
     */
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    /**
     * 获取商品分类id
     *
     * @return product_category_id - 商品分类id
     */
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * 设置商品分类id
     *
     * @param productCategoryId 商品分类id
     */
    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    /**
     * 获取商品分类名称
     *
     * @return product_category_name - 商品分类名称
     */
    public String getProductCategoryName() {
        return productCategoryName;
    }

    /**
     * 设置商品分类名称
     *
     * @param productCategoryName 商品分类名称
     */
    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName == null ? null : productCategoryName.trim();
    }

    /**
     * 获取父分类名称
     *
     * @return parent_category_name - 父分类名称
     */
    public String getParentCategoryName() {
        return parentCategoryName;
    }

    /**
     * 设置父分类名称
     *
     * @param parentCategoryName 父分类名称
     */
    public void setParentCategoryName(String parentCategoryName) {
        this.parentCategoryName = parentCategoryName == null ? null : parentCategoryName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", couponId=").append(couponId);
        sb.append(", productCategoryId=").append(productCategoryId);
        sb.append(", productCategoryName=").append(productCategoryName);
        sb.append(", parentCategoryName=").append(parentCategoryName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}