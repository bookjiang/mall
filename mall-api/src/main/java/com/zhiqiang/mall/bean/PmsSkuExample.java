package com.zhiqiang.mall.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PmsSkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsSkuExample() {
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

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Long value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Long value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Long value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Long value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Long value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Long> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Long> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Long value1, Long value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Long value1, Long value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
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

        public Criteria andSkuSnIsNull() {
            addCriterion("sku_sn is null");
            return (Criteria) this;
        }

        public Criteria andSkuSnIsNotNull() {
            addCriterion("sku_sn is not null");
            return (Criteria) this;
        }

        public Criteria andSkuSnEqualTo(String value) {
            addCriterion("sku_sn =", value, "skuSn");
            return (Criteria) this;
        }

        public Criteria andSkuSnNotEqualTo(String value) {
            addCriterion("sku_sn <>", value, "skuSn");
            return (Criteria) this;
        }

        public Criteria andSkuSnGreaterThan(String value) {
            addCriterion("sku_sn >", value, "skuSn");
            return (Criteria) this;
        }

        public Criteria andSkuSnGreaterThanOrEqualTo(String value) {
            addCriterion("sku_sn >=", value, "skuSn");
            return (Criteria) this;
        }

        public Criteria andSkuSnLessThan(String value) {
            addCriterion("sku_sn <", value, "skuSn");
            return (Criteria) this;
        }

        public Criteria andSkuSnLessThanOrEqualTo(String value) {
            addCriterion("sku_sn <=", value, "skuSn");
            return (Criteria) this;
        }

        public Criteria andSkuSnLike(String value) {
            addCriterion("sku_sn like", value, "skuSn");
            return (Criteria) this;
        }

        public Criteria andSkuSnNotLike(String value) {
            addCriterion("sku_sn not like", value, "skuSn");
            return (Criteria) this;
        }

        public Criteria andSkuSnIn(List<String> values) {
            addCriterion("sku_sn in", values, "skuSn");
            return (Criteria) this;
        }

        public Criteria andSkuSnNotIn(List<String> values) {
            addCriterion("sku_sn not in", values, "skuSn");
            return (Criteria) this;
        }

        public Criteria andSkuSnBetween(String value1, String value2) {
            addCriterion("sku_sn between", value1, value2, "skuSn");
            return (Criteria) this;
        }

        public Criteria andSkuSnNotBetween(String value1, String value2) {
            addCriterion("sku_sn not between", value1, value2, "skuSn");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeIsNull() {
            addCriterion("discount_type is null");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeIsNotNull() {
            addCriterion("discount_type is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeEqualTo(Integer value) {
            addCriterion("discount_type =", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotEqualTo(Integer value) {
            addCriterion("discount_type <>", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeGreaterThan(Integer value) {
            addCriterion("discount_type >", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("discount_type >=", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeLessThan(Integer value) {
            addCriterion("discount_type <", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeLessThanOrEqualTo(Integer value) {
            addCriterion("discount_type <=", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeIn(List<Integer> values) {
            addCriterion("discount_type in", values, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotIn(List<Integer> values) {
            addCriterion("discount_type not in", values, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeBetween(Integer value1, Integer value2) {
            addCriterion("discount_type between", value1, value2, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("discount_type not between", value1, value2, "discountType");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceIsNull() {
            addCriterion("promotion_price is null");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceIsNotNull() {
            addCriterion("promotion_price is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceEqualTo(BigDecimal value) {
            addCriterion("promotion_price =", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceNotEqualTo(BigDecimal value) {
            addCriterion("promotion_price <>", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceGreaterThan(BigDecimal value) {
            addCriterion("promotion_price >", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_price >=", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceLessThan(BigDecimal value) {
            addCriterion("promotion_price <", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_price <=", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceIn(List<BigDecimal> values) {
            addCriterion("promotion_price in", values, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceNotIn(List<BigDecimal> values) {
            addCriterion("promotion_price not in", values, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_price between", value1, value2, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_price not between", value1, value2, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceIsNull() {
            addCriterion("member_price is null");
            return (Criteria) this;
        }

        public Criteria andMemberPriceIsNotNull() {
            addCriterion("member_price is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPriceEqualTo(BigDecimal value) {
            addCriterion("member_price =", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceNotEqualTo(BigDecimal value) {
            addCriterion("member_price <>", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceGreaterThan(BigDecimal value) {
            addCriterion("member_price >", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("member_price >=", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLessThan(BigDecimal value) {
            addCriterion("member_price <", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("member_price <=", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceIn(List<BigDecimal> values) {
            addCriterion("member_price in", values, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceNotIn(List<BigDecimal> values) {
            addCriterion("member_price not in", values, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_price between", value1, value2, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_price not between", value1, value2, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andPointLimitIsNull() {
            addCriterion("point_limit is null");
            return (Criteria) this;
        }

        public Criteria andPointLimitIsNotNull() {
            addCriterion("point_limit is not null");
            return (Criteria) this;
        }

        public Criteria andPointLimitEqualTo(BigDecimal value) {
            addCriterion("point_limit =", value, "pointLimit");
            return (Criteria) this;
        }

        public Criteria andPointLimitNotEqualTo(BigDecimal value) {
            addCriterion("point_limit <>", value, "pointLimit");
            return (Criteria) this;
        }

        public Criteria andPointLimitGreaterThan(BigDecimal value) {
            addCriterion("point_limit >", value, "pointLimit");
            return (Criteria) this;
        }

        public Criteria andPointLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("point_limit >=", value, "pointLimit");
            return (Criteria) this;
        }

        public Criteria andPointLimitLessThan(BigDecimal value) {
            addCriterion("point_limit <", value, "pointLimit");
            return (Criteria) this;
        }

        public Criteria andPointLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("point_limit <=", value, "pointLimit");
            return (Criteria) this;
        }

        public Criteria andPointLimitIn(List<BigDecimal> values) {
            addCriterion("point_limit in", values, "pointLimit");
            return (Criteria) this;
        }

        public Criteria andPointLimitNotIn(List<BigDecimal> values) {
            addCriterion("point_limit not in", values, "pointLimit");
            return (Criteria) this;
        }

        public Criteria andPointLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("point_limit between", value1, value2, "pointLimit");
            return (Criteria) this;
        }

        public Criteria andPointLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("point_limit not between", value1, value2, "pointLimit");
            return (Criteria) this;
        }

        public Criteria andFullPriceIsNull() {
            addCriterion("full_price is null");
            return (Criteria) this;
        }

        public Criteria andFullPriceIsNotNull() {
            addCriterion("full_price is not null");
            return (Criteria) this;
        }

        public Criteria andFullPriceEqualTo(BigDecimal value) {
            addCriterion("full_price =", value, "fullPrice");
            return (Criteria) this;
        }

        public Criteria andFullPriceNotEqualTo(BigDecimal value) {
            addCriterion("full_price <>", value, "fullPrice");
            return (Criteria) this;
        }

        public Criteria andFullPriceGreaterThan(BigDecimal value) {
            addCriterion("full_price >", value, "fullPrice");
            return (Criteria) this;
        }

        public Criteria andFullPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("full_price >=", value, "fullPrice");
            return (Criteria) this;
        }

        public Criteria andFullPriceLessThan(BigDecimal value) {
            addCriterion("full_price <", value, "fullPrice");
            return (Criteria) this;
        }

        public Criteria andFullPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("full_price <=", value, "fullPrice");
            return (Criteria) this;
        }

        public Criteria andFullPriceIn(List<BigDecimal> values) {
            addCriterion("full_price in", values, "fullPrice");
            return (Criteria) this;
        }

        public Criteria andFullPriceNotIn(List<BigDecimal> values) {
            addCriterion("full_price not in", values, "fullPrice");
            return (Criteria) this;
        }

        public Criteria andFullPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("full_price between", value1, value2, "fullPrice");
            return (Criteria) this;
        }

        public Criteria andFullPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("full_price not between", value1, value2, "fullPrice");
            return (Criteria) this;
        }

        public Criteria andReductionMoneyIsNull() {
            addCriterion("reduction_money is null");
            return (Criteria) this;
        }

        public Criteria andReductionMoneyIsNotNull() {
            addCriterion("reduction_money is not null");
            return (Criteria) this;
        }

        public Criteria andReductionMoneyEqualTo(BigDecimal value) {
            addCriterion("reduction_money =", value, "reductionMoney");
            return (Criteria) this;
        }

        public Criteria andReductionMoneyNotEqualTo(BigDecimal value) {
            addCriterion("reduction_money <>", value, "reductionMoney");
            return (Criteria) this;
        }

        public Criteria andReductionMoneyGreaterThan(BigDecimal value) {
            addCriterion("reduction_money >", value, "reductionMoney");
            return (Criteria) this;
        }

        public Criteria andReductionMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reduction_money >=", value, "reductionMoney");
            return (Criteria) this;
        }

        public Criteria andReductionMoneyLessThan(BigDecimal value) {
            addCriterion("reduction_money <", value, "reductionMoney");
            return (Criteria) this;
        }

        public Criteria andReductionMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reduction_money <=", value, "reductionMoney");
            return (Criteria) this;
        }

        public Criteria andReductionMoneyIn(List<BigDecimal> values) {
            addCriterion("reduction_money in", values, "reductionMoney");
            return (Criteria) this;
        }

        public Criteria andReductionMoneyNotIn(List<BigDecimal> values) {
            addCriterion("reduction_money not in", values, "reductionMoney");
            return (Criteria) this;
        }

        public Criteria andReductionMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reduction_money between", value1, value2, "reductionMoney");
            return (Criteria) this;
        }

        public Criteria andReductionMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reduction_money not between", value1, value2, "reductionMoney");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andWarningStockIsNull() {
            addCriterion("warning_stock is null");
            return (Criteria) this;
        }

        public Criteria andWarningStockIsNotNull() {
            addCriterion("warning_stock is not null");
            return (Criteria) this;
        }

        public Criteria andWarningStockEqualTo(Integer value) {
            addCriterion("warning_stock =", value, "warningStock");
            return (Criteria) this;
        }

        public Criteria andWarningStockNotEqualTo(Integer value) {
            addCriterion("warning_stock <>", value, "warningStock");
            return (Criteria) this;
        }

        public Criteria andWarningStockGreaterThan(Integer value) {
            addCriterion("warning_stock >", value, "warningStock");
            return (Criteria) this;
        }

        public Criteria andWarningStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("warning_stock >=", value, "warningStock");
            return (Criteria) this;
        }

        public Criteria andWarningStockLessThan(Integer value) {
            addCriterion("warning_stock <", value, "warningStock");
            return (Criteria) this;
        }

        public Criteria andWarningStockLessThanOrEqualTo(Integer value) {
            addCriterion("warning_stock <=", value, "warningStock");
            return (Criteria) this;
        }

        public Criteria andWarningStockIn(List<Integer> values) {
            addCriterion("warning_stock in", values, "warningStock");
            return (Criteria) this;
        }

        public Criteria andWarningStockNotIn(List<Integer> values) {
            addCriterion("warning_stock not in", values, "warningStock");
            return (Criteria) this;
        }

        public Criteria andWarningStockBetween(Integer value1, Integer value2) {
            addCriterion("warning_stock between", value1, value2, "warningStock");
            return (Criteria) this;
        }

        public Criteria andWarningStockNotBetween(Integer value1, Integer value2) {
            addCriterion("warning_stock not between", value1, value2, "warningStock");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andSaleIsNull() {
            addCriterion("sale is null");
            return (Criteria) this;
        }

        public Criteria andSaleIsNotNull() {
            addCriterion("sale is not null");
            return (Criteria) this;
        }

        public Criteria andSaleEqualTo(Integer value) {
            addCriterion("sale =", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotEqualTo(Integer value) {
            addCriterion("sale <>", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleGreaterThan(Integer value) {
            addCriterion("sale >", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale >=", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleLessThan(Integer value) {
            addCriterion("sale <", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleLessThanOrEqualTo(Integer value) {
            addCriterion("sale <=", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleIn(List<Integer> values) {
            addCriterion("sale in", values, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotIn(List<Integer> values) {
            addCriterion("sale not in", values, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleBetween(Integer value1, Integer value2) {
            addCriterion("sale between", value1, value2, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotBetween(Integer value1, Integer value2) {
            addCriterion("sale not between", value1, value2, "sale");
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