package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.CmsHelpClassify;
import com.zhiqiang.mall.bean.CmsHelpClassifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CmsHelpClassifyMapper extends Mapper<CmsHelpClassify> {
    long countByExample(CmsHelpClassifyExample example);

    int deleteByExample(CmsHelpClassifyExample example);

    List<CmsHelpClassify> selectByExample(CmsHelpClassifyExample example);

    int updateByExampleSelective(@Param("record") CmsHelpClassify record, @Param("example") CmsHelpClassifyExample example);

    int updateByExample(@Param("record") CmsHelpClassify record, @Param("example") CmsHelpClassifyExample example);
}