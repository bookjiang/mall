package com.zhiqiang.mall.service;

import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.SmsHomeAdvertise;

import java.util.List;

/**
 * @ClassName: SmsHomeAdvertiseService
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/4 22:20
 */
public interface SmsHomeAdvertiseService {

    PageInfo<SmsHomeAdvertise> list(String name, Integer type, String endTime, Integer pageSize, Integer pageNum);

    int create(SmsHomeAdvertise advertise);

    int delete(List<Long> ids);

    int updateStatus(Long id, Integer status);

    SmsHomeAdvertise getItem(Long id);

    int update(Long id, SmsHomeAdvertise advertise);
}
