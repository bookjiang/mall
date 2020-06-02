package com.zhiqiang.mall.model;

import com.zhiqiang.mall.bean.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 查询单个产品进行修改时返回的结果
 * Created by macro on 2018/4/26.
 */
public class PmsProductResult extends PmsProductParam {


    //商品所选分类的父id
    private Long cateParentId;

    public PmsProductResult(Long id, Long brandId, Long productCategoryId, Long feightTemplateId, Long productAttributeCategoryId, String name, String pic, String productSn, Integer deleteStatus, Integer publishStatus, Integer newStatus, Integer recommandStatus, Integer verifyStatus, Integer sort, Integer sale, BigDecimal price, BigDecimal promotionPrice, Integer giftGrowth, Integer giftPoint, Integer usePointLimit, String subTitle, BigDecimal originalPrice, Integer stock, Integer lowStock, String unit, BigDecimal weight, Integer previewStatus, String serviceIds, String keywords, String note, String albumPics, String detailTitle, Date promotionStartTime, Date promotionEndTime, Integer promotionPerLimit, Integer promotionType, String brandName, String productCategoryName, String description, String detailDesc, String detailHtml, String detailMobileHtml) {
        super(id, brandId, productCategoryId, feightTemplateId, productAttributeCategoryId, name, pic, productSn, deleteStatus, publishStatus, newStatus, recommandStatus, verifyStatus, sort, sale, price, promotionPrice=null, giftGrowth, giftPoint, usePointLimit, subTitle, originalPrice, stock, lowStock, unit, weight, previewStatus, serviceIds, keywords, note, albumPics, detailTitle, promotionStartTime, promotionEndTime, promotionPerLimit, promotionType, brandName, productCategoryName, description, detailDesc, detailHtml, detailMobileHtml);
    }

    public PmsProductResult(Long id, Long brandId, Long productCategoryId, Long feightTemplateId, Long productAttributeCategoryId, String name, String pic, String productSn, Integer deleteStatus, Integer publishStatus, Integer newStatus, Integer recommandStatus, Integer verifyStatus, Integer sort, Integer sale, BigDecimal price, BigDecimal promotionPrice, Integer giftGrowth, Integer giftPoint, Integer usePointLimit, String subTitle, BigDecimal originalPrice, Integer stock, Integer lowStock, String unit, BigDecimal weight, Integer previewStatus, String serviceIds, String keywords, String note, String albumPics, String detailTitle, Date promotionStartTime, Date promotionEndTime, Integer promotionPerLimit, Integer promotionType, String brandName, String productCategoryName, String description, String detailDesc, String detailHtml, String detailMobileHtml, List<PmsProductLadder> productLadderList, List<PmsProductFullReduction> productFullReductionList, List<PmsMemberPrice> memberPriceList, List<PmsSkuStock> skuStockList, List<PmsProductAttributeValue> productAttributeValueList, List<CmsSubjectProductRelation> subjectProductRelationList, List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList) {
        super(id, brandId, productCategoryId, feightTemplateId, productAttributeCategoryId, name, pic, productSn, deleteStatus, publishStatus, newStatus, recommandStatus, verifyStatus, sort, sale, price, promotionPrice, giftGrowth, giftPoint, usePointLimit, subTitle, originalPrice, stock, lowStock, unit, weight, previewStatus, serviceIds, keywords, note, albumPics, detailTitle, promotionStartTime, promotionEndTime, promotionPerLimit, promotionType, brandName, productCategoryName, description, detailDesc, detailHtml, detailMobileHtml, productLadderList, productFullReductionList, memberPriceList, skuStockList, productAttributeValueList, subjectProductRelationList, prefrenceAreaProductRelationList);
    }

    public PmsProductResult(List<PmsProductLadder> productLadderList, List<PmsProductFullReduction> productFullReductionList, List<PmsMemberPrice> memberPriceList, List<PmsSkuStock> skuStockList, List<PmsProductAttributeValue> productAttributeValueList, List<CmsSubjectProductRelation> subjectProductRelationList, List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList) {
        super(productLadderList, productFullReductionList, memberPriceList, skuStockList, productAttributeValueList, subjectProductRelationList, prefrenceAreaProductRelationList);
    }

    public Long getCateParentId() {
        return cateParentId;
    }

    public void setCateParentId(Long cateParentId) {
        this.cateParentId = cateParentId;
    }
}
