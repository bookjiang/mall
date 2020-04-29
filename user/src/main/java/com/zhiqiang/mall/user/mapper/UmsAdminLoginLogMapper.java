package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.UmsAdminLoginLog;
import com.zhiqiang.mall.bean.UmsAdminLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UmsAdminLoginLogMapper extends Mapper<UmsAdminLoginLog> {
    long countByExample(UmsAdminLoginLogExample example);

    int deleteByExample(UmsAdminLoginLogExample example);

    List<UmsAdminLoginLog> selectByExample(UmsAdminLoginLogExample example);

    int updateByExampleSelective(@Param("record") UmsAdminLoginLog record, @Param("example") UmsAdminLoginLogExample example);

    int updateByExample(@Param("record") UmsAdminLoginLog record, @Param("example") UmsAdminLoginLogExample example);
}