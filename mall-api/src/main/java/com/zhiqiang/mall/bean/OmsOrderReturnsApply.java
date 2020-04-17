package com.zhiqiang.mall.bean;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "oms_order_returns_apply")
public class OmsOrderReturnsApply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_returns_apply_id")
    private Long orderReturnsApplyId;

    /**
     * 订单id
     */
    @Column(name = "order_id")
    private Long orderId;

    /**
     * 收货地址id
     */
    @Column(name = "address_id")
    private Long addressId;

    /**
     * 退货商品id
     */
    @Column(name = "product_id")
    private Long productId;

    /**
     * 订单货码
     */
    @Column(name = "order_sn")
    private String orderSn;

    /**
     * 申请时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 用户名
     */
    @Column(name = "member_name")
    private String memberName;

    /**
     * 退货人姓名
     */
    @Column(name = "return_name")
    private String returnName;

    /**
     * 退款金额
     */
    @Column(name = "return_amount")
    private BigDecimal returnAmount;

    /**
     * 退货人电话
     */
    @Column(name = "return_phone")
    private String returnPhone;

    /**
     * 申请状态:0->待处理;1->退货中；2->已完成;3->已拒绝
     */
    private Integer status;

    /**
     * 处理时间
     */
    @Column(name = "handle_time")
    private Date handleTime;

    /**
     * 处理人员
     */
    @Column(name = "handle_man")
    private String handleMan;

    /**
     * 处理备注
     */
    @Column(name = "handle_note")
    private String handleNote;

    /**
     * 收货人
     */
    @Column(name = "receive_man")
    private String receiveMan;

    /**
     * 收货时间
     */
    @Column(name = "receive_time")
    private Date receiveTime;

    /**
     * 收货备注
     */
    @Column(name = "receive_note")
    private String receiveNote;

    /**
     * 商品图片
     */
    @Column(name = "product_pic")
    private String productPic;

    /**
     * 商品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 商品品牌
     */
    @Column(name = "product_brand")
    private String productBrand;

    /**
     * 商品销售属性[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     */
    @Column(name = "product_attribute")
    private String productAttribute;

    /**
     * 退货数量
     */
    @Column(name = "product_count")
    private Integer productCount;

    /**
     * 商品单价
     */
    private BigDecimal price;

    /**
     * 商品实际支付单价
     */
    @Column(name = "real_price")
    private BigDecimal realPrice;

    /**
     * 原因
     */
    private String reason;

    /**
     * 详情描述
     */
    private String description;

    /**
     * 图片凭证，以逗号隔开
     */
    @Column(name = "proof_pics")
    private String proofPics;

    public OmsOrderReturnsApply(Long orderReturnsApplyId, Long orderId, Long addressId, Long productId, String orderSn, Date createTime, String memberName, String returnName, BigDecimal returnAmount, String returnPhone, Integer status, Date handleTime, String handleMan, String handleNote, String receiveMan, Date receiveTime, String receiveNote, String productPic, String productName, String productBrand, String productAttribute, Integer productCount, BigDecimal price, BigDecimal realPrice, String reason, String description, String proofPics) {
        this.orderReturnsApplyId = orderReturnsApplyId;
        this.orderId = orderId;
        this.addressId = addressId;
        this.productId = productId;
        this.orderSn = orderSn;
        this.createTime = createTime;
        this.memberName = memberName;
        this.returnName = returnName;
        this.returnAmount = returnAmount;
        this.returnPhone = returnPhone;
        this.status = status;
        this.handleTime = handleTime;
        this.handleMan = handleMan;
        this.handleNote = handleNote;
        this.receiveMan = receiveMan;
        this.receiveTime = receiveTime;
        this.receiveNote = receiveNote;
        this.productPic = productPic;
        this.productName = productName;
        this.productBrand = productBrand;
        this.productAttribute = productAttribute;
        this.productCount = productCount;
        this.price = price;
        this.realPrice = realPrice;
        this.reason = reason;
        this.description = description;
        this.proofPics = proofPics;
    }

    public OmsOrderReturnsApply() {
        super();
    }

    /**
     * @return order_returns_apply_id
     */
    public Long getOrderReturnsApplyId() {
        return orderReturnsApplyId;
    }

    /**
     * @param orderReturnsApplyId
     */
    public void setOrderReturnsApplyId(Long orderReturnsApplyId) {
        this.orderReturnsApplyId = orderReturnsApplyId;
    }

    /**
     * 获取订单id
     *
     * @return order_id - 订单id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id
     *
     * @param orderId 订单id
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取收货地址id
     *
     * @return address_id - 收货地址id
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * 设置收货地址id
     *
     * @param addressId 收货地址id
     */
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    /**
     * 获取退货商品id
     *
     * @return product_id - 退货商品id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 设置退货商品id
     *
     * @param productId 退货商品id
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 获取订单货码
     *
     * @return order_sn - 订单货码
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * 设置订单货码
     *
     * @param orderSn 订单货码
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    /**
     * 获取申请时间
     *
     * @return create_time - 申请时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置申请时间
     *
     * @param createTime 申请时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取用户名
     *
     * @return member_name - 用户名
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * 设置用户名
     *
     * @param memberName 用户名
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    /**
     * 获取退货人姓名
     *
     * @return return_name - 退货人姓名
     */
    public String getReturnName() {
        return returnName;
    }

    /**
     * 设置退货人姓名
     *
     * @param returnName 退货人姓名
     */
    public void setReturnName(String returnName) {
        this.returnName = returnName == null ? null : returnName.trim();
    }

    /**
     * 获取退款金额
     *
     * @return return_amount - 退款金额
     */
    public BigDecimal getReturnAmount() {
        return returnAmount;
    }

    /**
     * 设置退款金额
     *
     * @param returnAmount 退款金额
     */
    public void setReturnAmount(BigDecimal returnAmount) {
        this.returnAmount = returnAmount;
    }

    /**
     * 获取退货人电话
     *
     * @return return_phone - 退货人电话
     */
    public String getReturnPhone() {
        return returnPhone;
    }

    /**
     * 设置退货人电话
     *
     * @param returnPhone 退货人电话
     */
    public void setReturnPhone(String returnPhone) {
        this.returnPhone = returnPhone == null ? null : returnPhone.trim();
    }

    /**
     * 获取申请状态:0->待处理;1->退货中；2->已完成;3->已拒绝
     *
     * @return status - 申请状态:0->待处理;1->退货中；2->已完成;3->已拒绝
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置申请状态:0->待处理;1->退货中；2->已完成;3->已拒绝
     *
     * @param status 申请状态:0->待处理;1->退货中；2->已完成;3->已拒绝
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取处理时间
     *
     * @return handle_time - 处理时间
     */
    public Date getHandleTime() {
        return handleTime;
    }

    /**
     * 设置处理时间
     *
     * @param handleTime 处理时间
     */
    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    /**
     * 获取处理人员
     *
     * @return handle_man - 处理人员
     */
    public String getHandleMan() {
        return handleMan;
    }

    /**
     * 设置处理人员
     *
     * @param handleMan 处理人员
     */
    public void setHandleMan(String handleMan) {
        this.handleMan = handleMan == null ? null : handleMan.trim();
    }

    /**
     * 获取处理备注
     *
     * @return handle_note - 处理备注
     */
    public String getHandleNote() {
        return handleNote;
    }

    /**
     * 设置处理备注
     *
     * @param handleNote 处理备注
     */
    public void setHandleNote(String handleNote) {
        this.handleNote = handleNote == null ? null : handleNote.trim();
    }

    /**
     * 获取收货人
     *
     * @return receive_man - 收货人
     */
    public String getReceiveMan() {
        return receiveMan;
    }

    /**
     * 设置收货人
     *
     * @param receiveMan 收货人
     */
    public void setReceiveMan(String receiveMan) {
        this.receiveMan = receiveMan == null ? null : receiveMan.trim();
    }

    /**
     * 获取收货时间
     *
     * @return receive_time - 收货时间
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * 设置收货时间
     *
     * @param receiveTime 收货时间
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * 获取收货备注
     *
     * @return receive_note - 收货备注
     */
    public String getReceiveNote() {
        return receiveNote;
    }

    /**
     * 设置收货备注
     *
     * @param receiveNote 收货备注
     */
    public void setReceiveNote(String receiveNote) {
        this.receiveNote = receiveNote == null ? null : receiveNote.trim();
    }

    /**
     * 获取商品图片
     *
     * @return product_pic - 商品图片
     */
    public String getProductPic() {
        return productPic;
    }

    /**
     * 设置商品图片
     *
     * @param productPic 商品图片
     */
    public void setProductPic(String productPic) {
        this.productPic = productPic == null ? null : productPic.trim();
    }

    /**
     * 获取商品名称
     *
     * @return product_name - 商品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置商品名称
     *
     * @param productName 商品名称
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * 获取商品品牌
     *
     * @return product_brand - 商品品牌
     */
    public String getProductBrand() {
        return productBrand;
    }

    /**
     * 设置商品品牌
     *
     * @param productBrand 商品品牌
     */
    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand == null ? null : productBrand.trim();
    }

    /**
     * 获取商品销售属性[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     *
     * @return product_attribute - 商品销售属性[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     */
    public String getProductAttribute() {
        return productAttribute;
    }

    /**
     * 设置商品销售属性[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     *
     * @param productAttribute 商品销售属性[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     */
    public void setProductAttribute(String productAttribute) {
        this.productAttribute = productAttribute == null ? null : productAttribute.trim();
    }

    /**
     * 获取退货数量
     *
     * @return product_count - 退货数量
     */
    public Integer getProductCount() {
        return productCount;
    }

    /**
     * 设置退货数量
     *
     * @param productCount 退货数量
     */
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    /**
     * 获取商品单价
     *
     * @return price - 商品单价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置商品单价
     *
     * @param price 商品单价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取商品实际支付单价
     *
     * @return real_price - 商品实际支付单价
     */
    public BigDecimal getRealPrice() {
        return realPrice;
    }

    /**
     * 设置商品实际支付单价
     *
     * @param realPrice 商品实际支付单价
     */
    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    /**
     * 获取原因
     *
     * @return reason - 原因
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置原因
     *
     * @param reason 原因
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * 获取详情描述
     *
     * @return description - 详情描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置详情描述
     *
     * @param description 详情描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取图片凭证，以逗号隔开
     *
     * @return proof_pics - 图片凭证，以逗号隔开
     */
    public String getProofPics() {
        return proofPics;
    }

    /**
     * 设置图片凭证，以逗号隔开
     *
     * @param proofPics 图片凭证，以逗号隔开
     */
    public void setProofPics(String proofPics) {
        this.proofPics = proofPics == null ? null : proofPics.trim();
    }
}