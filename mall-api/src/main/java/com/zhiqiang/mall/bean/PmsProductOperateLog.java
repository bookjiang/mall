package com.zhiqiang.mall.bean;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "pms_product_operate_log")
public class PmsProductOperateLog implements Serializable {
    @Id
    @Column(name = "operate_log_id")
    private Long operateLogId;

    private static final long serialVersionUID = 1L;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", operateLogId=").append(operateLogId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}