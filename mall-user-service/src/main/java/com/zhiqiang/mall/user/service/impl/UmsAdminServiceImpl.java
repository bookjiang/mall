package com.zhiqiang.mall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhiqiang.mall.bean.UmsAdmin;
import com.zhiqiang.mall.service.UmsAdminService;
import com.zhiqiang.mall.user.mapper.UmsAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

/**
 * @ClassName: UmsAdminServiceImpl
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/4/21 23:38
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {
    @Autowired
    UmsAdminMapper umsAdminMapper;
@Autowired
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


    @Override
    public int register(UmsAdmin umsAdmin) {
        UmsAdmin umsAdmin1 = null;
        //System.out.println(umsAdmin.toString());
        umsAdmin1.setUsername(umsAdmin.getUsername());
        List<UmsAdmin> umsAdmins=umsAdminMapper.select(umsAdmin1);
        if(umsAdmins.size()>0)
        {
            return 1;
        }
        //将密码加密
        String encodePassword=passwordEncoder.encode(umsAdmin.getPassword());
        umsAdmin.setPassword(encodePassword);
        umsAdminMapper.insert(umsAdmin);
        return 2;//成功插入


    }
}
