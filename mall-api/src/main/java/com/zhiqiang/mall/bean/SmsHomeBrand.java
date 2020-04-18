package com.zhiqiang.mall.bean;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "sms_home_brand")
public class SmsHomeBrand implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商品品牌id
     */
    @Column(name = "brand_id")
    private Long brandId;

    /**
     * 商品品牌名称
     */
    @Column(name = "brand_name")
    private String brandName;

    /**
     * 推荐状态：0->不推荐;1->推荐
     */
    @Column(name = "recommend_status")
    private Integer recommendStatus;

    /**
     * 排序
     */
    private Integer sort;

    public SmsHomeBrand(Long id, Long brandId, String brandName, Integer recommendStatus, Integer sort) {
        this.id = id;
        this.brandId = brandId;
        this.brandName = brandName;
        this.recommendStatus = recommendStatus;
        this.sort = sort;
    }

    public SmsHomeBrand() {
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
     * 获取商品品牌id
     *
     * @return brand_id - 商品品牌id
     */
    public Long getBrandId() {
        return brandId;
    }

    /**
     * 设置商品品牌id
     *
     * @param brandId 商品品牌id
     */
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    /**
     * 获取商品品牌名称
     *
     * @return brand_name - 商品品牌名称
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * 设置商品品牌名称
     *
     * @param brandName 商品品牌名称
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
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