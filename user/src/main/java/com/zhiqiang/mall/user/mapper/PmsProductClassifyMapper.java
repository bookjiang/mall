package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.PmsProductClassify;
import com.zhiqiang.mall.bean.PmsProductClassifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface PmsProductClassifyMapper extends Mapper<PmsProductClassify> {
    long countByExample(PmsProductClassifyExample example);

    int deleteByExample(PmsProductClassifyExample example);

    List<PmsProductClassify> selectByExampleWithBLOBs(PmsProductClassifyExample example);

    List<PmsProductClassify> selectByExample(PmsProductClassifyExample example);

    int updateByExampleSelective(@Param("record") PmsProductClassify record, @Param("example") PmsProductClassifyExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsProductClassify record, @Param("example") PmsProductClassifyExample example);

    int updateByExample(@Param("record") PmsProductClassify record, @Param("example") PmsProductClassifyExample example);
}