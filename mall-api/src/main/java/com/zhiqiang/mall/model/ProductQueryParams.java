package com.zhiqiang.mall.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @ClassName: ProductQueryParams商品查询参数
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/1 21:57
 */
@ApiModel(value = "商品查询参数")
public class ProductQueryParams implements Serializable {
    @ApiModelProperty("上架状态")
    private Integer publishStatus;
    @ApiModelProperty("审核状态")
    private Integer verifyStatus;
    @ApiModelProperty("商品名称模糊关键字")
    private String keyword;
    @ApiModelProperty("商品货号")
    private String productSn;
    @ApiModelProperty("商品分类编号")
    private Long productCategoryId;
    @ApiModelProperty("商品品牌编号")
    private Long brandId;

    public Integer getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Long getBrandId() {
        return brandId;
    }

    @Override
    public String toString() {
        return "ProductQueryParams{" +
                "publishStatus=" + publishStatus +
                ", verifyStatus=" + verifyStatus +
                ", keyword='" + keyword + '\'' +
                ", productSn='" + productSn + '\'' +
                ", productCategoryId=" + productCategoryId +
                ", brandId=" + brandId +
                '}';
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

}
