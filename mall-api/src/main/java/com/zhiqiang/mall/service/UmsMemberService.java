package com.zhiqiang.mall.service;

import com.zhiqiang.mall.bean.UmsMember;

import javax.xml.ws.ServiceMode;
import java.util.List;

public interface UmsMemberService {

    List<UmsMember> getAllUser();
}
