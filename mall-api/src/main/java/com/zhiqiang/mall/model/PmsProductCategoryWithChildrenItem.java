package com.zhiqiang.mall.model;

import com.zhiqiang.mall.bean.PmsProductCategory;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName: PmsProductCategoryWithChildrenItem
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/2 18:34
 */
public class PmsProductCategoryWithChildrenItem extends PmsProductCategory {
//    public PmsProductCategoryWithChildrenItem(Long id, Long parentId, String name, Integer level, Integer productCount, String productUnit, Integer navStatus, Integer showStatus,Integer sort, String icon,String keywords, String description) {
//        super(id, parentId, name, level, productCount, productUnit, navStatus, showStatus, sort,icon, keywords,description);
//    }
    public PmsProductCategoryWithChildrenItem(Long id, Long parentId, String name, Integer level, Integer productCount, String productUnit, Integer navStatus, Integer showStatus,Integer sort, String icon,String keywords) {
        super(id, parentId, name, level, productCount, productUnit, navStatus, showStatus, sort,icon, keywords,"null");
    }
    private List<PmsProductCategory> children;

    public List<PmsProductCategory> getChildren() {
        return children;
    }

    public void setChildren(List<PmsProductCategory> children) {
        this.children = children;
    }

}
