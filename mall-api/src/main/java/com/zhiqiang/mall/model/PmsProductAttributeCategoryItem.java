package com.zhiqiang.mall.model;



import com.zhiqiang.mall.bean.PmsProductAttribute;
import com.zhiqiang.mall.bean.PmsProductAttributeCategory;

import java.util.List;

/**
 * 包含有分类下属性的dto

 */
public class PmsProductAttributeCategoryItem extends PmsProductAttributeCategory {
    public PmsProductAttributeCategoryItem(Long id, String name, Integer attributeCount, Integer paramCount) {
        super(id, name, attributeCount, paramCount);
    }

    private List<PmsProductAttribute> productAttributeList;

    public List<PmsProductAttribute> getProductAttributeList() {
        return productAttributeList;
    }

    public void setProductAttributeList(List<PmsProductAttribute> productAttributeList) {
        this.productAttributeList = productAttributeList;
    }
}
