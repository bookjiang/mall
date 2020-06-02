package com.zhiqiang.mall.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "pms_sku_stock")
public class PmsSkuStock implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    /**
     * sku编码
     */
    @Column(name = "sku_code")
    private String skuCode;

    private BigDecimal price;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 预警库存
     */
    @Column(name = "low_stock")
    private Integer lowStock;

    /**
     * 展示图片
     */
    private String pic;

    /**
     * 销量
     */
    private Integer sale;

    /**
     * 单品促销价格
     */
    @Column(name = "promotion_price")
    private BigDecimal promotionPrice;

    /**
     * 锁定库存
     */
    @Column(name = "lock_stock")
    private Integer lockStock;

    /**
     * 商品销售属性，json格式
     */
    @Column(name = "sp_data")
    private String spData;

    private static final long serialVersionUID = 1L;

    public PmsSkuStock(Long id, Long productId, String skuCode, BigDecimal price, Integer stock, Integer lowStock, String pic, Integer sale, BigDecimal promotionPrice, Integer lockStock, String spData) {
        this.id = id;
        this.productId = productId;
        this.skuCode = skuCode;
        this.price = price;
        this.stock = stock;
        this.lowStock = lowStock;
        this.pic = pic;
        this.sale = sale;
        this.promotionPrice = promotionPrice;
        this.lockStock = lockStock;
        this.spData = spData;
    }

    public PmsSkuStock() {
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
     * 获取sku编码
     *
     * @return sku_code - sku编码
     */
    public String getSkuCode() {
        return skuCode;
    }

    /**
     * 设置sku编码
     *
     * @param skuCode sku编码
     */
    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    /**
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取库存
     *
     * @return stock - 库存
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 设置库存
     *
     * @param stock 库存
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 获取预警库存
     *
     * @return low_stock - 预警库存
     */
    public Integer getLowStock() {
        return lowStock;
    }

    /**
     * 设置预警库存
     *
     * @param lowStock 预警库存
     */
    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
    }

    /**
     * 获取展示图片
     *
     * @return pic - 展示图片
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置展示图片
     *
     * @param pic 展示图片
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * 获取销量
     *
     * @return sale - 销量
     */
    public Integer getSale() {
        return sale;
    }

    /**
     * 设置销量
     *
     * @param sale 销量
     */
    public void setSale(Integer sale) {
        this.sale = sale;
    }

    /**
     * 获取单品促销价格
     *
     * @return promotion_price - 单品促销价格
     */
    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    /**
     * 设置单品促销价格
     *
     * @param promotionPrice 单品促销价格
     */
    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    /**
     * 获取锁定库存
     *
     * @return lock_stock - 锁定库存
     */
    public Integer getLockStock() {
        return lockStock;
    }

    /**
     * 设置锁定库存
     *
     * @param lockStock 锁定库存
     */
    public void setLockStock(Integer lockStock) {
        this.lockStock = lockStock;
    }

    /**
     * 获取商品销售属性，json格式
     *
     * @return sp_data - 商品销售属性，json格式
     */
    public String getSpData() {
        return spData;
    }

    /**
     * 设置商品销售属性，json格式
     *
     * @param spData 商品销售属性，json格式
     */
    public void setSpData(String spData) {
        this.spData = spData == null ? null : spData.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", skuCode=").append(skuCode);
        sb.append(", price=").append(price);
        sb.append(", stock=").append(stock);
        sb.append(", lowStock=").append(lowStock);
        sb.append(", pic=").append(pic);
        sb.append(", sale=").append(sale);
        sb.append(", promotionPrice=").append(promotionPrice);
        sb.append(", lockStock=").append(lockStock);
        sb.append(", spData=").append(spData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}