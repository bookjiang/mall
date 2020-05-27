package com.zhiqiang.mall.service;

import com.zhiqiang.mall.bean.UmsMemberLevel;

import java.util.List;

/**
 * @ClassName: UmsMemberLevelService会员等级管理Service
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/3 11:11
 */

public interface UmsMemberLevelService {

    List<UmsMemberLevel> list(Integer defaultStatus);
}
