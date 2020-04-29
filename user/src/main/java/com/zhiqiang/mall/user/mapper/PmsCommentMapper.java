package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.PmsComment;
import com.zhiqiang.mall.bean.PmsCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface PmsCommentMapper extends Mapper<PmsComment> {
    long countByExample(PmsCommentExample example);

    int deleteByExample(PmsCommentExample example);

    List<PmsComment> selectByExampleWithBLOBs(PmsCommentExample example);

    List<PmsComment> selectByExample(PmsCommentExample example);

    int updateByExampleSelective(@Param("record") PmsComment record, @Param("example") PmsCommentExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsComment record, @Param("example") PmsCommentExample example);

    int updateByExample(@Param("record") PmsComment record, @Param("example") PmsCommentExample example);
}