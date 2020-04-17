package com.zhiqiang.mall.bean;

import javax.persistence.*;

@Table(name = "pms_product_operate_log")
public class PmsProductOperateLog {
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