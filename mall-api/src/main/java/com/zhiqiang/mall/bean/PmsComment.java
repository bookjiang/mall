package com.zhiqiang.mall.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "pms_comment")
public class PmsComment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "member_nick_name")
    private String memberNickName;

    @Column(name = "product_name")
    private String productName;

    /**
     * 评价星数：0->5
     */
    private Integer star;

    /**
     * 评价的ip
     */
    @Column(name = "member_ip")
    private String memberIp;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "show_status")
    private Integer showStatus;

    /**
     * 购买时的商品属性
     */
    @Column(name = "product_attribute")
    private String productAttribute;

    @Column(name = "collect_couont")
    private Integer collectCouont;

    @Column(name = "read_count")
    private Integer readCount;

    /**
     * 上传图片地址，以逗号隔开
     */
    private String pics;

    /**
     * 评论用户头像
     */
    @Column(name = "member_icon")
    private String memberIcon;

    @Column(name = "replay_count")
    private Integer replayCount;

    private String content;

    private static final long serialVersionUID = 1L;

    public PmsComment(Long id, Long productId, String memberNickName, String productName, Integer star, String memberIp, Date createTime, Integer showStatus, String productAttribute, Integer collectCouont, Integer readCount, String pics, String memberIcon, Integer replayCount, String content) {
        this.id = id;
        this.productId = productId;
        this.memberNickName = memberNickName;
        this.productName = productName;
        this.star = star;
        this.memberIp = memberIp;
        this.createTime = createTime;
        this.showStatus = showStatus;
        this.productAttribute = productAttribute;
        this.collectCouont = collectCouont;
        this.readCount = readCount;
        this.pics = pics;
        this.memberIcon = memberIcon;
        this.replayCount = replayCount;
        this.content = content;
    }

    public PmsComment() {
        super();
    }

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return product_id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * @return member_nick_name
     */
    public String getMemberNickName() {
        return memberNickName;
    }

    /**
     * @param memberNickName
     */
    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName == null ? null : memberNickName.trim();
    }

    /**
     * @return product_name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * 获取评价星数：0->5
     *
     * @return star - 评价星数：0->5
     */
    public Integer getStar() {
        return star;
    }

    /**
     * 设置评价星数：0->5
     *
     * @param star 评价星数：0->5
     */
    public void setStar(Integer star) {
        this.star = star;
    }

    /**
     * 获取评价的ip
     *
     * @return member_ip - 评价的ip
     */
    public String getMemberIp() {
        return memberIp;
    }

    /**
     * 设置评价的ip
     *
     * @param memberIp 评价的ip
     */
    public void setMemberIp(String memberIp) {
        this.memberIp = memberIp == null ? null : memberIp.trim();
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return show_status
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * @param showStatus
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * 获取购买时的商品属性
     *
     * @return product_attribute - 购买时的商品属性
     */
    public String getProductAttribute() {
        return productAttribute;
    }

    /**
     * 设置购买时的商品属性
     *
     * @param productAttribute 购买时的商品属性
     */
    public void setProductAttribute(String productAttribute) {
        this.productAttribute = productAttribute == null ? null : productAttribute.trim();
    }

    /**
     * @return collect_couont
     */
    public Integer getCollectCouont() {
        return collectCouont;
    }

    /**
     * @param collectCouont
     */
    public void setCollectCouont(Integer collectCouont) {
        this.collectCouont = collectCouont;
    }

    /**
     * @return read_count
     */
    public Integer getReadCount() {
        return readCount;
    }

    /**
     * @param readCount
     */
    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    /**
     * 获取上传图片地址，以逗号隔开
     *
     * @return pics - 上传图片地址，以逗号隔开
     */
    public String getPics() {
        return pics;
    }

    /**
     * 设置上传图片地址，以逗号隔开
     *
     * @param pics 上传图片地址，以逗号隔开
     */
    public void setPics(String pics) {
        this.pics = pics == null ? null : pics.trim();
    }

    /**
     * 获取评论用户头像
     *
     * @return member_icon - 评论用户头像
     */
    public String getMemberIcon() {
        return memberIcon;
    }

    /**
     * 设置评论用户头像
     *
     * @param memberIcon 评论用户头像
     */
    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon == null ? null : memberIcon.trim();
    }

    /**
     * @return replay_count
     */
    public Integer getReplayCount() {
        return replayCount;
    }

    /**
     * @param replayCount
     */
    public void setReplayCount(Integer replayCount) {
        this.replayCount = replayCount;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", memberNickName=").append(memberNickName);
        sb.append(", productName=").append(productName);
        sb.append(", star=").append(star);
        sb.append(", memberIp=").append(memberIp);
        sb.append(", createTime=").append(createTime);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", productAttribute=").append(productAttribute);
        sb.append(", collectCouont=").append(collectCouont);
        sb.append(", readCount=").append(readCount);
        sb.append(", pics=").append(pics);
        sb.append(", memberIcon=").append(memberIcon);
        sb.append(", replayCount=").append(replayCount);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}