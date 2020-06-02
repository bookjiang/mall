package com.zhiqiang.mall.bean;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "cms_prefrence_area_product_relation")
public class CmsPrefrenceAreaProductRelation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "prefrence_area_id")
    private Long prefrenceAreaId;

    @Column(name = "product_id")
    private Long productId;

    private static final long serialVersionUID = 1L;

    public CmsPrefrenceAreaProductRelation(Long id, Long prefrenceAreaId, Long productId) {
        this.id = id;
        this.prefrenceAreaId = prefrenceAreaId;
        this.productId = productId;
    }

    public CmsPrefrenceAreaProductRelation() {
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
     * @return prefrence_area_id
     */
    public Long getPrefrenceAreaId() {
        return prefrenceAreaId;
    }

    /**
     * @param prefrenceAreaId
     */
    public void setPrefrenceAreaId(Long prefrenceAreaId) {
        this.prefrenceAreaId = prefrenceAreaId;
    }

    /**
     * @return product_id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", prefrenceAreaId=").append(prefrenceAreaId);
        sb.append(", productId=").append(productId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}