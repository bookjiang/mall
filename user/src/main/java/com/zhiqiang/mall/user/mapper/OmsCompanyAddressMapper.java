package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.OmsCompanyAddress;
import com.zhiqiang.mall.bean.OmsCompanyAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface OmsCompanyAddressMapper extends Mapper<OmsCompanyAddress> {
    long countByExample(OmsCompanyAddressExample example);

    int deleteByExample(OmsCompanyAddressExample example);

    List<OmsCompanyAddress> selectByExample(OmsCompanyAddressExample example);

    int updateByExampleSelective(@Param("record") OmsCompanyAddress record, @Param("example") OmsCompanyAddressExample example);

    int updateByExample(@Param("record") OmsCompanyAddress record, @Param("example") OmsCompanyAddressExample example);
}