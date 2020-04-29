package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.PmsProduct;
import com.zhiqiang.mall.bean.PmsProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface PmsProductMapper extends Mapper<PmsProduct> {
    long countByExample(PmsProductExample example);

    int deleteByExample(PmsProductExample example);

    List<PmsProduct> selectByExampleWithBLOBs(PmsProductExample example);

    List<PmsProduct> selectByExample(PmsProductExample example);

    int updateByExampleSelective(@Param("record") PmsProduct record, @Param("example") PmsProductExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsProduct record, @Param("example") PmsProductExample example);

    int updateByExample(@Param("record") PmsProduct record, @Param("example") PmsProductExample example);
}