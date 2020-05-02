package com.zhiqiang.mall.service;

import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.UmsAdmin;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


/**
 * @ClassName: UmsAdminService
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/4/21 22:28
 */

public interface UmsAdminService {
        int register(UmsAdmin umsAdmin);

        String login(String username, String password, Map tokenMap);

    UmsAdmin getAdminByUsername(String username);

    String refreshToken(String token);

    UmsAdmin getItem(Long id);

    PageInfo<UmsAdmin> list(String keyword, Integer pageSize, Integer pageNum);

    int update(Long id, UmsAdmin admin);

    int delete(Long id);

    int updateByUserName(UmsAdmin umsAdmin);
}
