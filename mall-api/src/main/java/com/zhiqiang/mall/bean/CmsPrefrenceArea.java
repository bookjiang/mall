package com.zhiqiang.mall.bean;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "cms_prefrence_area")
public class CmsPrefrenceArea implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "sub_title")
    private String subTitle;

    private Integer sort;

    @Column(name = "show_status")
    private Integer showStatus;

    /**
     * 展示图片
     */
    private byte[] pic;

    private static final long serialVersionUID = 1L;

    public CmsPrefrenceArea(Long id, String name, String subTitle, Integer sort, Integer showStatus, byte[] pic) {
        this.id = id;
        this.name = name;
        this.subTitle = subTitle;
        this.sort = sort;
        this.showStatus = showStatus;
        this.pic = pic;
    }

    public CmsPrefrenceArea() {
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
     * @return sub_title
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * @param subTitle
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
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
     * 获取展示图片
     *
     * @return pic - 展示图片
     */
    public byte[] getPic() {
        return pic;
    }

    /**
     * 设置展示图片
     *
     * @param pic 展示图片
     */
    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", subTitle=").append(subTitle);
        sb.append(", sort=").append(sort);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", pic=").append(pic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}