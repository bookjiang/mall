package com.zhiqiang.mall.bean;

import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
@ToString
@Table(name = "ums_member")
public class UmsMember implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long memberId;

    /**
     * 用户等级id
     */
    @Column(name = "member_level_id")
    private Long memberLevelId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 帐号启用状态:0->禁用；1->启用
     */
    private Integer status;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 密码
     */
    private String password;

    /**
     * 注册时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 头像
     */
    private String icon;

    /**
     * 性别：0->未知；1->男；2->女
     */
    private Integer gender;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 所做城市
     */
    private String city;

    /**
     * 职业
     */
    private String job;

    /**
     * 个性签名
     */
    @Column(name = "personalized_signature")
    private String personalizedSignature;

    /**
     * 用户来源
     */
    @Column(name = "source_type")
    private Integer sourceType;

    /**
     * 积分
     */
    private Integer integration;

    /**
     * 成长值
     */
    private Integer growth;

    /**
     * 历史积分数量
     */
    @Column(name = "history_integration")
    private Integer historyIntegration;

    /**
     * 是否会员（0->否；1->是）
     */
    @Column(name = "is_vip")
    private Integer isVip;

    public UmsMember(Long memberId, Long memberLevelId, String username, String nickname, Integer status, String phone, String password, Date createTime, String icon, Integer gender, Date birthday, String city, String job, String personalizedSignature, Integer sourceType, Integer integration, Integer growth, Integer historyIntegration, Integer isVip) {
        this.memberId = memberId;
        this.memberLevelId = memberLevelId;
        this.username = username;
        this.nickname = nickname;
        this.status = status;
        this.phone = phone;
        this.password = password;
        this.createTime = createTime;
        this.icon = icon;
        this.gender = gender;
        this.birthday = birthday;
        this.city = city;
        this.job = job;
        this.personalizedSignature = personalizedSignature;
        this.sourceType = sourceType;
        this.integration = integration;
        this.growth = growth;
        this.historyIntegration = historyIntegration;
        this.isVip = isVip;
    }

    public UmsMember() {
        super();
    }

    /**
     * @return member_id
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * @param memberId
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * 获取用户等级id
     *
     * @return member_level_id - 用户等级id
     */
    public Long getMemberLevelId() {
        return memberLevelId;
    }

    /**
     * 设置用户等级id
     *
     * @param memberLevelId 用户等级id
     */
    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取昵称
     *
     * @return nickname - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * 获取帐号启用状态:0->禁用；1->启用
     *
     * @return status - 帐号启用状态:0->禁用；1->启用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置帐号启用状态:0->禁用；1->启用
     *
     * @param status 帐号启用状态:0->禁用；1->启用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取手机号码
     *
     * @return phone - 手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号码
     *
     * @param phone 手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取注册时间
     *
     * @return create_time - 注册时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置注册时间
     *
     * @param createTime 注册时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取头像
     *
     * @return icon - 头像
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置头像
     *
     * @param icon 头像
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 获取性别：0->未知；1->男；2->女
     *
     * @return gender - 性别：0->未知；1->男；2->女
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性别：0->未知；1->男；2->女
     *
     * @param gender 性别：0->未知；1->男；2->女
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取所做城市
     *
     * @return city - 所做城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置所做城市
     *
     * @param city 所做城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 获取职业
     *
     * @return job - 职业
     */
    public String getJob() {
        return job;
    }

    /**
     * 设置职业
     *
     * @param job 职业
     */
    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    /**
     * 获取个性签名
     *
     * @return personalized_signature - 个性签名
     */
    public String getPersonalizedSignature() {
        return personalizedSignature;
    }

    /**
     * 设置个性签名
     *
     * @param personalizedSignature 个性签名
     */
    public void setPersonalizedSignature(String personalizedSignature) {
        this.personalizedSignature = personalizedSignature == null ? null : personalizedSignature.trim();
    }

    /**
     * 获取用户来源
     *
     * @return source_type - 用户来源
     */
    public Integer getSourceType() {
        return sourceType;
    }

    /**
     * 设置用户来源
     *
     * @param sourceType 用户来源
     */
    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * 获取积分
     *
     * @return integration - 积分
     */
    public Integer getIntegration() {
        return integration;
    }

    /**
     * 设置积分
     *
     * @param integration 积分
     */
    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    /**
     * 获取成长值
     *
     * @return growth - 成长值
     */
    public Integer getGrowth() {
        return growth;
    }

    /**
     * 设置成长值
     *
     * @param growth 成长值
     */
    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    /**
     * 获取历史积分数量
     *
     * @return history_integration - 历史积分数量
     */
    public Integer getHistoryIntegration() {
        return historyIntegration;
    }

    /**
     * 设置历史积分数量
     *
     * @param historyIntegration 历史积分数量
     */
    public void setHistoryIntegration(Integer historyIntegration) {
        this.historyIntegration = historyIntegration;
    }

    /**
     * 获取是否会员（0->否；1->是）
     *
     * @return is_vip - 是否会员（0->否；1->是）
     */
    public Integer getIsVip() {
        return isVip;
    }

    /**
     * 设置是否会员（0->否；1->是）
     *
     * @param isVip 是否会员（0->否；1->是）
     */
    public void setIsVip(Integer isVip) {
        this.isVip = isVip;
    }
}