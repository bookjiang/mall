package com.zhiqiang.mall.service;


import com.zhiqiang.mall.bean.OmsOrderSetting;

/**
 * @ClassName: OmsOrderSettingService订单设置
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/3 23:14
 */

public interface OmsOrderSettingService {
    OmsOrderSetting getItem(Long id);

    int update(Long id, OmsOrderSetting orderSetting);
}
