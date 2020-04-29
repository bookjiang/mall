package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.PmsProductOperateLog;
import com.zhiqiang.mall.bean.PmsProductOperateLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface PmsProductOperateLogMapper extends Mapper<PmsProductOperateLog> {
    long countByExample(PmsProductOperateLogExample example);

    int deleteByExample(PmsProductOperateLogExample example);

    List<PmsProductOperateLog> selectByExample(PmsProductOperateLogExample example);

    int updateByExampleSelective(@Param("record") PmsProductOperateLog record, @Param("example") PmsProductOperateLogExample example);

    int updateByExample(@Param("record") PmsProductOperateLog record, @Param("example") PmsProductOperateLogExample example);
}