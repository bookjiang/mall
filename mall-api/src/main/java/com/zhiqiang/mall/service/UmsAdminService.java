package com.zhiqiang.mall.service;

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

    List<UmsAdmin> list(String keyword, Integer pageSize, Integer pageNum);
}
