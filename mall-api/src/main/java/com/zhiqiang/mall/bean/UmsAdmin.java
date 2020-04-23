package com.zhiqiang.mall.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
@Data
@ApiModel(value = "后台管理者模型")
@ToString
@Table(name = "ums_admin")
public class UmsAdmin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")
    @ApiModelProperty(value = "管理员id")
    @JsonProperty(value = "adminId")
    private Long adminId;

    /**
     * 用户名
     */

    @NotEmpty(message = "用户名不能为空")
    private String username;

    /**
     * 密码
     */
    @Size(min = 6, message = "密码必须至少是6位")
    @Pattern(regexp = "^?=.*?[A-Z]", message = "密码至少一个小写英文字母")
    private String password;

    /**
     * 头像
     */
    private String icon;

    /**
     * 邮箱
     */
    @Email(message = "邮箱格式不合法")
    private String email;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    @JsonProperty(value = "nickName")
    private String nickName;

    /**
     * 备注信息
     */
    private String note;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @JsonProperty(value = "createTime")
    private Date createTime;

    /**
     * 最后登录时间
     */
    @Column(name = "login_time")
    @JsonProperty(value = "loginTime")
    private Date loginTime;

    /**
     * 帐号启用状态：0->禁用；1->启用
     */
    private Integer status;

    public UmsAdmin(Long adminId, String username, String password, String icon, String email, String nickName, String note, Date createTime, Date loginTime, Integer status) {
        this.adminId = adminId;
        this.username = username;
        this.password = password;
        this.icon = icon;
        this.email = email;
        this.nickName = nickName;
        this.note = note;
        this.createTime = createTime;
        this.loginTime = loginTime;
        this.status = status;
    }

    public UmsAdmin() {
        super();
    }

    /**
     * @return admin_id
     */
    public Long getAdminId() {
        return adminId;
    }

    /**
     * @param adminId
     */

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
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
        //this.username = username == null ? null : username.trim();
        this.username=username;
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
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取昵称
     *
     * @return nick_name - 昵称
     */

    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 获取备注信息
     *
     * @return note - 备注信息
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置备注信息
     *
     * @param note 备注信息
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
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
     * 获取最后登录时间
     *
     * @return login_time - 最后登录时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 设置最后登录时间
     *
     * @param loginTime 最后登录时间
     */

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取帐号启用状态：0->禁用；1->启用
     *
     * @return status - 帐号启用状态：0->禁用；1->启用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置帐号启用状态：0->禁用；1->启用
     *
     * @param status 帐号启用状态：0->禁用；1->启用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}