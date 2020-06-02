package com.zhiqiang.mall.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "pms_feight_template")
public class PmsFeightTemplate implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    /**
     * 计费类型:0->按重量；1->按件数
     */
    @Column(name = "charge_type")
    private Integer chargeType;

    /**
     * 首重kg
     */
    @Column(name = "first_weight")
    private BigDecimal firstWeight;

    /**
     * 首费（元）
     */
    @Column(name = "first_fee")
    private BigDecimal firstFee;

    @Column(name = "continue_weight")
    private BigDecimal continueWeight;

    @Column(name = "continme_fee")
    private BigDecimal continmeFee;

    /**
     * 目的地（省、市）
     */
    private String dest;

    private static final long serialVersionUID = 1L;

    public PmsFeightTemplate(Long id, String name, Integer chargeType, BigDecimal firstWeight, BigDecimal firstFee, BigDecimal continueWeight, BigDecimal continmeFee, String dest) {
        this.id = id;
        this.name = name;
        this.chargeType = chargeType;
        this.firstWeight = firstWeight;
        this.firstFee = firstFee;
        this.continueWeight = continueWeight;
        this.continmeFee = continmeFee;
        this.dest = dest;
    }

    public PmsFeightTemplate() {
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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取计费类型:0->按重量；1->按件数
     *
     * @return charge_type - 计费类型:0->按重量；1->按件数
     */
    public Integer getChargeType() {
        return chargeType;
    }

    /**
     * 设置计费类型:0->按重量；1->按件数
     *
     * @param chargeType 计费类型:0->按重量；1->按件数
     */
    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    /**
     * 获取首重kg
     *
     * @return first_weight - 首重kg
     */
    public BigDecimal getFirstWeight() {
        return firstWeight;
    }

    /**
     * 设置首重kg
     *
     * @param firstWeight 首重kg
     */
    public void setFirstWeight(BigDecimal firstWeight) {
        this.firstWeight = firstWeight;
    }

    /**
     * 获取首费（元）
     *
     * @return first_fee - 首费（元）
     */
    public BigDecimal getFirstFee() {
        return firstFee;
    }

    /**
     * 设置首费（元）
     *
     * @param firstFee 首费（元）
     */
    public void setFirstFee(BigDecimal firstFee) {
        this.firstFee = firstFee;
    }

    /**
     * @return continue_weight
     */
    public BigDecimal getContinueWeight() {
        return continueWeight;
    }

    /**
     * @param continueWeight
     */
    public void setContinueWeight(BigDecimal continueWeight) {
        this.continueWeight = continueWeight;
    }

    /**
     * @return continme_fee
     */
    public BigDecimal getContinmeFee() {
        return continmeFee;
    }

    /**
     * @param continmeFee
     */
    public void setContinmeFee(BigDecimal continmeFee) {
        this.continmeFee = continmeFee;
    }

    /**
     * 获取目的地（省、市）
     *
     * @return dest - 目的地（省、市）
     */
    public String getDest() {
        return dest;
    }

    /**
     * 设置目的地（省、市）
     *
     * @param dest 目的地（省、市）
     */
    public void setDest(String dest) {
        this.dest = dest == null ? null : dest.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", chargeType=").append(chargeType);
        sb.append(", firstWeight=").append(firstWeight);
        sb.append(", firstFee=").append(firstFee);
        sb.append(", continueWeight=").append(continueWeight);
        sb.append(", continmeFee=").append(continmeFee);
        sb.append(", dest=").append(dest);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}