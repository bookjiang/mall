package com.zhiqiang.mall.service;

import com.zhiqiang.mall.bean.SmsFlashPromotionSession;
import com.zhiqiang.mall.model.SmsFlashPromotionSessionDetail;

import java.util.List;

/**
 * @ClassName: SmsFlashPromotionSessionService限时购场次管理
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/5 0:02
 */
public interface SmsFlashPromotionSessionService {
    int create(SmsFlashPromotionSession promotionSession);

    int update(Long id, SmsFlashPromotionSession promotionSession);

    int updateStatus(Long id, Integer status);

    int delete(Long id);

    SmsFlashPromotionSession getItem(Long id);

    List<SmsFlashPromotionSession> list();

    List<SmsFlashPromotionSessionDetail> selectList(Long flashPromotionId);
}
