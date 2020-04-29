package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.OmsOrderSetting;
import com.zhiqiang.mall.bean.OmsOrderSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface OmsOrderSettingMapper extends Mapper<OmsOrderSetting> {
    long countByExample(OmsOrderSettingExample example);

    int deleteByExample(OmsOrderSettingExample example);

    List<OmsOrderSetting> selectByExample(OmsOrderSettingExample example);

    int updateByExampleSelective(@Param("record") OmsOrderSetting record, @Param("example") OmsOrderSettingExample example);

    int updateByExample(@Param("record") OmsOrderSetting record, @Param("example") OmsOrderSettingExample example);
}