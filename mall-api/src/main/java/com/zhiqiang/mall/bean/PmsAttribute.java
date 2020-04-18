package com.zhiqiang.mall.bean;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "pms_attribute")
public class PmsAttribute implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attribute_id")
    private Long attributeId;

    /**
     * 分类属性id
     */
    @Column(name = "classify_attribute_id")
    private Long classifyAttributeId;

    /**
     * 属性名称
     */
    private String name;

    /**
     * 属性选择类型：0->唯一；1->单选；2->多选；对应属性和参数意义不同；
     */
    @Column(name = "select_type")
    private Integer selectType;

    /**
     * 属性录入方式：0->手工录入;1->从列表中录入
     */
    @Column(name = "input_type")
    private Integer inputType;

    /**
     * 可选值列表，以逗号隔开
     */
    @Column(name = "input_list")
    private String inputList;

    /**
     * 是否支持手动新增;0->不支持；1->支持；
     */
    @Column(name = "hand_add_status")
    private Integer handAddStatus;

    /**
     * 属性类型：0->属性（规格);1->参数
     */
    private Integer type;

    public PmsAttribute(Long attributeId, Long classifyAttributeId, String name, Integer selectType, Integer inputType, String inputList, Integer handAddStatus, Integer type) {
        this.attributeId = attributeId;
        this.classifyAttributeId = classifyAttributeId;
        this.name = name;
        this.selectType = selectType;
        this.inputType = inputType;
        this.inputList = inputList;
        this.handAddStatus = handAddStatus;
        this.type = type;
    }

    public PmsAttribute() {
        super();
    }

    /**
     * @return attribute_id
     */
    public Long getAttributeId() {
        return attributeId;
    }

    /**
     * @param attributeId
     */
    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
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
     * 获取属性名称
     *
     * @return name - 属性名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置属性名称
     *
     * @param name 属性名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取属性选择类型：0->唯一；1->单选；2->多选；对应属性和参数意义不同；
     *
     * @return select_type - 属性选择类型：0->唯一；1->单选；2->多选；对应属性和参数意义不同；
     */
    public Integer getSelectType() {
        return selectType;
    }

    /**
     * 设置属性选择类型：0->唯一；1->单选；2->多选；对应属性和参数意义不同；
     *
     * @param selectType 属性选择类型：0->唯一；1->单选；2->多选；对应属性和参数意义不同；
     */
    public void setSelectType(Integer selectType) {
        this.selectType = selectType;
    }

    /**
     * 获取属性录入方式：0->手工录入;1->从列表中录入
     *
     * @return input_type - 属性录入方式：0->手工录入;1->从列表中录入
     */
    public Integer getInputType() {
        return inputType;
    }

    /**
     * 设置属性录入方式：0->手工录入;1->从列表中录入
     *
     * @param inputType 属性录入方式：0->手工录入;1->从列表中录入
     */
    public void setInputType(Integer inputType) {
        this.inputType = inputType;
    }

    /**
     * 获取可选值列表，以逗号隔开
     *
     * @return input_list - 可选值列表，以逗号隔开
     */
    public String getInputList() {
        return inputList;
    }

    /**
     * 设置可选值列表，以逗号隔开
     *
     * @param inputList 可选值列表，以逗号隔开
     */
    public void setInputList(String inputList) {
        this.inputList = inputList == null ? null : inputList.trim();
    }

    /**
     * 获取是否支持手动新增;0->不支持；1->支持；
     *
     * @return hand_add_status - 是否支持手动新增;0->不支持；1->支持；
     */
    public Integer getHandAddStatus() {
        return handAddStatus;
    }

    /**
     * 设置是否支持手动新增;0->不支持；1->支持；
     *
     * @param handAddStatus 是否支持手动新增;0->不支持；1->支持；
     */
    public void setHandAddStatus(Integer handAddStatus) {
        this.handAddStatus = handAddStatus;
    }

    /**
     * 获取属性类型：0->属性（规格);1->参数
     *
     * @return type - 属性类型：0->属性（规格);1->参数
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置属性类型：0->属性（规格);1->参数
     *
     * @param type 属性类型：0->属性（规格);1->参数
     */
    public void setType(Integer type) {
        this.type = type;
    }
}