package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.SmsHomeRecommendProduct;
import com.zhiqiang.mall.bean.SmsHomeRecommendProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface SmsHomeRecommendProductMapper extends Mapper<SmsHomeRecommendProduct> {
    long countByExample(SmsHomeRecommendProductExample example);

    int deleteByExample(SmsHomeRecommendProductExample example);

    List<SmsHomeRecommendProduct> selectByExample(SmsHomeRecommendProductExample example);

    int updateByExampleSelective(@Param("record") SmsHomeRecommendProduct record, @Param("example") SmsHomeRecommendProductExample example);

    int updateByExample(@Param("record") SmsHomeRecommendProduct record, @Param("example") SmsHomeRecommendProductExample example);
}