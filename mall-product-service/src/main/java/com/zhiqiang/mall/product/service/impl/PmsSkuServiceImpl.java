package com.zhiqiang.mall.product.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhiqiang.mall.bean.PmsSku;
import com.zhiqiang.mall.bean.PmsSkuExample;
import com.zhiqiang.mall.service.PmsSkuService;
import com.zhiqiang.mall.user.mapper.PmsSkuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @ClassName: PmsSkuServiceImpl
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/21 10:32
 */
@Service
public class PmsSkuServiceImpl implements PmsSkuService {
    @Autowired
    private PmsSkuMapper pmsSkuMapper;

    @Override
    public List<PmsSku> getList(Long pid, String keyword) {

        PmsSkuExample example = new PmsSkuExample();
        PmsSkuExample.Criteria criteria = example.createCriteria().andProductIdEqualTo(pid);
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andSkuSnLike("%" + keyword + "%");
            //criteria.andSkuCodeLike("%" + keyword + "%");
        }
        return pmsSkuMapper.selectByExample(example);

    }
}
