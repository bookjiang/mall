package com.zhiqiang.mall.bean;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "oms_company_address")
public class OmsCompanyAddress implements Serializable {
    @Id
    @Column(name = "address_id")
    private Long addressId;

    /**
     * 地址名称
     */
    @Column(name = "address_name")
    private String addressName;

    /**
     * 默认发货地址：0->否；1->是
     */
    @Column(name = "send_status")
    private Integer sendStatus;

    /**
     * 是否默认收货地址:0->否;1->是
     */
    @Column(name = "receive_status")
    private Integer receiveStatus;

    /**
     * 收发货姓名
     */
    private String name;

    /**
     * 收发货电话
     */
    private String phone;

    /**
     * 省/直辖市
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String region;

    /**
     * 详细地址
     */
    @Column(name = "detail_address")
    private String detailAddress;

    private static final long serialVersionUID = 1L;

    public OmsCompanyAddress(Long addressId, String addressName, Integer sendStatus, Integer receiveStatus, String name, String phone, String province, String city, String region, String detailAddress) {
        this.addressId = addressId;
        this.addressName = addressName;
        this.sendStatus = sendStatus;
        this.receiveStatus = receiveStatus;
        this.name = name;
        this.phone = phone;
        this.province = province;
        this.city = city;
        this.region = region;
        this.detailAddress = detailAddress;
    }

    public OmsCompanyAddress() {
        super();
    }

    /**
     * @return address_id
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * @param addressId
     */
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    /**
     * 获取地址名称
     *
     * @return address_name - 地址名称
     */
    public String getAddressName() {
        return addressName;
    }

    /**
     * 设置地址名称
     *
     * @param addressName 地址名称
     */
    public void setAddressName(String addressName) {
        this.addressName = addressName == null ? null : addressName.trim();
    }

    /**
     * 获取默认发货地址：0->否；1->是
     *
     * @return send_status - 默认发货地址：0->否；1->是
     */
    public Integer getSendStatus() {
        return sendStatus;
    }

    /**
     * 设置默认发货地址：0->否；1->是
     *
     * @param sendStatus 默认发货地址：0->否；1->是
     */
    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    /**
     * 获取是否默认收货地址:0->否;1->是
     *
     * @return receive_status - 是否默认收货地址:0->否;1->是
     */
    public Integer getReceiveStatus() {
        return receiveStatus;
    }

    /**
     * 设置是否默认收货地址:0->否;1->是
     *
     * @param receiveStatus 是否默认收货地址:0->否;1->是
     */
    public void setReceiveStatus(Integer receiveStatus) {
        this.receiveStatus = receiveStatus;
    }

    /**
     * 获取收发货姓名
     *
     * @return name - 收发货姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置收发货姓名
     *
     * @param name 收发货姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取收发货电话
     *
     * @return phone - 收发货电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置收发货电话
     *
     * @param phone 收发货电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取省/直辖市
     *
     * @return province - 省/直辖市
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省/直辖市
     *
     * @param province 省/直辖市
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 获取市
     *
     * @return city - 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置市
     *
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 获取区
     *
     * @return region - 区
     */
    public String getRegion() {
        return region;
    }

    /**
     * 设置区
     *
     * @param region 区
     */
    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    /**
     * 获取详细地址
     *
     * @return detail_address - 详细地址
     */
    public String getDetailAddress() {
        return detailAddress;
    }

    /**
     * 设置详细地址
     *
     * @param detailAddress 详细地址
     */
    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress == null ? null : detailAddress.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", addressId=").append(addressId);
        sb.append(", addressName=").append(addressName);
        sb.append(", sendStatus=").append(sendStatus);
        sb.append(", receiveStatus=").append(receiveStatus);
        sb.append(", name=").append(name);
        sb.append(", phone=").append(phone);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", region=").append(region);
        sb.append(", detailAddress=").append(detailAddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}