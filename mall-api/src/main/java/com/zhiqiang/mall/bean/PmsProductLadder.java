package com.zhiqiang.mall.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "pms_product_ladder")
public class PmsProductLadder implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    /**
     * 满足的商品数量
     */
    private Integer count;

    /**
     * 折扣
     */
    private BigDecimal discount;

    /**
     * 折后价格
     */
    private BigDecimal price;

    private static final long serialVersionUID = 1L;

    public PmsProductLadder(Long id, Long productId, Integer count, BigDecimal discount, BigDecimal price) {
        this.id = id;
        this.productId = productId;
        this.count = count;
        this.discount = discount;
        this.price = price;
    }

    public PmsProductLadder() {
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
     * 获取满足的商品数量
     *
     * @return count - 满足的商品数量
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置满足的商品数量
     *
     * @param count 满足的商品数量
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 获取折扣
     *
     * @return discount - 折扣
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * 设置折扣
     *
     * @param discount 折扣
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * 获取折后价格
     *
     * @return price - 折后价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置折后价格
     *
     * @param price 折后价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", count=").append(count);
        sb.append(", discount=").append(discount);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}