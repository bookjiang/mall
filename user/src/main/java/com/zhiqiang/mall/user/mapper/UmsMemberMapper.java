package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.UmsMember;
import com.zhiqiang.mall.bean.UmsMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UmsMemberMapper extends Mapper<UmsMember> {
    long countByExample(UmsMemberExample example);

    int deleteByExample(UmsMemberExample example);

    List<UmsMember> selectByExample(UmsMemberExample example);

    int updateByExampleSelective(@Param("record") UmsMember record, @Param("example") UmsMemberExample example);

    int updateByExample(@Param("record") UmsMember record, @Param("example") UmsMemberExample example);
}