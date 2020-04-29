package com.zhiqiang.mall.bean;

import java.util.ArrayList;
import java.util.List;

public class OmsOrderSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OmsOrderSettingExample() {
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

        public Criteria andOrderSettingIdIsNull() {
            addCriterion("order_setting_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderSettingIdIsNotNull() {
            addCriterion("order_setting_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSettingIdEqualTo(Long value) {
            addCriterion("order_setting_id =", value, "orderSettingId");
            return (Criteria) this;
        }

        public Criteria andOrderSettingIdNotEqualTo(Long value) {
            addCriterion("order_setting_id <>", value, "orderSettingId");
            return (Criteria) this;
        }

        public Criteria andOrderSettingIdGreaterThan(Long value) {
            addCriterion("order_setting_id >", value, "orderSettingId");
            return (Criteria) this;
        }

        public Criteria andOrderSettingIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_setting_id >=", value, "orderSettingId");
            return (Criteria) this;
        }

        public Criteria andOrderSettingIdLessThan(Long value) {
            addCriterion("order_setting_id <", value, "orderSettingId");
            return (Criteria) this;
        }

        public Criteria andOrderSettingIdLessThanOrEqualTo(Long value) {
            addCriterion("order_setting_id <=", value, "orderSettingId");
            return (Criteria) this;
        }

        public Criteria andOrderSettingIdIn(List<Long> values) {
            addCriterion("order_setting_id in", values, "orderSettingId");
            return (Criteria) this;
        }

        public Criteria andOrderSettingIdNotIn(List<Long> values) {
            addCriterion("order_setting_id not in", values, "orderSettingId");
            return (Criteria) this;
        }

        public Criteria andOrderSettingIdBetween(Long value1, Long value2) {
            addCriterion("order_setting_id between", value1, value2, "orderSettingId");
            return (Criteria) this;
        }

        public Criteria andOrderSettingIdNotBetween(Long value1, Long value2) {
            addCriterion("order_setting_id not between", value1, value2, "orderSettingId");
            return (Criteria) this;
        }

        public Criteria andSalesCloseTimeIsNull() {
            addCriterion("sales_close_time is null");
            return (Criteria) this;
        }

        public Criteria andSalesCloseTimeIsNotNull() {
            addCriterion("sales_close_time is not null");
            return (Criteria) this;
        }

        public Criteria andSalesCloseTimeEqualTo(Integer value) {
            addCriterion("sales_close_time =", value, "salesCloseTime");
            return (Criteria) this;
        }

        public Criteria andSalesCloseTimeNotEqualTo(Integer value) {
            addCriterion("sales_close_time <>", value, "salesCloseTime");
            return (Criteria) this;
        }

        public Criteria andSalesCloseTimeGreaterThan(Integer value) {
            addCriterion("sales_close_time >", value, "salesCloseTime");
            return (Criteria) this;
        }

        public Criteria andSalesCloseTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_close_time >=", value, "salesCloseTime");
            return (Criteria) this;
        }

        public Criteria andSalesCloseTimeLessThan(Integer value) {
            addCriterion("sales_close_time <", value, "salesCloseTime");
            return (Criteria) this;
        }

        public Criteria andSalesCloseTimeLessThanOrEqualTo(Integer value) {
            addCriterion("sales_close_time <=", value, "salesCloseTime");
            return (Criteria) this;
        }

        public Criteria andSalesCloseTimeIn(List<Integer> values) {
            addCriterion("sales_close_time in", values, "salesCloseTime");
            return (Criteria) this;
        }

        public Criteria andSalesCloseTimeNotIn(List<Integer> values) {
            addCriterion("sales_close_time not in", values, "salesCloseTime");
            return (Criteria) this;
        }

        public Criteria andSalesCloseTimeBetween(Integer value1, Integer value2) {
            addCriterion("sales_close_time between", value1, value2, "salesCloseTime");
            return (Criteria) this;
        }

