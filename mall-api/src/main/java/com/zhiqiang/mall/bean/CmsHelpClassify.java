package com.zhiqiang.mall.bean;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "cms_help_classify")
public class CmsHelpClassify implements Serializable {
    @Id
    @Column(name = "classify_id")
    private Long classifyId;

    private String name;

    /**
     * 分类图标
     */
    private String icon;

    /**
     * 专题数量
     */
    @Column(name = "help_count")
    private Integer helpCount;

    /**
     * 是否显示：0->不显示；1->显示
     */
    @Column(name = "show_status")
    private Integer showStatus;

    /**
     * 备注
     */
    private String note;

    private static final long serialVersionUID = 1L;

    public CmsHelpClassify(Long classifyId, String name, String icon, Integer helpCount, Integer showStatus, String note) {
        this.classifyId = classifyId;
        this.name = name;
        this.icon = icon;
        this.helpCount = helpCount;
        this.showStatus = showStatus;
        this.note = note;
    }

    public CmsHelpClassify() {
        super();
    }

    /**
     * @return classify_id
     */
    public Long getClassifyId() {
        return classifyId;
    }

    /**
     * @param classifyId
     */
    public void setClassifyId(Long classifyId) {
        this.classifyId = classifyId;
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
     * 获取分类图标
     *
     * @return icon - 分类图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置分类图标
     *
     * @param icon 分类图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 获取专题数量
     *
     * @return help_count - 专题数量
     */
    public Integer getHelpCount() {
        return helpCount;
    }

    /**
     * 设置专题数量
     *
     * @param helpCount 专题数量
     */
    public void setHelpCount(Integer helpCount) {
        this.helpCount = helpCount;
    }

    /**
     * 获取是否显示：0->不显示；1->显示
     *
     * @return show_status - 是否显示：0->不显示；1->显示
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * 设置是否显示：0->不显示；1->显示
     *
     * @param showStatus 是否显示：0->不显示；1->显示
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * 获取备注
     *
     * @return note - 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置备注
     *
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", classifyId=").append(classifyId);
        sb.append(", name=").append(name);
        sb.append(", icon=").append(icon);
        sb.append(", helpCount=").append(helpCount);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}