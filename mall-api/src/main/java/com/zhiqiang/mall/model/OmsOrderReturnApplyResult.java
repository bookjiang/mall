package com.zhiqiang.mall.model;


import com.zhiqiang.mall.bean.OmsCompanyAddress;
import com.zhiqiang.mall.bean.OmsOrderReturnApply;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 申请信息封装
 */
public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
    public OmsOrderReturnApplyResult(Long id, Long orderId, Long companyAddressId, Long productId, String orderSn, Date createTime, String memberUsername, BigDecimal returnAmount, String returnName, String returnPhone, Integer status, Date handleTime, String productPic, String productName, String productBrand, String productAttr, Integer productCount, BigDecimal productPrice, BigDecimal productRealPrice, String reason, String description, String proofPics, String handleNote, String handleMan, String receiveMan, Date receiveTime, String receiveNote, OmsCompanyAddress companyAddress) {
        super(id, orderId, companyAddressId, productId, orderSn, createTime, memberUsername, returnAmount, returnName, returnPhone, status, handleTime, productPic, productName, productBrand, productAttr, productCount, productPrice, productRealPrice, reason, description, proofPics, handleNote, handleMan, receiveMan, receiveTime, receiveNote);
        this.companyAddress = companyAddress;
    }
    public OmsOrderReturnApplyResult(Long id, Long orderId, Long companyAddressId, Long productId, String orderSn, Date createTime, String memberUsername, BigDecimal returnAmount, String returnName, String returnPhone, Integer status, Date handleTime, String productPic, String productName, String productBrand, String productAttr, Integer productCount, BigDecimal productPrice, BigDecimal productRealPrice, String reason, String description, String proofPics, String handleNote, String handleMan, String receiveMan, Date receiveTime, String receiveNote) {
        super(id, orderId, companyAddressId, productId, orderSn, createTime, memberUsername, returnAmount, returnName, returnPhone, status, handleTime, productPic, productName, productBrand, productAttr, productCount, productPrice, productRealPrice, reason, description, proofPics, handleNote, handleMan, receiveMan, receiveTime, receiveNote);

    }

    public OmsOrderReturnApplyResult(OmsCompanyAddress companyAddress) {
        this.companyAddress = companyAddress;
    }

    @Getter
    @Setter
    private OmsCompanyAddress companyAddress;
}
