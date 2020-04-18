package com.zhiqiang.mall.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "pms_comment")
public class PmsComment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long commentId;

    /**
     * 商品id
     */
    @Column(name = "product_id")
    private Long productId;

    /**
     * 用户名称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 商品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 评价星级:0->5
     */
    private Integer star;

    /**
     * 评价的ip
     */
    @Column(name = "member_ip")
    private String memberIp;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 是否显示
     */
    @Column(name = "show_status")
    private Integer showStatus;

    /**
     * 购买时的商品属性
     */
    @Column(name = "product_attribute")
    private String productAttribute;

    /**
     * 收藏数
     */
    @Column(name = "collect_num")
    private Integer collectNum;

    /**
     * 阅读数
     */
    @Column(name = "read_num")
    private Integer readNum;

    /**
     * 上传图片地址，逗号隔开
     */
    private String pics;

    /**
     * 评论用户头像（暂时不考虑用）
     */
    @Column(name = "member_icon")
    private String memberIcon;

    /**
     * 回复数
     */
    @Column(name = "replay_count")
    private Integer replayCount;

    /**
     * 内容
     */
    private String content;

    public PmsComment(Long commentId, Long productId, String nickName, String productName, Integer star, String memberIp, Date createTime, Integer showStatus, String productAttribute, Integer collectNum, Integer readNum, String pics, String memberIcon, Integer replayCount, String content) {
        this.commentId = commentId;
        this.productId = productId;
        this.nickName = nickName;
        this.productName = productName;
        this.star = star;
        this.memberIp = memberIp;
        this.createTime = createTime;
        this.showStatus = showStatus;
        this.productAttribute = productAttribute;
        this.collectNum = collectNum;
        this.readNum = readNum;
        this.pics = pics;
        this.memberIcon = memberIcon;
        this.replayCount = replayCount;
        this.content = content;
    }

    public PmsComment() {
        super();
    }

    /**
     * @return comment_id
     */
    public Long getCommentId() {
        return commentId;
    }

    /**
     * @param commentId
     */
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    /**
     * 获取商品id
     *
     * @return product_id - 商品id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 设置商品id
     *
     * @param productId 商品id
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 获取用户名称
     *
     * @return nick_name - 用户名称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置用户名称
     *
     * @param nickName 用户名称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
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
     * 获取评价星级:0->5
     *
     * @return star - 评价星级:0->5
     */
    public Integer getStar() {
        return star;
    }

    /**
     * 设置评价星级:0->5
     *
     * @param star 评价星级:0->5
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
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取是否显示
     *
     * @return show_status - 是否显示
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * 设置是否显示
     *
     * @param showStatus 是否显示
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
     * 获取收藏数
     *
     * @return collect_num - 收藏数
     */
    public Integer getCollectNum() {
        return collectNum;
    }

    /**
     * 设置收藏数
     *
     * @param collectNum 收藏数
     */
    public void setCollectNum(Integer collectNum) {
        this.collectNum = collectNum;
    }

    /**
     * 获取阅读数
     *
     * @return read_num - 阅读数
     */
    public Integer getReadNum() {
        return readNum;
    }

    /**
     * 设置阅读数
     *
     * @param readNum 阅读数
     */
    public void setReadNum(Integer readNum) {
        this.readNum = readNum;
    }

    /**
     * 获取上传图片地址，逗号隔开
     *
     * @return pics - 上传图片地址，逗号隔开
     */
    public String getPics() {
        return pics;
    }

    /**
     * 设置上传图片地址，逗号隔开
     *
     * @param pics 上传图片地址，逗号隔开
     */
    public void setPics(String pics) {
        this.pics = pics == null ? null : pics.trim();
    }

    /**
     * 获取评论用户头像（暂时不考虑用）
     *
     * @return member_icon - 评论用户头像（暂时不考虑用）
     */
    public String getMemberIcon() {
        return memberIcon;
    }

    /**
     * 设置评论用户头像（暂时不考虑用）
     *
     * @param memberIcon 评论用户头像（暂时不考虑用）
     */
    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon == null ? null : memberIcon.trim();
    }

    /**
     * 获取回复数
     *
     * @return replay_count - 回复数
     */
    public Integer getReplayCount() {
        return replayCount;
    }

    /**
     * 设置回复数
     *
     * @param replayCount 回复数
     */
    public void setReplayCount(Integer replayCount) {
        this.replayCount = replayCount;
    }

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}