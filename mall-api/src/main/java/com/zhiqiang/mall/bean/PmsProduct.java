package com.zhiqiang.mall.bean;

import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
@ToString
@Table(name = "pms_product")
public class PmsProduct implements Serializable {
    /**
     * 货品(spu)id（与商品sku区别）
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    /**
     * 分类
     */
    @Column(name = "product_classify_id")
    private Long productClassifyId;

    /**
     * 货品名称
     */
    private String name;

    /**
     * 关键字（类似副标题）
     */
    private String keywords;

    /**
     * 品牌id
     */
    @Column(name = "brand_id")
    private Long brandId;

    /**
     * 货号（条码）
     */
    @Column(name = "product_sn")
    private String productSn;

    /**
     * 参考价格
     */
    @Column(name = "reference_price")
    private BigDecimal referencePrice;

    /**
     * 实际价格
     */
    private BigDecimal price;

    /**
     * 货品库存
     */
    private Integer stock;

    /**
     * 库存预警值
     */
    @Column(name = "low_stock")
    private Integer lowStock;

    /**
     * 重量（默认单位为克）
     */
    private BigDecimal weight;

    /**
     * 货品单位
     */
    private String unit;

    /**
     * 增加的成长值
     */
    @Column(name = "growth_value")
    private Integer growthValue;

    /**
     * 增加积分
     */
    @Column(name = "member_point")
    private Integer memberPoint;

    /**
     * 积分兑换限额（百分比，表示只能抵扣价格的百分比）
     */
    @Column(name = "point_limit")
    private BigDecimal pointLimit;

    /**
     * 上架状态(0->下架；1->上架)
     */
    @Column(name = "publish_status")
    private Integer publishStatus;

    /**
     * 是否新品(0->非新品；1->新品)
     */
    @Column(name = "new_status")
    private Integer newStatus;

    /**
     * 是否推荐（0->不推荐；1->推荐)
     */
    @Column(name = "recommand_status")
    private Integer recommandStatus;

    /**
     * 服务保障（字符串，分号分割）：1->破损包退；2->运费险；3->保价险;4->正品保证(假一赔四);5->包邮
     */
    private String service;

    /**
     * 优惠方式(0;无优惠;1:促销价;2:会员价;3:积分兑换优惠)4:满减
     */
    @Column(name = "discount_type")
    private Integer discountType;

    /**
     * 货品图片（一张，主页用) 
     */
    @Column(name = "product_pic")
    private String productPic;

    /**
     * 运费模板id
     */
    @Column(name = "freight_id")
    private Long freightId;

    /**
     * 会员价格
     */
    @Column(name = "member_price")
    private Long memberPrice;

    /**
     * 是否删除：0->未删除；1->已删除
     */
    @Column(name = "delete_status")
    private Integer deleteStatus;

    /**
     * 审核状态：0->未审核；1->审核通过
     */
    @Column(name = "check_status")
    private Integer checkStatus;

    /**
     * 销量
     */
    private Integer sales;

    /**
     * 备注
     */
    private String note;

    /**
     * 相册（用于进入商品页面轮播）
     */
    private String album;

    /**
     * 详情标题
     */
    @Column(name = "detail_title")
    private String detailTitle;

    /**
     * 促销开始时间
     */
    @Column(name = "sale_start_time")
    private Date saleStartTime;

    /**
     * 促销结束时间
     */
    @Column(name = "sale_end_time")
    private Date saleEndTime;

    /**
     * 活动限购数量
     */
    @Column(name = "sale_per_limit")
    private Integer salePerLimit;

    /**
     * 产品分类名称
     */
    @Column(name = "product_classify_name")
    private String productClassifyName;

    /**
     * 品牌名称
     */
    @Column(name = "brand_name")
    private String brandName;

    /**
     * 货品介绍
     */
    private String description;

    /**
     * 详情描述
     */
    @Column(name = "detail_description")
    private String detailDescription;

    /**
     * 电脑端产品详情页
     */
    @Column(name = "detail_html")
    private String detailHtml;

    /**
     * 移动端网页详情
     */
    @Column(name = "detail_mobile_html")
    private String detailMobileHtml;

