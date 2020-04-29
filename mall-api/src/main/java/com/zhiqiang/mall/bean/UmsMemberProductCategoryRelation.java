package com.zhiqiang.mall.bean;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "ums_member_product_category_relation")
public class UmsMemberProductCategoryRelation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "product_classify_id")
    private Long productClassifyId;

    private static final long serialVersionUID = 1L;

    public UmsMemberProductCategoryRelation(Long id, Long memberId, Long productClassifyId) {
        this.id = id;
        this.memberId = memberId;
        this.productClassifyId = productClassifyId;
    }

    public UmsMemberProductCategoryRelation() {
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
     * @return member_id
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * @param memberId
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * @return product_classify_id
     */
    public Long getProductClassifyId() {
        return productClassifyId;
    }

    /**
     * @param productClassifyId
     */
    public void setProductClassifyId(Long productClassifyId) {
        this.productClassifyId = productClassifyId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberId=").append(memberId);
        sb.append(", productClassifyId=").append(productClassifyId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}