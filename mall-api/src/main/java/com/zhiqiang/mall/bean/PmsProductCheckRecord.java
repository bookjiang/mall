package com.zhiqiang.mall.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "pms_product_check_record")
public class PmsProductCheckRecord implements Serializable {
    @Id
    @Column(name = "check_id")
    private Long checkId;

    /**
     * 商品id
     */
    @Column(name = "product_id")
    private Long productId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 审核人
     */
    @Column(name = "check_man")
    private String checkMan;

    /**
     * 审核状态：0->未通过;1->已通过
     */
    private Integer status;

    /**
     * 反馈详情
     */
    private String detail;

    private static final long serialVersionUID = 1L;

    public PmsProductCheckRecord(Long checkId, Long productId, Date createTime, String checkMan, Integer status, String detail) {
        this.checkId = checkId;
        this.productId = productId;
        this.createTime = createTime;
        this.checkMan = checkMan;
        this.status = status;
        this.detail = detail;
    }

    public PmsProductCheckRecord() {
        super();
    }

    /**
     * @return check_id
     */
    public Long getCheckId() {
        return checkId;
    }

    /**
     * @param checkId
     */
    public void setCheckId(Long checkId) {
        this.checkId = checkId;
    }

    /**
     * 获取商品id
     *
     * @return product_id - 商品id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 设置商品id
     *
     * @param productId 商品id
     */
    public void setProductId(Long productId) {
        this.productId = productId;
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
     * 获取审核人
     *
     * @return check_man - 审核人
     */
    public String getCheckMan() {
        return checkMan;
    }

    /**
     * 设置审核人
     *
     * @param checkMan 审核人
     */
    public void setCheckMan(String checkMan) {
        this.checkMan = checkMan == null ? null : checkMan.trim();
    }

    /**
     * 获取审核状态：0->未通过;1->已通过
     *
     * @return status - 审核状态：0->未通过;1->已通过
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置审核状态：0->未通过;1->已通过
     *
     * @param status 审核状态：0->未通过;1->已通过
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取反馈详情
     *
     * @return detail - 反馈详情
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置反馈详情
     *
     * @param detail 反馈详情
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", checkId=").append(checkId);
        sb.append(", productId=").append(productId);
        sb.append(", createTime=").append(createTime);
        sb.append(", checkMan=").append(checkMan);
        sb.append(", status=").append(status);
        sb.append(", detail=").append(detail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}