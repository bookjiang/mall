package com.zhiqiang.mall.service;



import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.PmsProductCategory;
import com.zhiqiang.mall.model.PmsProductCategoryParam;
import com.zhiqiang.mall.model.PmsProductCategoryWithChildrenItem;

import java.util.List;

/**
 * @ClassName: PmsProductClassifyService
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/2 18:18
 */
public interface PmsProductClassifyService {
    List<PmsProductCategoryWithChildrenItem> listWithChildren();

    PageInfo<PmsProductCategory> getList(Long parentId, Integer pageSize, Integer pageNum);

    int updateNavStatus(List<Long> ids, Integer navStatus);

    int updateShowStatus(List<Long> ids, Integer showStatus);

    PmsProductCategory getItem(Long id);

    int update(Long id, PmsProductCategoryParam productCategoryParam);

    int delete(Long id);

    int create(PmsProductCategoryParam productCategoryParam);
}
