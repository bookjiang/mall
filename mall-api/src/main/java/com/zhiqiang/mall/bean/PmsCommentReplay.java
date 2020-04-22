package com.zhiqiang.mall.bean;

import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
@ToString
@Table(name = "pms_comment_replay")
public class PmsCommentReplay implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_replay_id")
    private Long commentReplayId;

    /**
     * 评论id
     */
    @Column(name = "comment_id")
    private Long commentId;

    /**
     * 用户昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 用户头像
     */
    @Column(name = "member_icon")
    private String memberIcon;

    /**
     * 内容
     */
    private String content;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 评论人员类型:0->用户；1->管理员
     */
    private Integer type;

    public PmsCommentReplay(Long commentReplayId, Long commentId, String nickName, String memberIcon, String content, Date createTime, Integer type) {
        this.commentReplayId = commentReplayId;
        this.commentId = commentId;
        this.nickName = nickName;
        this.memberIcon = memberIcon;
        this.content = content;
        this.createTime = createTime;
        this.type = type;
    }

    public PmsCommentReplay() {
        super();
    }

    /**
     * @return comment_replay_id
     */
    public Long getCommentReplayId() {
        return commentReplayId;
    }

    /**
     * @param commentReplayId
     */
    public void setCommentReplayId(Long commentReplayId) {
        this.commentReplayId = commentReplayId;
    }

    /**
     * 获取评论id
     *
     * @return comment_id - 评论id
     */
    public Long getCommentId() {
        return commentId;
    }

    /**
     * 设置评论id
     *
     * @param commentId 评论id
     */
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    /**
     * 获取用户昵称
     *
     * @return nick_name - 用户昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置用户昵称
     *
     * @param nickName 用户昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 获取用户头像
     *
     * @return member_icon - 用户头像
     */
    public String getMemberIcon() {
        return memberIcon;
    }

    /**
     * 设置用户头像
     *
     * @param memberIcon 用户头像
     */
    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon == null ? null : memberIcon.trim();
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
     * 获取评论人员类型:0->用户；1->管理员
     *
     * @return type - 评论人员类型:0->用户；1->管理员
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置评论人员类型:0->用户；1->管理员
     *
     * @param type 评论人员类型:0->用户；1->管理员
     */
    public void setType(Integer type) {
        this.type = type;
    }
}