package com.zhiqiang.mall.bean;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "pms_brand")
public class PmsBrand implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    /**
     * 首字母
     */
    @Column(name = "first_letter")
    private String firstLetter;

    private Integer sort;

    /**
     * 是否为品牌制造商：0->不是；1->是
     */
    @Column(name = "factory_status")
    private Integer factoryStatus;

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
     * 专区大图
     */
    @Column(name = "big_pic")
    private String bigPic;

    /**
     * 品牌故事
     */
    @Column(name = "brand_story")
    private String brandStory;

    private static final long serialVersionUID = 1L;

    public PmsBrand(Long id, String name, String firstLetter, Integer sort, Integer factoryStatus, Integer showStatus, Integer productCount, Integer productCommentCount, String logo, String bigPic, String brandStory) {
        this.id = id;
        this.name = name;
        this.firstLetter = firstLetter;
        this.sort = sort;
        this.factoryStatus = factoryStatus;
        this.showStatus = showStatus;
        this.productCount = productCount;
        this.productCommentCount = productCommentCount;
        this.logo = logo;
        this.bigPic = bigPic;
        this.brandStory = brandStory;
    }

    public PmsBrand() {
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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取首字母
     *
     * @return first_letter - 首字母
     */
    public String getFirstLetter() {
        return firstLetter;
    }

    /**
     * 设置首字母
     *
     * @param firstLetter 首字母
     */
    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter == null ? null : firstLetter.trim();
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

    /**
     * 获取是否为品牌制造商：0->不是；1->是
     *
     * @return factory_status - 是否为品牌制造商：0->不是；1->是
     */
    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    /**
     * 设置是否为品牌制造商：0->不是；1->是
     *
     * @param factoryStatus 是否为品牌制造商：0->不是；1->是
     */
    public void setFactoryStatus(Integer factoryStatus) {
        this.factoryStatus = factoryStatus;
    }

    /**
     * @return show_status
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * @param showStatus
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
     * 获取专区大图
     *
     * @return big_pic - 专区大图
     */
    public String getBigPic() {
        return bigPic;
    }

    /**
     * 设置专区大图
     *
     * @param bigPic 专区大图
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
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", firstLetter=").append(firstLetter);
        sb.append(", sort=").append(sort);
        sb.append(", factoryStatus=").append(factoryStatus);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", productCount=").append(productCount);
        sb.append(", productCommentCount=").append(productCommentCount);
        sb.append(", logo=").append(logo);
        sb.append(", bigPic=").append(bigPic);
        sb.append(", brandStory=").append(brandStory);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}