package com.zhiqiang.mall.order.dao;

import com.zhiqiang.mall.bean.OmsOrderOperateHistory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName: OmsOrderOperateHistoryDao
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/4 9:28
 */
public interface OmsOrderOperateHistoryDao {

    /**
     * 批量创建
     */
    int insertList(@Param("list") List<OmsOrderOperateHistory> orderOperateHistoryList);

}
