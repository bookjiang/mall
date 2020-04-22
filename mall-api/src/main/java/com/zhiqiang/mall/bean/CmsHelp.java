package com.zhiqiang.mall.bean;

import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "cms_help")
@ToString
public class CmsHelp implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "classify_id")
    private Long classifyId;

    private String icon;

    private String title;

    /**
     * 是否显示：0->不显示；1->显示
     */
    @Column(name = "show_status")
    private Integer showStatus;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "read_count")
    private Integer readCount;

    private String content;

    public CmsHelp(Long id, Long classifyId, String icon, String title, Integer showStatus, Date createTime, Integer readCount, String content) {
        this.id = id;
        this.classifyId = classifyId;
        this.icon = icon;
        this.title = title;
        this.showStatus = showStatus;
        this.createTime = createTime;
        this.readCount = readCount;
        this.content = content;
    }

    public CmsHelp() {
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
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return read_count
     */
    public Integer getReadCount() {
        return readCount;
    }

    /**
     * @param readCount
     */
    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}