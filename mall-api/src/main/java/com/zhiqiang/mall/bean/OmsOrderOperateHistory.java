package com.zhiqiang.mall.bean;

import java.util.Date;
import javax.persistence.*;

@Table(name = "oms_order_operate_history")
public class OmsOrderOperateHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_operate_history_id")
    private Long orderOperateHistoryId;

    /**
     * 订单id
     */
    @Column(name = "order_id")
    private Long orderId;

    /**
     * 操作者：用户；系统；后台管理员
     */
    @Column(name = "operate_man")
    private String operateMan;

    /**
     * 操作时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 操作前订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    @Column(name = "order_before_status")
    private Integer orderBeforeStatus;

    /**
     * 操作后订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    @Column(name = "order_late_status")
    private Integer orderLateStatus;

    /**
     * 备注
     */
    private String note;

    public OmsOrderOperateHistory(Long orderOperateHistoryId, Long orderId, String operateMan, Date createTime, Integer orderBeforeStatus, Integer orderLateStatus, String note) {
        this.orderOperateHistoryId = orderOperateHistoryId;
        this.orderId = orderId;
        this.operateMan = operateMan;
        this.createTime = createTime;
        this.orderBeforeStatus = orderBeforeStatus;
        this.orderLateStatus = orderLateStatus;
        this.note = note;
    }

    public OmsOrderOperateHistory() {
        super();
    }

    /**
     * @return order_operate_history_id
     */
    public Long getOrderOperateHistoryId() {
        return orderOperateHistoryId;
    }

    /**
     * @param orderOperateHistoryId
     */
    public void setOrderOperateHistoryId(Long orderOperateHistoryId) {
        this.orderOperateHistoryId = orderOperateHistoryId;
    }

    /**
     * 获取订单id
     *
     * @return order_id - 订单id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id
     *
     * @param orderId 订单id
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取操作者：用户；系统；后台管理员
     *
     * @return operate_man - 操作者：用户；系统；后台管理员
     */
    public String getOperateMan() {
        return operateMan;
    }

    /**
     * 设置操作者：用户；系统；后台管理员
     *
     * @param operateMan 操作者：用户；系统；后台管理员
     */
    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan == null ? null : operateMan.trim();
    }

    /**
     * 获取操作时间
     *
     * @return create_time - 操作时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置操作时间
     *
     * @param createTime 操作时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取操作前订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     *
     * @return order_before_status - 操作前订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    public Integer getOrderBeforeStatus() {
        return orderBeforeStatus;
    }

    /**
     * 设置操作前订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     *
     * @param orderBeforeStatus 操作前订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    public void setOrderBeforeStatus(Integer orderBeforeStatus) {
        this.orderBeforeStatus = orderBeforeStatus;
    }

    /**
     * 获取操作后订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     *
     * @return order_late_status - 操作后订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    public Integer getOrderLateStatus() {
        return orderLateStatus;
    }

    /**
     * 设置操作后订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     *
     * @param orderLateStatus 操作后订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    public void setOrderLateStatus(Integer orderLateStatus) {
        this.orderLateStatus = orderLateStatus;
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
}