    public PmsProduct(Long productId, Long productClassifyId, String name, String keywords, Long brandId, String productSn, BigDecimal referencePrice, BigDecimal price, Integer stock, Integer lowStock, BigDecimal weight, String unit, Integer growthValue, Integer memberPoint, BigDecimal pointLimit, Integer publishStatus, Integer newStatus, Integer recommandStatus, String service, Integer discountType, String productPic, Long freightId, Long memberPrice, Integer deleteStatus, Integer checkStatus, Integer sales, String note, String album, String detailTitle, Date saleStartTime, Date saleEndTime, Integer salePerLimit, String productClassifyName, String brandName, String description, String detailDescription, String detailHtml, String detailMobileHtml) {
        this.productId = productId;
        this.productClassifyId = productClassifyId;
        this.name = name;
        this.keywords = keywords;
        this.brandId = brandId;
        this.productSn = productSn;
        this.referencePrice = referencePrice;
        this.price = price;
        this.stock = stock;
        this.lowStock = lowStock;
        this.weight = weight;
        this.unit = unit;
        this.growthValue = growthValue;
        this.memberPoint = memberPoint;
        this.pointLimit = pointLimit;
        this.publishStatus = publishStatus;
        this.newStatus = newStatus;
        this.recommandStatus = recommandStatus;
        this.service = service;
        this.discountType = discountType;
        this.productPic = productPic;
        this.freightId = freightId;
        this.memberPrice = memberPrice;
        this.deleteStatus = deleteStatus;
        this.checkStatus = checkStatus;
        this.sales = sales;
        this.note = note;
        this.album = album;
        this.detailTitle = detailTitle;
        this.saleStartTime = saleStartTime;
        this.saleEndTime = saleEndTime;
        this.salePerLimit = salePerLimit;
        this.productClassifyName = productClassifyName;
        this.brandName = brandName;
        this.description = description;
        this.detailDescription = detailDescription;
        this.detailHtml = detailHtml;
        this.detailMobileHtml = detailMobileHtml;
    }

    public PmsProduct() {
        super();
    }

    /**
     * 获取货品(spu)id（与商品sku区别）
     *
     * @return product_id - 货品(spu)id（与商品sku区别）
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 设置货品(spu)id（与商品sku区别）
     *
     * @param productId 货品(spu)id（与商品sku区别）
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 获取分类
     *
     * @return product_classify_id - 分类
     */
    public Long getProductClassifyId() {
        return productClassifyId;
    }

    /**
     * 设置分类
     *
     * @param productClassifyId 分类
     */
    public void setProductClassifyId(Long productClassifyId) {
        this.productClassifyId = productClassifyId;
    }

    /**
     * 获取货品名称
     *
     * @return name - 货品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置货品名称
     *
     * @param name 货品名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取关键字（类似副标题）
     *
     * @return keywords - 关键字（类似副标题）
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * 设置关键字（类似副标题）
     *
     * @param keywords 关键字（类似副标题）
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    /**
     * 获取品牌id
     *
     * @return brand_id - 品牌id
     */
    public Long getBrandId() {
        return brandId;
    }

    /**
     * 设置品牌id
     *
     * @param brandId 品牌id
     */
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    /**
     * 获取货号（条码）
     *
     * @return product_sn - 货号（条码）
     */
    public String getProductSn() {
        return productSn;
    }

    /**
     * 设置货号（条码）
     *
     * @param productSn 货号（条码）
     */
    public void setProductSn(String productSn) {
        this.productSn = productSn == null ? null : productSn.trim();
    }

    /**
     * 获取参考价格
     *
     * @return reference_price - 参考价格
     */
    public BigDecimal getReferencePrice() {
        return referencePrice;
    }

    /**
     * 设置参考价格
     *
     * @param referencePrice 参考价格
     */
    public void setReferencePrice(BigDecimal referencePrice) {
        this.referencePrice = referencePrice;
    }

    /**
     * 获取实际价格
     *
     * @return price - 实际价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置实际价格
     *
     * @param price 实际价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取货品库存
     *
     * @return stock - 货品库存
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 设置货品库存
     *
     * @param stock 货品库存
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 获取库存预警值
     *
     * @return low_stock - 库存预警值
     */
    public Integer getLowStock() {
        return lowStock;
    }

