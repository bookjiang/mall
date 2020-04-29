package com.zhiqiang.mall.bean;

import java.util.ArrayList;
import java.util.List;

public class UmsMemberLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UmsMemberLevelExample() {
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

        public Criteria andMemberLevelIdIsNull() {
            addCriterion("member_level_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdIsNotNull() {
            addCriterion("member_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdEqualTo(Long value) {
            addCriterion("member_level_id =", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdNotEqualTo(Long value) {
            addCriterion("member_level_id <>", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdGreaterThan(Long value) {
            addCriterion("member_level_id >", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("member_level_id >=", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdLessThan(Long value) {
            addCriterion("member_level_id <", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdLessThanOrEqualTo(Long value) {
            addCriterion("member_level_id <=", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdIn(List<Long> values) {
            addCriterion("member_level_id in", values, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdNotIn(List<Long> values) {
            addCriterion("member_level_id not in", values, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdBetween(Long value1, Long value2) {
            addCriterion("member_level_id between", value1, value2, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdNotBetween(Long value1, Long value2) {
            addCriterion("member_level_id not between", value1, value2, "memberLevelId");
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

        public Criteria andGrowthPointLowIsNull() {
            addCriterion("growth_point_low is null");
            return (Criteria) this;
        }

        public Criteria andGrowthPointLowIsNotNull() {
            addCriterion("growth_point_low is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthPointLowEqualTo(Integer value) {
            addCriterion("growth_point_low =", value, "growthPointLow");
            return (Criteria) this;
        }

        public Criteria andGrowthPointLowNotEqualTo(Integer value) {
            addCriterion("growth_point_low <>", value, "growthPointLow");
            return (Criteria) this;
        }

        public Criteria andGrowthPointLowGreaterThan(Integer value) {
            addCriterion("growth_point_low >", value, "growthPointLow");
            return (Criteria) this;
        }

        public Criteria andGrowthPointLowGreaterThanOrEqualTo(Integer value) {
            addCriterion("growth_point_low >=", value, "growthPointLow");
            return (Criteria) this;
        }

        public Criteria andGrowthPointLowLessThan(Integer value) {
            addCriterion("growth_point_low <", value, "growthPointLow");
            return (Criteria) this;
        }

        public Criteria andGrowthPointLowLessThanOrEqualTo(Integer value) {
            addCriterion("growth_point_low <=", value, "growthPointLow");
            return (Criteria) this;
        }

        public Criteria andGrowthPointLowIn(List<Integer> values) {
            addCriterion("growth_point_low in", values, "growthPointLow");
            return (Criteria) this;
        }

        public Criteria andGrowthPointLowNotIn(List<Integer> values) {
            addCriterion("growth_point_low not in", values, "growthPointLow");
            return (Criteria) this;
        }

        public Criteria andGrowthPointLowBetween(Integer value1, Integer value2) {
            addCriterion("growth_point_low between", value1, value2, "growthPointLow");
            return (Criteria) this;
        }

        public Criteria andGrowthPointLowNotBetween(Integer value1, Integer value2) {
            addCriterion("growth_point_low not between", value1, value2, "growthPointLow");
            return (Criteria) this;
        }

        public Criteria andGrowthPointHighIsNull() {
            addCriterion("growth_point_high is null");
            return (Criteria) this;
        }

        public Criteria andGrowthPointHighIsNotNull() {
            addCriterion("growth_point_high is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthPointHighEqualTo(Integer value) {
            addCriterion("growth_point_high =", value, "growthPointHigh");
            return (Criteria) this;
        }

        public Criteria andGrowthPointHighNotEqualTo(Integer value) {
            addCriterion("growth_point_high <>", value, "growthPointHigh");
            return (Criteria) this;
        }

        public Criteria andGrowthPointHighGreaterThan(Integer value) {
            addCriterion("growth_point_high >", value, "growthPointHigh");
            return (Criteria) this;
        }

        public Criteria andGrowthPointHighGreaterThanOrEqualTo(Integer value) {
            addCriterion("growth_point_high >=", value, "growthPointHigh");
            return (Criteria) this;
        }

        public Criteria andGrowthPointHighLessThan(Integer value) {
            addCriterion("growth_point_high <", value, "growthPointHigh");
            return (Criteria) this;
        }

        public Criteria andGrowthPointHighLessThanOrEqualTo(Integer value) {
            addCriterion("growth_point_high <=", value, "growthPointHigh");
            return (Criteria) this;
        }

        public Criteria andGrowthPointHighIn(List<Integer> values) {
            addCriterion("growth_point_high in", values, "growthPointHigh");
            return (Criteria) this;
        }

        public Criteria andGrowthPointHighNotIn(List<Integer> values) {
            addCriterion("growth_point_high not in", values, "growthPointHigh");
            return (Criteria) this;
        }

        public Criteria andGrowthPointHighBetween(Integer value1, Integer value2) {
            addCriterion("growth_point_high between", value1, value2, "growthPointHigh");
            return (Criteria) this;
        }

        public Criteria andGrowthPointHighNotBetween(Integer value1, Integer value2) {
            addCriterion("growth_point_high not between", value1, value2, "growthPointHigh");
            return (Criteria) this;
        }

        public Criteria andDefaultStatusIsNull() {
            addCriterion("default_status is null");
            return (Criteria) this;
        }

        public Criteria andDefaultStatusIsNotNull() {
            addCriterion("default_status is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultStatusEqualTo(Integer value) {
            addCriterion("default_status =", value, "defaultStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultStatusNotEqualTo(Integer value) {
            addCriterion("default_status <>", value, "defaultStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultStatusGreaterThan(Integer value) {
            addCriterion("default_status >", value, "defaultStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("default_status >=", value, "defaultStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultStatusLessThan(Integer value) {
            addCriterion("default_status <", value, "defaultStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultStatusLessThanOrEqualTo(Integer value) {
            addCriterion("default_status <=", value, "defaultStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultStatusIn(List<Integer> values) {
            addCriterion("default_status in", values, "defaultStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultStatusNotIn(List<Integer> values) {
            addCriterion("default_status not in", values, "defaultStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultStatusBetween(Integer value1, Integer value2) {
            addCriterion("default_status between", value1, value2, "defaultStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("default_status not between", value1, value2, "defaultStatus");
            return (Criteria) this;
        }

        public Criteria andFreeFreightTicketIsNull() {
            addCriterion("free_freight_ticket is null");
            return (Criteria) this;
        }

        public Criteria andFreeFreightTicketIsNotNull() {
            addCriterion("free_freight_ticket is not null");
            return (Criteria) this;
        }

        public Criteria andFreeFreightTicketEqualTo(Integer value) {
            addCriterion("free_freight_ticket =", value, "freeFreightTicket");
            return (Criteria) this;
        }

        public Criteria andFreeFreightTicketNotEqualTo(Integer value) {
            addCriterion("free_freight_ticket <>", value, "freeFreightTicket");
            return (Criteria) this;
        }

        public Criteria andFreeFreightTicketGreaterThan(Integer value) {
            addCriterion("free_freight_ticket >", value, "freeFreightTicket");
            return (Criteria) this;
        }

        public Criteria andFreeFreightTicketGreaterThanOrEqualTo(Integer value) {
            addCriterion("free_freight_ticket >=", value, "freeFreightTicket");
            return (Criteria) this;
        }

        public Criteria andFreeFreightTicketLessThan(Integer value) {
            addCriterion("free_freight_ticket <", value, "freeFreightTicket");
            return (Criteria) this;
        }

        public Criteria andFreeFreightTicketLessThanOrEqualTo(Integer value) {
            addCriterion("free_freight_ticket <=", value, "freeFreightTicket");
            return (Criteria) this;
        }

        public Criteria andFreeFreightTicketIn(List<Integer> values) {
            addCriterion("free_freight_ticket in", values, "freeFreightTicket");
            return (Criteria) this;
        }

        public Criteria andFreeFreightTicketNotIn(List<Integer> values) {
            addCriterion("free_freight_ticket not in", values, "freeFreightTicket");
            return (Criteria) this;
        }

        public Criteria andFreeFreightTicketBetween(Integer value1, Integer value2) {
            addCriterion("free_freight_ticket between", value1, value2, "freeFreightTicket");
            return (Criteria) this;
        }

        public Criteria andFreeFreightTicketNotBetween(Integer value1, Integer value2) {
            addCriterion("free_freight_ticket not between", value1, value2, "freeFreightTicket");
            return (Criteria) this;
        }

        public Criteria andCommentGrowthPointIsNull() {
            addCriterion("comment_growth_point is null");
            return (Criteria) this;
        }

        public Criteria andCommentGrowthPointIsNotNull() {
            addCriterion("comment_growth_point is not null");
            return (Criteria) this;
        }

        public Criteria andCommentGrowthPointEqualTo(Integer value) {
            addCriterion("comment_growth_point =", value, "commentGrowthPoint");
            return (Criteria) this;
        }

        public Criteria andCommentGrowthPointNotEqualTo(Integer value) {
            addCriterion("comment_growth_point <>", value, "commentGrowthPoint");
            return (Criteria) this;
        }

        public Criteria andCommentGrowthPointGreaterThan(Integer value) {
            addCriterion("comment_growth_point >", value, "commentGrowthPoint");
            return (Criteria) this;
        }

        public Criteria andCommentGrowthPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_growth_point >=", value, "commentGrowthPoint");
            return (Criteria) this;
        }

        public Criteria andCommentGrowthPointLessThan(Integer value) {
            addCriterion("comment_growth_point <", value, "commentGrowthPoint");
            return (Criteria) this;
        }

        public Criteria andCommentGrowthPointLessThanOrEqualTo(Integer value) {
            addCriterion("comment_growth_point <=", value, "commentGrowthPoint");
            return (Criteria) this;
        }

        public Criteria andCommentGrowthPointIn(List<Integer> values) {
            addCriterion("comment_growth_point in", values, "commentGrowthPoint");
            return (Criteria) this;
        }

        public Criteria andCommentGrowthPointNotIn(List<Integer> values) {
            addCriterion("comment_growth_point not in", values, "commentGrowthPoint");
            return (Criteria) this;
        }

        public Criteria andCommentGrowthPointBetween(Integer value1, Integer value2) {
            addCriterion("comment_growth_point between", value1, value2, "commentGrowthPoint");
            return (Criteria) this;
        }

        public Criteria andCommentGrowthPointNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_growth_point not between", value1, value2, "commentGrowthPoint");
            return (Criteria) this;
        }

        public Criteria andPriviledgeCommentIsNull() {
            addCriterion("priviledge_comment is null");
            return (Criteria) this;
        }

        public Criteria andPriviledgeCommentIsNotNull() {
            addCriterion("priviledge_comment is not null");
            return (Criteria) this;
        }

        public Criteria andPriviledgeCommentEqualTo(Integer value) {
            addCriterion("priviledge_comment =", value, "priviledgeComment");
            return (Criteria) this;
        }

        public Criteria andPriviledgeCommentNotEqualTo(Integer value) {
            addCriterion("priviledge_comment <>", value, "priviledgeComment");
            return (Criteria) this;
        }

        public Criteria andPriviledgeCommentGreaterThan(Integer value) {
            addCriterion("priviledge_comment >", value, "priviledgeComment");
            return (Criteria) this;
        }

        public Criteria andPriviledgeCommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("priviledge_comment >=", value, "priviledgeComment");
            return (Criteria) this;
        }

        public Criteria andPriviledgeCommentLessThan(Integer value) {
            addCriterion("priviledge_comment <", value, "priviledgeComment");
            return (Criteria) this;
        }

        public Criteria andPriviledgeCommentLessThanOrEqualTo(Integer value) {
            addCriterion("priviledge_comment <=", value, "priviledgeComment");
            return (Criteria) this;
        }

        public Criteria andPriviledgeCommentIn(List<Integer> values) {
            addCriterion("priviledge_comment in", values, "priviledgeComment");
            return (Criteria) this;
        }

        public Criteria andPriviledgeCommentNotIn(List<Integer> values) {
            addCriterion("priviledge_comment not in", values, "priviledgeComment");
            return (Criteria) this;
        }

        public Criteria andPriviledgeCommentBetween(Integer value1, Integer value2) {
            addCriterion("priviledge_comment between", value1, value2, "priviledgeComment");
            return (Criteria) this;
        }

        public Criteria andPriviledgeCommentNotBetween(Integer value1, Integer value2) {
            addCriterion("priviledge_comment not between", value1, value2, "priviledgeComment");
            return (Criteria) this;
        }

        public Criteria andPriviledgeMemberPriceIsNull() {
            addCriterion("priviledge_member_price is null");
            return (Criteria) this;
        }

        public Criteria andPriviledgeMemberPriceIsNotNull() {
            addCriterion("priviledge_member_price is not null");
            return (Criteria) this;
        }

        public Criteria andPriviledgeMemberPriceEqualTo(Integer value) {
            addCriterion("priviledge_member_price =", value, "priviledgeMemberPrice");
            return (Criteria) this;
        }

        public Criteria andPriviledgeMemberPriceNotEqualTo(Integer value) {
            addCriterion("priviledge_member_price <>", value, "priviledgeMemberPrice");
            return (Criteria) this;
        }

        public Criteria andPriviledgeMemberPriceGreaterThan(Integer value) {
            addCriterion("priviledge_member_price >", value, "priviledgeMemberPrice");
            return (Criteria) this;
        }

        public Criteria andPriviledgeMemberPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("priviledge_member_price >=", value, "priviledgeMemberPrice");
            return (Criteria) this;
        }

        public Criteria andPriviledgeMemberPriceLessThan(Integer value) {
            addCriterion("priviledge_member_price <", value, "priviledgeMemberPrice");
            return (Criteria) this;
        }

        public Criteria andPriviledgeMemberPriceLessThanOrEqualTo(Integer value) {
            addCriterion("priviledge_member_price <=", value, "priviledgeMemberPrice");
            return (Criteria) this;
        }

        public Criteria andPriviledgeMemberPriceIn(List<Integer> values) {
            addCriterion("priviledge_member_price in", values, "priviledgeMemberPrice");
            return (Criteria) this;
        }

        public Criteria andPriviledgeMemberPriceNotIn(List<Integer> values) {
            addCriterion("priviledge_member_price not in", values, "priviledgeMemberPrice");
            return (Criteria) this;
        }

        public Criteria andPriviledgeMemberPriceBetween(Integer value1, Integer value2) {
            addCriterion("priviledge_member_price between", value1, value2, "priviledgeMemberPrice");
            return (Criteria) this;
        }

        public Criteria andPriviledgeMemberPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("priviledge_member_price not between", value1, value2, "priviledgeMemberPrice");
            return (Criteria) this;
        }

        public Criteria andPriviledgeBirthdayIsNull() {
            addCriterion("priviledge_birthday is null");
            return (Criteria) this;
        }

        public Criteria andPriviledgeBirthdayIsNotNull() {
            addCriterion("priviledge_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andPriviledgeBirthdayEqualTo(Integer value) {
            addCriterion("priviledge_birthday =", value, "priviledgeBirthday");
            return (Criteria) this;
        }

        public Criteria andPriviledgeBirthdayNotEqualTo(Integer value) {
            addCriterion("priviledge_birthday <>", value, "priviledgeBirthday");
            return (Criteria) this;
        }

        public Criteria andPriviledgeBirthdayGreaterThan(Integer value) {
            addCriterion("priviledge_birthday >", value, "priviledgeBirthday");
            return (Criteria) this;
        }

        public Criteria andPriviledgeBirthdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("priviledge_birthday >=", value, "priviledgeBirthday");
            return (Criteria) this;
        }

        public Criteria andPriviledgeBirthdayLessThan(Integer value) {
            addCriterion("priviledge_birthday <", value, "priviledgeBirthday");
            return (Criteria) this;
        }

        public Criteria andPriviledgeBirthdayLessThanOrEqualTo(Integer value) {
            addCriterion("priviledge_birthday <=", value, "priviledgeBirthday");
            return (Criteria) this;
        }

        public Criteria andPriviledgeBirthdayIn(List<Integer> values) {
            addCriterion("priviledge_birthday in", values, "priviledgeBirthday");
            return (Criteria) this;
        }

        public Criteria andPriviledgeBirthdayNotIn(List<Integer> values) {
            addCriterion("priviledge_birthday not in", values, "priviledgeBirthday");
            return (Criteria) this;
        }

        public Criteria andPriviledgeBirthdayBetween(Integer value1, Integer value2) {
            addCriterion("priviledge_birthday between", value1, value2, "priviledgeBirthday");
            return (Criteria) this;
        }

        public Criteria andPriviledgeBirthdayNotBetween(Integer value1, Integer value2) {
            addCriterion("priviledge_birthday not between", value1, value2, "priviledgeBirthday");
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