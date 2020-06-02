package com.zhiqiang.mall.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "oms_order")
public class OmsOrder implements Serializable {
    /**
     * 订单id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "coupon_id")
    private Long couponId;

    /**
     * 订单编号
     */
    @Column(name = "order_sn")
    private String orderSn;

    /**
     * 提交时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 用户帐号
     */
    @Column(name = "member_username")
    private String memberUsername;

    /**
     * 订单总金额
     */
    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    /**
     * 应付金额（实际支付金额）
     */
    @Column(name = "pay_amount")
    private BigDecimal payAmount;

    /**
     * 运费金额
     */
    @Column(name = "freight_amount")
    private BigDecimal freightAmount;

    /**
     * 促销优化金额（促销价、满减、阶梯价）
     */
    @Column(name = "promotion_amount")
    private BigDecimal promotionAmount;

    /**
     * 积分抵扣金额
     */
    @Column(name = "integration_amount")
    private BigDecimal integrationAmount;

    /**
     * 优惠券抵扣金额
     */
    @Column(name = "coupon_amount")
    private BigDecimal couponAmount;

    /**
     * 管理员后台调整订单使用的折扣金额
     */
    @Column(name = "discount_amount")
    private BigDecimal discountAmount;

    /**
     * 支付方式：0->未支付；1->支付宝；2->微信
     */
    @Column(name = "pay_type")
    private Integer payType;

    /**
     * 订单来源：0->PC订单；1->app订单
     */
    @Column(name = "source_type")
    private Integer sourceType;

    /**
     * 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    private Integer status;

    /**
     * 订单类型：0->正常订单；1->秒杀订单
     */
    @Column(name = "order_type")
    private Integer orderType;

    /**
     * 物流公司(配送方式)
     */
    @Column(name = "delivery_company")
    private String deliveryCompany;

    /**
     * 物流单号
     */
    @Column(name = "delivery_sn")
    private String deliverySn;

    /**
     * 自动确认时间（天）
     */
    @Column(name = "auto_confirm_day")
    private Integer autoConfirmDay;

    /**
     * 可以获得的积分
     */
    private Integer integration;

    /**
     * 可以活动的成长值
     */
    private Integer growth;

    /**
     * 活动信息
     */
    @Column(name = "promotion_info")
    private String promotionInfo;

    /**
     * 发票类型：0->不开发票；1->电子发票；2->纸质发票
     */
    @Column(name = "bill_type")
    private Integer billType;

    /**
     * 发票抬头
     */
    @Column(name = "bill_header")
    private String billHeader;

    /**
     * 发票内容
     */
    @Column(name = "bill_content")
    private String billContent;

    /**
     * 收票人电话
     */
    @Column(name = "bill_receiver_phone")
    private String billReceiverPhone;

    /**
     * 收票人邮箱
     */
    @Column(name = "bill_receiver_email")
    private String billReceiverEmail;

    /**
     * 收货人姓名
     */
    @Column(name = "receiver_name")
    private String receiverName;

    /**
     * 收货人电话
     */
    @Column(name = "receiver_phone")
    private String receiverPhone;

    /**
     * 收货人邮编
     */
    @Column(name = "receiver_post_code")
    private String receiverPostCode;

    /**
     * 省份/直辖市
     */
    @Column(name = "receiver_province")
    private String receiverProvince;

    /**
     * 城市
     */
    @Column(name = "receiver_city")
    private String receiverCity;

    /**
     * 区
     */
    @Column(name = "receiver_region")
    private String receiverRegion;

    /**
     * 详细地址
     */
    @Column(name = "receiver_detail_address")
    private String receiverDetailAddress;

    /**
     * 订单备注
     */
    private String note;

    /**
     * 确认收货状态：0->未确认；1->已确认
     */
    @Column(name = "confirm_status")
    private Integer confirmStatus;

    /**
     * 删除状态：0->未删除；1->已删除
     */
    @Column(name = "delete_status")
    private Integer deleteStatus;

    /**
     * 下单时使用的积分
     */
    @Column(name = "use_integration")
    private Integer useIntegration;

    /**
     * 支付时间
     */
    @Column(name = "payment_time")
    private Date paymentTime;

    /**
     * 发货时间
     */
    @Column(name = "delivery_time")
    private Date deliveryTime;

