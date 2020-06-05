package com.zhiqiang.mall.sale.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.SmsFlashPromotionProductRelation;
import com.zhiqiang.mall.bean.SmsFlashPromotionProductRelationExample;
import com.zhiqiang.mall.model.SmsFlashPromotionProduct;
import com.zhiqiang.mall.sale.dao.SmsFlashPromotionProductRelationDao;
import com.zhiqiang.mall.service.SmsFlashPromotionProductRelationService;
import com.zhiqiang.mall.user.mapper.SmsFlashPromotionProductRelationMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName: SmsFlashPromotionProductRelationServiceImpl
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/4 23:12
 */
@Service
public class SmsFlashPromotionProductRelationServiceImpl implements SmsFlashPromotionProductRelationService {
    @Autowired
    private SmsFlashPromotionProductRelationMapper relationMapper;
    @Autowired
    private SmsFlashPromotionProductRelationDao relationDao;

    @Override
    public PageInfo<SmsFlashPromotionProduct> list(Long flashPromotionId, Long flashPromotionSessionId, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        List<SmsFlashPromotionProduct> list=relationDao.getList(flashPromotionId,flashPromotionSessionId);
        PageInfo<SmsFlashPromotionProduct> pageInfo=new PageInfo<>(list);
        return pageInfo;

    }

    @Override
    public int create(List<SmsFlashPromotionProductRelation> relationList) {
        for (SmsFlashPromotionProductRelation relation : relationList) {
            relationMapper.insert(relation);
        }
        return relationList.size();
    }

    @Override
    public int update(Long id, SmsFlashPromotionProductRelation relation) {
        relation.setId(id);
        return relationMapper.updateByPrimaryKey(relation);

    }

    @Override
    public int delete(Long id) {
        return relationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public SmsFlashPromotionProductRelation getItem(Long id) {
        return relationMapper.selectByPrimaryKey(id);
    }


    @Override
    public long getCount(Long flashPromotionId, Long flashPromotionSessionId) {
        SmsFlashPromotionProductRelationExample example = new SmsFlashPromotionProductRelationExample();
        example.createCriteria()
                .andFlashPromotionIdEqualTo(flashPromotionId)
                .andFlashPromotionSessionIdEqualTo(flashPromotionSessionId);

        return relationMapper.selectCountByExample(example);

    }

}
