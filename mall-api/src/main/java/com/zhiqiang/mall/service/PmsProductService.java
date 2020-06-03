package com.zhiqiang.mall.service;

import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.PmsProduct;
import com.zhiqiang.mall.model.PmsProductParam;
import com.zhiqiang.mall.model.PmsProductResult;
import com.zhiqiang.mall.model.ProductQueryParams;


import java.util.List;

/**
 * @ClassName: PmsProductService
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/1 22:02
 */
public interface PmsProductService {
    

    PageInfo<PmsProduct> listAll(ProductQueryParams productQueryParam, Integer pageSize, Integer pageNum);

    List<PmsProduct> list(String keyword);

    int updatePublishStatus(List<Long> ids, Integer publishStatus);

    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);

    int updateNewStatus(List<Long> ids, Integer newStatus);

    int updateDeleteStatus(List<Long> ids, Integer deleteStatus);

    PmsProductResult getUpdateInfo(Long id);

    int create(PmsProductParam productParam);
}
