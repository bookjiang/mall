package com.zhiqiang.mall.user.service.impl;

import com.zhiqiang.mall.bean.UmsMember;
import com.zhiqiang.mall.service.UmsMemberService;
import com.zhiqiang.mall.user.mapper.UmsMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
