package com.zhiqiang.mall.order.service.impl;


import com.zhiqiang.mall.bean.OmsOrderSetting;
import com.zhiqiang.mall.service.OmsOrderSettingService;
import com.zhiqiang.mall.user.mapper.OmsOrderSettingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * 订单设置管理Service实现类

 */
@Service
public class OmsOrderSettingServiceImpl implements OmsOrderSettingService {
    @Autowired
    private OmsOrderSettingMapper orderSettingMapper;

    @Override
    public OmsOrderSetting getItem(Long id) {
        return orderSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Long id, OmsOrderSetting orderSetting) {
        orderSetting.setId(id);
        return orderSettingMapper.updateByPrimaryKey(orderSetting);
    }
}
