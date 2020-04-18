package com.zhiqiang.mall.bean;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "sms_home_new_product")
public class SmsHomeNewProduct implements Serializable {
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
     * 推荐状态：0->不推荐;1->推荐
     */
    @Column(name = "recommend_status")
    private Integer recommendStatus;

    /**
     * 排序
     */
    private Integer sort;

    public SmsHomeNewProduct(Long id, Long productId, String productName, Integer recommendStatus, Integer sort) {
        this.id = id;
        this.productId = productId;
        this.productName = productName;
        this.recommendStatus = recommendStatus;
        this.sort = sort;
    }

    public SmsHomeNewProduct() {
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
     * 获取推荐状态：0->不推荐;1->推荐
     *
     * @return recommend_status - 推荐状态：0->不推荐;1->推荐
     */
    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    /**
     * 设置推荐状态：0->不推荐;1->推荐
     *
     * @param recommendStatus 推荐状态：0->不推荐;1->推荐
     */
    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}