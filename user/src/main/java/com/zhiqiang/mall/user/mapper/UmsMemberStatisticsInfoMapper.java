package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.UmsMemberStatisticsInfo;
import com.zhiqiang.mall.bean.UmsMemberStatisticsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UmsMemberStatisticsInfoMapper extends Mapper<UmsMemberStatisticsInfo> {
    long countByExample(UmsMemberStatisticsInfoExample example);

    int deleteByExample(UmsMemberStatisticsInfoExample example);

    List<UmsMemberStatisticsInfo> selectByExample(UmsMemberStatisticsInfoExample example);

    int updateByExampleSelective(@Param("record") UmsMemberStatisticsInfo record, @Param("example") UmsMemberStatisticsInfoExample example);

    int updateByExample(@Param("record") UmsMemberStatisticsInfo record, @Param("example") UmsMemberStatisticsInfoExample example);
}