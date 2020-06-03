package com.zhiqiang.mall.product.Dao;

import com.zhiqiang.mall.bean.PmsMemberPrice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName: PmsMemberPriceDao
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/2 20:16
 */
public interface PmsMemberPriceDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsMemberPrice> memberPriceList);
}
