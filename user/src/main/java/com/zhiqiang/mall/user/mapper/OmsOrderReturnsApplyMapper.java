package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.OmsOrderReturnsApply;
import com.zhiqiang.mall.bean.OmsOrderReturnsApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface OmsOrderReturnsApplyMapper extends Mapper<OmsOrderReturnsApply> {
    long countByExample(OmsOrderReturnsApplyExample example);

    int deleteByExample(OmsOrderReturnsApplyExample example);

    List<OmsOrderReturnsApply> selectByExample(OmsOrderReturnsApplyExample example);

    int updateByExampleSelective(@Param("record") OmsOrderReturnsApply record, @Param("example") OmsOrderReturnsApplyExample example);

    int updateByExample(@Param("record") OmsOrderReturnsApply record, @Param("example") OmsOrderReturnsApplyExample example);
}