package com.zhiqiang.mall.service;

import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.SmsFlashPromotionProductRelation;
import com.zhiqiang.mall.model.SmsFlashPromotionProduct;

import java.util.List;

/**
 * @ClassName: SmsFlashPromotionProductRelationService
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/4 23:12
 */
public interface SmsFlashPromotionProductRelationService {
    PageInfo<SmsFlashPromotionProduct> list(Long flashPromotionId, Long flashPromotionSessionId, Integer pageSize, Integer pageNum);

    int create(List<SmsFlashPromotionProductRelation> relationList);

    int update(Long id, SmsFlashPromotionProductRelation relation);

    int delete(Long id);

    SmsFlashPromotionProductRelation getItem(Long id);
    long getCount(Long flashPromotionId,Long flashPromotionSessionId);

}
