package com.zhiqiang.mall.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PmsFreightTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsFreightTemplateExample() {
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

        public Criteria andFreightIdIsNull() {
            addCriterion("freight_id is null");
            return (Criteria) this;
        }

        public Criteria andFreightIdIsNotNull() {
            addCriterion("freight_id is not null");
            return (Criteria) this;
        }

        public Criteria andFreightIdEqualTo(Long value) {
            addCriterion("freight_id =", value, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdNotEqualTo(Long value) {
            addCriterion("freight_id <>", value, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdGreaterThan(Long value) {
            addCriterion("freight_id >", value, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdGreaterThanOrEqualTo(Long value) {
            addCriterion("freight_id >=", value, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdLessThan(Long value) {
            addCriterion("freight_id <", value, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdLessThanOrEqualTo(Long value) {
            addCriterion("freight_id <=", value, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdIn(List<Long> values) {
            addCriterion("freight_id in", values, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdNotIn(List<Long> values) {
            addCriterion("freight_id not in", values, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdBetween(Long value1, Long value2) {
            addCriterion("freight_id between", value1, value2, "freightId");
            return (Criteria) this;
        }

        public Criteria andFreightIdNotBetween(Long value1, Long value2) {
            addCriterion("freight_id not between", value1, value2, "freightId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIsNull() {
            addCriterion("charge_type is null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIsNotNull() {
            addCriterion("charge_type is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeEqualTo(Integer value) {
            addCriterion("charge_type =", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotEqualTo(Integer value) {
            addCriterion("charge_type <>", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeGreaterThan(Integer value) {
            addCriterion("charge_type >", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_type >=", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLessThan(Integer value) {
            addCriterion("charge_type <", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("charge_type <=", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIn(List<Integer> values) {
            addCriterion("charge_type in", values, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotIn(List<Integer> values) {
            addCriterion("charge_type not in", values, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeBetween(Integer value1, Integer value2) {
            addCriterion("charge_type between", value1, value2, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_type not between", value1, value2, "chargeType");
            return (Criteria) this;
        }

        public Criteria andFirstWeightIsNull() {
            addCriterion("first_weight is null");
            return (Criteria) this;
        }

        public Criteria andFirstWeightIsNotNull() {
            addCriterion("first_weight is not null");
            return (Criteria) this;
        }

        public Criteria andFirstWeightEqualTo(BigDecimal value) {
            addCriterion("first_weight =", value, "firstWeight");
            return (Criteria) this;
        }

        public Criteria andFirstWeightNotEqualTo(BigDecimal value) {
            addCriterion("first_weight <>", value, "firstWeight");
            return (Criteria) this;
        }

        public Criteria andFirstWeightGreaterThan(BigDecimal value) {
            addCriterion("first_weight >", value, "firstWeight");
            return (Criteria) this;
        }

        public Criteria andFirstWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("first_weight >=", value, "firstWeight");
            return (Criteria) this;
        }

        public Criteria andFirstWeightLessThan(BigDecimal value) {
            addCriterion("first_weight <", value, "firstWeight");
            return (Criteria) this;
        }

        public Criteria andFirstWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("first_weight <=", value, "firstWeight");
            return (Criteria) this;
        }

        public Criteria andFirstWeightIn(List<BigDecimal> values) {
            addCriterion("first_weight in", values, "firstWeight");
            return (Criteria) this;
        }

        public Criteria andFirstWeightNotIn(List<BigDecimal> values) {
            addCriterion("first_weight not in", values, "firstWeight");
            return (Criteria) this;
        }

        public Criteria andFirstWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_weight between", value1, value2, "firstWeight");
            return (Criteria) this;
        }

        public Criteria andFirstWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_weight not between", value1, value2, "firstWeight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightIsNull() {
            addCriterion("first_freight is null");
            return (Criteria) this;
        }

        public Criteria andFirstFreightIsNotNull() {
            addCriterion("first_freight is not null");
            return (Criteria) this;
        }

        public Criteria andFirstFreightEqualTo(BigDecimal value) {
            addCriterion("first_freight =", value, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightNotEqualTo(BigDecimal value) {
            addCriterion("first_freight <>", value, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightGreaterThan(BigDecimal value) {
            addCriterion("first_freight >", value, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("first_freight >=", value, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightLessThan(BigDecimal value) {
            addCriterion("first_freight <", value, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("first_freight <=", value, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightIn(List<BigDecimal> values) {
            addCriterion("first_freight in", values, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightNotIn(List<BigDecimal> values) {
            addCriterion("first_freight not in", values, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_freight between", value1, value2, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_freight not between", value1, value2, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andContinueWeightIsNull() {
            addCriterion("continue_weight is null");
            return (Criteria) this;
        }

        public Criteria andContinueWeightIsNotNull() {
            addCriterion("continue_weight is not null");
            return (Criteria) this;
        }

        public Criteria andContinueWeightEqualTo(BigDecimal value) {
            addCriterion("continue_weight =", value, "continueWeight");
            return (Criteria) this;
        }

        public Criteria andContinueWeightNotEqualTo(BigDecimal value) {
            addCriterion("continue_weight <>", value, "continueWeight");
            return (Criteria) this;
        }

        public Criteria andContinueWeightGreaterThan(BigDecimal value) {
            addCriterion("continue_weight >", value, "continueWeight");
            return (Criteria) this;
        }

        public Criteria andContinueWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("continue_weight >=", value, "continueWeight");
            return (Criteria) this;
        }

        public Criteria andContinueWeightLessThan(BigDecimal value) {
            addCriterion("continue_weight <", value, "continueWeight");
            return (Criteria) this;
        }

        public Criteria andContinueWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("continue_weight <=", value, "continueWeight");
            return (Criteria) this;
        }

        public Criteria andContinueWeightIn(List<BigDecimal> values) {
            addCriterion("continue_weight in", values, "continueWeight");
            return (Criteria) this;
        }

        public Criteria andContinueWeightNotIn(List<BigDecimal> values) {
            addCriterion("continue_weight not in", values, "continueWeight");
            return (Criteria) this;
        }

        public Criteria andContinueWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("continue_weight between", value1, value2, "continueWeight");
            return (Criteria) this;
        }

        public Criteria andContinueWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("continue_weight not between", value1, value2, "continueWeight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightIsNull() {
            addCriterion("continue_freight is null");
            return (Criteria) this;
        }

        public Criteria andContinueFreightIsNotNull() {
            addCriterion("continue_freight is not null");
            return (Criteria) this;
        }

        public Criteria andContinueFreightEqualTo(BigDecimal value) {
            addCriterion("continue_freight =", value, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightNotEqualTo(BigDecimal value) {
            addCriterion("continue_freight <>", value, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightGreaterThan(BigDecimal value) {
            addCriterion("continue_freight >", value, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("continue_freight >=", value, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightLessThan(BigDecimal value) {
            addCriterion("continue_freight <", value, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("continue_freight <=", value, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightIn(List<BigDecimal> values) {
            addCriterion("continue_freight in", values, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightNotIn(List<BigDecimal> values) {
            addCriterion("continue_freight not in", values, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("continue_freight between", value1, value2, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("continue_freight not between", value1, value2, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNull() {
            addCriterion("destination is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("destination is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("destination =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("destination <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("destination >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("destination >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("destination <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("destination <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("destination like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("destination not like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("destination in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("destination not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("destination between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("destination not between", value1, value2, "destination");
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