package com.zhiqiang.mall.user.mapper;

import com.zhiqiang.mall.bean.UmsMemberReceiveAddress;
import com.zhiqiang.mall.bean.UmsMemberReceiveAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UmsMemberReceiveAddressMapper extends Mapper<UmsMemberReceiveAddress> {
    long countByExample(UmsMemberReceiveAddressExample example);

    int deleteByExample(UmsMemberReceiveAddressExample example);

    List<UmsMemberReceiveAddress> selectByExample(UmsMemberReceiveAddressExample example);

    int updateByExampleSelective(@Param("record") UmsMemberReceiveAddress record, @Param("example") UmsMemberReceiveAddressExample example);

    int updateByExample(@Param("record") UmsMemberReceiveAddress record, @Param("example") UmsMemberReceiveAddressExample example);
}