package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.OmsOrderOperateHistory;
import com.zhiqiang.mall.bean.OmsOrderOperateHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface OmsOrderOperateHistoryMapper extends Mapper<OmsOrderOperateHistory> {
    long countByExample(OmsOrderOperateHistoryExample example);

    int deleteByExample(OmsOrderOperateHistoryExample example);

    List<OmsOrderOperateHistory> selectByExample(OmsOrderOperateHistoryExample example);

    int updateByExampleSelective(@Param("record") OmsOrderOperateHistory record, @Param("example") OmsOrderOperateHistoryExample example);

    int updateByExample(@Param("record") OmsOrderOperateHistory record, @Param("example") OmsOrderOperateHistoryExample example);
}