package com.zhiqiang.mall.model;


import com.zhiqiang.mall.bean.*;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 创建和修改商品时使用的参数
 * Created by macro on 2018/4/26.
 */
public class PmsProductParam extends PmsProduct {

    @ApiModelProperty("商品阶梯价格设置")
    public List<PmsProductLadder> productLadderList;
    @ApiModelProperty("商品满减价格设置")
    public List<PmsProductFullReduction> productFullReductionList;
    @ApiModelProperty("商品会员价格设置")
    public List<PmsMemberPrice> memberPriceList;
    @ApiModelProperty("商品的sku库存信息")
    public List<PmsSkuStock> skuStockList;
    @ApiModelProperty("商品参数及自定义规格属性")
    public List<PmsProductAttributeValue> productAttributeValueList;
    @ApiModelProperty("专题和商品关系")
    public List<CmsSubjectProductRelation> subjectProductRelationList;
    @ApiModelProperty("优选专区和商品的关系")
    public List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList;

    public PmsProductParam(Long id, Long brandId, Long productCategoryId, Long feightTemplateId, Long productAttributeCategoryId, String name, String pic, String productSn, Integer deleteStatus, Integer publishStatus, Integer newStatus, Integer recommandStatus, Integer verifyStatus, Integer sort, Integer sale, BigDecimal price, BigDecimal promotionPrice, Integer giftGrowth, Integer giftPoint, Integer usePointLimit, String subTitle, BigDecimal originalPrice, Integer stock, Integer lowStock, String unit, BigDecimal weight, Integer previewStatus, String serviceIds, String keywords, String note, String albumPics, String detailTitle, Date promotionStartTime, Date promotionEndTime, Integer promotionPerLimit, Integer promotionType, String brandName, String productCategoryName, String description, String detailDesc, String detailHtml, String detailMobileHtml, List<PmsProductLadder> productLadderList, List<PmsProductFullReduction> productFullReductionList, List<PmsMemberPrice> memberPriceList, List<PmsSkuStock> skuStockList, List<PmsProductAttributeValue> productAttributeValueList, List<CmsSubjectProductRelation> subjectProductRelationList, List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList) {
        super(id, brandId, productCategoryId, feightTemplateId, productAttributeCategoryId, name, pic, productSn, deleteStatus, publishStatus, newStatus, recommandStatus, verifyStatus, sort, sale, price, promotionPrice, giftGrowth, giftPoint, usePointLimit, subTitle, originalPrice, stock, lowStock, unit, weight, previewStatus, serviceIds, keywords, note, albumPics, detailTitle, promotionStartTime, promotionEndTime, promotionPerLimit, promotionType, brandName, productCategoryName, description, detailDesc, detailHtml, detailMobileHtml);
        this.productLadderList = productLadderList;
        this.productFullReductionList = productFullReductionList;
        this.memberPriceList = memberPriceList;
        this.skuStockList = skuStockList;
        this.productAttributeValueList = productAttributeValueList;
        this.subjectProductRelationList = subjectProductRelationList;
        this.prefrenceAreaProductRelationList = prefrenceAreaProductRelationList;
    }
    public PmsProductParam(Long id, Long brandId, Long productCategoryId, Long feightTemplateId, Long productAttributeCategoryId, String name, String pic, String productSn, Integer deleteStatus, Integer publishStatus, Integer newStatus, Integer recommandStatus, Integer verifyStatus, Integer sort, Integer sale, BigDecimal price, BigDecimal promotionPrice, Integer giftGrowth, Integer giftPoint, Integer usePointLimit, String subTitle, BigDecimal originalPrice, Integer stock, Integer lowStock, String unit, BigDecimal weight, Integer previewStatus, String serviceIds, String keywords, String note, String albumPics, String detailTitle, Date promotionStartTime, Date promotionEndTime, Integer promotionPerLimit, Integer promotionType, String brandName, String productCategoryName, String description, String detailDesc, String detailHtml, String detailMobileHtml) {
        super(id, brandId, productCategoryId, feightTemplateId, productAttributeCategoryId, name, pic, productSn, deleteStatus, publishStatus, newStatus, recommandStatus, verifyStatus, sort, sale, price, promotionPrice, giftGrowth, giftPoint, usePointLimit, subTitle, originalPrice, stock, lowStock, unit, weight, previewStatus, serviceIds, keywords, note, albumPics, detailTitle, promotionStartTime, promotionEndTime, promotionPerLimit, promotionType, brandName, productCategoryName, description, detailDesc, detailHtml, detailMobileHtml);
    }
    public PmsProductParam(List<PmsProductLadder> productLadderList, List<PmsProductFullReduction> productFullReductionList, List<PmsMemberPrice> memberPriceList, List<PmsSkuStock> skuStockList, List<PmsProductAttributeValue> productAttributeValueList, List<CmsSubjectProductRelation> subjectProductRelationList, List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList) {
        this.productLadderList = productLadderList;
        this.productFullReductionList = productFullReductionList;
        this.memberPriceList = memberPriceList;
        this.skuStockList = skuStockList;
        this.productAttributeValueList = productAttributeValueList;
        this.subjectProductRelationList = subjectProductRelationList;
        this.prefrenceAreaProductRelationList = prefrenceAreaProductRelationList;
    }

    public List<PmsProductLadder> getProductLadderList() {
        return productLadderList;
    }

    public void setProductLadderList(List<PmsProductLadder> productLadderList) {
        this.productLadderList = productLadderList;
    }

    public List<PmsProductFullReduction> getProductFullReductionList() {
        return productFullReductionList;
    }

    public void setProductFullReductionList(List<PmsProductFullReduction> productFullReductionList) {
        this.productFullReductionList = productFullReductionList;
    }

    public List<PmsMemberPrice> getMemberPriceList() {
        return memberPriceList;
    }

    public void setMemberPriceList(List<PmsMemberPrice> memberPriceList) {
        this.memberPriceList = memberPriceList;
    }

    public List<PmsSkuStock> getSkuStockList() {
        return skuStockList;
    }

    public void setSkuStockList(List<PmsSkuStock> skuStockList) {
        this.skuStockList = skuStockList;
    }

    public List<PmsProductAttributeValue> getProductAttributeValueList() {
        return productAttributeValueList;
    }

    public void setProductAttributeValueList(List<PmsProductAttributeValue> productAttributeValueList) {
        this.productAttributeValueList = productAttributeValueList;
    }

    public List<CmsSubjectProductRelation> getSubjectProductRelationList() {
        return subjectProductRelationList;
    }

    public void setSubjectProductRelationList(List<CmsSubjectProductRelation> subjectProductRelationList) {
        this.subjectProductRelationList = subjectProductRelationList;
    }

    public List<CmsPrefrenceAreaProductRelation> getPrefrenceAreaProductRelationList() {
        return prefrenceAreaProductRelationList;
    }

    public void setPrefrenceAreaProductRelationList(List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList) {
        this.prefrenceAreaProductRelationList = prefrenceAreaProductRelationList;
    }
}
