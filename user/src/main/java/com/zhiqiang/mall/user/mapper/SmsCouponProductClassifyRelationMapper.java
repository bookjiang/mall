package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.SmsCouponProductClassifyRelation;
import com.zhiqiang.mall.bean.SmsCouponProductClassifyRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface SmsCouponProductClassifyRelationMapper extends Mapper<SmsCouponProductClassifyRelation> {
    long countByExample(SmsCouponProductClassifyRelationExample example);

    int deleteByExample(SmsCouponProductClassifyRelationExample example);

    List<SmsCouponProductClassifyRelation> selectByExample(SmsCouponProductClassifyRelationExample example);

    int updateByExampleSelective(@Param("record") SmsCouponProductClassifyRelation record, @Param("example") SmsCouponProductClassifyRelationExample example);

    int updateByExample(@Param("record") SmsCouponProductClassifyRelation record, @Param("example") SmsCouponProductClassifyRelationExample example);
}