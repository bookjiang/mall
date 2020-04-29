package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.OmsCartItem;
import com.zhiqiang.mall.bean.OmsCartItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface OmsCartItemMapper extends Mapper<OmsCartItem> {
    long countByExample(OmsCartItemExample example);

    int deleteByExample(OmsCartItemExample example);

    List<OmsCartItem> selectByExample(OmsCartItemExample example);

    int updateByExampleSelective(@Param("record") OmsCartItem record, @Param("example") OmsCartItemExample example);

    int updateByExample(@Param("record") OmsCartItem record, @Param("example") OmsCartItemExample example);
}