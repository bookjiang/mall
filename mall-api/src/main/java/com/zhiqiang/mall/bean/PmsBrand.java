package com.zhiqiang.mall.bean;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "pms_brand")
public class PmsBrand implements Serializable {
    /**
     * 品牌id
     */
    @Id
    @Column(name = "brand_id")
    private Long id;

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
    @Column(name = "factory")
    private Integer factoryStatus;

    /**
     * 平台宣传图
     */
    @Column(name = "picture")
    private String bigPic;

    /**
     * 品牌故事
     */
    @Column(name = "brand_story")
    private String brandStory;

    private static final long serialVersionUID = 1L;

    public PmsBrand(Long id, String name, Integer showStatus, Integer productCount, Integer productCommentCount, String logo, Integer factoryStatus, String bigPic, String brandStory) {
        this.id = id;
        this.name = name;
        this.showStatus = showStatus;
        this.productCount = productCount;
        this.productCommentCount = productCommentCount;
        this.logo = logo;
        this.factoryStatus = factoryStatus;
        this.bigPic = bigPic;
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
    public Long getId() {
        return id;
    }

    /**
     * 设置品牌id
     *
     * @param id 品牌id
     */
    public void setId(Long id) {
        this.id = id;
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
    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    /**
     * 设置是否厂商直供
     *
     * @param factoryStatus 是否厂商直供
     */
    public void setFactoryStatus(Integer factoryStatus) {
        this.factoryStatus = factoryStatus;
    }

    /**
     * 获取平台宣传图
     *
     * @return picture - 平台宣传图
     */
    public String getBigPic() {
        return bigPic;
    }

    /**
     * 设置平台宣传图
     *
     * @param bigPic 平台宣传图
     */
    public void setBigPic(String bigPic) {
        this.bigPic = bigPic == null ? null : bigPic.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", brandId=").append(id);
        sb.append(", name=").append(name);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", productCount=").append(productCount);
        sb.append(", productCommentCount=").append(productCommentCount);
        sb.append(", logo=").append(logo);
        sb.append(", factory=").append(factoryStatus);
        sb.append(", picture=").append(bigPic);
        sb.append(", brandStory=").append(brandStory);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}