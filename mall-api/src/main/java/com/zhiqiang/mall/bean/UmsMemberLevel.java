package com.zhiqiang.mall.bean;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "ums_member_level")
public class UmsMemberLevel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_level_id")
    private Long memberLevelId;

    /**
     * 名称
     */
    private String name;

    /**
     * 最低成长值
     */
    @Column(name = "growth_point_low")
    private Integer growthPointLow;

    /**
     * 最高成长值
     */
    @Column(name = "growth_point_high")
    private Integer growthPointHigh;

    /**
     * 是否为默认等级：0->不是；1->是
     */
    @Column(name = "default_status")
    private Integer defaultStatus;

    /**
     * 免运费券数量
     */
    @Column(name = "free_freight_ticket")
    private Integer freeFreightTicket;

    /**
     * 每次评价获取的成长值
     */
    @Column(name = "comment_growth_point")
    private Integer commentGrowthPoint;

    /**
     * 是否有评论获奖励特权
     */
    @Column(name = "priviledge_comment")
    private Integer priviledgeComment;

    /**
     * 是否有会员价格特权
     */
    @Column(name = "priviledge_member_price")
    private Integer priviledgeMemberPrice;

    /**
     * 是否有生日特权
     */
    @Column(name = "priviledge_birthday")
    private Integer priviledgeBirthday;

    private String note;

    public UmsMemberLevel(Long memberLevelId, String name, Integer growthPointLow, Integer growthPointHigh, Integer defaultStatus, Integer freeFreightTicket, Integer commentGrowthPoint, Integer priviledgeComment, Integer priviledgeMemberPrice, Integer priviledgeBirthday, String note) {
        this.memberLevelId = memberLevelId;
        this.name = name;
        this.growthPointLow = growthPointLow;
        this.growthPointHigh = growthPointHigh;
        this.defaultStatus = defaultStatus;
        this.freeFreightTicket = freeFreightTicket;
        this.commentGrowthPoint = commentGrowthPoint;
        this.priviledgeComment = priviledgeComment;
        this.priviledgeMemberPrice = priviledgeMemberPrice;
        this.priviledgeBirthday = priviledgeBirthday;
        this.note = note;
    }

    public UmsMemberLevel() {
        super();
    }

    /**
     * @return member_level_id
     */
    public Long getMemberLevelId() {
        return memberLevelId;
    }

    /**
     * @param memberLevelId
     */
    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取最低成长值
     *
     * @return growth_point_low - 最低成长值
     */
    public Integer getGrowthPointLow() {
        return growthPointLow;
    }

    /**
     * 设置最低成长值
     *
     * @param growthPointLow 最低成长值
     */
    public void setGrowthPointLow(Integer growthPointLow) {
        this.growthPointLow = growthPointLow;
    }

    /**
     * 获取最高成长值
     *
     * @return growth_point_high - 最高成长值
     */
    public Integer getGrowthPointHigh() {
        return growthPointHigh;
    }

    /**
     * 设置最高成长值
     *
     * @param growthPointHigh 最高成长值
     */
    public void setGrowthPointHigh(Integer growthPointHigh) {
        this.growthPointHigh = growthPointHigh;
    }

    /**
     * 获取是否为默认等级：0->不是；1->是
     *
     * @return default_status - 是否为默认等级：0->不是；1->是
     */
    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    /**
     * 设置是否为默认等级：0->不是；1->是
     *
     * @param defaultStatus 是否为默认等级：0->不是；1->是
     */
    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    /**
     * 获取免运费券数量
     *
     * @return free_freight_ticket - 免运费券数量
     */
    public Integer getFreeFreightTicket() {
        return freeFreightTicket;
    }

    /**
     * 设置免运费券数量
     *
     * @param freeFreightTicket 免运费券数量
     */
    public void setFreeFreightTicket(Integer freeFreightTicket) {
        this.freeFreightTicket = freeFreightTicket;
    }

    /**
     * 获取每次评价获取的成长值
     *
     * @return comment_growth_point - 每次评价获取的成长值
     */
    public Integer getCommentGrowthPoint() {
        return commentGrowthPoint;
    }

    /**
     * 设置每次评价获取的成长值
     *
     * @param commentGrowthPoint 每次评价获取的成长值
     */
    public void setCommentGrowthPoint(Integer commentGrowthPoint) {
        this.commentGrowthPoint = commentGrowthPoint;
    }

    /**
     * 获取是否有评论获奖励特权
     *
     * @return priviledge_comment - 是否有评论获奖励特权
     */
    public Integer getPriviledgeComment() {
        return priviledgeComment;
    }

    /**
     * 设置是否有评论获奖励特权
     *
     * @param priviledgeComment 是否有评论获奖励特权
     */
    public void setPriviledgeComment(Integer priviledgeComment) {
        this.priviledgeComment = priviledgeComment;
    }

    /**
     * 获取是否有会员价格特权
     *
     * @return priviledge_member_price - 是否有会员价格特权
     */
    public Integer getPriviledgeMemberPrice() {
        return priviledgeMemberPrice;
    }

    /**
     * 设置是否有会员价格特权
     *
     * @param priviledgeMemberPrice 是否有会员价格特权
     */
    public void setPriviledgeMemberPrice(Integer priviledgeMemberPrice) {
        this.priviledgeMemberPrice = priviledgeMemberPrice;
    }

    /**
     * 获取是否有生日特权
     *
     * @return priviledge_birthday - 是否有生日特权
     */
    public Integer getPriviledgeBirthday() {
        return priviledgeBirthday;
    }

    /**
     * 设置是否有生日特权
     *
     * @param priviledgeBirthday 是否有生日特权
     */
    public void setPriviledgeBirthday(Integer priviledgeBirthday) {
        this.priviledgeBirthday = priviledgeBirthday;
    }

    /**
     * @return note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}