package com.zhiqiang.mall.bean;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ums_member_statistics_info")
public class UmsMemberStatisticsInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_id")
    private Long memberId;

    /**
     * 累计消费金额
     */
    @Column(name = "consume_amount")
    private BigDecimal consumeAmount;

    /**
     * 订单数量
     */
    @Column(name = "order_count")
    private Integer orderCount;

    /**
     * 优惠券数量
     */
    @Column(name = "coupon_count")
    private Integer couponCount;

    /**
     * 评价数
     */
    @Column(name = "comment_count")
    private Integer commentCount;

    /**
     * 退货数量
     */
    @Column(name = "return_order_count")
    private Integer returnOrderCount;

    /**
     * 登录次数
     */
    @Column(name = "login_count")
    private Integer loginCount;

    @Column(name = "collect_product_count")
    private Integer collectProductCount;

    @Column(name = "invite_friend_count")
    private Integer inviteFriendCount;

    /**
     * 最后一次下订单时间
     */
    @Column(name = "recent_order_time")
    private Date recentOrderTime;

    public UmsMemberStatisticsInfo(Long id, Long memberId, BigDecimal consumeAmount, Integer orderCount, Integer couponCount, Integer commentCount, Integer returnOrderCount, Integer loginCount, Integer collectProductCount, Integer inviteFriendCount, Date recentOrderTime) {
        this.id = id;
        this.memberId = memberId;
        this.consumeAmount = consumeAmount;
        this.orderCount = orderCount;
        this.couponCount = couponCount;
        this.commentCount = commentCount;
        this.returnOrderCount = returnOrderCount;
        this.loginCount = loginCount;
        this.collectProductCount = collectProductCount;
        this.inviteFriendCount = inviteFriendCount;
        this.recentOrderTime = recentOrderTime;
    }

    public UmsMemberStatisticsInfo() {
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
     * 获取累计消费金额
     *
     * @return consume_amount - 累计消费金额
     */
    public BigDecimal getConsumeAmount() {
        return consumeAmount;
    }

    /**
     * 设置累计消费金额
     *
     * @param consumeAmount 累计消费金额
     */
    public void setConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    /**
     * 获取订单数量
     *
     * @return order_count - 订单数量
     */
    public Integer getOrderCount() {
        return orderCount;
    }

    /**
     * 设置订单数量
     *
     * @param orderCount 订单数量
     */
    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    /**
     * 获取优惠券数量
     *
     * @return coupon_count - 优惠券数量
     */
    public Integer getCouponCount() {
        return couponCount;
    }

    /**
     * 设置优惠券数量
     *
     * @param couponCount 优惠券数量
     */
    public void setCouponCount(Integer couponCount) {
        this.couponCount = couponCount;
    }

    /**
     * 获取评价数
     *
     * @return comment_count - 评价数
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * 设置评价数
     *
     * @param commentCount 评价数
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * 获取退货数量
     *
     * @return return_order_count - 退货数量
     */
    public Integer getReturnOrderCount() {
        return returnOrderCount;
    }

    /**
     * 设置退货数量
     *
     * @param returnOrderCount 退货数量
     */
    public void setReturnOrderCount(Integer returnOrderCount) {
        this.returnOrderCount = returnOrderCount;
    }

    /**
     * 获取登录次数
     *
     * @return login_count - 登录次数
     */
    public Integer getLoginCount() {
        return loginCount;
    }

    /**
     * 设置登录次数
     *
     * @param loginCount 登录次数
     */
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * @return collect_product_count
     */
    public Integer getCollectProductCount() {
        return collectProductCount;
    }

    /**
     * @param collectProductCount
     */
    public void setCollectProductCount(Integer collectProductCount) {
        this.collectProductCount = collectProductCount;
    }

    /**
     * @return invite_friend_count
     */
    public Integer getInviteFriendCount() {
        return inviteFriendCount;
    }

    /**
     * @param inviteFriendCount
     */
    public void setInviteFriendCount(Integer inviteFriendCount) {
        this.inviteFriendCount = inviteFriendCount;
    }

    /**
     * 获取最后一次下订单时间
     *
     * @return recent_order_time - 最后一次下订单时间
     */
    public Date getRecentOrderTime() {
        return recentOrderTime;
    }

    /**
     * 设置最后一次下订单时间
     *
     * @param recentOrderTime 最后一次下订单时间
     */
    public void setRecentOrderTime(Date recentOrderTime) {
        this.recentOrderTime = recentOrderTime;
    }
}