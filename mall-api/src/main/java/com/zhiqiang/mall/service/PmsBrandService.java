package com.zhiqiang.mall.service;

import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.PmsBrand;

/**
 * @ClassName: PmsBrandService
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/2 17:58
 */
public interface PmsBrandService {
    PageInfo<PmsBrand> listBrand(String keyword, Integer pageNum, Integer pageSize);
}
