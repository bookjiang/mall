package com.zhiqiang.mall.service;

import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.PmsProductAttributeCategory;
import com.zhiqiang.mall.model.PmsProductAttributeCategoryItem;

import java.util.List;

/**
 * @ClassName: PmsProductAttributeCategoryService
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/2 14:18
 */
public interface PmsProductAttributeCategoryService {
    PageInfo<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum);

    List<PmsProductAttributeCategoryItem> getListWithAttr();

    int update(Long id, String name);
}
