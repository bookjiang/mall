package com.zhiqiang.mall.sale.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.SmsCouponHistory;
import com.zhiqiang.mall.bean.SmsCouponHistoryExample;
import com.zhiqiang.mall.service.SmsCouponHistoryService;
import com.zhiqiang.mall.user.mapper.SmsCouponHistoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @ClassName: SmsCouponHistoryServiceImpl优惠券领取记录管理
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/4 21:01
 */
@Service
public class SmsCouponHistoryServiceImpl implements SmsCouponHistoryService {
    @Autowired
    private SmsCouponHistoryMapper historyMapper;

    @Override
    public PageInfo<SmsCouponHistory> list(Long couponId, Integer useStatus, String orderSn, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        SmsCouponHistoryExample example = new SmsCouponHistoryExample();
        SmsCouponHistoryExample.Criteria criteria = example.createCriteria();
        if(couponId!=null){
            criteria.andCouponIdEqualTo(couponId);
        }
        if(useStatus!=null){
            criteria.andUseStatusEqualTo(useStatus);
        }
        if(!StringUtils.isEmpty(orderSn)){
            criteria.andOrderSnEqualTo(orderSn);
        }
        List<SmsCouponHistory> list=historyMapper.selectByExample(example);
        PageInfo<SmsCouponHistory> pageInfo=new PageInfo<>(list);
        return pageInfo;

    }
}
