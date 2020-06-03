package com.zhiqiang.mall.product.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.zhiqiang.mall.bean.PmsProduct;
import com.zhiqiang.mall.bean.PmsProductAttribute;
import com.zhiqiang.mall.bean.PmsProductAttributeCategory;
import com.zhiqiang.mall.bean.PmsProductAttributeExample;
import com.zhiqiang.mall.model.PmsProductAttributeParam;
import com.zhiqiang.mall.model.ProductAttrInfo;
import com.zhiqiang.mall.product.Dao.PmsProductAttributeDao;
import com.zhiqiang.mall.service.PmsProductAttributeService;

import com.zhiqiang.mall.user.mapper.PmsProductAttributeCategoryMapper;
import com.zhiqiang.mall.user.mapper.PmsProductAttributeMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName: PmsProductAttributeServiceImpl
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/29 13:09
 */
@Service
public class PmsProductAttributeServiceImpl implements PmsProductAttributeService {
    @Autowired
   private PmsProductAttributeMapper pmsAttributeMapper;
    @Autowired
    private PmsProductAttributeDao productAttributeDao;
    @Autowired
    private PmsProductAttributeCategoryMapper pmsProductAttributeCategoryMapper;
    @Override
    public PageInfo<PmsProductAttribute> getList(Long cid, Integer type, Integer pageSize, Integer pageNum) {


        PageHelper.startPage(pageNum, pageSize);
        PmsProductAttributeExample example = new PmsProductAttributeExample();
        //example.setOrderByClause("sort desc");
        //example.createCriteria().andClassifyAttributeIdEqualTo(cid);
        example.createCriteria().andProductAttributeCategoryIdEqualTo(cid).andTypeEqualTo(type);
        List<PmsProductAttribute> list=pmsAttributeMapper.selectByExample(example);
        PageInfo<PmsProductAttribute> pageInfo = new PageInfo<PmsProductAttribute>(list);
        return pageInfo;
    }

    @Override
    public List<ProductAttrInfo> getProductAttrInfo(Long productCategoryId) {
        return productAttributeDao.getProductAttrInfo(productCategoryId);
    }

    @Override
    public PmsProductAttribute getItem(Long id) {
        return pmsAttributeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Long id, PmsProductAttributeParam productAttributeParam) {
        PmsProductAttribute pmsProductAttribute = new PmsProductAttribute();
        pmsProductAttribute.setId(id);
        BeanUtils.copyProperties(productAttributeParam, pmsProductAttribute);
        return pmsAttributeMapper.updateByPrimaryKeySelective(pmsProductAttribute);

    }

    @Override
    public int create(PmsProductAttributeParam productAttributeParam) {
        PmsProductAttribute pmsProductAttribute = new PmsProductAttribute();
        BeanUtils.copyProperties(productAttributeParam, pmsProductAttribute);
        int count = pmsAttributeMapper.insertSelective(pmsProductAttribute);
        //新增商品属性以后需要更新商品属性分类数量
        PmsProductAttributeCategory pmsProductAttributeCategory = pmsProductAttributeCategoryMapper.selectByPrimaryKey(pmsProductAttribute.getProductAttributeCategoryId());
        if(pmsProductAttribute.getType()==0){//表示规格
            pmsProductAttributeCategory.setAttributeCount(pmsProductAttributeCategory.getAttributeCount()+1);
        }else if(pmsProductAttribute.getType()==1){
            pmsProductAttributeCategory.setParamCount(pmsProductAttributeCategory.getParamCount()+1);
        }
        pmsProductAttributeCategoryMapper.updateByPrimaryKey(pmsProductAttributeCategory);
        return count;
    }

    @Override
    public int delete(List<Long> ids) {
        //获取分类
        PmsProductAttribute pmsProductAttribute = pmsAttributeMapper.selectByPrimaryKey(ids.get(0));
        Integer type = pmsProductAttribute.getType();
        PmsProductAttributeCategory pmsProductAttributeCategory = pmsProductAttributeCategoryMapper.selectByPrimaryKey(pmsProductAttribute.getProductAttributeCategoryId());
        PmsProductAttributeExample example = new PmsProductAttributeExample();
        example.createCriteria().andIdIn(ids);
        int count = pmsAttributeMapper.deleteByExample(example);
        //删除完成后修改数量
        if(type==0){
            if(pmsProductAttributeCategory.getAttributeCount()>=count){
                pmsProductAttributeCategory.setAttributeCount(pmsProductAttributeCategory.getAttributeCount()-count);
            }else{
                pmsProductAttributeCategory.setAttributeCount(0);
            }
        }else if(type==1){
            if(pmsProductAttributeCategory.getParamCount()>=count){
                pmsProductAttributeCategory.setParamCount(pmsProductAttributeCategory.getParamCount()-count);
            }else{
                pmsProductAttributeCategory.setParamCount(0);
            }
        }
        pmsProductAttributeCategoryMapper.updateByPrimaryKey(pmsProductAttributeCategory);
        return count;
    }
}
