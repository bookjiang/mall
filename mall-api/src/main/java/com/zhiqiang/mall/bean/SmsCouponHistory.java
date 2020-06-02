package com.zhiqiang.mall.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "sms_coupon_history")
public class SmsCouponHistory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "coupon_id")
    private Long couponId;

    @Column(name = "member_id")
    private Long memberId;

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
     * 订单编号
     */
    @Column(name = "order_id")
    private Long orderId;

    /**
     * 订单号码
     */
    @Column(name = "order_sn")
    private String orderSn;

    private static final long serialVersionUID = 1L;

    public SmsCouponHistory(Long id, Long couponId, Long memberId, String couponCode, String memberNickname, Integer getType, Date createTime, Integer useStatus, Date useTime, Long orderId, String orderSn) {
        this.id = id;
        this.couponId = couponId;
        this.memberId = memberId;
        this.couponCode = couponCode;
        this.memberNickname = memberNickname;
        this.getType = getType;
        this.createTime = createTime;
        this.useStatus = useStatus;
        this.useTime = useTime;
        this.orderId = orderId;
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
     * @return coupon_code
     */
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * @param couponCode
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
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
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
     * 获取订单编号
     *
     * @return order_id - 订单编号
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置订单编号
     *
     * @param orderId 订单编号
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", couponId=").append(couponId);
        sb.append(", memberId=").append(memberId);
        sb.append(", couponCode=").append(couponCode);
        sb.append(", memberNickname=").append(memberNickname);
        sb.append(", getType=").append(getType);
        sb.append(", createTime=").append(createTime);
        sb.append(", useStatus=").append(useStatus);
        sb.append(", useTime=").append(useTime);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}