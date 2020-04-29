package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.PmsSku;
import com.zhiqiang.mall.bean.PmsSkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface PmsSkuMapper extends Mapper<PmsSku> {
    long countByExample(PmsSkuExample example);

    int deleteByExample(PmsSkuExample example);

    List<PmsSku> selectByExample(PmsSkuExample example);

    int updateByExampleSelective(@Param("record") PmsSku record, @Param("example") PmsSkuExample example);

    int updateByExample(@Param("record") PmsSku record, @Param("example") PmsSkuExample example);
}