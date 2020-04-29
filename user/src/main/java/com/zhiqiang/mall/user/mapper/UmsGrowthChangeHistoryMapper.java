package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.UmsGrowthChangeHistory;
import com.zhiqiang.mall.bean.UmsGrowthChangeHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UmsGrowthChangeHistoryMapper extends Mapper<UmsGrowthChangeHistory> {
    long countByExample(UmsGrowthChangeHistoryExample example);

    int deleteByExample(UmsGrowthChangeHistoryExample example);

    List<UmsGrowthChangeHistory> selectByExample(UmsGrowthChangeHistoryExample example);

    int updateByExampleSelective(@Param("record") UmsGrowthChangeHistory record, @Param("example") UmsGrowthChangeHistoryExample example);

    int updateByExample(@Param("record") UmsGrowthChangeHistory record, @Param("example") UmsGrowthChangeHistoryExample example);
}