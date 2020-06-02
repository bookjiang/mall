package com.zhiqiang.mall.bean;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "sms_coupon_product_category_relation")
public class SmsCouponProductCategoryRelation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "coupon_id")
    private Long couponId;

    @Column(name = "product_category_id")
    private Long productCategoryId;

    /**
     * 产品分类名称
     */
    @Column(name = "product_category_name")
    private String productCategoryName;

    /**
     * 父分类名称
     */
    @Column(name = "parent_category_name")
    private String parentCategoryName;

    private static final long serialVersionUID = 1L;

    public SmsCouponProductCategoryRelation(Long id, Long couponId, Long productCategoryId, String productCategoryName, String parentCategoryName) {
        this.id = id;
        this.couponId = couponId;
        this.productCategoryId = productCategoryId;
        this.productCategoryName = productCategoryName;
        this.parentCategoryName = parentCategoryName;
    }

    public SmsCouponProductCategoryRelation() {
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
     * @return coupon_id
     */
    public Long getCouponId() {
        return couponId;
    }

    /**
     * @param couponId
     */
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    /**
     * @return product_category_id
     */
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * @param productCategoryId
     */
    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    /**
     * 获取产品分类名称
     *
     * @return product_category_name - 产品分类名称
     */
    public String getProductCategoryName() {
        return productCategoryName;
    }

    /**
     * 设置产品分类名称
     *
     * @param productCategoryName 产品分类名称
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