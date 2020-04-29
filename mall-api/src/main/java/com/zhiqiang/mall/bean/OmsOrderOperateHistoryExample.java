package com.zhiqiang.mall.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OmsOrderOperateHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OmsOrderOperateHistoryExample() {
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

        public Criteria andOrderOperateHistoryIdIsNull() {
            addCriterion("order_operate_history_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderOperateHistoryIdIsNotNull() {
            addCriterion("order_operate_history_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderOperateHistoryIdEqualTo(Long value) {
            addCriterion("order_operate_history_id =", value, "orderOperateHistoryId");
            return (Criteria) this;
        }

        public Criteria andOrderOperateHistoryIdNotEqualTo(Long value) {
            addCriterion("order_operate_history_id <>", value, "orderOperateHistoryId");
            return (Criteria) this;
        }

        public Criteria andOrderOperateHistoryIdGreaterThan(Long value) {
            addCriterion("order_operate_history_id >", value, "orderOperateHistoryId");
            return (Criteria) this;
        }

        public Criteria andOrderOperateHistoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_operate_history_id >=", value, "orderOperateHistoryId");
            return (Criteria) this;
        }

        public Criteria andOrderOperateHistoryIdLessThan(Long value) {
            addCriterion("order_operate_history_id <", value, "orderOperateHistoryId");
            return (Criteria) this;
        }

        public Criteria andOrderOperateHistoryIdLessThanOrEqualTo(Long value) {
            addCriterion("order_operate_history_id <=", value, "orderOperateHistoryId");
            return (Criteria) this;
        }

        public Criteria andOrderOperateHistoryIdIn(List<Long> values) {
            addCriterion("order_operate_history_id in", values, "orderOperateHistoryId");
            return (Criteria) this;
        }

        public Criteria andOrderOperateHistoryIdNotIn(List<Long> values) {
            addCriterion("order_operate_history_id not in", values, "orderOperateHistoryId");
            return (Criteria) this;
        }

        public Criteria andOrderOperateHistoryIdBetween(Long value1, Long value2) {
            addCriterion("order_operate_history_id between", value1, value2, "orderOperateHistoryId");
            return (Criteria) this;
        }

        public Criteria andOrderOperateHistoryIdNotBetween(Long value1, Long value2) {
            addCriterion("order_operate_history_id not between", value1, value2, "orderOperateHistoryId");
            return (Criteria) this;
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

        public Criteria andOperateManIsNull() {
            addCriterion("operate_man is null");
            return (Criteria) this;
        }

        public Criteria andOperateManIsNotNull() {
            addCriterion("operate_man is not null");
            return (Criteria) this;
        }

        public Criteria andOperateManEqualTo(String value) {
            addCriterion("operate_man =", value, "operateMan");
            return (Criteria) this;
        }

        public Criteria andOperateManNotEqualTo(String value) {
            addCriterion("operate_man <>", value, "operateMan");
            return (Criteria) this;
        }

        public Criteria andOperateManGreaterThan(String value) {
            addCriterion("operate_man >", value, "operateMan");
            return (Criteria) this;
        }

        public Criteria andOperateManGreaterThanOrEqualTo(String value) {
            addCriterion("operate_man >=", value, "operateMan");
            return (Criteria) this;
        }

        public Criteria andOperateManLessThan(String value) {
            addCriterion("operate_man <", value, "operateMan");
            return (Criteria) this;
        }

        public Criteria andOperateManLessThanOrEqualTo(String value) {
            addCriterion("operate_man <=", value, "operateMan");
            return (Criteria) this;
        }

        public Criteria andOperateManLike(String value) {
            addCriterion("operate_man like", value, "operateMan");
            return (Criteria) this;
        }

        public Criteria andOperateManNotLike(String value) {
            addCriterion("operate_man not like", value, "operateMan");
            return (Criteria) this;
        }

        public Criteria andOperateManIn(List<String> values) {
            addCriterion("operate_man in", values, "operateMan");
            return (Criteria) this;
        }

        public Criteria andOperateManNotIn(List<String> values) {
            addCriterion("operate_man not in", values, "operateMan");
            return (Criteria) this;
        }

        public Criteria andOperateManBetween(String value1, String value2) {
            addCriterion("operate_man between", value1, value2, "operateMan");
            return (Criteria) this;
        }

        public Criteria andOperateManNotBetween(String value1, String value2) {
            addCriterion("operate_man not between", value1, value2, "operateMan");
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

        public Criteria andOrderBeforeStatusIsNull() {
            addCriterion("order_before_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderBeforeStatusIsNotNull() {
            addCriterion("order_before_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBeforeStatusEqualTo(Integer value) {
            addCriterion("order_before_status =", value, "orderBeforeStatus");
            return (Criteria) this;
        }

        public Criteria andOrderBeforeStatusNotEqualTo(Integer value) {
            addCriterion("order_before_status <>", value, "orderBeforeStatus");
            return (Criteria) this;
        }

        public Criteria andOrderBeforeStatusGreaterThan(Integer value) {
            addCriterion("order_before_status >", value, "orderBeforeStatus");
            return (Criteria) this;
        }

        public Criteria andOrderBeforeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_before_status >=", value, "orderBeforeStatus");
            return (Criteria) this;
        }

        public Criteria andOrderBeforeStatusLessThan(Integer value) {
            addCriterion("order_before_status <", value, "orderBeforeStatus");
            return (Criteria) this;
        }

        public Criteria andOrderBeforeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_before_status <=", value, "orderBeforeStatus");
            return (Criteria) this;
        }

        public Criteria andOrderBeforeStatusIn(List<Integer> values) {
            addCriterion("order_before_status in", values, "orderBeforeStatus");
            return (Criteria) this;
        }

        public Criteria andOrderBeforeStatusNotIn(List<Integer> values) {
            addCriterion("order_before_status not in", values, "orderBeforeStatus");
            return (Criteria) this;
        }

        public Criteria andOrderBeforeStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_before_status between", value1, value2, "orderBeforeStatus");
            return (Criteria) this;
        }

        public Criteria andOrderBeforeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_before_status not between", value1, value2, "orderBeforeStatus");
            return (Criteria) this;
        }

        public Criteria andOrderLateStatusIsNull() {
            addCriterion("order_late_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderLateStatusIsNotNull() {
            addCriterion("order_late_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderLateStatusEqualTo(Integer value) {
            addCriterion("order_late_status =", value, "orderLateStatus");
            return (Criteria) this;
        }

        public Criteria andOrderLateStatusNotEqualTo(Integer value) {
            addCriterion("order_late_status <>", value, "orderLateStatus");
            return (Criteria) this;
        }

        public Criteria andOrderLateStatusGreaterThan(Integer value) {
            addCriterion("order_late_status >", value, "orderLateStatus");
            return (Criteria) this;
        }

        public Criteria andOrderLateStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_late_status >=", value, "orderLateStatus");
            return (Criteria) this;
        }

        public Criteria andOrderLateStatusLessThan(Integer value) {
            addCriterion("order_late_status <", value, "orderLateStatus");
            return (Criteria) this;
        }

        public Criteria andOrderLateStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_late_status <=", value, "orderLateStatus");
            return (Criteria) this;
        }

        public Criteria andOrderLateStatusIn(List<Integer> values) {
            addCriterion("order_late_status in", values, "orderLateStatus");
            return (Criteria) this;
        }

        public Criteria andOrderLateStatusNotIn(List<Integer> values) {
            addCriterion("order_late_status not in", values, "orderLateStatus");
            return (Criteria) this;
        }

        public Criteria andOrderLateStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_late_status between", value1, value2, "orderLateStatus");
            return (Criteria) this;
        }

        public Criteria andOrderLateStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_late_status not between", value1, value2, "orderLateStatus");
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