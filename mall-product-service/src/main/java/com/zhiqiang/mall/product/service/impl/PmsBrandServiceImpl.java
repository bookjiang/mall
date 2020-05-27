package com.zhiqiang.mall.product.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.PmsBrand;
import com.zhiqiang.mall.bean.PmsBrandExample;
import com.zhiqiang.mall.bean.UmsAdmin;
import com.zhiqiang.mall.service.PmsBrandService;
import com.zhiqiang.mall.user.mapper.PmsBrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @ClassName: PmsBrandServiceImpl
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/2 17:59
 */
@Service
public class PmsBrandServiceImpl implements PmsBrandService {

    @Autowired
    PmsBrandMapper pmsBrandMapper;

    @Override
    public PageInfo<PmsBrand> listBrand(String keyword, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        PmsBrandExample pmsBrandExample = new PmsBrandExample();
        //pmsBrandExample.setOrderByClause("sort desc");
        PmsBrandExample.Criteria criteria = pmsBrandExample.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andNameLike("%" + keyword + "%");
        }
        List<PmsBrand> list= pmsBrandMapper.selectByExample(pmsBrandExample);
        PageInfo<PmsBrand> pageInfo = new PageInfo<PmsBrand>(list);
        return pageInfo;
    }
}
