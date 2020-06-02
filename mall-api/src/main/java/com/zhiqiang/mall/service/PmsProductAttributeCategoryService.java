package com.zhiqiang.mall.service;

import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.PmsProductAttributeCategory;

/**
 * @ClassName: PmsProductAttributeCategoryService
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/2 14:18
 */
public interface PmsProductAttributeCategoryService {
    PageInfo<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum);
}
