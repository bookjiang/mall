package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.PmsFreightTemplate;
import com.zhiqiang.mall.bean.PmsFreightTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface PmsFreightTemplateMapper extends Mapper<PmsFreightTemplate> {
    long countByExample(PmsFreightTemplateExample example);

    int deleteByExample(PmsFreightTemplateExample example);

    List<PmsFreightTemplate> selectByExample(PmsFreightTemplateExample example);

    int updateByExampleSelective(@Param("record") PmsFreightTemplate record, @Param("example") PmsFreightTemplateExample example);

    int updateByExample(@Param("record") PmsFreightTemplate record, @Param("example") PmsFreightTemplateExample example);
}