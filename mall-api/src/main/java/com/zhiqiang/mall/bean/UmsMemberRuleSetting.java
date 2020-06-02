package com.zhiqiang.mall.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "ums_member_rule_setting")
public class UmsMemberRuleSetting implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 连续签到天数
     */
    @Column(name = "continue_sign_day")
    private Integer continueSignDay;

    /**
     * 连续签到赠送数量
     */
    @Column(name = "continue_sign_point")
    private Integer continueSignPoint;

    /**
     * 每消费多少元获取1个点
     */
    @Column(name = "consume_per_point")
    private BigDecimal consumePerPoint;

    /**
     * 最低获取点数的订单金额
     */
    @Column(name = "low_order_amount")
    private BigDecimal lowOrderAmount;

    /**
     * 每笔订单最高获取点数
     */
    @Column(name = "max_point_per_order")
    private Integer maxPointPerOrder;

    /**
     * 类型：0->积分规则；1->成长值规则
     */
    private Integer type;

    private static final long serialVersionUID = 1L;

    public UmsMemberRuleSetting(Long id, Integer continueSignDay, Integer continueSignPoint, BigDecimal consumePerPoint, BigDecimal lowOrderAmount, Integer maxPointPerOrder, Integer type) {
        this.id = id;
        this.continueSignDay = continueSignDay;
        this.continueSignPoint = continueSignPoint;
        this.consumePerPoint = consumePerPoint;
        this.lowOrderAmount = lowOrderAmount;
        this.maxPointPerOrder = maxPointPerOrder;
        this.type = type;
    }

    public UmsMemberRuleSetting() {
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
     * 获取连续签到天数
     *
     * @return continue_sign_day - 连续签到天数
     */
    public Integer getContinueSignDay() {
        return continueSignDay;
    }

    /**
     * 设置连续签到天数
     *
     * @param continueSignDay 连续签到天数
     */
    public void setContinueSignDay(Integer continueSignDay) {
        this.continueSignDay = continueSignDay;
    }

    /**
     * 获取连续签到赠送数量
     *
     * @return continue_sign_point - 连续签到赠送数量
     */
    public Integer getContinueSignPoint() {
        return continueSignPoint;
    }

    /**
     * 设置连续签到赠送数量
     *
     * @param continueSignPoint 连续签到赠送数量
     */
    public void setContinueSignPoint(Integer continueSignPoint) {
        this.continueSignPoint = continueSignPoint;
    }

    /**
     * 获取每消费多少元获取1个点
     *
     * @return consume_per_point - 每消费多少元获取1个点
     */
    public BigDecimal getConsumePerPoint() {
        return consumePerPoint;
    }

    /**
     * 设置每消费多少元获取1个点
     *
     * @param consumePerPoint 每消费多少元获取1个点
     */
    public void setConsumePerPoint(BigDecimal consumePerPoint) {
        this.consumePerPoint = consumePerPoint;
    }

    /**
     * 获取最低获取点数的订单金额
     *
     * @return low_order_amount - 最低获取点数的订单金额
     */
    public BigDecimal getLowOrderAmount() {
        return lowOrderAmount;
    }

    /**
     * 设置最低获取点数的订单金额
     *
     * @param lowOrderAmount 最低获取点数的订单金额
     */
    public void setLowOrderAmount(BigDecimal lowOrderAmount) {
        this.lowOrderAmount = lowOrderAmount;
    }

    /**
     * 获取每笔订单最高获取点数
     *
     * @return max_point_per_order - 每笔订单最高获取点数
     */
    public Integer getMaxPointPerOrder() {
        return maxPointPerOrder;
    }

    /**
     * 设置每笔订单最高获取点数
     *
     * @param maxPointPerOrder 每笔订单最高获取点数
     */
    public void setMaxPointPerOrder(Integer maxPointPerOrder) {
        this.maxPointPerOrder = maxPointPerOrder;
    }

    /**
     * 获取类型：0->积分规则；1->成长值规则
     *
     * @return type - 类型：0->积分规则；1->成长值规则
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型：0->积分规则；1->成长值规则
     *
     * @param type 类型：0->积分规则；1->成长值规则
     */
    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", continueSignDay=").append(continueSignDay);
        sb.append(", continueSignPoint=").append(continueSignPoint);
        sb.append(", consumePerPoint=").append(consumePerPoint);
        sb.append(", lowOrderAmount=").append(lowOrderAmount);
        sb.append(", maxPointPerOrder=").append(maxPointPerOrder);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}