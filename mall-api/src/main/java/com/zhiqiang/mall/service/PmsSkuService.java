package com.zhiqiang.mall.service;


import com.zhiqiang.mall.bean.PmsSkuStock;

import java.util.List;

/**
 * @ClassName: PmsSkuService
 * @description: Sku服务
 * @author: zhiqiang
 * @create: 2020/5/21 10:30
 */
public interface PmsSkuService {

    List<PmsSkuStock> getList(Long pid, String keyword);
}
