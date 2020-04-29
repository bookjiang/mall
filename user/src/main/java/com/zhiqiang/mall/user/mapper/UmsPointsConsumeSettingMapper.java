package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.UmsPointsConsumeSetting;
import com.zhiqiang.mall.bean.UmsPointsConsumeSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UmsPointsConsumeSettingMapper extends Mapper<UmsPointsConsumeSetting> {
    long countByExample(UmsPointsConsumeSettingExample example);

    int deleteByExample(UmsPointsConsumeSettingExample example);

    List<UmsPointsConsumeSetting> selectByExample(UmsPointsConsumeSettingExample example);

    int updateByExampleSelective(@Param("record") UmsPointsConsumeSetting record, @Param("example") UmsPointsConsumeSettingExample example);

    int updateByExample(@Param("record") UmsPointsConsumeSetting record, @Param("example") UmsPointsConsumeSettingExample example);
}