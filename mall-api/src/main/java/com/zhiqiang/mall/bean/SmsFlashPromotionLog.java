package com.zhiqiang.mall.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "sms_flash_promotion_log")
public class SmsFlashPromotionLog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "member_id")
    private Integer memberId;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "member_phone")
    private String memberPhone;

    @Column(name = "product_name")
    private String productName;

    /**
     * 会员订阅时间
     */
    @Column(name = "subscribe_time")
    private Date subscribeTime;

    @Column(name = "send_time")
    private Date sendTime;

    private static final long serialVersionUID = 1L;

    public SmsFlashPromotionLog(Integer id, Integer memberId, Long productId, String memberPhone, String productName, Date subscribeTime, Date sendTime) {
        this.id = id;
        this.memberId = memberId;
        this.productId = productId;
        this.memberPhone = memberPhone;
        this.productName = productName;
        this.subscribeTime = subscribeTime;
        this.sendTime = sendTime;
    }

    public SmsFlashPromotionLog() {
        super();
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return member_id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * @param memberId
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * @return product_id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * @return member_phone
     */
    public String getMemberPhone() {
        return memberPhone;
    }

    /**
     * @param memberPhone
     */
    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone == null ? null : memberPhone.trim();
    }

    /**
     * @return product_name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * 获取会员订阅时间
     *
     * @return subscribe_time - 会员订阅时间
     */
    public Date getSubscribeTime() {
        return subscribeTime;
    }

    /**
     * 设置会员订阅时间
     *
     * @param subscribeTime 会员订阅时间
     */
    public void setSubscribeTime(Date subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    /**
     * @return send_time
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * @param sendTime
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberId=").append(memberId);
        sb.append(", productId=").append(productId);
        sb.append(", memberPhone=").append(memberPhone);
        sb.append(", productName=").append(productName);
        sb.append(", subscribeTime=").append(subscribeTime);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}