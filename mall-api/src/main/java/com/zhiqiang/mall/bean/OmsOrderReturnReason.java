package com.zhiqiang.mall.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "oms_order_return_reason")
public class OmsOrderReturnReason implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 退货类型
     */
    private String name;

    private Integer sort;

    /**
     * 状态：0->不启用；1->启用
     */
    private Integer status;

    /**
     * 添加时间
     */
    @Column(name = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public OmsOrderReturnReason(Long id, String name, Integer sort, Integer status, Date createTime) {
        this.id = id;
        this.name = name;
        this.sort = sort;
        this.status = status;
        this.createTime = createTime;
    }

    public OmsOrderReturnReason() {
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
     * 获取退货类型
     *
     * @return name - 退货类型
     */
    public String getName() {
        return name;
    }

    /**
     * 设置退货类型
     *
     * @param name 退货类型
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取状态：0->不启用；1->启用
     *
     * @return status - 状态：0->不启用；1->启用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态：0->不启用；1->启用
     *
     * @param status 状态：0->不启用；1->启用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取添加时间
     *
     * @return create_time - 添加时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置添加时间
     *
     * @param createTime 添加时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", sort=").append(sort);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}