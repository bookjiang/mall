package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.PmsAttribute;
import com.zhiqiang.mall.bean.PmsAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface PmsAttributeMapper extends Mapper<PmsAttribute> {
    long countByExample(PmsAttributeExample example);

    int deleteByExample(PmsAttributeExample example);

    List<PmsAttribute> selectByExample(PmsAttributeExample example);

    int updateByExampleSelective(@Param("record") PmsAttribute record, @Param("example") PmsAttributeExample example);

    int updateByExample(@Param("record") PmsAttribute record, @Param("example") PmsAttributeExample example);
}