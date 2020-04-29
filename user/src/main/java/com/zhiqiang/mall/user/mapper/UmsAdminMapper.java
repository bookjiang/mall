package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.UmsAdmin;
import com.zhiqiang.mall.bean.UmsAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UmsAdminMapper extends Mapper<UmsAdmin> {
    long countByExample(UmsAdminExample example);

    int deleteByExample(UmsAdminExample example);

    List<UmsAdmin> selectByExample(UmsAdminExample example);

    int updateByExampleSelective(@Param("record") UmsAdmin record, @Param("example") UmsAdminExample example);

    int updateByExample(@Param("record") UmsAdmin record, @Param("example") UmsAdminExample example);
}