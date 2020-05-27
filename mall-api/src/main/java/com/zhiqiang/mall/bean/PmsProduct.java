package com.zhiqiang.mall.bean;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
@Data
@ApiModel(value = "商品模型")
@Table(name = "pms_product")
public class PmsProduct implements Serializable {
    /**
     * 货品(spu)id（与商品sku区别）
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "product_attribute_category_id")
    private Long productAttributeCategoryId;
    /**
     * 分类
     */
    @Column(name = "product_classify_id")
    private Long productCategoryId;

    /**
     * 货品名称
     */
    private String name;

    /**
     * 关键字（类似副标题）
     */
    @Column(name="keywords")
    private String keywords;

    /**
     * 与关键字同
     */
    @Transient
    private String subTitle;


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
    private BigDecimal originalPrice;

    /**
     * 实际价格,即价格
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
    private Integer giftGrowth;

    /**
     * 增加积分
     */
    @Column(name = "member_point")
    private Integer giftPoint;

    /**
     * 积分兑换限额（百分比，表示只能抵扣价格的百分比）
     */
    //注意这是百分比
    @Column(name = "point_limit")
    private BigDecimal usePointLimit;

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
    @Column(name = "service")
    private String serviceIds;

    /**
     * 优惠方式(0;无优惠;1:促销价;2:会员价;3:积分兑换优惠)4:满减
     */
    @Column(name = "discount_type")
    private Integer promotionType;

    /**
     * 货品图片（一张，主页用) 
     */
    @Column(name = "product_pic")
    private String pic;

    /**
     * 运费模板id
     */
    @Column(name = "freight_id")
    private Long feightTemplateId;

    /**
     * 会员价格，即促销价格
     */
    @Column(name = "member_price")
    private Long promotionPrice;

    /**
     * 是否删除：0->未删除；1->已删除
     */
    @Column(name = "delete_status")
    private Integer deleteStatus;

    /**
     * 审核状态：0->未审核；1->审核通过
     */
    @Column(name = "check_status")
    private Integer verifyStatus;

    /**
     * 销量
     */
    @Column(name = "sales")
    private Integer sale;

    /**
     * 备注
     */
    private String note;

    /**
     * 相册（用于进入商品页面轮播）
     */
    @Column(name = "album")
    private String albumPics;

    /**
     * 详情标题
     */
    @Column(name = "detail_title")
    private String detailTitle;

    /**
     * 促销开始时间
     */
    @Column(name = "sale_start_time")
    private Date promotionStartTime;

    /**
     * 促销结束时间
     */
    @Column(name = "sale_end_time")
    private Date promotionEndTime;

    /**
     * 活动限购数量
     */
    @Column(name = "sale_per_limit")
    private Integer promotionPerLimit;

    /**
     * 产品分类名称
     */
    @Column(name = "product_classify_name")
    private String productCategoryName;

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
    private String detailDesc;

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

    private static final long serialVersionUID = 1L;

