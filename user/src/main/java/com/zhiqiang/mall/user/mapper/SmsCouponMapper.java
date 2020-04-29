package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.SmsCoupon;
import com.zhiqiang.mall.bean.SmsCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface SmsCouponMapper extends Mapper<SmsCoupon> {
    long countByExample(SmsCouponExample example);

    int deleteByExample(SmsCouponExample example);

    List<SmsCoupon> selectByExample(SmsCouponExample example);

    int updateByExampleSelective(@Param("record") SmsCoupon record, @Param("example") SmsCouponExample example);

    int updateByExample(@Param("record") SmsCoupon record, @Param("example") SmsCouponExample example);
}