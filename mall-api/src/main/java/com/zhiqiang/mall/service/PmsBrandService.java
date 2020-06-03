package com.zhiqiang.mall.service;

import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.PmsBrand;
import com.zhiqiang.mall.model.PmsBrandParam;

import java.util.List;

/**
 * @ClassName: PmsBrandService
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/2 17:58
 */
public interface PmsBrandService {
    PageInfo<PmsBrand> listBrand(String keyword, Integer pageNum, Integer pageSize);

    int updateShowStatus(List<Long> ids, Integer showStatus);

    int updateFactoryStatus(List<Long> ids, Integer factoryStatus);

    PmsBrand getBrand(Long id);

    int updateBrand(Long id, PmsBrandParam pmsBrandParam);

    int createBrand(PmsBrandParam pmsBrand);

    int deleteBrand(Long id);
}
