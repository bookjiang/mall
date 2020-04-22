package com.zhiqiang.mall.bean;

import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
@ToString
@Table(name = "oms_order_return_reason")
public class OmsOrderReturnReason implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_return_reason_id")
    private Long orderReturnReasonId;

    /**
     * 原因
     */
    private String name;

    /**
     * 是否显示:0->不显示；1->显示
     */
    private Integer staus;

    /**
     * 添加时间
     */
    @Column(name = "create_time")
    private Date createTime;

    public OmsOrderReturnReason(Long orderReturnReasonId, String name, Integer staus, Date createTime) {
        this.orderReturnReasonId = orderReturnReasonId;
        this.name = name;
        this.staus = staus;
        this.createTime = createTime;
    }

    public OmsOrderReturnReason() {
        super();
    }

    /**
     * @return order_return_reason_id
     */
    public Long getOrderReturnReasonId() {
        return orderReturnReasonId;
    }

    /**
     * @param orderReturnReasonId
     */
    public void setOrderReturnReasonId(Long orderReturnReasonId) {
        this.orderReturnReasonId = orderReturnReasonId;
    }

    /**
     * 获取原因
     *
     * @return name - 原因
     */
    public String getName() {
        return name;
    }

    /**
     * 设置原因
     *
     * @param name 原因
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取是否显示:0->不显示；1->显示
     *
     * @return staus - 是否显示:0->不显示；1->显示
     */
    public Integer getStaus() {
        return staus;
    }

    /**
     * 设置是否显示:0->不显示；1->显示
     *
     * @param staus 是否显示:0->不显示；1->显示
     */
    public void setStaus(Integer staus) {
        this.staus = staus;
    }

    /**
     * 获取添加时间
     *
     * @return create_time - 添加时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置添加时间
     *
     * @param createTime 添加时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}