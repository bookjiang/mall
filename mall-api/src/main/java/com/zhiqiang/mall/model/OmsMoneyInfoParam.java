package com.zhiqiang.mall.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 修改订单费用信息参数
 */
@Getter
@Setter
public class OmsMoneyInfoParam implements Serializable {
    private Long orderId;
    private BigDecimal freightAmount;
    private BigDecimal discountAmount;
    private Integer status;
}
