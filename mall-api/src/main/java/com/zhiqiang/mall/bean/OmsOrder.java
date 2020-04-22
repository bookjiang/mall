package com.zhiqiang.mall.bean;

import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
@ToString
@Table(name = "oms_order")
public class OmsOrder implements Serializable {
    /**
     * 订单id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    /**
     * 用户id
     */
    @Column(name = "member_id")
    private Long memberId;

    /**
     * 优惠券id
     */
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
     * 用户账号
     */
    @Column(name = "member_username")
    private String memberUsername;

    /**
     * 订单总金额
     */
    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    /**
     * 应付金额（实际支付金额)
     */
    @Column(name = "pay_amount")
    private BigDecimal payAmount;

    /**
     * 运费金额
     */
    @Column(name = "freight_amount")
    private BigDecimal freightAmount;

    /**
     * 促销优惠金额（促销价，满减，会员价)
     */
    @Column(name = "promotion_amount")
    private BigDecimal promotionAmount;

    /**
     * 积分抵扣金额
     */
    @Column(name = "points_discount_amount")
    private BigDecimal pointsDiscountAmount;

    /**
     * 优惠券抵扣金额
     */
    @Column(name = "coupon_amount")
    private BigDecimal couponAmount;

    /**
     * 管理员后台调整金额
     */
    @Column(name = "discount_amount")
    private BigDecimal discountAmount;

    /**
     * 支付类型：0->未支付；1->支付宝；2->微信；
     */
    @Column(name = "pay_type")
    private Integer payType;

    /**
     * 订单来源:0->PC订单;1->app订单
     */
    @Column(name = "source_type")
    private Integer sourceType;

    /**
     * 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    private Integer status;

    /**
     * 订单类型:0->正常订单;1->秒杀订单
     */
    @Column(name = "order_type")
    private Integer orderType;

    /**
     * 物流公司
     */
    @Column(name = "logistics_company")
    private String logisticsCompany;

    /**
     * 物流单号
     */
    @Column(name = "logistics_num")
    private String logisticsNum;

    /**
     * 自动收货时间（天）
     */
    @Column(name = "auto_confirm_day")
    private Integer autoConfirmDay;

    /**
     * 获得积分
     */
    @Column(name = "get_points")
    private Integer getPoints;

    /**
     * 获得成长值
     */
    private Integer growth;

    /**
     * 活动信息
     */
    @Column(name = "promotion_info")
    private String promotionInfo;

    /**
     * 发票类型：0->不开发票;1->电子发票;2->纸质发票
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
     * 收货人你电话
     */
    @Column(name = "receiver_phone")
    private String receiverPhone;

    /**
     * 收货人邮编
     */
    @Column(name = "receiver_postcode")
    private String receiverPostcode;

    /**
     * 收货人省份/直辖市
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
     * 确认收货状态:0->未确认；1->已确认
     */
    @Column(name = "confirm_status")
    private Integer confirmStatus;

    /**
     * 删除状态:0->未删除；1->已删除
     */
    @Column(name = "delete_status")
    private Integer deleteStatus;

    /**
     * 支付时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 下单时使用的积分
     */
    @Column(name = "use_points")
    private Integer usePoints;

    /**
     * 发货时间
     */
    @Column(name = "delivery_time")
    private Date deliveryTime;

    /**
     * 确认收货时间
     */
    @Column(name = "receiver_time")
    private Date receiverTime;

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

