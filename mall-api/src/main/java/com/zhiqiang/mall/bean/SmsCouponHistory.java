package com.zhiqiang.mall.bean;

import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
@ToString
@Table(name = "sms_coupon_history")
public class SmsCouponHistory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 优惠券id
     */
    @Column(name = "coupon_id")
    private Long couponId;

    /**
     * 会员id
     */
    @Column(name = "member_id")
    private Long memberId;

    /**
     * 订单id
     */
    @Column(name = "order_id")
    private Long orderId;

    /**
     * 优惠券码
     */
    @Column(name = "coupon_code")
    private String couponCode;

    /**
     * 领取人昵称
     */
    @Column(name = "member_nickname")
    private String memberNickname;

    /**
     * 获取类型：0->后台赠送；1->主动获取
     */
    @Column(name = "get_type")
    private Integer getType;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 使用状态：0->未使用；1->已使用；2->已过期
     */
    @Column(name = "use_status")
    private Integer useStatus;

    /**
     * 使用时间
     */
    @Column(name = "use_time")
    private Date useTime;

    /**
     * 订单号码
     */
    @Column(name = "order_sn")
    private String orderSn;

    public SmsCouponHistory(Long id, Long couponId, Long memberId, Long orderId, String couponCode, String memberNickname, Integer getType, Date createTime, Integer useStatus, Date useTime, String orderSn) {
        this.id = id;
        this.couponId = couponId;
        this.memberId = memberId;
        this.orderId = orderId;
        this.couponCode = couponCode;
        this.memberNickname = memberNickname;
        this.getType = getType;
        this.createTime = createTime;
        this.useStatus = useStatus;
        this.useTime = useTime;
        this.orderSn = orderSn;
    }

    public SmsCouponHistory() {
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
     * 获取会员id
     *
     * @return member_id - 会员id
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * 设置会员id
     *
     * @param memberId 会员id
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
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
     * 获取优惠券码
     *
     * @return coupon_code - 优惠券码
     */
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * 设置优惠券码
     *
     * @param couponCode 优惠券码
     */
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode == null ? null : couponCode.trim();
    }

    /**
     * 获取领取人昵称
     *
     * @return member_nickname - 领取人昵称
     */
    public String getMemberNickname() {
        return memberNickname;
    }

    /**
     * 设置领取人昵称
     *
     * @param memberNickname 领取人昵称
     */
    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname == null ? null : memberNickname.trim();
    }

    /**
     * 获取获取类型：0->后台赠送；1->主动获取
     *
     * @return get_type - 获取类型：0->后台赠送；1->主动获取
     */
    public Integer getGetType() {
        return getType;
    }

    /**
     * 设置获取类型：0->后台赠送；1->主动获取
     *
     * @param getType 获取类型：0->后台赠送；1->主动获取
     */
    public void setGetType(Integer getType) {
        this.getType = getType;
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
     * 获取使用状态：0->未使用；1->已使用；2->已过期
     *
     * @return use_status - 使用状态：0->未使用；1->已使用；2->已过期
     */
    public Integer getUseStatus() {
        return useStatus;
    }

    /**
     * 设置使用状态：0->未使用；1->已使用；2->已过期
     *
     * @param useStatus 使用状态：0->未使用；1->已使用；2->已过期
     */
    public void setUseStatus(Integer useStatus) {
        this.useStatus = useStatus;
    }

    /**
     * 获取使用时间
     *
     * @return use_time - 使用时间
     */
    public Date getUseTime() {
        return useTime;
    }

    /**
     * 设置使用时间
     *
     * @param useTime 使用时间
     */
    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    /**
     * 获取订单号码
     *
     * @return order_sn - 订单号码
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * 设置订单号码
     *
     * @param orderSn 订单号码
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }
}