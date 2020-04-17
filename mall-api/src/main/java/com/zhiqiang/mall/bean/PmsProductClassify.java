package com.zhiqiang.mall.bean;

import javax.persistence.*;

@Table(name = "pms_product_classify")
public class PmsProductClassify {
    /**
     * 分类id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_classify_id")
    private Long productClassifyId;

    /**
     * 上级分类编号，0表示一级分类；
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 分类名称（名称示例：服装-T恤）
     */
    private String name;

    /**
     * 分类级别
     */
    private Integer level;

    /**
     * 商品数量
     */
    @Column(name = "product_count")
    private Integer productCount;

    /**
     * 商品单位
     */
    @Column(name = "product_unit")
    private String productUnit;

    /**
     * 导航栏是否显示：0->不显示；1->显示
     */
    @Column(name = "nav_status")
    private Integer navStatus;

    /**
     * 移动端是否显示:0->不显示；1->显示
     */
    @Column(name = "show_status")
    private Integer showStatus;

    /**
     * 图标
     */
    private String icon;

    /**
     * 描述
     */
    private String description;

    public PmsProductClassify(Long productClassifyId, Long parentId, String name, Integer level, Integer productCount, String productUnit, Integer navStatus, Integer showStatus, String icon, String description) {
        this.productClassifyId = productClassifyId;
        this.parentId = parentId;
        this.name = name;
        this.level = level;
        this.productCount = productCount;
        this.productUnit = productUnit;
        this.navStatus = navStatus;
        this.showStatus = showStatus;
        this.icon = icon;
        this.description = description;
    }

    public PmsProductClassify() {
        super();
    }

    /**
     * 获取分类id
     *
     * @return product_classify_id - 分类id
     */
    public Long getProductClassifyId() {
        return productClassifyId;
    }

    /**
     * 设置分类id
     *
     * @param productClassifyId 分类id
     */
    public void setProductClassifyId(Long productClassifyId) {
        this.productClassifyId = productClassifyId;
    }

    /**
     * 获取上级分类编号，0表示一级分类；
     *
     * @return parent_id - 上级分类编号，0表示一级分类；
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置上级分类编号，0表示一级分类；
     *
     * @param parentId 上级分类编号，0表示一级分类；
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取分类名称（名称示例：服装-T恤）
     *
     * @return name - 分类名称（名称示例：服装-T恤）
     */
    public String getName() {
        return name;
    }

    /**
     * 设置分类名称（名称示例：服装-T恤）
     *
     * @param name 分类名称（名称示例：服装-T恤）
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取分类级别
     *
     * @return level - 分类级别
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置分类级别
     *
     * @param level 分类级别
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取商品数量
     *
     * @return product_count - 商品数量
     */
    public Integer getProductCount() {
        return productCount;
    }

    /**
     * 设置商品数量
     *
     * @param productCount 商品数量
     */
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    /**
     * 获取商品单位
     *
     * @return product_unit - 商品单位
     */
    public String getProductUnit() {
        return productUnit;
    }

    /**
     * 设置商品单位
     *
     * @param productUnit 商品单位
     */
    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit == null ? null : productUnit.trim();
    }

    /**
     * 获取导航栏是否显示：0->不显示；1->显示
     *
     * @return nav_status - 导航栏是否显示：0->不显示；1->显示
     */
    public Integer getNavStatus() {
        return navStatus;
    }

    /**
     * 设置导航栏是否显示：0->不显示；1->显示
     *
     * @param navStatus 导航栏是否显示：0->不显示；1->显示
     */
    public void setNavStatus(Integer navStatus) {
        this.navStatus = navStatus;
    }

    /**
     * 获取移动端是否显示:0->不显示；1->显示
     *
     * @return show_status - 移动端是否显示:0->不显示；1->显示
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * 设置移动端是否显示:0->不显示；1->显示
     *
     * @param showStatus 移动端是否显示:0->不显示；1->显示
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
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
}