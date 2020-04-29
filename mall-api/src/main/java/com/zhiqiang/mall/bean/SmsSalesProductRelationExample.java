package com.zhiqiang.mall.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SmsSalesProductRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmsSalesProductRelationExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSalesIdIsNull() {
            addCriterion("sales_id is null");
            return (Criteria) this;
        }

        public Criteria andSalesIdIsNotNull() {
            addCriterion("sales_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalesIdEqualTo(Long value) {
            addCriterion("sales_id =", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdNotEqualTo(Long value) {
            addCriterion("sales_id <>", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdGreaterThan(Long value) {
            addCriterion("sales_id >", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sales_id >=", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdLessThan(Long value) {
            addCriterion("sales_id <", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdLessThanOrEqualTo(Long value) {
            addCriterion("sales_id <=", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdIn(List<Long> values) {
            addCriterion("sales_id in", values, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdNotIn(List<Long> values) {
            addCriterion("sales_id not in", values, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdBetween(Long value1, Long value2) {
            addCriterion("sales_id between", value1, value2, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdNotBetween(Long value1, Long value2) {
            addCriterion("sales_id not between", value1, value2, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesSessionIdIsNull() {
            addCriterion("sales_session_id is null");
            return (Criteria) this;
        }

        public Criteria andSalesSessionIdIsNotNull() {
            addCriterion("sales_session_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalesSessionIdEqualTo(Long value) {
            addCriterion("sales_session_id =", value, "salesSessionId");
            return (Criteria) this;
        }

        public Criteria andSalesSessionIdNotEqualTo(Long value) {
            addCriterion("sales_session_id <>", value, "salesSessionId");
            return (Criteria) this;
        }

        public Criteria andSalesSessionIdGreaterThan(Long value) {
            addCriterion("sales_session_id >", value, "salesSessionId");
            return (Criteria) this;
        }

        public Criteria andSalesSessionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sales_session_id >=", value, "salesSessionId");
            return (Criteria) this;
        }

        public Criteria andSalesSessionIdLessThan(Long value) {
            addCriterion("sales_session_id <", value, "salesSessionId");
            return (Criteria) this;
        }

        public Criteria andSalesSessionIdLessThanOrEqualTo(Long value) {
            addCriterion("sales_session_id <=", value, "salesSessionId");
            return (Criteria) this;
        }

        public Criteria andSalesSessionIdIn(List<Long> values) {
            addCriterion("sales_session_id in", values, "salesSessionId");
            return (Criteria) this;
        }

        public Criteria andSalesSessionIdNotIn(List<Long> values) {
            addCriterion("sales_session_id not in", values, "salesSessionId");
            return (Criteria) this;
        }

        public Criteria andSalesSessionIdBetween(Long value1, Long value2) {
            addCriterion("sales_session_id between", value1, value2, "salesSessionId");
            return (Criteria) this;
        }

        public Criteria andSalesSessionIdNotBetween(Long value1, Long value2) {
            addCriterion("sales_session_id not between", value1, value2, "salesSessionId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Long value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Long> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Long> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionPriceIsNull() {
            addCriterion("flash_promotion_price is null");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionPriceIsNotNull() {
            addCriterion("flash_promotion_price is not null");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionPriceEqualTo(BigDecimal value) {
            addCriterion("flash_promotion_price =", value, "flashPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionPriceNotEqualTo(BigDecimal value) {
            addCriterion("flash_promotion_price <>", value, "flashPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionPriceGreaterThan(BigDecimal value) {
            addCriterion("flash_promotion_price >", value, "flashPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("flash_promotion_price >=", value, "flashPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionPriceLessThan(BigDecimal value) {
            addCriterion("flash_promotion_price <", value, "flashPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("flash_promotion_price <=", value, "flashPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionPriceIn(List<BigDecimal> values) {
            addCriterion("flash_promotion_price in", values, "flashPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionPriceNotIn(List<BigDecimal> values) {
            addCriterion("flash_promotion_price not in", values, "flashPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("flash_promotion_price between", value1, value2, "flashPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("flash_promotion_price not between", value1, value2, "flashPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionCountIsNull() {
            addCriterion("flash_promotion_count is null");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionCountIsNotNull() {
            addCriterion("flash_promotion_count is not null");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionCountEqualTo(Integer value) {
            addCriterion("flash_promotion_count =", value, "flashPromotionCount");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionCountNotEqualTo(Integer value) {
            addCriterion("flash_promotion_count <>", value, "flashPromotionCount");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionCountGreaterThan(Integer value) {
            addCriterion("flash_promotion_count >", value, "flashPromotionCount");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("flash_promotion_count >=", value, "flashPromotionCount");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionCountLessThan(Integer value) {
            addCriterion("flash_promotion_count <", value, "flashPromotionCount");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionCountLessThanOrEqualTo(Integer value) {
            addCriterion("flash_promotion_count <=", value, "flashPromotionCount");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionCountIn(List<Integer> values) {
            addCriterion("flash_promotion_count in", values, "flashPromotionCount");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionCountNotIn(List<Integer> values) {
            addCriterion("flash_promotion_count not in", values, "flashPromotionCount");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionCountBetween(Integer value1, Integer value2) {
            addCriterion("flash_promotion_count between", value1, value2, "flashPromotionCount");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionCountNotBetween(Integer value1, Integer value2) {
            addCriterion("flash_promotion_count not between", value1, value2, "flashPromotionCount");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionLimitIsNull() {
            addCriterion("flash_promotion_limit is null");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionLimitIsNotNull() {
            addCriterion("flash_promotion_limit is not null");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionLimitEqualTo(Integer value) {
            addCriterion("flash_promotion_limit =", value, "flashPromotionLimit");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionLimitNotEqualTo(Integer value) {
            addCriterion("flash_promotion_limit <>", value, "flashPromotionLimit");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionLimitGreaterThan(Integer value) {
            addCriterion("flash_promotion_limit >", value, "flashPromotionLimit");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("flash_promotion_limit >=", value, "flashPromotionLimit");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionLimitLessThan(Integer value) {
            addCriterion("flash_promotion_limit <", value, "flashPromotionLimit");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionLimitLessThanOrEqualTo(Integer value) {
            addCriterion("flash_promotion_limit <=", value, "flashPromotionLimit");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionLimitIn(List<Integer> values) {
            addCriterion("flash_promotion_limit in", values, "flashPromotionLimit");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionLimitNotIn(List<Integer> values) {
            addCriterion("flash_promotion_limit not in", values, "flashPromotionLimit");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionLimitBetween(Integer value1, Integer value2) {
            addCriterion("flash_promotion_limit between", value1, value2, "flashPromotionLimit");
            return (Criteria) this;
        }

        public Criteria andFlashPromotionLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("flash_promotion_limit not between", value1, value2, "flashPromotionLimit");
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