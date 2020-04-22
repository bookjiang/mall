package com.zhiqiang.mall.bean;

import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
@ToString
@Table(name = "pms_product_operate_log")
public class PmsProductOperateLog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "operate_log_id")
    private Long operateLogId;

    public PmsProductOperateLog(Long operateLogId) {
        this.operateLogId = operateLogId;
    }

    public PmsProductOperateLog() {
        super();
    }

    /**
     * @return operate_log_id
     */
    public Long getOperateLogId() {
        return operateLogId;
    }

    /**
     * @param operateLogId
     */
    public void setOperateLogId(Long operateLogId) {
        this.operateLogId = operateLogId;
    }
}