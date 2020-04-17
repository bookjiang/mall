package com.zhiqiang.mall.bean;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "pms_freight_template")
public class PmsFreightTemplate {
    /**
     * 运费模板id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "freight_id")
    private Long freightId;

    /**
     * 名称
     */
    private String name;

    /**
     * 计费类型:0->按重量;1->按件数
     */
    @Column(name = "charge_type")
    private Integer chargeType;

    /**
     * 首重（kg）
     */
    @Column(name = "first_weight")
    private BigDecimal firstWeight;

    /**
     * 首重运费（元)
     */
    @Column(name = "first_freight")
    private BigDecimal firstFreight;

    /**
     * 续重
     */
    @Column(name = "continue_weight")
    private BigDecimal continueWeight;

    /**
     * 续重费用
     */
    @Column(name = "continue_freight")
    private BigDecimal continueFreight;

    /**
     * 目的地
     */
    private String destination;

    public PmsFreightTemplate(Long freightId, String name, Integer chargeType, BigDecimal firstWeight, BigDecimal firstFreight, BigDecimal continueWeight, BigDecimal continueFreight, String destination) {
        this.freightId = freightId;
        this.name = name;
        this.chargeType = chargeType;
        this.firstWeight = firstWeight;
        this.firstFreight = firstFreight;
        this.continueWeight = continueWeight;
        this.continueFreight = continueFreight;
        this.destination = destination;
    }

    public PmsFreightTemplate() {
        super();
    }

    /**
     * 获取运费模板id
     *
     * @return freight_id - 运费模板id
     */
    public Long getFreightId() {
        return freightId;
    }

    /**
     * 设置运费模板id
     *
     * @param freightId 运费模板id
     */
    public void setFreightId(Long freightId) {
        this.freightId = freightId;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取计费类型:0->按重量;1->按件数
     *
     * @return charge_type - 计费类型:0->按重量;1->按件数
     */
    public Integer getChargeType() {
        return chargeType;
    }

    /**
     * 设置计费类型:0->按重量;1->按件数
     *
     * @param chargeType 计费类型:0->按重量;1->按件数
     */
    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    /**
     * 获取首重（kg）
     *
     * @return first_weight - 首重（kg）
     */
    public BigDecimal getFirstWeight() {
        return firstWeight;
    }

    /**
     * 设置首重（kg）
     *
     * @param firstWeight 首重（kg）
     */
    public void setFirstWeight(BigDecimal firstWeight) {
        this.firstWeight = firstWeight;
    }

    /**
     * 获取首重运费（元)
     *
     * @return first_freight - 首重运费（元)
     */
    public BigDecimal getFirstFreight() {
        return firstFreight;
    }

    /**
     * 设置首重运费（元)
     *
     * @param firstFreight 首重运费（元)
     */
    public void setFirstFreight(BigDecimal firstFreight) {
        this.firstFreight = firstFreight;
    }

    /**
     * 获取续重
     *
     * @return continue_weight - 续重
     */
    public BigDecimal getContinueWeight() {
        return continueWeight;
    }

    /**
     * 设置续重
     *
     * @param continueWeight 续重
     */
    public void setContinueWeight(BigDecimal continueWeight) {
        this.continueWeight = continueWeight;
    }

    /**
     * 获取续重费用
     *
     * @return continue_freight - 续重费用
     */
    public BigDecimal getContinueFreight() {
        return continueFreight;
    }

    /**
     * 设置续重费用
     *
     * @param continueFreight 续重费用
     */
    public void setContinueFreight(BigDecimal continueFreight) {
        this.continueFreight = continueFreight;
    }

    /**
     * 获取目的地
     *
     * @return destination - 目的地
     */
    public String getDestination() {
        return destination;
    }

    /**
     * 设置目的地
     *
     * @param destination 目的地
     */
    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }
}