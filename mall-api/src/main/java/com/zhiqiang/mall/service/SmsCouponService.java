package com.zhiqiang.mall.service;

import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.SmsCoupon;
import com.zhiqiang.mall.model.SmsCouponParam;

/**
 * @ClassName: SmsCouponService
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/4 21:00
 */
public interface SmsCouponService {

    PageInfo<SmsCoupon> list(String name, Integer type, Integer pageSize, Integer pageNum);

    int create(SmsCouponParam couponParam);

    int delete(Long id);

    int update(Long id, SmsCouponParam couponParam);

    SmsCouponParam getItem(Long id);
}
