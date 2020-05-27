package com.zhiqiang.mall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhiqiang.mall.bean.UmsMemberLevel;
import com.zhiqiang.mall.bean.UmsMemberLevelExample;
import com.zhiqiang.mall.service.UmsMemberLevelService;
import com.zhiqiang.mall.user.mapper.UmsMemberLevelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName: UmsMemberLevelService
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/3 11:13
 */
@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService {
    @Autowired
    private UmsMemberLevelMapper memberLevelMapper;
    @Override
    public List<UmsMemberLevel> list(Integer defaultStatus) {
        UmsMemberLevelExample example = new UmsMemberLevelExample();
        example.createCriteria().andDefaultStatusEqualTo(defaultStatus);
        return memberLevelMapper.selectByExample(example);
    }
}
