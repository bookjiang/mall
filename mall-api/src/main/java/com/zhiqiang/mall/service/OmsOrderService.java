package com.zhiqiang.mall.service;


import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.OmsOrder;
import com.zhiqiang.mall.model.*;

import java.util.List;

/**
 * @ClassName: OmsOrderService订单管理
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/3 23:14
 */

public interface OmsOrderService {
    PageInfo<OmsOrder> list(OmsOrderQueryParam queryParam, Integer pageSize, Integer pageNum);

    int delivery(List<OmsOrderDeliveryParam> deliveryParamList);

    int close(List<Long> ids, String note);

    int delete(List<Long> ids);

    OmsOrderDetail detail(Long id);

    int updateReceiverInfo(OmsReceiverInfoParam receiverInfoParam);

    int updateMoneyInfo(OmsMoneyInfoParam moneyInfoParam);

    int updateNote(Long id, String note, Integer status);
}
