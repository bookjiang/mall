package com.zhiqiang.mall.order.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.zhiqiang.mall.bean.OmsCompanyAddress;
import com.zhiqiang.mall.bean.OmsCompanyAddressExample;
import com.zhiqiang.mall.service.OmsCompanyAddressService;
import com.zhiqiang.mall.user.mapper.OmsCompanyAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

/**
 * 收货地址管理Service实现类
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