    public OmsOrder(Long orderId, Long memberId, Long couponId, String orderSn, Date createTime, String memberUsername, BigDecimal totalAmount, BigDecimal payAmount, BigDecimal freightAmount, BigDecimal promotionAmount, BigDecimal pointsDiscountAmount, BigDecimal couponAmount, BigDecimal discountAmount, Integer payType, Integer sourceType, Integer status, Integer orderType, String logisticsCompany, String logisticsNum, Integer autoConfirmDay, Integer getPoints, Integer growth, String promotionInfo, Integer billType, String billHeader, String billContent, String billReceiverPhone, String billReceiverEmail, String receiverName, String receiverPhone, String receiverPostcode, String receiverProvince, String receiverCity, String receiverRegion, String receiverDetailAddress, String note, Integer confirmStatus, Integer deleteStatus, Date payTime, Integer usePoints, Date deliveryTime, Date receiverTime, Date commentTime, Date modifyTime) {
        this.orderId = orderId;
        this.memberId = memberId;
        this.couponId = couponId;
        this.orderSn = orderSn;
        this.createTime = createTime;
        this.memberUsername = memberUsername;
        this.totalAmount = totalAmount;
        this.payAmount = payAmount;
        this.freightAmount = freightAmount;
        this.promotionAmount = promotionAmount;
        this.pointsDiscountAmount = pointsDiscountAmount;
        this.couponAmount = couponAmount;
        this.discountAmount = discountAmount;
        this.payType = payType;
        this.sourceType = sourceType;
        this.status = status;
        this.orderType = orderType;
        this.logisticsCompany = logisticsCompany;
        this.logisticsNum = logisticsNum;
        this.autoConfirmDay = autoConfirmDay;
        this.getPoints = getPoints;
        this.growth = growth;
        this.promotionInfo = promotionInfo;
        this.billType = billType;
        this.billHeader = billHeader;
        this.billContent = billContent;
        this.billReceiverPhone = billReceiverPhone;
        this.billReceiverEmail = billReceiverEmail;
        this.receiverName = receiverName;
        this.receiverPhone = receiverPhone;
        this.receiverPostcode = receiverPostcode;
        this.receiverProvince = receiverProvince;
        this.receiverCity = receiverCity;
        this.receiverRegion = receiverRegion;
        this.receiverDetailAddress = receiverDetailAddress;
        this.note = note;
        this.confirmStatus = confirmStatus;
        this.deleteStatus = deleteStatus;
        this.payTime = payTime;
        this.usePoints = usePoints;
        this.deliveryTime = deliveryTime;
        this.receiverTime = receiverTime;
        this.commentTime = commentTime;
        this.modifyTime = modifyTime;
    }

    public OmsOrder() {
        super();
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
     * 获取用户id
     *
     * @return member_id - 用户id
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * 设置用户id
     *
     * @param memberId 用户id
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * 获取优惠券id
     *
     * @return coupon_id - 优惠券id
     */
    public Long getCouponId() {
        return couponId;
    }

    /**
     * 设置优惠券id
     *
     * @param couponId 优惠券id
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
     * 获取用户账号
     *
     * @return member_username - 用户账号
     */
    public String getMemberUsername() {
        return memberUsername;
    }

    /**
     * 设置用户账号
     *
     * @param memberUsername 用户账号
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
     * 获取应付金额（实际支付金额)
     *
     * @return pay_amount - 应付金额（实际支付金额)
     */
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    /**
     * 设置应付金额（实际支付金额)
     *
     * @param payAmount 应付金额（实际支付金额)
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
     * 获取促销优惠金额（促销价，满减，会员价)
     *
     * @return promotion_amount - 促销优惠金额（促销价，满减，会员价)
     */
    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    /**
     * 设置促销优惠金额（促销价，满减，会员价)
     *
     * @param promotionAmount 促销优惠金额（促销价，满减，会员价)
     */
    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    /**
     * 获取积分抵扣金额
     *
     * @return points_discount_amount - 积分抵扣金额
     */
    public BigDecimal getPointsDiscountAmount() {
        return pointsDiscountAmount;
    }

    /**
     * 设置积分抵扣金额
     *
     * @param pointsDiscountAmount 积分抵扣金额
     */
    public void setPointsDiscountAmount(BigDecimal pointsDiscountAmount) {
        this.pointsDiscountAmount = pointsDiscountAmount;
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
     * 获取管理员后台调整金额
     *
     * @return discount_amount - 管理员后台调整金额
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * 设置管理员后台调整金额
     *
     * @param discountAmount 管理员后台调整金额
     */
    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * 获取支付类型：0->未支付；1->支付宝；2->微信；
     *
     * @return pay_type - 支付类型：0->未支付；1->支付宝；2->微信；
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * 设置支付类型：0->未支付；1->支付宝；2->微信；
     *
     * @param payType 支付类型：0->未支付；1->支付宝；2->微信；
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * 获取订单来源:0->PC订单;1->app订单
     *
     * @return source_type - 订单来源:0->PC订单;1->app订单
     */
    public Integer getSourceType() {
        return sourceType;
    }

    /**
     * 设置订单来源:0->PC订单;1->app订单
     *
     * @param sourceType 订单来源:0->PC订单;1->app订单
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
     * 获取订单类型:0->正常订单;1->秒杀订单
     *
     * @return order_type - 订单类型:0->正常订单;1->秒杀订单
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * 设置订单类型:0->正常订单;1->秒杀订单
     *
     * @param orderType 订单类型:0->正常订单;1->秒杀订单
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * 获取物流公司
     *
     * @return logistics_company - 物流公司
     */
    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    /**
     * 设置物流公司
     *
     * @param logisticsCompany 物流公司
     */
    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany == null ? null : logisticsCompany.trim();
    }

    /**
     * 获取物流单号
     *
     * @return logistics_num - 物流单号
     */
    public String getLogisticsNum() {
        return logisticsNum;
    }

    /**
     * 设置物流单号
     *
     * @param logisticsNum 物流单号
     */
    public void setLogisticsNum(String logisticsNum) {
        this.logisticsNum = logisticsNum == null ? null : logisticsNum.trim();
    }

    /**
     * 获取自动收货时间（天）
     *
     * @return auto_confirm_day - 自动收货时间（天）
     */
    public Integer getAutoConfirmDay() {
        return autoConfirmDay;
    }

    /**
     * 设置自动收货时间（天）
     *
     * @param autoConfirmDay 自动收货时间（天）
     */
    public void setAutoConfirmDay(Integer autoConfirmDay) {
        this.autoConfirmDay = autoConfirmDay;
    }

    /**
     * 获取获得积分
     *
     * @return get_points - 获得积分
     */
    public Integer getGetPoints() {
        return getPoints;
    }

    /**
     * 设置获得积分
     *
     * @param getPoints 获得积分
     */
    public void setGetPoints(Integer getPoints) {
        this.getPoints = getPoints;
    }

    /**
     * 获取获得成长值
     *
     * @return growth - 获得成长值
     */
    public Integer getGrowth() {
        return growth;
    }

    /**
     * 设置获得成长值
     *
     * @param growth 获得成长值
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
     * 获取发票类型：0->不开发票;1->电子发票;2->纸质发票
     *
     * @return bill_type - 发票类型：0->不开发票;1->电子发票;2->纸质发票
     */
    public Integer getBillType() {
        return billType;
    }

    /**
     * 设置发票类型：0->不开发票;1->电子发票;2->纸质发票
     *
     * @param billType 发票类型：0->不开发票;1->电子发票;2->纸质发票
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
     * 获取收货人你电话
     *
     * @return receiver_phone - 收货人你电话
     */
    public String getReceiverPhone() {
        return receiverPhone;
    }

    /**
     * 设置收货人你电话
     *
     * @param receiverPhone 收货人你电话
     */
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone == null ? null : receiverPhone.trim();
    }