    public PmsProduct(Long id, Long productCategoryId, String name, String keywords, Long brandId, String productSn, BigDecimal originalPrice, BigDecimal price, Integer stock, Integer lowStock, BigDecimal weight, String unit, Integer giftGrowth, Integer giftPoint, BigDecimal usePointLimit, Integer publishStatus, Integer newStatus, Integer recommandStatus, String serviceIds, Integer promotionType, String pic, Long feightTemplateId, Long promotionPrice, Integer deleteStatus, Integer verifyStatus, Integer sale, String note, String albumPics, String detailTitle, Date promotionStartTime, Date promotionEndTime, Integer promotionPerLimit, String productCategoryName, String brandName, String description, String detailDesc, String detailHtml, String detailMobileHtml) {
        this.id = id;
        this.productCategoryId = productCategoryId;
        this.name = name;
        this.keywords = keywords;
        this.brandId = brandId;
        this.productSn = productSn;
        this.originalPrice = originalPrice;
        this.price = price;
        this.stock = stock;
        this.lowStock = lowStock;
        this.weight = weight;
        this.unit = unit;
        this.giftGrowth = giftGrowth;
        this.giftPoint = giftPoint;
        this.usePointLimit = usePointLimit;
        this.publishStatus = publishStatus;
        this.newStatus = newStatus;
        this.recommandStatus = recommandStatus;
        this.serviceIds = serviceIds;
        this.promotionType = promotionType;
        this.pic = pic;
        this.feightTemplateId = feightTemplateId;
        this.promotionPrice = promotionPrice;
        this.deleteStatus = deleteStatus;
        this.verifyStatus = verifyStatus;
        this.sale = sale;
        this.note = note;
        this.albumPics = albumPics;
        this.detailTitle = detailTitle;
        this.promotionStartTime = promotionStartTime;
        this.promotionEndTime = promotionEndTime;
        this.promotionPerLimit = promotionPerLimit;
        this.productCategoryName = productCategoryName;
        this.brandName = brandName;
        this.description = description;
        this.detailDesc = detailDesc;
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
    public Long getId() {
        return id;
    }

    /**
     * 设置货品(spu)id（与商品sku区别）
     *
     * @param id 货品(spu)id（与商品sku区别）
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取分类
     *
     * @return product_classify_id - 分类
     */
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * 设置分类
     *
     * @param productCategoryId 分类
     */
    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
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
    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    /**
     * 设置参考价格
     *
     * @param originalPrice 参考价格
     */
    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
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
    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    /**
     * 设置增加的成长值
     *
     * @param giftGrowth 增加的成长值
     */
    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    /**
     * 获取增加积分
     *
     * @return member_point - 增加积分
     */
    public Integer getGiftPoint() {
        return giftPoint;
    }

    /**
     * 设置增加积分
     *
     * @param giftPoint 增加积分
     */
    public void setGiftPoint(Integer giftPoint) {
        this.giftPoint = giftPoint;
    }

    /**
     * 获取积分兑换限额（百分比，表示只能抵扣价格的百分比）
     *
     * @return point_limit - 积分兑换限额（百分比，表示只能抵扣价格的百分比）
     */
    public BigDecimal getUsePointLimit() {
        return usePointLimit;
    }

    /**
     * 设置积分兑换限额（百分比，表示只能抵扣价格的百分比）
     *
     * @param usePointLimit 积分兑换限额（百分比，表示只能抵扣价格的百分比）
     */
    public void setUsePointLimit(BigDecimal usePointLimit) {
        this.usePointLimit = usePointLimit;
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
    public String getServiceIds() {
        return serviceIds;
    }

    /**
     * 设置服务保障（字符串，分号分割）：1->破损包退；2->运费险；3->保价险;4->正品保证(假一赔四);5->包邮
     *
     * @param serviceIds 服务保障（字符串，分号分割）：1->破损包退；2->运费险；3->保价险;4->正品保证(假一赔四);5->包邮
     */
    public void setServiceIds(String serviceIds) {
        this.serviceIds = serviceIds == null ? null : serviceIds.trim();
    }

    /**
     * 获取优惠方式(0;无优惠;1:促销价;2:会员价;3:积分兑换优惠)4:满减
     *
     * @return discount_type - 优惠方式(0;无优惠;1:促销价;2:会员价;3:积分兑换优惠)4:满减
     */
    public Integer getPromotionType() {
        return promotionType;
    }

    /**
     * 设置优惠方式(0;无优惠;1:促销价;2:会员价;3:积分兑换优惠)4:满减
     *
     * @param promotionType 优惠方式(0;无优惠;1:促销价;2:会员价;3:积分兑换优惠)4:满减
     */
    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    /**
     * 获取货品图片（一张，主页用) 
     *
     * @return product_pic - 货品图片（一张，主页用) 
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置货品图片（一张，主页用) 
     *
     * @param pic 货品图片（一张，主页用)
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * 获取运费模板id
     *
     * @return freight_id - 运费模板id
     */
    public Long getFeightTemplateId() {
        return feightTemplateId;
    }

    /**
     * 设置运费模板id
     *
     * @param feightTemplateId 运费模板id
     */
    public void setFeightTemplateId(Long feightTemplateId) {
        this.feightTemplateId = feightTemplateId;
    }

    /**
     * 获取会员价格
     *
     * @return member_price - 会员价格
     */
    public Long getPromotionPrice() {
        return promotionPrice;
    }

    /**
     * 设置会员价格
     *
     * @param promotionPrice 会员价格
     */
    public void setPromotionPrice(Long promotionPrice) {
        this.promotionPrice = promotionPrice;
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
    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    /**
     * 设置审核状态：0->未审核；1->审核通过
     *
     * @param verifyStatus 审核状态：0->未审核；1->审核通过
     */
    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    /**
     * 获取销量
     *
     * @return sales - 销量
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
    public String getAlbumPics() {
        return albumPics;
    }

    /**
     * 设置相册（用于进入商品页面轮播）
     *
     * @param albumPics 相册（用于进入商品页面轮播）
     */
    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics == null ? null : albumPics.trim();
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
    public Date getPromotionStartTime() {
        return promotionStartTime;
    }

    /**
     * 设置促销开始时间
     *
     * @param promotionStartTime 促销开始时间
     */
    public void setPromotionStartTime(Date promotionStartTime) {
        this.promotionStartTime = promotionStartTime;
    }

    /**
     * 获取促销结束时间
     *
     * @return sale_end_time - 促销结束时间
     */
    public Date getPromotionEndTime() {
        return promotionEndTime;
    }

    /**
     * 设置促销结束时间
     *
     * @param promotionEndTime 促销结束时间
     */
    public void setPromotionEndTime(Date promotionEndTime) {
        this.promotionEndTime = promotionEndTime;
    }

    /**
     * 获取活动限购数量
     *
     * @return sale_per_limit - 活动限购数量
     */
    public Integer getPromotionPerLimit() {
        return promotionPerLimit;
    }

    /**
     * 设置活动限购数量
     *
     * @param promotionPerLimit 活动限购数量
     */
    public void setPromotionPerLimit(Integer promotionPerLimit) {
        this.promotionPerLimit = promotionPerLimit;
    }

    /**
     * 获取产品分类名称
     *
     * @return product_classify_name - 产品分类名称
     */
    public String getProductCategoryName() {
        return productCategoryName;
    }

    /**
     * 设置产品分类名称
     *
     * @param productCategoryName 产品分类名称
     */
    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName == null ? null : productCategoryName.trim();
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
    public String getDetailDesc() {
        return detailDesc;
    }

    /**
     * 设置详情描述
     *
     * @param detailDesc 详情描述
     */
    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc == null ? null : detailDesc.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productId=").append(id);
        sb.append(", productClassifyId=").append(productCategoryId);
        sb.append(", name=").append(name);
        sb.append(", keywords=").append(keywords);
        sb.append(", brandId=").append(brandId);
        sb.append(", productSn=").append(productSn);
        sb.append(", referencePrice=").append(originalPrice);
        sb.append(", price=").append(price);
        sb.append(", stock=").append(stock);
        sb.append(", lowStock=").append(lowStock);
        sb.append(", weight=").append(weight);
        sb.append(", unit=").append(unit);
        sb.append(", growthValue=").append(giftGrowth);
        sb.append(", memberPoint=").append(giftPoint);
        sb.append(", pointLimit=").append(usePointLimit);
        sb.append(", publishStatus=").append(publishStatus);
        sb.append(", newStatus=").append(newStatus);
        sb.append(", recommandStatus=").append(recommandStatus);
        sb.append(", service=").append(serviceIds);
        sb.append(", discountType=").append(promotionType);
        sb.append(", productPic=").append(pic);
        sb.append(", freightId=").append(feightTemplateId);
        sb.append(", memberPrice=").append(promotionPrice);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", checkStatus=").append(verifyStatus);
        sb.append(", sales=").append(sale);
        sb.append(", note=").append(note);
        sb.append(", album=").append(albumPics);
        sb.append(", detailTitle=").append(detailTitle);
        sb.append(", saleStartTime=").append(promotionStartTime);
        sb.append(", saleEndTime=").append(promotionEndTime);
        sb.append(", salePerLimit=").append(promotionPerLimit);
        sb.append(", productClassifyName=").append(productCategoryName);
        sb.append(", brandName=").append(brandName);
        sb.append(", description=").append(description);
        sb.append(", detailDescription=").append(detailDesc);
        sb.append(", detailHtml=").append(detailHtml);
        sb.append(", detailMobileHtml=").append(detailMobileHtml);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}