    /**
     * 确认收货时间
     */
    @Column(name = "receive_time")
    private Date receiveTime;

    /**
     * 评价时间
     */
    @Column(name = "comment_time")
    private Date commentTime;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    private static final long serialVersionUID = 1L;

    public OmsOrder(Long id, Long memberId, Long couponId, String orderSn, Date createTime, String memberUsername, BigDecimal totalAmount, BigDecimal payAmount, BigDecimal freightAmount, BigDecimal promotionAmount, BigDecimal integrationAmount, BigDecimal couponAmount, BigDecimal discountAmount, Integer payType, Integer sourceType, Integer status, Integer orderType, String deliveryCompany, String deliverySn, Integer autoConfirmDay, Integer integration, Integer growth, String promotionInfo, Integer billType, String billHeader, String billContent, String billReceiverPhone, String billReceiverEmail, String receiverName, String receiverPhone, String receiverPostCode, String receiverProvince, String receiverCity, String receiverRegion, String receiverDetailAddress, String note, Integer confirmStatus, Integer deleteStatus, Integer useIntegration, Date paymentTime, Date deliveryTime, Date receiveTime, Date commentTime, Date modifyTime) {
        this.id = id;
        this.memberId = memberId;
        this.couponId = couponId;
        this.orderSn = orderSn;
        this.createTime = createTime;
        this.memberUsername = memberUsername;
        this.totalAmount = totalAmount;
        this.payAmount = payAmount;
        this.freightAmount = freightAmount;
        this.promotionAmount = promotionAmount;
        this.integrationAmount = integrationAmount;
        this.couponAmount = couponAmount;
        this.discountAmount = discountAmount;
        this.payType = payType;
        this.sourceType = sourceType;
        this.status = status;
        this.orderType = orderType;
        this.deliveryCompany = deliveryCompany;
        this.deliverySn = deliverySn;
        this.autoConfirmDay = autoConfirmDay;
        this.integration = integration;
        this.growth = growth;
        this.promotionInfo = promotionInfo;
        this.billType = billType;
        this.billHeader = billHeader;
        this.billContent = billContent;
        this.billReceiverPhone = billReceiverPhone;
        this.billReceiverEmail = billReceiverEmail;
        this.receiverName = receiverName;
        this.receiverPhone = receiverPhone;
        this.receiverPostCode = receiverPostCode;
        this.receiverProvince = receiverProvince;
        this.receiverCity = receiverCity;
        this.receiverRegion = receiverRegion;
        this.receiverDetailAddress = receiverDetailAddress;
        this.note = note;
        this.confirmStatus = confirmStatus;
        this.deleteStatus = deleteStatus;
        this.useIntegration = useIntegration;
        this.paymentTime = paymentTime;
        this.deliveryTime = deliveryTime;
        this.receiveTime = receiveTime;
        this.commentTime = commentTime;
        this.modifyTime = modifyTime;
    }

    public OmsOrder() {
        super();
    }

    /**
     * 获取订单id
     *
     * @return id - 订单id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置订单id
     *
     * @param id 订单id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return member_id
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * @param memberId
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * @return coupon_id
     */
    public Long getCouponId() {
        return couponId;
    }

    /**
     * @param couponId
     */
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    /**
     * 获取订单编号
     *
     * @return order_sn - 订单编号
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * 设置订单编号
     *
     * @param orderSn 订单编号
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    /**
     * 获取提交时间
     *
     * @return create_time - 提交时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置提交时间
     *
     * @param createTime 提交时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取用户帐号
     *
     * @return member_username - 用户帐号
     */
    public String getMemberUsername() {
        return memberUsername;
    }

