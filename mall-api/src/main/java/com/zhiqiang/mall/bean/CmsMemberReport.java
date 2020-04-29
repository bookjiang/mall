package com.zhiqiang.mall.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "cms_member_report")
public class CmsMemberReport implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 举报人
     */
    @Column(name = "report_member_name")
    private String reportMemberName;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 举报类型：0->对评价举报；1->对其他举报
     */
    @Column(name = "report_type")
    private Integer reportType;

    /**
     * 被举报评价id(当对其他举报时，此项默认空）
     */
    @Column(name = "comment_id")
    private Long commentId;

    /**
     * 举报对象
     */
    @Column(name = "report_object")
    private String reportObject;

    /**
     * 举报状态：0->未处理；1->已处理
     */
    @Column(name = "report_status")
    private Integer reportStatus;

    /**
     * 处理结果：0->无效；1->有效；2->恶意
     */
    @Column(name = "handle_status")
    private Integer handleStatus;

    private String note;

    /**
     * 处理管理员admin_id
     */
    @Column(name = "handle_man")
    private Long handleMan;

    /**
     * 举报内容
     */
    @Column(name = "report_content")
    private String reportContent;

    /**
     * 处理回复
     */
    @Column(name = "handle_replay")
    private String handleReplay;

    private static final long serialVersionUID = 1L;

    public CmsMemberReport(Long id, String reportMemberName, Date createTime, Integer reportType, Long commentId, String reportObject, Integer reportStatus, Integer handleStatus, String note, Long handleMan, String reportContent, String handleReplay) {
        this.id = id;
        this.reportMemberName = reportMemberName;
        this.createTime = createTime;
        this.reportType = reportType;
        this.commentId = commentId;
        this.reportObject = reportObject;
        this.reportStatus = reportStatus;
        this.handleStatus = handleStatus;
        this.note = note;
        this.handleMan = handleMan;
        this.reportContent = reportContent;
        this.handleReplay = handleReplay;
    }

    public CmsMemberReport() {
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
     * 获取举报人
     *
     * @return report_member_name - 举报人
     */
    public String getReportMemberName() {
        return reportMemberName;
    }

    /**
     * 设置举报人
     *
     * @param reportMemberName 举报人
     */
    public void setReportMemberName(String reportMemberName) {
        this.reportMemberName = reportMemberName == null ? null : reportMemberName.trim();
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
     * 获取举报类型：0->对评价举报；1->对其他举报
     *
     * @return report_type - 举报类型：0->对评价举报；1->对其他举报
     */
    public Integer getReportType() {
        return reportType;
    }

    /**
     * 设置举报类型：0->对评价举报；1->对其他举报
     *
     * @param reportType 举报类型：0->对评价举报；1->对其他举报
     */
    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    /**
     * 获取被举报评价id(当对其他举报时，此项默认空）
     *
     * @return comment_id - 被举报评价id(当对其他举报时，此项默认空）
     */
    public Long getCommentId() {
        return commentId;
    }

    /**
     * 设置被举报评价id(当对其他举报时，此项默认空）
     *
     * @param commentId 被举报评价id(当对其他举报时，此项默认空）
     */
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    /**
     * 获取举报对象
     *
     * @return report_object - 举报对象
     */
    public String getReportObject() {
        return reportObject;
    }

    /**
     * 设置举报对象
     *
     * @param reportObject 举报对象
     */
    public void setReportObject(String reportObject) {
        this.reportObject = reportObject == null ? null : reportObject.trim();
    }

    /**
     * 获取举报状态：0->未处理；1->已处理
     *
     * @return report_status - 举报状态：0->未处理；1->已处理
     */
    public Integer getReportStatus() {
        return reportStatus;
    }

    /**
     * 设置举报状态：0->未处理；1->已处理
     *
     * @param reportStatus 举报状态：0->未处理；1->已处理
     */
    public void setReportStatus(Integer reportStatus) {
        this.reportStatus = reportStatus;
    }

    /**
     * 获取处理结果：0->无效；1->有效；2->恶意
     *
     * @return handle_status - 处理结果：0->无效；1->有效；2->恶意
     */
    public Integer getHandleStatus() {
        return handleStatus;
    }

    /**
     * 设置处理结果：0->无效；1->有效；2->恶意
     *
     * @param handleStatus 处理结果：0->无效；1->有效；2->恶意
     */
    public void setHandleStatus(Integer handleStatus) {
        this.handleStatus = handleStatus;
    }

    /**
     * @return note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * 获取处理管理员admin_id
     *
     * @return handle_man - 处理管理员admin_id
     */
    public Long getHandleMan() {
        return handleMan;
    }

    /**
     * 设置处理管理员admin_id
     *
     * @param handleMan 处理管理员admin_id
     */
    public void setHandleMan(Long handleMan) {
        this.handleMan = handleMan;
    }

    /**
     * 获取举报内容
     *
     * @return report_content - 举报内容
     */
    public String getReportContent() {
        return reportContent;
    }

    /**
     * 设置举报内容
     *
     * @param reportContent 举报内容
     */
    public void setReportContent(String reportContent) {
        this.reportContent = reportContent == null ? null : reportContent.trim();
    }

    /**
     * 获取处理回复
     *
     * @return handle_replay - 处理回复
     */
    public String getHandleReplay() {
        return handleReplay;
    }

    /**
     * 设置处理回复
     *
     * @param handleReplay 处理回复
     */
    public void setHandleReplay(String handleReplay) {
        this.handleReplay = handleReplay == null ? null : handleReplay.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", reportMemberName=").append(reportMemberName);
        sb.append(", createTime=").append(createTime);
        sb.append(", reportType=").append(reportType);
        sb.append(", commentId=").append(commentId);
        sb.append(", reportObject=").append(reportObject);
        sb.append(", reportStatus=").append(reportStatus);
        sb.append(", handleStatus=").append(handleStatus);
        sb.append(", note=").append(note);
        sb.append(", handleMan=").append(handleMan);
        sb.append(", reportContent=").append(reportContent);
        sb.append(", handleReplay=").append(handleReplay);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}