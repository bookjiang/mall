package com.zhiqiang.mall.bean;

import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
@ToString
@Table(name = "pms_classify_attribute_relation")
public class PmsClassifyAttributeRelation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商品分类id
     */
    @Column(name = "product_classify_id")
    private Long productClassifyId;

    /**
     * 属性id
     */
    @Column(name = "attribute_id")
    private Long attributeId;

    public PmsClassifyAttributeRelation(Long id, Long productClassifyId, Long attributeId) {
        this.id = id;
        this.productClassifyId = productClassifyId;
        this.attributeId = attributeId;
    }

    public PmsClassifyAttributeRelation() {
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
     * 获取商品分类id
     *
     * @return product_classify_id - 商品分类id
     */
    public Long getProductClassifyId() {
        return productClassifyId;
    }

    /**
     * 设置商品分类id
     *
     * @param productClassifyId 商品分类id
     */
    public void setProductClassifyId(Long productClassifyId) {
        this.productClassifyId = productClassifyId;
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
}