    /**
     * 设置用户帐号
     *
     * @param memberUsername 用户帐号
     */
    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername == null ? null : memberUsername.trim();
    }

    /**
     * 获取订单总金额
     *
     * @return total_amount - 订单总金额
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置订单总金额
     *
     * @param totalAmount 订单总金额
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 获取应付金额（实际支付金额）
     *
     * @return pay_amount - 应付金额（实际支付金额）
     */
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    /**
     * 设置应付金额（实际支付金额）
     *
     * @param payAmount 应付金额（实际支付金额）
     */
    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * 获取运费金额
     *
     * @return freight_amount - 运费金额
     */
    public BigDecimal getFreightAmount() {
        return freightAmount;
    }

    /**
     * 设置运费金额
     *
     * @param freightAmount 运费金额
     */
    public void setFreightAmount(BigDecimal freightAmount) {
        this.freightAmount = freightAmount;
    }

    /**
     * 获取促销优化金额（促销价、满减、阶梯价）
     *
     * @return promotion_amount - 促销优化金额（促销价、满减、阶梯价）
     */
    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    /**
     * 设置促销优化金额（促销价、满减、阶梯价）
     *
     * @param promotionAmount 促销优化金额（促销价、满减、阶梯价）
     */
    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    /**
     * 获取积分抵扣金额
     *
     * @return integration_amount - 积分抵扣金额
     */
    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    /**
     * 设置积分抵扣金额
     *
     * @param integrationAmount 积分抵扣金额
     */
    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    /**
     * 获取优惠券抵扣金额
     *
     * @return coupon_amount - 优惠券抵扣金额
     */
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    /**
     * 设置优惠券抵扣金额
     *
     * @param couponAmount 优惠券抵扣金额
     */
    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * 获取管理员后台调整订单使用的折扣金额
     *
     * @return discount_amount - 管理员后台调整订单使用的折扣金额
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * 设置管理员后台调整订单使用的折扣金额
     *
     * @param discountAmount 管理员后台调整订单使用的折扣金额
     */
    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * 获取支付方式：0->未支付；1->支付宝；2->微信
     *
     * @return pay_type - 支付方式：0->未支付；1->支付宝；2->微信
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * 设置支付方式：0->未支付；1->支付宝；2->微信
     *
     * @param payType 支付方式：0->未支付；1->支付宝；2->微信
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * 获取订单来源：0->PC订单；1->app订单
     *
     * @return source_type - 订单来源：0->PC订单；1->app订单
     */
    public Integer getSourceType() {
        return sourceType;
    }

    /**
     * 设置订单来源：0->PC订单；1->app订单
     *
     * @param sourceType 订单来源：0->PC订单；1->app订单
     */
    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * 获取订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     *
     * @return status - 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     *
     * @param status 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取订单类型：0->正常订单；1->秒杀订单
     *
     * @return order_type - 订单类型：0->正常订单；1->秒杀订单
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * 设置订单类型：0->正常订单；1->秒杀订单
     *
     * @param orderType 订单类型：0->正常订单；1->秒杀订单
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * 获取物流公司(配送方式)
     *
     * @return delivery_company - 物流公司(配送方式)
     */
    public String getDeliveryCompany() {
        return deliveryCompany;
    }

    /**
     * 设置物流公司(配送方式)
     *
     * @param deliveryCompany 物流公司(配送方式)
     */
    public void setDeliveryCompany(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany == null ? null : deliveryCompany.trim();
    }

    /**
     * 获取物流单号
     *
     * @return delivery_sn - 物流单号
     */
    public String getDeliverySn() {
        return deliverySn;
    }

    /**
     * 设置物流单号
     *
     * @param deliverySn 物流单号
     */
    public void setDeliverySn(String deliverySn) {
        this.deliverySn = deliverySn == null ? null : deliverySn.trim();
    }

    /**
     * 获取自动确认时间（天）
     *
     * @return auto_confirm_day - 自动确认时间（天）
     */
    public Integer getAutoConfirmDay() {
        return autoConfirmDay;
    }

    /**
     * 设置自动确认时间（天）
     *
     * @param autoConfirmDay 自动确认时间（天）
     */
    public void setAutoConfirmDay(Integer autoConfirmDay) {
        this.autoConfirmDay = autoConfirmDay;
    }

    /**
     * 获取可以获得的积分
     *
     * @return integration - 可以获得的积分
     */
    public Integer getIntegration() {
        return integration;
    }

    /**
     * 设置可以获得的积分
     *
     * @param integration 可以获得的积分
     */
    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    /**
     * 获取可以活动的成长值
     *
     * @return growth - 可以活动的成长值
     */
    public Integer getGrowth() {
        return growth;
    }

    /**
     * 设置可以活动的成长值
     *
     * @param growth 可以活动的成长值
     */
    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    /**
     * 获取活动信息
     *
     * @return promotion_info - 活动信息
     */
    public String getPromotionInfo() {
        return promotionInfo;
    }

    /**
     * 设置活动信息
     *
     * @param promotionInfo 活动信息
     */
    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo == null ? null : promotionInfo.trim();
    }

    /**
     * 获取发票类型：0->不开发票；1->电子发票；2->纸质发票
     *
     * @return bill_type - 发票类型：0->不开发票；1->电子发票；2->纸质发票
     */
    public Integer getBillType() {
        return billType;
    }

    /**
     * 设置发票类型：0->不开发票；1->电子发票；2->纸质发票
     *
     * @param billType 发票类型：0->不开发票；1->电子发票；2->纸质发票
     */
    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    /**
     * 获取发票抬头
     *
     * @return bill_header - 发票抬头
     */
    public String getBillHeader() {
        return billHeader;
    }

    /**
     * 设置发票抬头
     *
     * @param billHeader 发票抬头
     */
    public void setBillHeader(String billHeader) {
        this.billHeader = billHeader == null ? null : billHeader.trim();
    }

    /**
     * 获取发票内容
     *
     * @return bill_content - 发票内容
     */
    public String getBillContent() {
        return billContent;
    }

    /**
     * 设置发票内容
     *
     * @param billContent 发票内容
     */
    public void setBillContent(String billContent) {
        this.billContent = billContent == null ? null : billContent.trim();
    }

    /**
     * 获取收票人电话
     *
     * @return bill_receiver_phone - 收票人电话
     */
    public String getBillReceiverPhone() {
        return billReceiverPhone;
    }

    /**
     * 设置收票人电话
     *
     * @param billReceiverPhone 收票人电话
     */
    public void setBillReceiverPhone(String billReceiverPhone) {
        this.billReceiverPhone = billReceiverPhone == null ? null : billReceiverPhone.trim();
    }

    /**
     * 获取收票人邮箱
     *
     * @return bill_receiver_email - 收票人邮箱
     */
    public String getBillReceiverEmail() {
        return billReceiverEmail;
    }

    /**
     * 设置收票人邮箱
     *
     * @param billReceiverEmail 收票人邮箱
     */
    public void setBillReceiverEmail(String billReceiverEmail) {
        this.billReceiverEmail = billReceiverEmail == null ? null : billReceiverEmail.trim();
    }

    /**
     * 获取收货人姓名
     *
     * @return receiver_name - 收货人姓名
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * 设置收货人姓名
     *
     * @param receiverName 收货人姓名
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    /**
     * 获取收货人电话
     *
     * @return receiver_phone - 收货人电话
     */
    public String getReceiverPhone() {
        return receiverPhone;
    }

    /**
     * 设置收货人电话
     *
     * @param receiverPhone 收货人电话
     */
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone == null ? null : receiverPhone.trim();
    }

    /**
     * 获取收货人邮编
     *
     * @return receiver_post_code - 收货人邮编
     */
    public String getReceiverPostCode() {
        return receiverPostCode;
    }

    /**
     * 设置收货人邮编
     *
     * @param receiverPostCode 收货人邮编
     */
    public void setReceiverPostCode(String receiverPostCode) {
        this.receiverPostCode = receiverPostCode == null ? null : receiverPostCode.trim();
    }

    /**
     * 获取省份/直辖市
     *
     * @return receiver_province - 省份/直辖市
     */
    public String getReceiverProvince() {
        return receiverProvince;
    }

    /**
     * 设置省份/直辖市
     *
     * @param receiverProvince 省份/直辖市
     */
    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince == null ? null : receiverProvince.trim();
    }

    /**
     * 获取城市
     *
     * @return receiver_city - 城市
     */
    public String getReceiverCity() {
        return receiverCity;
    }

    /**
     * 设置城市
     *
     * @param receiverCity 城市
     */
    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity == null ? null : receiverCity.trim();
    }

    /**
     * 获取区
     *
     * @return receiver_region - 区
     */
    public String getReceiverRegion() {
        return receiverRegion;
    }

    /**
     * 设置区
     *
     * @param receiverRegion 区
     */
    public void setReceiverRegion(String receiverRegion) {
        this.receiverRegion = receiverRegion == null ? null : receiverRegion.trim();
    }

    /**
     * 获取详细地址
     *
     * @return receiver_detail_address - 详细地址
     */
    public String getReceiverDetailAddress() {
        return receiverDetailAddress;
    }

    /**
     * 设置详细地址
     *
     * @param receiverDetailAddress 详细地址
     */
    public void setReceiverDetailAddress(String receiverDetailAddress) {
        this.receiverDetailAddress = receiverDetailAddress == null ? null : receiverDetailAddress.trim();
    }

    /**
     * 获取订单备注
     *
     * @return note - 订单备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置订单备注
     *
     * @param note 订单备注
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * 获取确认收货状态：0->未确认；1->已确认
     *
     * @return confirm_status - 确认收货状态：0->未确认；1->已确认
     */
    public Integer getConfirmStatus() {
        return confirmStatus;
    }

    /**
     * 设置确认收货状态：0->未确认；1->已确认
     *
     * @param confirmStatus 确认收货状态：0->未确认；1->已确认
     */
    public void setConfirmStatus(Integer confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    /**
     * 获取删除状态：0->未删除；1->已删除
     *
     * @return delete_status - 删除状态：0->未删除；1->已删除
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * 设置删除状态：0->未删除；1->已删除
     *
     * @param deleteStatus 删除状态：0->未删除；1->已删除
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * 获取下单时使用的积分
     *
     * @return use_integration - 下单时使用的积分
     */
    public Integer getUseIntegration() {
        return useIntegration;
    }

    /**
     * 设置下单时使用的积分
     *
     * @param useIntegration 下单时使用的积分
     */
    public void setUseIntegration(Integer useIntegration) {
        this.useIntegration = useIntegration;
    }

    /**
     * 获取支付时间
     *
     * @return payment_time - 支付时间
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * 设置支付时间
     *
     * @param paymentTime 支付时间
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * 获取发货时间
     *
     * @return delivery_time - 发货时间
     */
    public Date getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * 设置发货时间
     *
     * @param deliveryTime 发货时间
     */
    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * 获取确认收货时间
     *
     * @return receive_time - 确认收货时间
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * 设置确认收货时间
     *
     * @param receiveTime 确认收货时间
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * 获取评价时间
     *
     * @return comment_time - 评价时间
     */
    public Date getCommentTime() {
        return commentTime;
    }

    /**
     * 设置评价时间
     *
     * @param commentTime 评价时间
     */
    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberId=").append(memberId);
        sb.append(", couponId=").append(couponId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", createTime=").append(createTime);
        sb.append(", memberUsername=").append(memberUsername);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", payAmount=").append(payAmount);
        sb.append(", freightAmount=").append(freightAmount);
        sb.append(", promotionAmount=").append(promotionAmount);
        sb.append(", integrationAmount=").append(integrationAmount);
        sb.append(", couponAmount=").append(couponAmount);
        sb.append(", discountAmount=").append(discountAmount);
        sb.append(", payType=").append(payType);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", status=").append(status);
        sb.append(", orderType=").append(orderType);
        sb.append(", deliveryCompany=").append(deliveryCompany);
        sb.append(", deliverySn=").append(deliverySn);
        sb.append(", autoConfirmDay=").append(autoConfirmDay);
        sb.append(", integration=").append(integration);
        sb.append(", growth=").append(growth);
        sb.append(", promotionInfo=").append(promotionInfo);
        sb.append(", billType=").append(billType);
        sb.append(", billHeader=").append(billHeader);
        sb.append(", billContent=").append(billContent);
        sb.append(", billReceiverPhone=").append(billReceiverPhone);
        sb.append(", billReceiverEmail=").append(billReceiverEmail);
        sb.append(", receiverName=").append(receiverName);
        sb.append(", receiverPhone=").append(receiverPhone);
        sb.append(", receiverPostCode=").append(receiverPostCode);
        sb.append(", receiverProvince=").append(receiverProvince);
        sb.append(", receiverCity=").append(receiverCity);
        sb.append(", receiverRegion=").append(receiverRegion);
        sb.append(", receiverDetailAddress=").append(receiverDetailAddress);
        sb.append(", note=").append(note);
        sb.append(", confirmStatus=").append(confirmStatus);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", useIntegration=").append(useIntegration);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append(", deliveryTime=").append(deliveryTime);
        sb.append(", receiveTime=").append(receiveTime);
        sb.append(", commentTime=").append(commentTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}