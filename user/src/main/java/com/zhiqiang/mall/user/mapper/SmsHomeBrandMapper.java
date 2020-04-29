package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.SmsHomeBrand;
import com.zhiqiang.mall.bean.SmsHomeBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface SmsHomeBrandMapper extends Mapper<SmsHomeBrand> {
    long countByExample(SmsHomeBrandExample example);

    int deleteByExample(SmsHomeBrandExample example);

    List<SmsHomeBrand> selectByExample(SmsHomeBrandExample example);

    int updateByExampleSelective(@Param("record") SmsHomeBrand record, @Param("example") SmsHomeBrandExample example);

    int updateByExample(@Param("record") SmsHomeBrand record, @Param("example") SmsHomeBrandExample example);
}