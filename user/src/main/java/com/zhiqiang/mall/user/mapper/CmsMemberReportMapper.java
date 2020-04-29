package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.CmsMemberReport;
import com.zhiqiang.mall.bean.CmsMemberReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CmsMemberReportMapper extends Mapper<CmsMemberReport> {
    long countByExample(CmsMemberReportExample example);

    int deleteByExample(CmsMemberReportExample example);

    List<CmsMemberReport> selectByExampleWithBLOBs(CmsMemberReportExample example);

    List<CmsMemberReport> selectByExample(CmsMemberReportExample example);

    int updateByExampleSelective(@Param("record") CmsMemberReport record, @Param("example") CmsMemberReportExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsMemberReport record, @Param("example") CmsMemberReportExample example);

    int updateByExample(@Param("record") CmsMemberReport record, @Param("example") CmsMemberReportExample example);
}