    /**
     * 设置库存预警值
     *
     * @param lowStock 库存预警值
     */
    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
    }

    /**
     * 获取重量（默认单位为克）
     *
     * @return weight - 重量（默认单位为克）
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * 设置重量（默认单位为克）
     *
     * @param weight 重量（默认单位为克）
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * 获取货品单位
     *
     * @return unit - 货品单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置货品单位
     *
     * @param unit 货品单位
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * 获取增加的成长值
     *
     * @return growth_value - 增加的成长值
     */
    public Integer getGrowthValue() {
        return growthValue;
    }

    /**
     * 设置增加的成长值
     *
     * @param growthValue 增加的成长值
     */
    public void setGrowthValue(Integer growthValue) {
        this.growthValue = growthValue;
    }

    /**
     * 获取增加积分
     *
     * @return member_point - 增加积分
     */
    public Integer getMemberPoint() {
        return memberPoint;
    }

    /**
     * 设置增加积分
     *
     * @param memberPoint 增加积分
     */
    public void setMemberPoint(Integer memberPoint) {
        this.memberPoint = memberPoint;
    }

    /**
     * 获取积分兑换限额（百分比，表示只能抵扣价格的百分比）
     *
     * @return point_limit - 积分兑换限额（百分比，表示只能抵扣价格的百分比）
     */
    public BigDecimal getPointLimit() {
        return pointLimit;
    }

    /**
     * 设置积分兑换限额（百分比，表示只能抵扣价格的百分比）
     *
     * @param pointLimit 积分兑换限额（百分比，表示只能抵扣价格的百分比）
     */
    public void setPointLimit(BigDecimal pointLimit) {
        this.pointLimit = pointLimit;
    }

    /**
     * 获取上架状态(0->下架；1->上架)
     *
     * @return publish_status - 上架状态(0->下架；1->上架)
     */
    public Integer getPublishStatus() {
        return publishStatus;
    }

    /**
     * 设置上架状态(0->下架；1->上架)
     *
     * @param publishStatus 上架状态(0->下架；1->上架)
     */
    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    /**
     * 获取是否新品(0->非新品；1->新品)
     *
     * @return new_status - 是否新品(0->非新品；1->新品)
     */
    public Integer getNewStatus() {
        return newStatus;
    }

    /**
     * 设置是否新品(0->非新品；1->新品)
     *
     * @param newStatus 是否新品(0->非新品；1->新品)
     */
    public void setNewStatus(Integer newStatus) {
        this.newStatus = newStatus;
    }

    /**
     * 获取是否推荐（0->不推荐；1->推荐)
     *
     * @return recommand_status - 是否推荐（0->不推荐；1->推荐)
     */
    public Integer getRecommandStatus() {
        return recommandStatus;
    }

    /**
     * 设置是否推荐（0->不推荐；1->推荐)
     *
     * @param recommandStatus 是否推荐（0->不推荐；1->推荐)
     */
    public void setRecommandStatus(Integer recommandStatus) {
        this.recommandStatus = recommandStatus;
    }

    /**
     * 获取服务保障（字符串，分号分割）：1->破损包退；2->运费险；3->保价险;4->正品保证(假一赔四);5->包邮
     *
     * @return service - 服务保障（字符串，分号分割）：1->破损包退；2->运费险；3->保价险;4->正品保证(假一赔四);5->包邮
     */
    public String getService() {
        return service;
    }

    /**
     * 设置服务保障（字符串，分号分割）：1->破损包退；2->运费险；3->保价险;4->正品保证(假一赔四);5->包邮
     *
     * @param service 服务保障（字符串，分号分割）：1->破损包退；2->运费险；3->保价险;4->正品保证(假一赔四);5->包邮
     */
    public void setService(String service) {
        this.service = service == null ? null : service.trim();
    }

    /**
     * 获取优惠方式(0;无优惠;1:促销价;2:会员价;3:积分兑换优惠)4:满减
     *
     * @return discount_type - 优惠方式(0;无优惠;1:促销价;2:会员价;3:积分兑换优惠)4:满减
     */
    public Integer getDiscountType() {
        return discountType;
    }

    /**
     * 设置优惠方式(0;无优惠;1:促销价;2:会员价;3:积分兑换优惠)4:满减
     *
     * @param discountType 优惠方式(0;无优惠;1:促销价;2:会员价;3:积分兑换优惠)4:满减
     */
    public void setDiscountType(Integer discountType) {
        this.discountType = discountType;
    }

    /**
     * 获取货品图片（一张，主页用) 
     *
     * @return product_pic - 货品图片（一张，主页用) 
     */
    public String getProductPic() {
        return productPic;
    }

    /**
     * 设置货品图片（一张，主页用) 
     *
     * @param productPic 货品图片（一张，主页用) 
     */
    public void setProductPic(String productPic) {
        this.productPic = productPic == null ? null : productPic.trim();
    }

    /**
     * 获取运费模板id
     *
     * @return freight_id - 运费模板id
     */
    public Long getFreightId() {
        return freightId;
    }

    /**
     * 设置运费模板id
     *
     * @param freightId 运费模板id
     */
    public void setFreightId(Long freightId) {
        this.freightId = freightId;
    }

    /**
     * 获取会员价格
     *
     * @return member_price - 会员价格
     */
    public Long getMemberPrice() {
        return memberPrice;
    }

    /**
     * 设置会员价格
     *
     * @param memberPrice 会员价格
     */
    public void setMemberPrice(Long memberPrice) {
        this.memberPrice = memberPrice;
    }

    /**
     * 获取是否删除：0->未删除；1->已删除
     *
     * @return delete_status - 是否删除：0->未删除；1->已删除
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * 设置是否删除：0->未删除；1->已删除
     *
     * @param deleteStatus 是否删除：0->未删除；1->已删除
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * 获取审核状态：0->未审核；1->审核通过
     *
     * @return check_status - 审核状态：0->未审核；1->审核通过
     */
    public Integer getCheckStatus() {
        return checkStatus;
    }

    /**
     * 设置审核状态：0->未审核；1->审核通过
     *
     * @param checkStatus 审核状态：0->未审核；1->审核通过
     */
    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    /**
     * 获取销量
     *
     * @return sales - 销量
     */
    public Integer getSales() {
        return sales;
    }

    /**
     * 设置销量
     *
     * @param sales 销量
     */
    public void setSales(Integer sales) {
        this.sales = sales;
    }

    /**
     * 获取备注
     *
     * @return note - 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置备注
     *
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * 获取相册（用于进入商品页面轮播）
     *
     * @return album - 相册（用于进入商品页面轮播）
     */
    public String getAlbum() {
        return album;
    }

    /**
     * 设置相册（用于进入商品页面轮播）
     *
     * @param album 相册（用于进入商品页面轮播）
     */
    public void setAlbum(String album) {
        this.album = album == null ? null : album.trim();
    }

    /**
     * 获取详情标题
     *
     * @return detail_title - 详情标题
     */
    public String getDetailTitle() {
        return detailTitle;
    }

    /**
     * 设置详情标题
     *
     * @param detailTitle 详情标题
     */
    public void setDetailTitle(String detailTitle) {
        this.detailTitle = detailTitle == null ? null : detailTitle.trim();
    }

    /**
     * 获取促销开始时间
     *
     * @return sale_start_time - 促销开始时间
     */
    public Date getSaleStartTime() {
        return saleStartTime;
    }

    /**
     * 设置促销开始时间
     *
     * @param saleStartTime 促销开始时间
     */
    public void setSaleStartTime(Date saleStartTime) {
        this.saleStartTime = saleStartTime;
    }

    /**
     * 获取促销结束时间
     *
     * @return sale_end_time - 促销结束时间
     */
    public Date getSaleEndTime() {
        return saleEndTime;
    }

    /**
     * 设置促销结束时间
     *
     * @param saleEndTime 促销结束时间
     */
    public void setSaleEndTime(Date saleEndTime) {
        this.saleEndTime = saleEndTime;
    }

    /**
     * 获取活动限购数量
     *
     * @return sale_per_limit - 活动限购数量
     */
    public Integer getSalePerLimit() {
        return salePerLimit;
    }

    /**
     * 设置活动限购数量
     *
     * @param salePerLimit 活动限购数量
     */
    public void setSalePerLimit(Integer salePerLimit) {
        this.salePerLimit = salePerLimit;
    }

    /**
     * 获取产品分类名称
     *
     * @return product_classify_name - 产品分类名称
     */
    public String getProductClassifyName() {
        return productClassifyName;
    }

    /**
     * 设置产品分类名称
     *
     * @param productClassifyName 产品分类名称
     */
    public void setProductClassifyName(String productClassifyName) {
        this.productClassifyName = productClassifyName == null ? null : productClassifyName.trim();
    }

    /**
     * 获取品牌名称
     *
     * @return brand_name - 品牌名称
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * 设置品牌名称
     *
     * @param brandName 品牌名称
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    /**
     * 获取货品介绍
     *
     * @return description - 货品介绍
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置货品介绍
     *
     * @param description 货品介绍
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取详情描述
     *
     * @return detail_description - 详情描述
     */
    public String getDetailDescription() {
        return detailDescription;
    }

    /**
     * 设置详情描述
     *
     * @param detailDescription 详情描述
     */
    public void setDetailDescription(String detailDescription) {
        this.detailDescription = detailDescription == null ? null : detailDescription.trim();
    }

    /**
     * 获取电脑端产品详情页
     *
     * @return detail_html - 电脑端产品详情页
     */
    public String getDetailHtml() {
        return detailHtml;
    }

    /**
     * 设置电脑端产品详情页
     *
     * @param detailHtml 电脑端产品详情页
     */
    public void setDetailHtml(String detailHtml) {
        this.detailHtml = detailHtml == null ? null : detailHtml.trim();
    }

    /**
     * 获取移动端网页详情
     *
     * @return detail_mobile_html - 移动端网页详情
     */
    public String getDetailMobileHtml() {
        return detailMobileHtml;
    }

    /**
     * 设置移动端网页详情
     *
     * @param detailMobileHtml 移动端网页详情
     */
    public void setDetailMobileHtml(String detailMobileHtml) {
        this.detailMobileHtml = detailMobileHtml == null ? null : detailMobileHtml.trim();
    }
}