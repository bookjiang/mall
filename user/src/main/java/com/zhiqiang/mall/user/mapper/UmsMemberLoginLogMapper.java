package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.UmsMemberLoginLog;
import com.zhiqiang.mall.bean.UmsMemberLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UmsMemberLoginLogMapper extends Mapper<UmsMemberLoginLog> {
    long countByExample(UmsMemberLoginLogExample example);

    int deleteByExample(UmsMemberLoginLogExample example);

    List<UmsMemberLoginLog> selectByExample(UmsMemberLoginLogExample example);

    int updateByExampleSelective(@Param("record") UmsMemberLoginLog record, @Param("example") UmsMemberLoginLogExample example);

    int updateByExample(@Param("record") UmsMemberLoginLog record, @Param("example") UmsMemberLoginLogExample example);
}