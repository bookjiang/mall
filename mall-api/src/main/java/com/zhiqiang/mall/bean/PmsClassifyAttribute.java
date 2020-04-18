package com.zhiqiang.mall.bean;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "pms_classify_attribute")
public class PmsClassifyAttribute implements Serializable {
    /**
     * 分类属性id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "classify_attribute_id")
    private Long classifyAttributeId;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 属性数量
     */
    @Column(name = "attribute_count")
    private Integer attributeCount;

    /**
     * 参数数量
     */
    @Column(name = "param_count")
    private Integer paramCount;

    public PmsClassifyAttribute(Long classifyAttributeId, String name, Integer attributeCount, Integer paramCount) {
        this.classifyAttributeId = classifyAttributeId;
        this.name = name;
        this.attributeCount = attributeCount;
        this.paramCount = paramCount;
    }

    public PmsClassifyAttribute() {
        super();
    }

    /**
     * 获取分类属性id
     *
     * @return classify_attribute_id - 分类属性id
     */
    public Long getClassifyAttributeId() {
        return classifyAttributeId;
    }

    /**
     * 设置分类属性id
     *
     * @param classifyAttributeId 分类属性id
     */
    public void setClassifyAttributeId(Long classifyAttributeId) {
        this.classifyAttributeId = classifyAttributeId;
    }

    /**
     * 获取分类名称
     *
     * @return name - 分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置分类名称
     *
     * @param name 分类名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取属性数量
     *
     * @return attribute_count - 属性数量
     */
    public Integer getAttributeCount() {
        return attributeCount;
    }

    /**
     * 设置属性数量
     *
     * @param attributeCount 属性数量
     */
    public void setAttributeCount(Integer attributeCount) {
        this.attributeCount = attributeCount;
    }

    /**
     * 获取参数数量
     *
     * @return param_count - 参数数量
     */
    public Integer getParamCount() {
        return paramCount;
    }

    /**
     * 设置参数数量
     *
     * @param paramCount 参数数量
     */
    public void setParamCount(Integer paramCount) {
        this.paramCount = paramCount;
    }
}