package com.zhiqiang.mall.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "sms_sales")
public class SmsSales implements Serializable {
    @Id
    @Column(name = "sales_id")
    private Long salesId;

    /**
     * 标题
     */
    private String title;

    /**
     * 开始日期
     */
    @Column(name = "start_date")
    private Date startDate;

    /**
     * 结束日期
     */
    @Column(name = "end_date")
    private Date endDate;

    /**
     * 上下线状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public SmsSales(Long salesId, String title, Date startDate, Date endDate, Integer status, Date createTime) {
        this.salesId = salesId;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.createTime = createTime;
    }

    public SmsSales() {
        super();
    }

    /**
     * @return sales_id
     */
    public Long getSalesId() {
        return salesId;
    }

    /**
     * @param salesId
     */
    public void setSalesId(Long salesId) {
        this.salesId = salesId;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取开始日期
     *
     * @return start_date - 开始日期
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置开始日期
     *
     * @param startDate 开始日期
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取结束日期
     *
     * @return end_date - 结束日期
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置结束日期
     *
     * @param endDate 结束日期
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取上下线状态
     *
     * @return status - 上下线状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置上下线状态
     *
     * @param status 上下线状态
     */
    public void setStatus(Integer status) {
        this.status = status;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", salesId=").append(salesId);
        sb.append(", title=").append(title);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}