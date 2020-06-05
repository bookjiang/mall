package com.zhiqiang.mall.service;

import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.SmsCouponHistory;

/**
 * @ClassName: SmsCouponHistoryService
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/4 21:01
 */
public interface SmsCouponHistoryService {


    PageInfo<SmsCouponHistory> list(Long couponId, Integer useStatus, String orderSn, Integer pageSize, Integer pageNum);
}
