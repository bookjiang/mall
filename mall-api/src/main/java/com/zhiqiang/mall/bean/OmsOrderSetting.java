package com.zhiqiang.mall.bean;

import javax.persistence.*;

@Table(name = "oms_order_setting")
public class OmsOrderSetting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_setting_id")
    private Long orderSettingId;

    /**
     * 秒杀订单超时关闭时间（分钟）
     */
    @Column(name = "sales_close_time")
    private Integer salesCloseTime;

    /**
     * 正常订单超时关闭时间（分）
     */
    @Column(name = "normal_close_time")
    private Integer normalCloseTime;

    /**
     * 自动收货时间（天）
     */
    @Column(name = "confirm_close_time")
    private Integer confirmCloseTime;

    /**
     * 售后时间（天）
     */
    @Column(name = "after_sales_time")
    private Integer afterSalesTime;

    /**
     * 订单自动评价时间（天)
     */
    @Column(name = "auto_comment_time")
    private Integer autoCommentTime;

    public OmsOrderSetting(Long orderSettingId, Integer salesCloseTime, Integer normalCloseTime, Integer confirmCloseTime, Integer afterSalesTime, Integer autoCommentTime) {
        this.orderSettingId = orderSettingId;
        this.salesCloseTime = salesCloseTime;
        this.normalCloseTime = normalCloseTime;
        this.confirmCloseTime = confirmCloseTime;
        this.afterSalesTime = afterSalesTime;
        this.autoCommentTime = autoCommentTime;
    }

    public OmsOrderSetting() {
        super();
    }

    /**
     * @return order_setting_id
     */
    public Long getOrderSettingId() {
        return orderSettingId;
    }

    /**
     * @param orderSettingId
     */
    public void setOrderSettingId(Long orderSettingId) {
        this.orderSettingId = orderSettingId;
    }

    /**
     * 获取秒杀订单超时关闭时间（分钟）
     *
     * @return sales_close_time - 秒杀订单超时关闭时间（分钟）
     */
    public Integer getSalesCloseTime() {
        return salesCloseTime;
    }

    /**
     * 设置秒杀订单超时关闭时间（分钟）
     *
     * @param salesCloseTime 秒杀订单超时关闭时间（分钟）
     */
    public void setSalesCloseTime(Integer salesCloseTime) {
        this.salesCloseTime = salesCloseTime;
    }

    /**
     * 获取正常订单超时关闭时间（分）
     *
     * @return normal_close_time - 正常订单超时关闭时间（分）
     */
    public Integer getNormalCloseTime() {
        return normalCloseTime;
    }

    /**
     * 设置正常订单超时关闭时间（分）
     *
     * @param normalCloseTime 正常订单超时关闭时间（分）
     */
    public void setNormalCloseTime(Integer normalCloseTime) {
        this.normalCloseTime = normalCloseTime;
    }

    /**
     * 获取自动收货时间（天）
     *
     * @return confirm_close_time - 自动收货时间（天）
     */
    public Integer getConfirmCloseTime() {
        return confirmCloseTime;
    }

    /**
     * 设置自动收货时间（天）
     *
     * @param confirmCloseTime 自动收货时间（天）
     */
    public void setConfirmCloseTime(Integer confirmCloseTime) {
        this.confirmCloseTime = confirmCloseTime;
    }

    /**
     * 获取售后时间（天）
     *
     * @return after_sales_time - 售后时间（天）
     */
    public Integer getAfterSalesTime() {
        return afterSalesTime;
    }

    /**
     * 设置售后时间（天）
     *
     * @param afterSalesTime 售后时间（天）
     */
    public void setAfterSalesTime(Integer afterSalesTime) {
        this.afterSalesTime = afterSalesTime;
    }

    /**
     * 获取订单自动评价时间（天)
     *
     * @return auto_comment_time - 订单自动评价时间（天)
     */
    public Integer getAutoCommentTime() {
        return autoCommentTime;
    }

    /**
     * 设置订单自动评价时间（天)
     *
     * @param autoCommentTime 订单自动评价时间（天)
     */
    public void setAutoCommentTime(Integer autoCommentTime) {
        this.autoCommentTime = autoCommentTime;
    }
}