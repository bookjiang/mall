package com.zhiqiang.mall.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ums_menu")
public class UmsMenu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 父级ID
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 菜单名称
     */
    private String title;

    /**
     * 菜单级数
     */
    private Integer level;

    /**
     * 菜单排序
     */
    private Integer sort;

    /**
     * 前端名称
     */
    private String name;

    /**
     * 前端图标
     */
    private String icon;

    /**
     * 前端隐藏
     */
    private Integer hidden;

    private static final long serialVersionUID = 1L;

    public UmsMenu(Long id, Long parentId, Date createTime, String title, Integer level, Integer sort, String name, String icon, Integer hidden) {
        this.id = id;
        this.parentId = parentId;
        this.createTime = createTime;
        this.title = title;
        this.level = level;
        this.sort = sort;
        this.name = name;
        this.icon = icon;
        this.hidden = hidden;
    }

    public UmsMenu() {
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
     * 获取父级ID
     *
     * @return parent_id - 父级ID
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置父级ID
     *
     * @param parentId 父级ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取菜单名称
     *
     * @return title - 菜单名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置菜单名称
     *
     * @param title 菜单名称
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取菜单级数
     *
     * @return level - 菜单级数
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置菜单级数
     *
     * @param level 菜单级数
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取菜单排序
     *
     * @return sort - 菜单排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置菜单排序
     *
     * @param sort 菜单排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取前端名称
     *
     * @return name - 前端名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置前端名称
     *
     * @param name 前端名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取前端图标
     *
     * @return icon - 前端图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置前端图标
     *
     * @param icon 前端图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 获取前端隐藏
     *
     * @return hidden - 前端隐藏
     */
    public Integer getHidden() {
        return hidden;
    }

    /**
     * 设置前端隐藏
     *
     * @param hidden 前端隐藏
     */
    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", createTime=").append(createTime);
        sb.append(", title=").append(title);
        sb.append(", level=").append(level);
        sb.append(", sort=").append(sort);
        sb.append(", name=").append(name);
        sb.append(", icon=").append(icon);
        sb.append(", hidden=").append(hidden);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}