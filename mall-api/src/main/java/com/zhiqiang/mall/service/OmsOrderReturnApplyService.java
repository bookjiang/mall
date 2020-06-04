package com.zhiqiang.mall.service;


import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.OmsOrderReturnApply;
import com.zhiqiang.mall.model.OmsOrderReturnApplyResult;
import com.zhiqiang.mall.model.OmsReturnApplyQueryParam;
import com.zhiqiang.mall.model.OmsUpdateStatusParam;

import java.util.List;

/**
 * @ClassName: OmsOrderReturnApplyService退货申请管理
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/6/3 23:13
 */

public interface OmsOrderReturnApplyService {
    PageInfo<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum);

    int delete(List<Long> ids);

    int updateStatus(Long id, OmsUpdateStatusParam statusParam);

    OmsOrderReturnApplyResult getItem(Long id);
}
