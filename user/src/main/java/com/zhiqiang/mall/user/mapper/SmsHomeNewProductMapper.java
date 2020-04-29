package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.SmsHomeNewProduct;
import com.zhiqiang.mall.bean.SmsHomeNewProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface SmsHomeNewProductMapper extends Mapper<SmsHomeNewProduct> {
    long countByExample(SmsHomeNewProductExample example);

    int deleteByExample(SmsHomeNewProductExample example);

    List<SmsHomeNewProduct> selectByExample(SmsHomeNewProductExample example);

    int updateByExampleSelective(@Param("record") SmsHomeNewProduct record, @Param("example") SmsHomeNewProductExample example);

    int updateByExample(@Param("record") SmsHomeNewProduct record, @Param("example") SmsHomeNewProductExample example);
}