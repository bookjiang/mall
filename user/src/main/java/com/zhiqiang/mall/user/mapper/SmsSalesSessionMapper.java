package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.SmsSalesSession;
import com.zhiqiang.mall.bean.SmsSalesSessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface SmsSalesSessionMapper extends Mapper<SmsSalesSession> {
    long countByExample(SmsSalesSessionExample example);

    int deleteByExample(SmsSalesSessionExample example);

    List<SmsSalesSession> selectByExample(SmsSalesSessionExample example);

    int updateByExampleSelective(@Param("record") SmsSalesSession record, @Param("example") SmsSalesSessionExample example);

    int updateByExample(@Param("record") SmsSalesSession record, @Param("example") SmsSalesSessionExample example);
}