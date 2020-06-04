package com.zhiqiang.mall.order.dao;

import com.zhiqiang.mall.bean.OmsOrder;
import com.zhiqiang.mall.model.OmsOrderDeliveryParam;
import com.zhiqiang.mall.model.OmsOrderDetail;
import com.zhiqiang.mall.model.OmsOrderQueryParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName: OmsOrderDao
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/3 23:37
 */
public interface OmsOrderDao {
    List<OmsOrder> getList(@Param("queryParam")OmsOrderQueryParam queryParam);

    OmsOrderDetail getDetail(Long id);

    int delivery(List<OmsOrderDeliveryParam> deliveryParamList);
}
