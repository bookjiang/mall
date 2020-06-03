package com.zhiqiang.mall.service;

import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.PmsProductAttribute;
import com.zhiqiang.mall.model.PmsProductAttributeParam;
import com.zhiqiang.mall.model.ProductAttrInfo;

import java.util.List;

/**
 * @ClassName: PmsProductAttributeService
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/29 13:09
 */
public interface PmsProductAttributeService {
    PageInfo<PmsProductAttribute> getList(Long cid, Integer type, Integer pageSize, Integer pageNum);

    List<ProductAttrInfo> getProductAttrInfo(Long productCategoryId);

    PmsProductAttribute getItem(Long id);

    int update(Long id, PmsProductAttributeParam productAttributeParam);

    int create(PmsProductAttributeParam productAttributeParam);

    int delete(List<Long> ids);
}
