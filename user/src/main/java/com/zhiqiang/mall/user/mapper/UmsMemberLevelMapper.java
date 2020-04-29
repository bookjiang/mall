package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.UmsMemberLevel;
import com.zhiqiang.mall.bean.UmsMemberLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UmsMemberLevelMapper extends Mapper<UmsMemberLevel> {
    long countByExample(UmsMemberLevelExample example);

    int deleteByExample(UmsMemberLevelExample example);

    List<UmsMemberLevel> selectByExample(UmsMemberLevelExample example);

    int updateByExampleSelective(@Param("record") UmsMemberLevel record, @Param("example") UmsMemberLevelExample example);

    int updateByExample(@Param("record") UmsMemberLevel record, @Param("example") UmsMemberLevelExample example);
}