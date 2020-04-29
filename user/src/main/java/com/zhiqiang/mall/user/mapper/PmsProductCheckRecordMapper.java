package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.PmsProductCheckRecord;
import com.zhiqiang.mall.bean.PmsProductCheckRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface PmsProductCheckRecordMapper extends Mapper<PmsProductCheckRecord> {
    long countByExample(PmsProductCheckRecordExample example);

    int deleteByExample(PmsProductCheckRecordExample example);

    List<PmsProductCheckRecord> selectByExample(PmsProductCheckRecordExample example);

    int updateByExampleSelective(@Param("record") PmsProductCheckRecord record, @Param("example") PmsProductCheckRecordExample example);

    int updateByExample(@Param("record") PmsProductCheckRecord record, @Param("example") PmsProductCheckRecordExample example);
}