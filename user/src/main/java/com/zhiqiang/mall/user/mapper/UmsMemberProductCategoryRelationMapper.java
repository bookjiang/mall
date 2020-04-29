package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.UmsMemberProductCategoryRelation;
import com.zhiqiang.mall.bean.UmsMemberProductCategoryRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UmsMemberProductCategoryRelationMapper extends Mapper<UmsMemberProductCategoryRelation> {
    long countByExample(UmsMemberProductCategoryRelationExample example);

    int deleteByExample(UmsMemberProductCategoryRelationExample example);

    List<UmsMemberProductCategoryRelation> selectByExample(UmsMemberProductCategoryRelationExample example);

    int updateByExampleSelective(@Param("record") UmsMemberProductCategoryRelation record, @Param("example") UmsMemberProductCategoryRelationExample example);

    int updateByExample(@Param("record") UmsMemberProductCategoryRelation record, @Param("example") UmsMemberProductCategoryRelationExample example);
}