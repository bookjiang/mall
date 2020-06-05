package com.zhiqiang.mall.sale.dao;

import com.zhiqiang.mall.model.SmsFlashPromotionProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName: SmsFlashPromotionProductRelationDao
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/4 23:26
 */
public interface SmsFlashPromotionProductRelationDao {
    List<SmsFlashPromotionProduct> getList(@Param("flashPromotionId") Long flashPromotionId, @Param("flashPromotionSessionId") Long flashPromotionSessionId);
}
