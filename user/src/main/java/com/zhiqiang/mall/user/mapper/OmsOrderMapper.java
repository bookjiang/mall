package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.OmsOrder;
import com.zhiqiang.mall.bean.OmsOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface OmsOrderMapper extends Mapper<OmsOrder> {
    long countByExample(OmsOrderExample example);

    int deleteByExample(OmsOrderExample example);

    List<OmsOrder> selectByExample(OmsOrderExample example);

    int updateByExampleSelective(@Param("record") OmsOrder record, @Param("example") OmsOrderExample example);

    int updateByExample(@Param("record") OmsOrder record, @Param("example") OmsOrderExample example);
}