package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.SmsCouponProductRelation;
import com.zhiqiang.mall.bean.SmsCouponProductRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface SmsCouponProductRelationMapper extends Mapper<SmsCouponProductRelation> {
    long countByExample(SmsCouponProductRelationExample example);

    int deleteByExample(SmsCouponProductRelationExample example);

    List<SmsCouponProductRelation> selectByExample(SmsCouponProductRelationExample example);

    int updateByExampleSelective(@Param("record") SmsCouponProductRelation record, @Param("example") SmsCouponProductRelationExample example);

    int updateByExample(@Param("record") SmsCouponProductRelation record, @Param("example") SmsCouponProductRelationExample example);
}