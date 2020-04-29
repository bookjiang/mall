package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.OmsOrderItem;
import com.zhiqiang.mall.bean.OmsOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface OmsOrderItemMapper extends Mapper<OmsOrderItem> {
    long countByExample(OmsOrderItemExample example);

    int deleteByExample(OmsOrderItemExample example);

    List<OmsOrderItem> selectByExample(OmsOrderItemExample example);

    int updateByExampleSelective(@Param("record") OmsOrderItem record, @Param("example") OmsOrderItemExample example);

    int updateByExample(@Param("record") OmsOrderItem record, @Param("example") OmsOrderItemExample example);
}