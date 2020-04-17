package com.zhiqiang.mall.bean;

import javax.persistence.*;

@Table(name = "pms_brand")
public class PmsBrand {
    /**
     * 品牌id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    private Long brandId;

    /**
     * 品牌名字
     */
    private String name;

    /**
     * 是否显示
     */
    @Column(name = "show_status")
    private Integer showStatus;

    /**
     * 产品数量
     */
    @Column(name = "product_count")
    private Integer productCount;

    /**
     * 产品评论数量
     */
    @Column(name = "product_comment_count")
    private Integer productCommentCount;

    /**
     * 品牌logo
     */
    private String logo;

    /**
     * 是否厂商直供
     */
    private Integer factory;

    /**
     * 平台宣传图
     */
    private String picture;

    /**
     * 品牌故事
     */
    @Column(name = "brand_story")
    private String brandStory;

    public PmsBrand(Long brandId, String name, Integer showStatus, Integer productCount, Integer productCommentCount, String logo, Integer factory, String picture, String brandStory) {
        this.brandId = brandId;
        this.name = name;
        this.showStatus = showStatus;
        this.productCount = productCount;
        this.productCommentCount = productCommentCount;
        this.logo = logo;
        this.factory = factory;
        this.picture = picture;
        this.brandStory = brandStory;
    }

    public PmsBrand() {
        super();
    }

    /**
     * 获取品牌id
     *
     * @return brand_id - 品牌id
     */
    public Long getBrandId() {
        return brandId;
    }

    /**
     * 设置品牌id
     *
     * @param brandId 品牌id
     */
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    /**
     * 获取品牌名字
     *
     * @return name - 品牌名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置品牌名字
     *
     * @param name 品牌名字
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取是否显示
     *
     * @return show_status - 是否显示
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * 设置是否显示
     *
     * @param showStatus 是否显示
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * 获取产品数量
     *
     * @return product_count - 产品数量
     */
    public Integer getProductCount() {
        return productCount;
    }

    /**
     * 设置产品数量
     *
     * @param productCount 产品数量
     */
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    /**
     * 获取产品评论数量
     *
     * @return product_comment_count - 产品评论数量
     */
    public Integer getProductCommentCount() {
        return productCommentCount;
    }

    /**
     * 设置产品评论数量
     *
     * @param productCommentCount 产品评论数量
     */
    public void setProductCommentCount(Integer productCommentCount) {
        this.productCommentCount = productCommentCount;
    }

    /**
     * 获取品牌logo
     *
     * @return logo - 品牌logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置品牌logo
     *
     * @param logo 品牌logo
     */
    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    /**
     * 获取是否厂商直供
     *
     * @return factory - 是否厂商直供
     */
    public Integer getFactory() {
        return factory;
    }

    /**
     * 设置是否厂商直供
     *
     * @param factory 是否厂商直供
     */
    public void setFactory(Integer factory) {
        this.factory = factory;
    }

    /**
     * 获取平台宣传图
     *
     * @return picture - 平台宣传图
     */
    public String getPicture() {
        return picture;
    }

    /**
     * 设置平台宣传图
     *
     * @param picture 平台宣传图
     */
    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    /**
     * 获取品牌故事
     *
     * @return brand_story - 品牌故事
     */
    public String getBrandStory() {
        return brandStory;
    }

    /**
     * 设置品牌故事
     *
     * @param brandStory 品牌故事
     */
    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory == null ? null : brandStory.trim();
    }
}