    /**
     * 获取收货人邮编
     *
     * @return receiver_postcode - 收货人邮编
     */
    public String getReceiverPostcode() {
        return receiverPostcode;
    }

    /**
     * 设置收货人邮编
     *
     * @param receiverPostcode 收货人邮编
     */
    public void setReceiverPostcode(String receiverPostcode) {
        this.receiverPostcode = receiverPostcode == null ? null : receiverPostcode.trim();
    }

    /**
     * 获取收货人省份/直辖市
     *
     * @return receiver_province - 收货人省份/直辖市
     */
    public String getReceiverProvince() {
        return receiverProvince;
    }

    /**
     * 设置收货人省份/直辖市
     *
     * @param receiverProvince 收货人省份/直辖市
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
     * 获取确认收货状态:0->未确认；1->已确认
     *
     * @return confirm_status - 确认收货状态:0->未确认；1->已确认
     */
    public Integer getConfirmStatus() {
        return confirmStatus;
    }

    /**
     * 设置确认收货状态:0->未确认；1->已确认
     *
     * @param confirmStatus 确认收货状态:0->未确认；1->已确认
     */
    public void setConfirmStatus(Integer confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    /**
     * 获取删除状态:0->未删除；1->已删除
     *
     * @return delete_status - 删除状态:0->未删除；1->已删除
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * 设置删除状态:0->未删除；1->已删除
     *
     * @param deleteStatus 删除状态:0->未删除；1->已删除
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * 获取支付时间
     *
     * @return pay_time - 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置支付时间
     *
     * @param payTime 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取下单时使用的积分
     *
     * @return use_points - 下单时使用的积分
     */
    public Integer getUsePoints() {
        return usePoints;
    }

    /**
     * 设置下单时使用的积分
     *
     * @param usePoints 下单时使用的积分
     */
    public void setUsePoints(Integer usePoints) {
        this.usePoints = usePoints;
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
     * @return receiver_time - 确认收货时间
     */
    public Date getReceiverTime() {
        return receiverTime;
    }

    /**
     * 设置确认收货时间
     *
     * @param receiverTime 确认收货时间
     */
    public void setReceiverTime(Date receiverTime) {
        this.receiverTime = receiverTime;
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
}