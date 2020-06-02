package com.zhiqiang.mall.product.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import com.zhiqiang.mall.bean.PmsSkuStock;
import com.zhiqiang.mall.bean.PmsSkuStockExample;
import com.zhiqiang.mall.model.PmsSku;
import com.zhiqiang.mall.service.PmsSkuService;

import com.zhiqiang.mall.user.mapper.PmsSkuStockMapper;
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
    private PmsSkuStockMapper pmsSkuMapper;

    @Override
    public List<PmsSkuStock> getList(Long pid, String keyword) {

        PmsSkuStockExample example = new PmsSkuStockExample();
        PmsSkuStockExample.Criteria criteria = example.createCriteria().andProductIdEqualTo(pid);
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andSkuCodeLike("%" + keyword + "%");
            //criteria.andSkuCodeLike("%" + keyword + "%");
        }
        return pmsSkuMapper.selectByExample(example);

    }
}
