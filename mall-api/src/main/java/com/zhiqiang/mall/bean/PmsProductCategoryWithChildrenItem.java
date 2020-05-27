package com.zhiqiang.mall.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName: PmsProductCategoryWithChildrenItem
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/2 18:34
 */
public class PmsProductCategoryWithChildrenItem extends PmsProductClassify  {
    public PmsProductCategoryWithChildrenItem(Long id, Long parentId, String name, Integer level, Integer productCount, String productUnit, Integer navStatus, Integer showStatus, String icon, String description) {
        super(id, parentId, name, level, productCount, productUnit, navStatus, showStatus, icon, description);
    }

    private List<PmsProductClassify> children;

    public List<PmsProductClassify> getChildren() {
        return children;
    }

    public void setChildren(List<PmsProductClassify> children) {
        this.children = children;
    }

}