        public Criteria andSalesCloseTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("sales_close_time not between", value1, value2, "salesCloseTime");
            return (Criteria) this;
        }

        public Criteria andNormalCloseTimeIsNull() {
            addCriterion("normal_close_time is null");
            return (Criteria) this;
        }

        public Criteria andNormalCloseTimeIsNotNull() {
            addCriterion("normal_close_time is not null");
            return (Criteria) this;
        }

        public Criteria andNormalCloseTimeEqualTo(Integer value) {
            addCriterion("normal_close_time =", value, "normalCloseTime");
            return (Criteria) this;
        }

        public Criteria andNormalCloseTimeNotEqualTo(Integer value) {
            addCriterion("normal_close_time <>", value, "normalCloseTime");
            return (Criteria) this;
        }

        public Criteria andNormalCloseTimeGreaterThan(Integer value) {
            addCriterion("normal_close_time >", value, "normalCloseTime");
            return (Criteria) this;
        }

        public Criteria andNormalCloseTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("normal_close_time >=", value, "normalCloseTime");
            return (Criteria) this;
        }

        public Criteria andNormalCloseTimeLessThan(Integer value) {
            addCriterion("normal_close_time <", value, "normalCloseTime");
            return (Criteria) this;
        }

        public Criteria andNormalCloseTimeLessThanOrEqualTo(Integer value) {
            addCriterion("normal_close_time <=", value, "normalCloseTime");
            return (Criteria) this;
        }

        public Criteria andNormalCloseTimeIn(List<Integer> values) {
            addCriterion("normal_close_time in", values, "normalCloseTime");
            return (Criteria) this;
        }

        public Criteria andNormalCloseTimeNotIn(List<Integer> values) {
            addCriterion("normal_close_time not in", values, "normalCloseTime");
            return (Criteria) this;
        }

        public Criteria andNormalCloseTimeBetween(Integer value1, Integer value2) {
            addCriterion("normal_close_time between", value1, value2, "normalCloseTime");
            return (Criteria) this;
        }

        public Criteria andNormalCloseTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("normal_close_time not between", value1, value2, "normalCloseTime");
            return (Criteria) this;
        }

        public Criteria andConfirmCloseTimeIsNull() {
            addCriterion("confirm_close_time is null");
            return (Criteria) this;
        }

        public Criteria andConfirmCloseTimeIsNotNull() {
            addCriterion("confirm_close_time is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmCloseTimeEqualTo(Integer value) {
            addCriterion("confirm_close_time =", value, "confirmCloseTime");
            return (Criteria) this;
        }

        public Criteria andConfirmCloseTimeNotEqualTo(Integer value) {
            addCriterion("confirm_close_time <>", value, "confirmCloseTime");
            return (Criteria) this;
        }

        public Criteria andConfirmCloseTimeGreaterThan(Integer value) {
            addCriterion("confirm_close_time >", value, "confirmCloseTime");
            return (Criteria) this;
        }

        public Criteria andConfirmCloseTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirm_close_time >=", value, "confirmCloseTime");
            return (Criteria) this;
        }

        public Criteria andConfirmCloseTimeLessThan(Integer value) {
            addCriterion("confirm_close_time <", value, "confirmCloseTime");
            return (Criteria) this;
        }

        public Criteria andConfirmCloseTimeLessThanOrEqualTo(Integer value) {
            addCriterion("confirm_close_time <=", value, "confirmCloseTime");
            return (Criteria) this;
        }

        public Criteria andConfirmCloseTimeIn(List<Integer> values) {
            addCriterion("confirm_close_time in", values, "confirmCloseTime");
            return (Criteria) this;
        }

        public Criteria andConfirmCloseTimeNotIn(List<Integer> values) {
            addCriterion("confirm_close_time not in", values, "confirmCloseTime");
            return (Criteria) this;
        }

        public Criteria andConfirmCloseTimeBetween(Integer value1, Integer value2) {
            addCriterion("confirm_close_time between", value1, value2, "confirmCloseTime");
            return (Criteria) this;
        }

        public Criteria andConfirmCloseTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("confirm_close_time not between", value1, value2, "confirmCloseTime");
            return (Criteria) this;
        }

        public Criteria andAfterSalesTimeIsNull() {
            addCriterion("after_sales_time is null");
            return (Criteria) this;
        }

        public Criteria andAfterSalesTimeIsNotNull() {
            addCriterion("after_sales_time is not null");
            return (Criteria) this;
        }

        public Criteria andAfterSalesTimeEqualTo(Integer value) {
            addCriterion("after_sales_time =", value, "afterSalesTime");
            return (Criteria) this;
        }

        public Criteria andAfterSalesTimeNotEqualTo(Integer value) {
            addCriterion("after_sales_time <>", value, "afterSalesTime");
            return (Criteria) this;
        }

        public Criteria andAfterSalesTimeGreaterThan(Integer value) {
            addCriterion("after_sales_time >", value, "afterSalesTime");
            return (Criteria) this;
        }

        public Criteria andAfterSalesTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("after_sales_time >=", value, "afterSalesTime");
            return (Criteria) this;
        }

        public Criteria andAfterSalesTimeLessThan(Integer value) {
            addCriterion("after_sales_time <", value, "afterSalesTime");
            return (Criteria) this;
        }

        public Criteria andAfterSalesTimeLessThanOrEqualTo(Integer value) {
            addCriterion("after_sales_time <=", value, "afterSalesTime");
            return (Criteria) this;
        }

        public Criteria andAfterSalesTimeIn(List<Integer> values) {
            addCriterion("after_sales_time in", values, "afterSalesTime");
            return (Criteria) this;
        }

        public Criteria andAfterSalesTimeNotIn(List<Integer> values) {
            addCriterion("after_sales_time not in", values, "afterSalesTime");
            return (Criteria) this;
        }

        public Criteria andAfterSalesTimeBetween(Integer value1, Integer value2) {
            addCriterion("after_sales_time between", value1, value2, "afterSalesTime");
            return (Criteria) this;
        }

        public Criteria andAfterSalesTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("after_sales_time not between", value1, value2, "afterSalesTime");
            return (Criteria) this;
        }

        public Criteria andAutoCommentTimeIsNull() {
            addCriterion("auto_comment_time is null");
            return (Criteria) this;
        }

        public Criteria andAutoCommentTimeIsNotNull() {
            addCriterion("auto_comment_time is not null");
            return (Criteria) this;
        }

        public Criteria andAutoCommentTimeEqualTo(Integer value) {
            addCriterion("auto_comment_time =", value, "autoCommentTime");
            return (Criteria) this;
        }

        public Criteria andAutoCommentTimeNotEqualTo(Integer value) {
            addCriterion("auto_comment_time <>", value, "autoCommentTime");
            return (Criteria) this;
        }

        public Criteria andAutoCommentTimeGreaterThan(Integer value) {
            addCriterion("auto_comment_time >", value, "autoCommentTime");
            return (Criteria) this;
        }

        public Criteria andAutoCommentTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("auto_comment_time >=", value, "autoCommentTime");
            return (Criteria) this;
        }

        public Criteria andAutoCommentTimeLessThan(Integer value) {
            addCriterion("auto_comment_time <", value, "autoCommentTime");
            return (Criteria) this;
        }

        public Criteria andAutoCommentTimeLessThanOrEqualTo(Integer value) {
            addCriterion("auto_comment_time <=", value, "autoCommentTime");
            return (Criteria) this;
        }

        public Criteria andAutoCommentTimeIn(List<Integer> values) {
            addCriterion("auto_comment_time in", values, "autoCommentTime");
            return (Criteria) this;
        }

        public Criteria andAutoCommentTimeNotIn(List<Integer> values) {
            addCriterion("auto_comment_time not in", values, "autoCommentTime");
            return (Criteria) this;
        }

        public Criteria andAutoCommentTimeBetween(Integer value1, Integer value2) {
            addCriterion("auto_comment_time between", value1, value2, "autoCommentTime");
            return (Criteria) this;
        }

        public Criteria andAutoCommentTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("auto_comment_time not between", value1, value2, "autoCommentTime");
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