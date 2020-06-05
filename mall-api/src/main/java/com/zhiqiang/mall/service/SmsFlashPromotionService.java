package com.zhiqiang.mall.service;

import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.SmsFlashPromotion;

/**
 * @ClassName: SmsFlashPromotionService限时购活动管理
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/4 23:00
 */
public interface SmsFlashPromotionService {

    int create(SmsFlashPromotion flashPromotion);

    int update(Long id, SmsFlashPromotion flashPromotion);

    int delete(Long id);

    int updateStatus(Long id, Integer status);

    SmsFlashPromotion getItem(Long id);

    PageInfo<SmsFlashPromotion> list(String keyword, Integer pageSize, Integer pageNum);
}
