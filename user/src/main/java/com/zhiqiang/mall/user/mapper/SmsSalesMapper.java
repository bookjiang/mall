package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.SmsSales;
import com.zhiqiang.mall.bean.SmsSalesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface SmsSalesMapper extends Mapper<SmsSales> {
    long countByExample(SmsSalesExample example);

    int deleteByExample(SmsSalesExample example);

    List<SmsSales> selectByExample(SmsSalesExample example);

    int updateByExampleSelective(@Param("record") SmsSales record, @Param("example") SmsSalesExample example);

    int updateByExample(@Param("record") SmsSales record, @Param("example") SmsSalesExample example);
}