package com.zhiqiang.mall.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "pms_member_price")
public class PmsMemberPrice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "member_level_id")
    private Long memberLevelId;

    /**
     * 会员价格
     */
    @Column(name = "member_price")
    private BigDecimal memberPrice;

    @Column(name = "member_level_name")
    private String memberLevelName;

    private static final long serialVersionUID = 1L;

    public PmsMemberPrice(Long id, Long productId, Long memberLevelId, BigDecimal memberPrice, String memberLevelName) {
        this.id = id;
        this.productId = productId;
        this.memberLevelId = memberLevelId;
        this.memberPrice = memberPrice;
        this.memberLevelName = memberLevelName;
    }

    public PmsMemberPrice() {
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

    /**
     * @return member_level_id
     */
    public Long getMemberLevelId() {
        return memberLevelId;
    }

    /**
     * @param memberLevelId
     */
    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    /**
     * 获取会员价格
     *
     * @return member_price - 会员价格
     */
    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    /**
     * 设置会员价格
     *
     * @param memberPrice 会员价格
     */
    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    /**
     * @return member_level_name
     */
    public String getMemberLevelName() {
        return memberLevelName;
    }

    /**
     * @param memberLevelName
     */
    public void setMemberLevelName(String memberLevelName) {
        this.memberLevelName = memberLevelName == null ? null : memberLevelName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", memberLevelId=").append(memberLevelId);
        sb.append(", memberPrice=").append(memberPrice);
        sb.append(", memberLevelName=").append(memberLevelName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}