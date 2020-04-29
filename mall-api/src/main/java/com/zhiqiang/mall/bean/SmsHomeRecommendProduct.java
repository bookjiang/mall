package com.zhiqiang.mall.bean;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "sms_home_recommend_product")
public class SmsHomeRecommendProduct implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商品id
     */
    @Column(name = "product_id")
    private Long productId;

    /**
     * 商品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 推荐状态
     */
    @Column(name = "recommend_status")
    private Integer recommendStatus;

    private Integer sort;

    private static final long serialVersionUID = 1L;

    public SmsHomeRecommendProduct(Long id, Long productId, String productName, Integer recommendStatus, Integer sort) {
        this.id = id;
        this.productId = productId;
        this.productName = productName;
        this.recommendStatus = recommendStatus;
        this.sort = sort;
    }

    public SmsHomeRecommendProduct() {
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
     * 获取推荐状态
     *
     * @return recommend_status - 推荐状态
     */
    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    /**
     * 设置推荐状态
     *
     * @param recommendStatus 推荐状态
     */
    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    /**
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", productName=").append(productName);
        sb.append(", recommendStatus=").append(recommendStatus);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}