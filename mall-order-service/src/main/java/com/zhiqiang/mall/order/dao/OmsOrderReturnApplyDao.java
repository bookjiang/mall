package com.zhiqiang.mall.order.dao;

import com.zhiqiang.mall.bean.OmsOrderReturnApply;
import com.zhiqiang.mall.model.OmsOrderReturnApplyResult;
import com.zhiqiang.mall.model.OmsReturnApplyQueryParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName: OmsOrderReturnApplyDao
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/4 9:31
 */
public interface OmsOrderReturnApplyDao {
    /**
     * 查询申请列表
     */
    List<OmsOrderReturnApply> getList(@Param("queryParam") OmsReturnApplyQueryParam queryParam);

    /**
     * 获取申请详情
     */
    OmsOrderReturnApplyResult getDetail(@Param("id")Long id);


}
