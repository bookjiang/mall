package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.PmsClassifyAttribute;
import com.zhiqiang.mall.bean.PmsClassifyAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface PmsClassifyAttributeMapper extends Mapper<PmsClassifyAttribute> {
    long countByExample(PmsClassifyAttributeExample example);

    int deleteByExample(PmsClassifyAttributeExample example);

    List<PmsClassifyAttribute> selectByExample(PmsClassifyAttributeExample example);

    int updateByExampleSelective(@Param("record") PmsClassifyAttribute record, @Param("example") PmsClassifyAttributeExample example);

    int updateByExample(@Param("record") PmsClassifyAttribute record, @Param("example") PmsClassifyAttributeExample example);
}