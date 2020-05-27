package com.zhiqiang.mall.service;

import com.zhiqiang.mall.bean.PmsProductCategoryWithChildrenItem;

import java.util.List;

/**
 * @ClassName: PmsProductClassifyService
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/2 18:18
 */
public interface PmsProductClassifyService {
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
