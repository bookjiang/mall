package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.PmsCommentReplay;
import com.zhiqiang.mall.bean.PmsCommentReplayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface PmsCommentReplayMapper extends Mapper<PmsCommentReplay> {
    long countByExample(PmsCommentReplayExample example);

    int deleteByExample(PmsCommentReplayExample example);

    List<PmsCommentReplay> selectByExample(PmsCommentReplayExample example);

    int updateByExampleSelective(@Param("record") PmsCommentReplay record, @Param("example") PmsCommentReplayExample example);

    int updateByExample(@Param("record") PmsCommentReplay record, @Param("example") PmsCommentReplayExample example);
}