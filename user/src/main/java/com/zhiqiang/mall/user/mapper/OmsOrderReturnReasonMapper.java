package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.OmsOrderReturnReason;
import com.zhiqiang.mall.bean.OmsOrderReturnReasonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface OmsOrderReturnReasonMapper extends Mapper<OmsOrderReturnReason> {
    long countByExample(OmsOrderReturnReasonExample example);

    int deleteByExample(OmsOrderReturnReasonExample example);

    List<OmsOrderReturnReason> selectByExample(OmsOrderReturnReasonExample example);

    int updateByExampleSelective(@Param("record") OmsOrderReturnReason record, @Param("example") OmsOrderReturnReasonExample example);

    int updateByExample(@Param("record") OmsOrderReturnReason record, @Param("example") OmsOrderReturnReasonExample example);
}