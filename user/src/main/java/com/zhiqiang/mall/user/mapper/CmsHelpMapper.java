package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.CmsHelp;
import com.zhiqiang.mall.bean.CmsHelpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CmsHelpMapper extends Mapper<CmsHelp> {
    long countByExample(CmsHelpExample example);

    int deleteByExample(CmsHelpExample example);

    List<CmsHelp> selectByExampleWithBLOBs(CmsHelpExample example);

    List<CmsHelp> selectByExample(CmsHelpExample example);

    int updateByExampleSelective(@Param("record") CmsHelp record, @Param("example") CmsHelpExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsHelp record, @Param("example") CmsHelpExample example);

    int updateByExample(@Param("record") CmsHelp record, @Param("example") CmsHelpExample example);
}