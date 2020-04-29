package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.SmsCouponHistory;
import com.zhiqiang.mall.bean.SmsCouponHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface SmsCouponHistoryMapper extends Mapper<SmsCouponHistory> {
    long countByExample(SmsCouponHistoryExample example);

    int deleteByExample(SmsCouponHistoryExample example);

    List<SmsCouponHistory> selectByExample(SmsCouponHistoryExample example);

    int updateByExampleSelective(@Param("record") SmsCouponHistory record, @Param("example") SmsCouponHistoryExample example);

    int updateByExample(@Param("record") SmsCouponHistory record, @Param("example") SmsCouponHistoryExample example);
}