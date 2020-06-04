package com.zhiqiang.mall.model;


import com.zhiqiang.mall.bean.OmsOrder;
import com.zhiqiang.mall.bean.OmsOrderItem;
import com.zhiqiang.mall.bean.OmsOrderOperateHistory;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 订单详情信息
 */
public class OmsOrderDetail extends OmsOrder {

    public OmsOrderDetail(Long id, Long memberId, Long couponId, String orderSn, Date createTime, String memberUsername, BigDecimal totalAmount, BigDecimal payAmount, BigDecimal freightAmount, BigDecimal promotionAmount, BigDecimal integrationAmount, BigDecimal couponAmount, BigDecimal discountAmount, Integer payType, Integer sourceType, Integer status, Integer orderType, String deliveryCompany, String deliverySn, Integer autoConfirmDay, Integer integration, Integer growth, String promotionInfo, Integer billType, String billHeader, String billContent, String billReceiverPhone, String billReceiverEmail, String receiverName, String receiverPhone, String receiverPostCode, String receiverProvince, String receiverCity, String receiverRegion, String receiverDetailAddress, String note, Integer confirmStatus, Integer deleteStatus, Integer useIntegration, Date paymentTime, Date deliveryTime, Date receiveTime, Date commentTime, Date modifyTime, List<OmsOrderItem> orderItemList, List<OmsOrderOperateHistory> historyList) {
        super(id, memberId, couponId, orderSn, createTime, memberUsername, totalAmount, payAmount, freightAmount, promotionAmount, integrationAmount, couponAmount, discountAmount, payType, sourceType, status, orderType, deliveryCompany, deliverySn, autoConfirmDay, integration, growth, promotionInfo, billType, billHeader, billContent, billReceiverPhone, billReceiverEmail, receiverName, receiverPhone, receiverPostCode, receiverProvince, receiverCity, receiverRegion, receiverDetailAddress, note, confirmStatus, deleteStatus, useIntegration, paymentTime, deliveryTime, receiveTime, commentTime, modifyTime);
        this.orderItemList = orderItemList;
        this.historyList = historyList;
    }
    public OmsOrderDetail(Long id, Long memberId, Long couponId, String orderSn, Date createTime, String memberUsername, BigDecimal totalAmount, BigDecimal payAmount, BigDecimal freightAmount, BigDecimal promotionAmount, BigDecimal integrationAmount, BigDecimal couponAmount, BigDecimal discountAmount, Integer payType, Integer sourceType, Integer status, Integer orderType, String deliveryCompany, String deliverySn, Integer autoConfirmDay, Integer integration, Integer growth, String promotionInfo, Integer billType, String billHeader, String billContent, String billReceiverPhone, String billReceiverEmail, String receiverName, String receiverPhone, String receiverPostCode, String receiverProvince, String receiverCity, String receiverRegion, String receiverDetailAddress, String note, Integer confirmStatus, Integer deleteStatus, Integer useIntegration, Date paymentTime, Date deliveryTime, Date receiveTime, Date commentTime, Date modifyTime) {
        super(id, memberId, couponId, orderSn, createTime, memberUsername, totalAmount, payAmount, freightAmount, promotionAmount, integrationAmount, couponAmount, discountAmount, payType, sourceType, status, orderType, deliveryCompany, deliverySn, autoConfirmDay, integration, growth, promotionInfo, billType, billHeader, billContent, billReceiverPhone, billReceiverEmail, receiverName, receiverPhone, receiverPostCode, receiverProvince, receiverCity, receiverRegion, receiverDetailAddress, note, confirmStatus, deleteStatus, useIntegration, paymentTime, deliveryTime, receiveTime, commentTime, modifyTime);
    }

    public OmsOrderDetail(List<OmsOrderItem> orderItemList, List<OmsOrderOperateHistory> historyList) {
        this.orderItemList = orderItemList;
        this.historyList = historyList;
    }

    @Getter
    @Setter
    private List<OmsOrderItem> orderItemList;
    @Getter
    @Setter
    private List<OmsOrderOperateHistory> historyList;
}
