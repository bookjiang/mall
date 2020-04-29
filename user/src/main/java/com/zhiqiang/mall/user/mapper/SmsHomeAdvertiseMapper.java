package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.SmsHomeAdvertise;
import com.zhiqiang.mall.bean.SmsHomeAdvertiseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface SmsHomeAdvertiseMapper extends Mapper<SmsHomeAdvertise> {
    long countByExample(SmsHomeAdvertiseExample example);

    int deleteByExample(SmsHomeAdvertiseExample example);

    List<SmsHomeAdvertise> selectByExample(SmsHomeAdvertiseExample example);

    int updateByExampleSelective(@Param("record") SmsHomeAdvertise record, @Param("example") SmsHomeAdvertiseExample example);

    int updateByExample(@Param("record") SmsHomeAdvertise record, @Param("example") SmsHomeAdvertiseExample example);
}