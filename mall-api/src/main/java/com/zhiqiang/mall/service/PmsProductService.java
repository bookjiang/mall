package com.zhiqiang.mall.service;

import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.PmsProduct;
import com.zhiqiang.mall.bean.ProductQueryParams;

import java.util.List;

/**
 * @ClassName: PmsProductService
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/1 22:02
 */
public interface PmsProductService {
    PageInfo<PmsProduct> listAll(ProductQueryParams productQueryParam, Integer pageSize, Integer pageNum);
}
