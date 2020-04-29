package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.SmsSalesProductRelation;
import com.zhiqiang.mall.bean.SmsSalesProductRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface SmsSalesProductRelationMapper extends Mapper<SmsSalesProductRelation> {
    long countByExample(SmsSalesProductRelationExample example);

    int deleteByExample(SmsSalesProductRelationExample example);

    List<SmsSalesProductRelation> selectByExample(SmsSalesProductRelationExample example);

    int updateByExampleSelective(@Param("record") SmsSalesProductRelation record, @Param("example") SmsSalesProductRelationExample example);

    int updateByExample(@Param("record") SmsSalesProductRelation record, @Param("example") SmsSalesProductRelationExample example);
}