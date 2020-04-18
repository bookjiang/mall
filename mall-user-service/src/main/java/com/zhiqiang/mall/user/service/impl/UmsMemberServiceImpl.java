package com.zhiqiang.mall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.zhiqiang.mall.bean.UmsMember;
import com.zhiqiang.mall.service.UmsMemberService;
import com.zhiqiang.mall.user.mapper.UmsMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;



import java.util.List;
@Service
public class UmsMemberServiceImpl  implements UmsMemberService {

    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Override
    public List<UmsMember> getAllUser() {
        return umsMemberMapper.selectAll();
    }
}
