package com.zhiqiang.mall.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OmsOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OmsOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Long value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Long value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Long value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Long value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Long value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Long> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Long> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Long value1, Long value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Long value1, Long value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(Long value) {
            addCriterion("coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(Long value) {
            addCriterion("coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(Long value) {
            addCriterion("coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(Long value) {
            addCriterion("coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(Long value) {
            addCriterion("coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(Long value) {
            addCriterion("coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<Long> values) {
            addCriterion("coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<Long> values) {
            addCriterion("coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(Long value1, Long value2) {
            addCriterion("coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(Long value1, Long value2) {
            addCriterion("coupon_id not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNull() {
            addCriterion("order_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNotNull() {
            addCriterion("order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSnEqualTo(String value) {
            addCriterion("order_sn =", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotEqualTo(String value) {
            addCriterion("order_sn <>", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThan(String value) {
            addCriterion("order_sn >", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(String value) {
            addCriterion("order_sn >=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThan(String value) {
            addCriterion("order_sn <", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(String value) {
            addCriterion("order_sn <=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLike(String value) {
            addCriterion("order_sn like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotLike(String value) {
            addCriterion("order_sn not like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnIn(List<String> values) {
            addCriterion("order_sn in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotIn(List<String> values) {
            addCriterion("order_sn not in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnBetween(String value1, String value2) {
            addCriterion("order_sn between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotBetween(String value1, String value2) {
            addCriterion("order_sn not between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameIsNull() {
            addCriterion("member_username is null");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameIsNotNull() {
            addCriterion("member_username is not null");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameEqualTo(String value) {
            addCriterion("member_username =", value, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameNotEqualTo(String value) {
            addCriterion("member_username <>", value, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameGreaterThan(String value) {
            addCriterion("member_username >", value, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("member_username >=", value, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameLessThan(String value) {
            addCriterion("member_username <", value, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameLessThanOrEqualTo(String value) {
            addCriterion("member_username <=", value, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameLike(String value) {
            addCriterion("member_username like", value, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameNotLike(String value) {
            addCriterion("member_username not like", value, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameIn(List<String> values) {
            addCriterion("member_username in", values, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameNotIn(List<String> values) {
            addCriterion("member_username not in", values, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameBetween(String value1, String value2) {
            addCriterion("member_username between", value1, value2, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameNotBetween(String value1, String value2) {
            addCriterion("member_username not between", value1, value2, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNull() {
            addCriterion("pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNotNull() {
            addCriterion("pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountEqualTo(BigDecimal value) {
            addCriterion("pay_amount =", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("pay_amount <>", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThan(BigDecimal value) {
            addCriterion("pay_amount >", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amount >=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThan(BigDecimal value) {
            addCriterion("pay_amount <", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amount <=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIn(List<BigDecimal> values) {
            addCriterion("pay_amount in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("pay_amount not in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amount between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amount not between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountIsNull() {
            addCriterion("freight_amount is null");
            return (Criteria) this;
        }

        public Criteria andFreightAmountIsNotNull() {
            addCriterion("freight_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFreightAmountEqualTo(BigDecimal value) {
            addCriterion("freight_amount =", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountNotEqualTo(BigDecimal value) {
            addCriterion("freight_amount <>", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountGreaterThan(BigDecimal value) {
            addCriterion("freight_amount >", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_amount >=", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountLessThan(BigDecimal value) {
            addCriterion("freight_amount <", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_amount <=", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountIn(List<BigDecimal> values) {
            addCriterion("freight_amount in", values, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountNotIn(List<BigDecimal> values) {
            addCriterion("freight_amount not in", values, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_amount between", value1, value2, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_amount not between", value1, value2, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountIsNull() {
            addCriterion("promotion_amount is null");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountIsNotNull() {
            addCriterion("promotion_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountEqualTo(BigDecimal value) {
            addCriterion("promotion_amount =", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountNotEqualTo(BigDecimal value) {
            addCriterion("promotion_amount <>", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountGreaterThan(BigDecimal value) {
            addCriterion("promotion_amount >", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_amount >=", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountLessThan(BigDecimal value) {
            addCriterion("promotion_amount <", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_amount <=", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountIn(List<BigDecimal> values) {
            addCriterion("promotion_amount in", values, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountNotIn(List<BigDecimal> values) {
            addCriterion("promotion_amount not in", values, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_amount between", value1, value2, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_amount not between", value1, value2, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPointsDiscountAmountIsNull() {
            addCriterion("points_discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andPointsDiscountAmountIsNotNull() {
            addCriterion("points_discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPointsDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("points_discount_amount =", value, "pointsDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPointsDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("points_discount_amount <>", value, "pointsDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPointsDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("points_discount_amount >", value, "pointsDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPointsDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("points_discount_amount >=", value, "pointsDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPointsDiscountAmountLessThan(BigDecimal value) {
            addCriterion("points_discount_amount <", value, "pointsDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPointsDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("points_discount_amount <=", value, "pointsDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPointsDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("points_discount_amount in", values, "pointsDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPointsDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("points_discount_amount not in", values, "pointsDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPointsDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("points_discount_amount between", value1, value2, "pointsDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPointsDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("points_discount_amount not between", value1, value2, "pointsDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIsNull() {
            addCriterion("coupon_amount is null");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIsNotNull() {
            addCriterion("coupon_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCouponAmountEqualTo(BigDecimal value) {
            addCriterion("coupon_amount =", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotEqualTo(BigDecimal value) {
            addCriterion("coupon_amount <>", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountGreaterThan(BigDecimal value) {
            addCriterion("coupon_amount >", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_amount >=", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountLessThan(BigDecimal value) {
            addCriterion("coupon_amount <", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_amount <=", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIn(List<BigDecimal> values) {
            addCriterion("coupon_amount in", values, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotIn(List<BigDecimal> values) {
            addCriterion("coupon_amount not in", values, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_amount between", value1, value2, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_amount not between", value1, value2, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNull() {
            addCriterion("discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNotNull() {
            addCriterion("discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("discount_amount =", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("discount_amount <>", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("discount_amount >", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount >=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThan(BigDecimal value) {
            addCriterion("discount_amount <", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount <=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("discount_amount in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("discount_amount not in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount not between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNull() {
            addCriterion("source_type is null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNotNull() {
            addCriterion("source_type is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(Integer value) {
            addCriterion("source_type =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotEqualTo(Integer value) {
            addCriterion("source_type <>", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThan(Integer value) {
            addCriterion("source_type >", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_type >=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThan(Integer value) {
            addCriterion("source_type <", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("source_type <=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIn(List<Integer> values) {
            addCriterion("source_type in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotIn(List<Integer> values) {
            addCriterion("source_type not in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeBetween(Integer value1, Integer value2) {
            addCriterion("source_type between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("source_type not between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Integer value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Integer value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Integer value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Integer value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Integer> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Integer> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIsNull() {
            addCriterion("logistics_company is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIsNotNull() {
            addCriterion("logistics_company is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyEqualTo(String value) {
            addCriterion("logistics_company =", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotEqualTo(String value) {
            addCriterion("logistics_company <>", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyGreaterThan(String value) {
            addCriterion("logistics_company >", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_company >=", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLessThan(String value) {
            addCriterion("logistics_company <", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLessThanOrEqualTo(String value) {
            addCriterion("logistics_company <=", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLike(String value) {
            addCriterion("logistics_company like", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotLike(String value) {
            addCriterion("logistics_company not like", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIn(List<String> values) {
            addCriterion("logistics_company in", values, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotIn(List<String> values) {
            addCriterion("logistics_company not in", values, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyBetween(String value1, String value2) {
            addCriterion("logistics_company between", value1, value2, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotBetween(String value1, String value2) {
            addCriterion("logistics_company not between", value1, value2, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumIsNull() {
            addCriterion("logistics_num is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumIsNotNull() {
            addCriterion("logistics_num is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumEqualTo(String value) {
            addCriterion("logistics_num =", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumNotEqualTo(String value) {
            addCriterion("logistics_num <>", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumGreaterThan(String value) {
            addCriterion("logistics_num >", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_num >=", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumLessThan(String value) {
            addCriterion("logistics_num <", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumLessThanOrEqualTo(String value) {
            addCriterion("logistics_num <=", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumLike(String value) {
            addCriterion("logistics_num like", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumNotLike(String value) {
            addCriterion("logistics_num not like", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumIn(List<String> values) {
            addCriterion("logistics_num in", values, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumNotIn(List<String> values) {
            addCriterion("logistics_num not in", values, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumBetween(String value1, String value2) {
            addCriterion("logistics_num between", value1, value2, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumNotBetween(String value1, String value2) {
            addCriterion("logistics_num not between", value1, value2, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andAutoConfirmDayIsNull() {
            addCriterion("auto_confirm_day is null");
            return (Criteria) this;
        }

        public Criteria andAutoConfirmDayIsNotNull() {
            addCriterion("auto_confirm_day is not null");
            return (Criteria) this;
        }

        public Criteria andAutoConfirmDayEqualTo(Integer value) {
            addCriterion("auto_confirm_day =", value, "autoConfirmDay");
            return (Criteria) this;
        }

        public Criteria andAutoConfirmDayNotEqualTo(Integer value) {
            addCriterion("auto_confirm_day <>", value, "autoConfirmDay");
            return (Criteria) this;
        }

        public Criteria andAutoConfirmDayGreaterThan(Integer value) {
            addCriterion("auto_confirm_day >", value, "autoConfirmDay");
            return (Criteria) this;
        }

        public Criteria andAutoConfirmDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("auto_confirm_day >=", value, "autoConfirmDay");
            return (Criteria) this;
        }

        public Criteria andAutoConfirmDayLessThan(Integer value) {
            addCriterion("auto_confirm_day <", value, "autoConfirmDay");
            return (Criteria) this;
        }

        public Criteria andAutoConfirmDayLessThanOrEqualTo(Integer value) {
            addCriterion("auto_confirm_day <=", value, "autoConfirmDay");
            return (Criteria) this;
        }

        public Criteria andAutoConfirmDayIn(List<Integer> values) {
            addCriterion("auto_confirm_day in", values, "autoConfirmDay");
            return (Criteria) this;
        }

        public Criteria andAutoConfirmDayNotIn(List<Integer> values) {
            addCriterion("auto_confirm_day not in", values, "autoConfirmDay");
            return (Criteria) this;
        }

        public Criteria andAutoConfirmDayBetween(Integer value1, Integer value2) {
            addCriterion("auto_confirm_day between", value1, value2, "autoConfirmDay");
            return (Criteria) this;
        }

        public Criteria andAutoConfirmDayNotBetween(Integer value1, Integer value2) {
            addCriterion("auto_confirm_day not between", value1, value2, "autoConfirmDay");
            return (Criteria) this;
        }

        public Criteria andGetPointsIsNull() {
            addCriterion("get_points is null");
            return (Criteria) this;
        }

        public Criteria andGetPointsIsNotNull() {
            addCriterion("get_points is not null");
            return (Criteria) this;
        }

        public Criteria andGetPointsEqualTo(Integer value) {
            addCriterion("get_points =", value, "getPoints");
            return (Criteria) this;
        }

        public Criteria andGetPointsNotEqualTo(Integer value) {
            addCriterion("get_points <>", value, "getPoints");
            return (Criteria) this;
        }

        public Criteria andGetPointsGreaterThan(Integer value) {
            addCriterion("get_points >", value, "getPoints");
            return (Criteria) this;
        }

        public Criteria andGetPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("get_points >=", value, "getPoints");
            return (Criteria) this;
        }

        public Criteria andGetPointsLessThan(Integer value) {
            addCriterion("get_points <", value, "getPoints");
            return (Criteria) this;
        }

        public Criteria andGetPointsLessThanOrEqualTo(Integer value) {
            addCriterion("get_points <=", value, "getPoints");
            return (Criteria) this;
        }

        public Criteria andGetPointsIn(List<Integer> values) {
            addCriterion("get_points in", values, "getPoints");
            return (Criteria) this;
        }

        public Criteria andGetPointsNotIn(List<Integer> values) {
            addCriterion("get_points not in", values, "getPoints");
            return (Criteria) this;
        }

        public Criteria andGetPointsBetween(Integer value1, Integer value2) {
            addCriterion("get_points between", value1, value2, "getPoints");
            return (Criteria) this;
        }

        public Criteria andGetPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("get_points not between", value1, value2, "getPoints");
            return (Criteria) this;
        }

        public Criteria andGrowthIsNull() {
            addCriterion("growth is null");
            return (Criteria) this;
        }

        public Criteria andGrowthIsNotNull() {
            addCriterion("growth is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthEqualTo(Integer value) {
            addCriterion("growth =", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotEqualTo(Integer value) {
            addCriterion("growth <>", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthGreaterThan(Integer value) {
            addCriterion("growth >", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthGreaterThanOrEqualTo(Integer value) {
            addCriterion("growth >=", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthLessThan(Integer value) {
            addCriterion("growth <", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthLessThanOrEqualTo(Integer value) {
            addCriterion("growth <=", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthIn(List<Integer> values) {
            addCriterion("growth in", values, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotIn(List<Integer> values) {
            addCriterion("growth not in", values, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthBetween(Integer value1, Integer value2) {
            addCriterion("growth between", value1, value2, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotBetween(Integer value1, Integer value2) {
            addCriterion("growth not between", value1, value2, "growth");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoIsNull() {
            addCriterion("promotion_info is null");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoIsNotNull() {
            addCriterion("promotion_info is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoEqualTo(String value) {
            addCriterion("promotion_info =", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoNotEqualTo(String value) {
            addCriterion("promotion_info <>", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoGreaterThan(String value) {
            addCriterion("promotion_info >", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_info >=", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoLessThan(String value) {
            addCriterion("promotion_info <", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoLessThanOrEqualTo(String value) {
            addCriterion("promotion_info <=", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoLike(String value) {
            addCriterion("promotion_info like", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoNotLike(String value) {
            addCriterion("promotion_info not like", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoIn(List<String> values) {
            addCriterion("promotion_info in", values, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoNotIn(List<String> values) {
            addCriterion("promotion_info not in", values, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoBetween(String value1, String value2) {
            addCriterion("promotion_info between", value1, value2, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoNotBetween(String value1, String value2) {
            addCriterion("promotion_info not between", value1, value2, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNull() {
            addCriterion("bill_type is null");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNotNull() {
            addCriterion("bill_type is not null");
            return (Criteria) this;
        }

        public Criteria andBillTypeEqualTo(Integer value) {
            addCriterion("bill_type =", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotEqualTo(Integer value) {
            addCriterion("bill_type <>", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThan(Integer value) {
            addCriterion("bill_type >", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_type >=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThan(Integer value) {
            addCriterion("bill_type <", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThanOrEqualTo(Integer value) {
            addCriterion("bill_type <=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeIn(List<Integer> values) {
            addCriterion("bill_type in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotIn(List<Integer> values) {
            addCriterion("bill_type not in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeBetween(Integer value1, Integer value2) {
            addCriterion("bill_type between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_type not between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillHeaderIsNull() {
            addCriterion("bill_header is null");
            return (Criteria) this;
        }

        public Criteria andBillHeaderIsNotNull() {
            addCriterion("bill_header is not null");
            return (Criteria) this;
        }

        public Criteria andBillHeaderEqualTo(String value) {
            addCriterion("bill_header =", value, "billHeader");
            return (Criteria) this;
        }

        public Criteria andBillHeaderNotEqualTo(String value) {
            addCriterion("bill_header <>", value, "billHeader");
            return (Criteria) this;
        }

        public Criteria andBillHeaderGreaterThan(String value) {
            addCriterion("bill_header >", value, "billHeader");
            return (Criteria) this;
        }

        public Criteria andBillHeaderGreaterThanOrEqualTo(String value) {
            addCriterion("bill_header >=", value, "billHeader");
            return (Criteria) this;
        }

        public Criteria andBillHeaderLessThan(String value) {
            addCriterion("bill_header <", value, "billHeader");
            return (Criteria) this;
        }

        public Criteria andBillHeaderLessThanOrEqualTo(String value) {
            addCriterion("bill_header <=", value, "billHeader");
            return (Criteria) this;
        }

        public Criteria andBillHeaderLike(String value) {
            addCriterion("bill_header like", value, "billHeader");
            return (Criteria) this;
        }

        public Criteria andBillHeaderNotLike(String value) {
            addCriterion("bill_header not like", value, "billHeader");
            return (Criteria) this;
        }

        public Criteria andBillHeaderIn(List<String> values) {
            addCriterion("bill_header in", values, "billHeader");
            return (Criteria) this;
        }

        public Criteria andBillHeaderNotIn(List<String> values) {
            addCriterion("bill_header not in", values, "billHeader");
            return (Criteria) this;
        }

        public Criteria andBillHeaderBetween(String value1, String value2) {
            addCriterion("bill_header between", value1, value2, "billHeader");
            return (Criteria) this;
        }

        public Criteria andBillHeaderNotBetween(String value1, String value2) {
            addCriterion("bill_header not between", value1, value2, "billHeader");
            return (Criteria) this;
        }

        public Criteria andBillContentIsNull() {
            addCriterion("bill_content is null");
            return (Criteria) this;
        }

        public Criteria andBillContentIsNotNull() {
            addCriterion("bill_content is not null");
            return (Criteria) this;
        }

        public Criteria andBillContentEqualTo(String value) {
            addCriterion("bill_content =", value, "billContent");
            return (Criteria) this;
        }

        public Criteria andBillContentNotEqualTo(String value) {
            addCriterion("bill_content <>", value, "billContent");
            return (Criteria) this;
        }

        public Criteria andBillContentGreaterThan(String value) {
            addCriterion("bill_content >", value, "billContent");
            return (Criteria) this;
        }

        public Criteria andBillContentGreaterThanOrEqualTo(String value) {
            addCriterion("bill_content >=", value, "billContent");
            return (Criteria) this;
        }

        public Criteria andBillContentLessThan(String value) {
            addCriterion("bill_content <", value, "billContent");
            return (Criteria) this;
        }

        public Criteria andBillContentLessThanOrEqualTo(String value) {
            addCriterion("bill_content <=", value, "billContent");
            return (Criteria) this;
        }

        public Criteria andBillContentLike(String value) {
            addCriterion("bill_content like", value, "billContent");
            return (Criteria) this;
        }

        public Criteria andBillContentNotLike(String value) {
            addCriterion("bill_content not like", value, "billContent");
            return (Criteria) this;
        }

        public Criteria andBillContentIn(List<String> values) {
            addCriterion("bill_content in", values, "billContent");
            return (Criteria) this;
        }

        public Criteria andBillContentNotIn(List<String> values) {
            addCriterion("bill_content not in", values, "billContent");
            return (Criteria) this;
        }

        public Criteria andBillContentBetween(String value1, String value2) {
            addCriterion("bill_content between", value1, value2, "billContent");
            return (Criteria) this;
        }

        public Criteria andBillContentNotBetween(String value1, String value2) {
            addCriterion("bill_content not between", value1, value2, "billContent");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhoneIsNull() {
            addCriterion("bill_receiver_phone is null");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhoneIsNotNull() {
            addCriterion("bill_receiver_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhoneEqualTo(String value) {
            addCriterion("bill_receiver_phone =", value, "billReceiverPhone");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhoneNotEqualTo(String value) {
            addCriterion("bill_receiver_phone <>", value, "billReceiverPhone");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhoneGreaterThan(String value) {
            addCriterion("bill_receiver_phone >", value, "billReceiverPhone");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("bill_receiver_phone >=", value, "billReceiverPhone");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhoneLessThan(String value) {
            addCriterion("bill_receiver_phone <", value, "billReceiverPhone");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhoneLessThanOrEqualTo(String value) {
            addCriterion("bill_receiver_phone <=", value, "billReceiverPhone");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhoneLike(String value) {
            addCriterion("bill_receiver_phone like", value, "billReceiverPhone");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhoneNotLike(String value) {
            addCriterion("bill_receiver_phone not like", value, "billReceiverPhone");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhoneIn(List<String> values) {
            addCriterion("bill_receiver_phone in", values, "billReceiverPhone");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhoneNotIn(List<String> values) {
            addCriterion("bill_receiver_phone not in", values, "billReceiverPhone");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhoneBetween(String value1, String value2) {
            addCriterion("bill_receiver_phone between", value1, value2, "billReceiverPhone");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhoneNotBetween(String value1, String value2) {
            addCriterion("bill_receiver_phone not between", value1, value2, "billReceiverPhone");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailIsNull() {
            addCriterion("bill_receiver_email is null");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailIsNotNull() {
            addCriterion("bill_receiver_email is not null");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailEqualTo(String value) {
            addCriterion("bill_receiver_email =", value, "billReceiverEmail");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailNotEqualTo(String value) {
            addCriterion("bill_receiver_email <>", value, "billReceiverEmail");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailGreaterThan(String value) {
            addCriterion("bill_receiver_email >", value, "billReceiverEmail");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailGreaterThanOrEqualTo(String value) {
            addCriterion("bill_receiver_email >=", value, "billReceiverEmail");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailLessThan(String value) {
            addCriterion("bill_receiver_email <", value, "billReceiverEmail");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailLessThanOrEqualTo(String value) {
            addCriterion("bill_receiver_email <=", value, "billReceiverEmail");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailLike(String value) {
            addCriterion("bill_receiver_email like", value, "billReceiverEmail");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailNotLike(String value) {
            addCriterion("bill_receiver_email not like", value, "billReceiverEmail");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailIn(List<String> values) {
            addCriterion("bill_receiver_email in", values, "billReceiverEmail");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailNotIn(List<String> values) {
            addCriterion("bill_receiver_email not in", values, "billReceiverEmail");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailBetween(String value1, String value2) {
            addCriterion("bill_receiver_email between", value1, value2, "billReceiverEmail");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailNotBetween(String value1, String value2) {
            addCriterion("bill_receiver_email not between", value1, value2, "billReceiverEmail");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNull() {
            addCriterion("receiver_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNotNull() {
            addCriterion("receiver_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameEqualTo(String value) {
            addCriterion("receiver_name =", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotEqualTo(String value) {
            addCriterion("receiver_name <>", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThan(String value) {
            addCriterion("receiver_name >", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_name >=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThan(String value) {
            addCriterion("receiver_name <", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThanOrEqualTo(String value) {
            addCriterion("receiver_name <=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLike(String value) {
            addCriterion("receiver_name like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotLike(String value) {
            addCriterion("receiver_name not like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIn(List<String> values) {
            addCriterion("receiver_name in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotIn(List<String> values) {
            addCriterion("receiver_name not in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameBetween(String value1, String value2) {
            addCriterion("receiver_name between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotBetween(String value1, String value2) {
            addCriterion("receiver_name not between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneIsNull() {
            addCriterion("receiver_phone is null");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneIsNotNull() {
            addCriterion("receiver_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneEqualTo(String value) {
            addCriterion("receiver_phone =", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotEqualTo(String value) {
            addCriterion("receiver_phone <>", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneGreaterThan(String value) {
            addCriterion("receiver_phone >", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_phone >=", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneLessThan(String value) {
            addCriterion("receiver_phone <", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneLessThanOrEqualTo(String value) {
            addCriterion("receiver_phone <=", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneLike(String value) {
            addCriterion("receiver_phone like", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotLike(String value) {
            addCriterion("receiver_phone not like", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneIn(List<String> values) {
            addCriterion("receiver_phone in", values, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotIn(List<String> values) {
            addCriterion("receiver_phone not in", values, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneBetween(String value1, String value2) {
            addCriterion("receiver_phone between", value1, value2, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotBetween(String value1, String value2) {
            addCriterion("receiver_phone not between", value1, value2, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeIsNull() {
            addCriterion("receiver_postcode is null");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeIsNotNull() {
            addCriterion("receiver_postcode is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeEqualTo(String value) {
            addCriterion("receiver_postcode =", value, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeNotEqualTo(String value) {
            addCriterion("receiver_postcode <>", value, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeGreaterThan(String value) {
            addCriterion("receiver_postcode >", value, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_postcode >=", value, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeLessThan(String value) {
            addCriterion("receiver_postcode <", value, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeLessThanOrEqualTo(String value) {
            addCriterion("receiver_postcode <=", value, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeLike(String value) {
            addCriterion("receiver_postcode like", value, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeNotLike(String value) {
            addCriterion("receiver_postcode not like", value, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeIn(List<String> values) {
            addCriterion("receiver_postcode in", values, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeNotIn(List<String> values) {
            addCriterion("receiver_postcode not in", values, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeBetween(String value1, String value2) {
            addCriterion("receiver_postcode between", value1, value2, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostcodeNotBetween(String value1, String value2) {
            addCriterion("receiver_postcode not between", value1, value2, "receiverPostcode");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceIsNull() {
            addCriterion("receiver_province is null");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceIsNotNull() {
            addCriterion("receiver_province is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceEqualTo(String value) {
            addCriterion("receiver_province =", value, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceNotEqualTo(String value) {
            addCriterion("receiver_province <>", value, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceGreaterThan(String value) {
            addCriterion("receiver_province >", value, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_province >=", value, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceLessThan(String value) {
            addCriterion("receiver_province <", value, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceLessThanOrEqualTo(String value) {
            addCriterion("receiver_province <=", value, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceLike(String value) {
            addCriterion("receiver_province like", value, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceNotLike(String value) {
            addCriterion("receiver_province not like", value, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceIn(List<String> values) {
            addCriterion("receiver_province in", values, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceNotIn(List<String> values) {
            addCriterion("receiver_province not in", values, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceBetween(String value1, String value2) {
            addCriterion("receiver_province between", value1, value2, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceNotBetween(String value1, String value2) {
            addCriterion("receiver_province not between", value1, value2, "receiverProvince");
            return (Criteria) this;
        }

        public Criteria andReceiverCityIsNull() {
            addCriterion("receiver_city is null");
            return (Criteria) this;
        }

        public Criteria andReceiverCityIsNotNull() {
            addCriterion("receiver_city is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverCityEqualTo(String value) {
            addCriterion("receiver_city =", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityNotEqualTo(String value) {
            addCriterion("receiver_city <>", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityGreaterThan(String value) {
            addCriterion("receiver_city >", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_city >=", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityLessThan(String value) {
            addCriterion("receiver_city <", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityLessThanOrEqualTo(String value) {
            addCriterion("receiver_city <=", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityLike(String value) {
            addCriterion("receiver_city like", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityNotLike(String value) {
            addCriterion("receiver_city not like", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityIn(List<String> values) {
            addCriterion("receiver_city in", values, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityNotIn(List<String> values) {
            addCriterion("receiver_city not in", values, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityBetween(String value1, String value2) {
            addCriterion("receiver_city between", value1, value2, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityNotBetween(String value1, String value2) {
            addCriterion("receiver_city not between", value1, value2, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionIsNull() {
            addCriterion("receiver_region is null");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionIsNotNull() {
            addCriterion("receiver_region is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionEqualTo(String value) {
            addCriterion("receiver_region =", value, "receiverRegion");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionNotEqualTo(String value) {
            addCriterion("receiver_region <>", value, "receiverRegion");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionGreaterThan(String value) {
            addCriterion("receiver_region >", value, "receiverRegion");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_region >=", value, "receiverRegion");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionLessThan(String value) {
            addCriterion("receiver_region <", value, "receiverRegion");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionLessThanOrEqualTo(String value) {
            addCriterion("receiver_region <=", value, "receiverRegion");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionLike(String value) {
            addCriterion("receiver_region like", value, "receiverRegion");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionNotLike(String value) {
            addCriterion("receiver_region not like", value, "receiverRegion");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionIn(List<String> values) {
            addCriterion("receiver_region in", values, "receiverRegion");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionNotIn(List<String> values) {
            addCriterion("receiver_region not in", values, "receiverRegion");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionBetween(String value1, String value2) {
            addCriterion("receiver_region between", value1, value2, "receiverRegion");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionNotBetween(String value1, String value2) {
            addCriterion("receiver_region not between", value1, value2, "receiverRegion");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressIsNull() {
            addCriterion("receiver_detail_address is null");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressIsNotNull() {
            addCriterion("receiver_detail_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressEqualTo(String value) {
            addCriterion("receiver_detail_address =", value, "receiverDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressNotEqualTo(String value) {
            addCriterion("receiver_detail_address <>", value, "receiverDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressGreaterThan(String value) {
            addCriterion("receiver_detail_address >", value, "receiverDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_detail_address >=", value, "receiverDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressLessThan(String value) {
            addCriterion("receiver_detail_address <", value, "receiverDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressLessThanOrEqualTo(String value) {
            addCriterion("receiver_detail_address <=", value, "receiverDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressLike(String value) {
            addCriterion("receiver_detail_address like", value, "receiverDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressNotLike(String value) {
            addCriterion("receiver_detail_address not like", value, "receiverDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressIn(List<String> values) {
            addCriterion("receiver_detail_address in", values, "receiverDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressNotIn(List<String> values) {
            addCriterion("receiver_detail_address not in", values, "receiverDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressBetween(String value1, String value2) {
            addCriterion("receiver_detail_address between", value1, value2, "receiverDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressNotBetween(String value1, String value2) {
            addCriterion("receiver_detail_address not between", value1, value2, "receiverDetailAddress");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusIsNull() {
            addCriterion("confirm_status is null");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusIsNotNull() {
            addCriterion("confirm_status is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusEqualTo(Integer value) {
            addCriterion("confirm_status =", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusNotEqualTo(Integer value) {
            addCriterion("confirm_status <>", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusGreaterThan(Integer value) {
            addCriterion("confirm_status >", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirm_status >=", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusLessThan(Integer value) {
            addCriterion("confirm_status <", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusLessThanOrEqualTo(Integer value) {
            addCriterion("confirm_status <=", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusIn(List<Integer> values) {
            addCriterion("confirm_status in", values, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusNotIn(List<Integer> values) {
            addCriterion("confirm_status not in", values, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusBetween(Integer value1, Integer value2) {
            addCriterion("confirm_status between", value1, value2, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("confirm_status not between", value1, value2, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIsNull() {
            addCriterion("delete_status is null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIsNotNull() {
            addCriterion("delete_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusEqualTo(Integer value) {
            addCriterion("delete_status =", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotEqualTo(Integer value) {
            addCriterion("delete_status <>", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusGreaterThan(Integer value) {
            addCriterion("delete_status >", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_status >=", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLessThan(Integer value) {
            addCriterion("delete_status <", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLessThanOrEqualTo(Integer value) {
            addCriterion("delete_status <=", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIn(List<Integer> values) {
            addCriterion("delete_status in", values, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotIn(List<Integer> values) {
            addCriterion("delete_status not in", values, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusBetween(Integer value1, Integer value2) {
            addCriterion("delete_status between", value1, value2, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_status not between", value1, value2, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andUsePointsIsNull() {
            addCriterion("use_points is null");
            return (Criteria) this;
        }

        public Criteria andUsePointsIsNotNull() {
            addCriterion("use_points is not null");
            return (Criteria) this;
        }

        public Criteria andUsePointsEqualTo(Integer value) {
            addCriterion("use_points =", value, "usePoints");
            return (Criteria) this;
        }

        public Criteria andUsePointsNotEqualTo(Integer value) {
            addCriterion("use_points <>", value, "usePoints");
            return (Criteria) this;
        }

        public Criteria andUsePointsGreaterThan(Integer value) {
            addCriterion("use_points >", value, "usePoints");
            return (Criteria) this;
        }

        public Criteria andUsePointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_points >=", value, "usePoints");
            return (Criteria) this;
        }

        public Criteria andUsePointsLessThan(Integer value) {
            addCriterion("use_points <", value, "usePoints");
            return (Criteria) this;
        }

        public Criteria andUsePointsLessThanOrEqualTo(Integer value) {
            addCriterion("use_points <=", value, "usePoints");
            return (Criteria) this;
        }

        public Criteria andUsePointsIn(List<Integer> values) {
            addCriterion("use_points in", values, "usePoints");
            return (Criteria) this;
        }

        public Criteria andUsePointsNotIn(List<Integer> values) {
            addCriterion("use_points not in", values, "usePoints");
            return (Criteria) this;
        }

        public Criteria andUsePointsBetween(Integer value1, Integer value2) {
            addCriterion("use_points between", value1, value2, "usePoints");
            return (Criteria) this;
        }

        public Criteria andUsePointsNotBetween(Integer value1, Integer value2) {
            addCriterion("use_points not between", value1, value2, "usePoints");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNull() {
            addCriterion("delivery_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNotNull() {
            addCriterion("delivery_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeEqualTo(Date value) {
            addCriterion("delivery_time =", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotEqualTo(Date value) {
            addCriterion("delivery_time <>", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThan(Date value) {
            addCriterion("delivery_time >", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delivery_time >=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThan(Date value) {
            addCriterion("delivery_time <", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThanOrEqualTo(Date value) {
            addCriterion("delivery_time <=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIn(List<Date> values) {
            addCriterion("delivery_time in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotIn(List<Date> values) {
            addCriterion("delivery_time not in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeBetween(Date value1, Date value2) {
            addCriterion("delivery_time between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotBetween(Date value1, Date value2) {
            addCriterion("delivery_time not between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeIsNull() {
            addCriterion("receiver_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeIsNotNull() {
            addCriterion("receiver_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeEqualTo(Date value) {
            addCriterion("receiver_time =", value, "receiverTime");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeNotEqualTo(Date value) {
            addCriterion("receiver_time <>", value, "receiverTime");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeGreaterThan(Date value) {
            addCriterion("receiver_time >", value, "receiverTime");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receiver_time >=", value, "receiverTime");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeLessThan(Date value) {
            addCriterion("receiver_time <", value, "receiverTime");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeLessThanOrEqualTo(Date value) {
            addCriterion("receiver_time <=", value, "receiverTime");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeIn(List<Date> values) {
            addCriterion("receiver_time in", values, "receiverTime");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeNotIn(List<Date> values) {
            addCriterion("receiver_time not in", values, "receiverTime");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeBetween(Date value1, Date value2) {
            addCriterion("receiver_time between", value1, value2, "receiverTime");
            return (Criteria) this;
        }

        public Criteria andReceiverTimeNotBetween(Date value1, Date value2) {
            addCriterion("receiver_time not between", value1, value2, "receiverTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNull() {
            addCriterion("comment_time is null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNotNull() {
            addCriterion("comment_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeEqualTo(Date value) {
            addCriterion("comment_time =", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotEqualTo(Date value) {
            addCriterion("comment_time <>", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThan(Date value) {
            addCriterion("comment_time >", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_time >=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThan(Date value) {
            addCriterion("comment_time <", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThanOrEqualTo(Date value) {
            addCriterion("comment_time <=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIn(List<Date> values) {
            addCriterion("comment_time in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotIn(List<Date> values) {
            addCriterion("comment_time not in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeBetween(Date value1, Date value2) {
            addCriterion("comment_time between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotBetween(Date value1, Date value2) {
            addCriterion("comment_time not between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}