package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.PmsClassifyAttributeRelation;
import com.zhiqiang.mall.bean.PmsClassifyAttributeRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface PmsClassifyAttributeRelationMapper extends Mapper<PmsClassifyAttributeRelation> {
    long countByExample(PmsClassifyAttributeRelationExample example);

    int deleteByExample(PmsClassifyAttributeRelationExample example);

    List<PmsClassifyAttributeRelation> selectByExample(PmsClassifyAttributeRelationExample example);

    int updateByExampleSelective(@Param("record") PmsClassifyAttributeRelation record, @Param("example") PmsClassifyAttributeRelationExample example);

    int updateByExample(@Param("record") PmsClassifyAttributeRelation record, @Param("example") PmsClassifyAttributeRelationExample example);
}