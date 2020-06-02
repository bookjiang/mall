package com.zhiqiang.mall.bean;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "pms_product_category")
public class PmsProductCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 上机分类的编号：0表示一级分类
     */
    @Column(name = "parent_id")
    private Long parentId;

    private String name;

    /**
     * 分类级别：0->1级；1->2级
     */
    private Integer level;

    @Column(name = "product_count")
    private Integer productCount;

    @Column(name = "product_unit")
    private String productUnit;

    /**
     * 是否显示在导航栏：0->不显示；1->显示
     */
    @Column(name = "nav_status")
    private Integer navStatus;

    /**
     * 显示状态：0->不显示；1->显示
     */
    @Column(name = "show_status")
    private Integer showStatus;

    private Integer sort;

    /**
     * 图标
     */
    private String icon;

    private String keywords;

    /**
     * 描述
     */
    private String description;

    private static final long serialVersionUID = 1L;

    public PmsProductCategory(Long id, Long parentId, String name, Integer level, Integer productCount, String productUnit, Integer navStatus, Integer showStatus, Integer sort, String icon, String keywords, String description) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.level = level;
        this.productCount = productCount;
        this.productUnit = productUnit;
        this.navStatus = navStatus;
        this.showStatus = showStatus;
        this.sort = sort;
        this.icon = icon;
        this.keywords = keywords;
        this.description = description;
    }
    public PmsProductCategory(Long id, Long parentId, String name, Integer level, Integer productCount, String productUnit, Integer navStatus, Integer showStatus, Integer sort, String icon, String keywords) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.level = level;
        this.productCount = productCount;
        this.productUnit = productUnit;
        this.navStatus = navStatus;
        this.showStatus = showStatus;
        this.sort = sort;
        this.icon = icon;
        this.keywords = keywords;
        this.description = null;
    }
    public PmsProductCategory() {
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
     * 获取上机分类的编号：0表示一级分类
     *
     * @return parent_id - 上机分类的编号：0表示一级分类
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置上机分类的编号：0表示一级分类
     *
     * @param parentId 上机分类的编号：0表示一级分类
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
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
     * 获取分类级别：0->1级；1->2级
     *
     * @return level - 分类级别：0->1级；1->2级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置分类级别：0->1级；1->2级
     *
     * @param level 分类级别：0->1级；1->2级
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * @return product_count
     */
    public Integer getProductCount() {
        return productCount;
    }

    /**
     * @param productCount
     */
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    /**
     * @return product_unit
     */
    public String getProductUnit() {
        return productUnit;
    }

    /**
     * @param productUnit
     */
    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit == null ? null : productUnit.trim();
    }

    /**
     * 获取是否显示在导航栏：0->不显示；1->显示
     *
     * @return nav_status - 是否显示在导航栏：0->不显示；1->显示
     */
    public Integer getNavStatus() {
        return navStatus;
    }

    /**
     * 设置是否显示在导航栏：0->不显示；1->显示
     *
     * @param navStatus 是否显示在导航栏：0->不显示；1->显示
     */
    public void setNavStatus(Integer navStatus) {
        this.navStatus = navStatus;
    }

    /**
     * 获取显示状态：0->不显示；1->显示
     *
     * @return show_status - 显示状态：0->不显示；1->显示
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * 设置显示状态：0->不显示；1->显示
     *
     * @param showStatus 显示状态：0->不显示；1->显示
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
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
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * @return keywords
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * @param keywords
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", name=").append(name);
        sb.append(", level=").append(level);
        sb.append(", productCount=").append(productCount);
        sb.append(", productUnit=").append(productUnit);
        sb.append(", navStatus=").append(navStatus);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", sort=").append(sort);
        sb.append(", icon=").append(icon);
        sb.append(", keywords=").append(keywords);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}