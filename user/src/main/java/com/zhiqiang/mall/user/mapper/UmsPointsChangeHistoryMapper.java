package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.UmsPointsChangeHistory;
import com.zhiqiang.mall.bean.UmsPointsChangeHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UmsPointsChangeHistoryMapper extends Mapper<UmsPointsChangeHistory> {
    long countByExample(UmsPointsChangeHistoryExample example);

    int deleteByExample(UmsPointsChangeHistoryExample example);

    List<UmsPointsChangeHistory> selectByExample(UmsPointsChangeHistoryExample example);

    int updateByExampleSelective(@Param("record") UmsPointsChangeHistory record, @Param("example") UmsPointsChangeHistoryExample example);

    int updateByExample(@Param("record") UmsPointsChangeHistory record, @Param("example") UmsPointsChangeHistoryExample example);
}