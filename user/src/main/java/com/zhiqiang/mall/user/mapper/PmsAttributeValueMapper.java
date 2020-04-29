package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.PmsAttributeValue;
import com.zhiqiang.mall.bean.PmsAttributeValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface PmsAttributeValueMapper extends Mapper<PmsAttributeValue> {
    long countByExample(PmsAttributeValueExample example);

    int deleteByExample(PmsAttributeValueExample example);

    List<PmsAttributeValue> selectByExample(PmsAttributeValueExample example);

    int updateByExampleSelective(@Param("record") PmsAttributeValue record, @Param("example") PmsAttributeValueExample example);

    int updateByExample(@Param("record") PmsAttributeValue record, @Param("example") PmsAttributeValueExample example);
}