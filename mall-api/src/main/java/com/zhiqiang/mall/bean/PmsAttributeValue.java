package com.zhiqiang.mall.bean;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "pms_attribute_value")
public class PmsAttributeValue implements Serializable {
    /**
     * 属性值id
     */
    @Id
    @Column(name = "attribute_value_id")
    private Long attributeValueId;

    /**
     * sku的id
     */
    @Column(name = "sku_id")
    private Long skuId;

    /**
     * 属性id
     */
    @Column(name = "attribute_id")
    private Long attributeId;

    /**
     * 手动录入或则列表选择；多格式
     */
    private String value;

    private static final long serialVersionUID = 1L;

    public PmsAttributeValue(Long attributeValueId, Long skuId, Long attributeId, String value) {
        this.attributeValueId = attributeValueId;
        this.skuId = skuId;
        this.attributeId = attributeId;
        this.value = value;
    }

    public PmsAttributeValue() {
        super();
    }

    /**
     * 获取属性值id
     *
     * @return attribute_value_id - 属性值id
     */
    public Long getAttributeValueId() {
        return attributeValueId;
    }

    /**
     * 设置属性值id
     *
     * @param attributeValueId 属性值id
     */
    public void setAttributeValueId(Long attributeValueId) {
        this.attributeValueId = attributeValueId;
    }

    /**
     * 获取sku的id
     *
     * @return sku_id - sku的id
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * 设置sku的id
     *
     * @param skuId sku的id
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * 获取属性id
     *
     * @return attribute_id - 属性id
     */
    public Long getAttributeId() {
        return attributeId;
    }

    /**
     * 设置属性id
     *
     * @param attributeId 属性id
     */
    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    /**
     * 获取手动录入或则列表选择；多格式
     *
     * @return value - 手动录入或则列表选择；多格式
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置手动录入或则列表选择；多格式
     *
     * @param value 手动录入或则列表选择；多格式
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", attributeValueId=").append(attributeValueId);
        sb.append(", skuId=").append(skuId);
        sb.append(", attributeId=").append(attributeId);
        sb.append(", value=").append(value);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}