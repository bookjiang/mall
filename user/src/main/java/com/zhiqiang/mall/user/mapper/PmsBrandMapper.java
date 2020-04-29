package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.PmsBrand;
import com.zhiqiang.mall.bean.PmsBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface PmsBrandMapper extends Mapper<PmsBrand> {
    long countByExample(PmsBrandExample example);

    int deleteByExample(PmsBrandExample example);

    List<PmsBrand> selectByExampleWithBLOBs(PmsBrandExample example);

    List<PmsBrand> selectByExample(PmsBrandExample example);

    int updateByExampleSelective(@Param("record") PmsBrand record, @Param("example") PmsBrandExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsBrand record, @Param("example") PmsBrandExample example);

    int updateByExample(@Param("record") PmsBrand record, @Param("example") PmsBrandExample example);
}