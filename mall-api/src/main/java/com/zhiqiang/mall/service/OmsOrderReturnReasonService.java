package com.zhiqiang.mall.service;


import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.OmsOrderReturnReason;

import java.util.List;

/**
 * @ClassName: OmsOrderReturnReasonService订单原因管理
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/3 23:14
 */

public interface OmsOrderReturnReasonService {
    int create(OmsOrderReturnReason returnReason);

    int update(Long id, OmsOrderReturnReason returnReason);

    int delete(List<Long> ids);

    PageInfo<OmsOrderReturnReason> list(Integer pageSize, Integer pageNum);

    int updateStatus(List<Long> ids, Integer status);

    OmsOrderReturnReason getItem(Long id);
}
