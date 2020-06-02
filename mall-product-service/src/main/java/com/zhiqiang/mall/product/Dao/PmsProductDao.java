package com.zhiqiang.mall.product.Dao;

import com.zhiqiang.mall.model.PmsProductResult;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: ProductDao
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/1 22:19
 */
public interface PmsProductDao {
    PmsProductResult getUpdateInfo(@Param("id") Long id);
}
