package com.zhiqiang.mall.product.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.PmsProduct;
import com.zhiqiang.mall.bean.PmsProductExample;

import com.zhiqiang.mall.bean.PmsSkuStock;
import com.zhiqiang.mall.bean.UmsAdmin;
import com.zhiqiang.mall.model.PmsProductParam;
import com.zhiqiang.mall.model.PmsProductResult;
import com.zhiqiang.mall.model.ProductQueryParams;
import com.zhiqiang.mall.product.Dao.*;
import com.zhiqiang.mall.service.PmsProductService;
import com.zhiqiang.mall.user.mapper.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: PmsProductServiceImpl
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/5/1 22:09
 */
@Service
public class PmsProductServiceImpl implements PmsProductService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PmsProductServiceImpl.class);
    @Autowired
    PmsProductMapper pmsProductMapper;
    @Autowired
    PmsProductDao productDao;
    @Autowired
    PmsMemberPriceDao memberPriceDao;

    @Autowired
    private PmsMemberPriceMapper memberPriceMapper;
    @Autowired
    private PmsProductLadderDao productLadderDao;
    @Autowired
    private PmsProductLadderMapper productLadderMapper;
    @Autowired
    private PmsProductFullReductionDao productFullReductionDao;
    @Autowired
    private PmsProductFullReductionMapper productFullReductionMapper;
    @Autowired
    private PmsSkuStockDao skuStockDao;
    @Autowired
    private PmsSkuStockMapper skuStockMapper;
    @Autowired
    private PmsProductAttributeValueDao productAttributeValueDao;
    @Autowired
    private PmsProductAttributeValueMapper productAttributeValueMapper;
   // @Autowired
   // private CmsSubjectProductRelationDao subjectProductRelationDao;
   /// @Autowired
  //  private CmsSubjectProductRelationMapper subjectProductRelationMapper;
  //  @Autowired
   // private CmsPrefrenceAreaProductRelationDao prefrenceAreaProductRelationDao;
   // @Autowired
    //private CmsPrefrenceAreaProductRelationMapper prefrenceAreaProductRelationMapper;
    @Autowired
    private PmsProductVertifyRecordDao productVertifyRecordDao;



    @Override
    public PageInfo<PmsProduct> listAll(ProductQueryParams productQueryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        PmsProductExample pmsProductExample = new PmsProductExample();
        PmsProductExample.Criteria criteria = pmsProductExample.createCriteria();
        criteria.andDeleteStatusEqualTo(0);
        if (productQueryParam.getPublishStatus() != null) {
            criteria.andPublishStatusEqualTo(productQueryParam.getPublishStatus());
        }
        if (productQueryParam.getVerifyStatus() != null) {
            //criteria.andCheckStatusEqualTo((productQueryParam.getVerifyStatus()));
            criteria.andVerifyStatusEqualTo((productQueryParam.getVerifyStatus()));

        }
        if (!StringUtils.isEmpty(productQueryParam.getKeyword())) {
            //System.out.println(productQueryParam.getKeyword());
            criteria.andNameLike("%" + productQueryParam.getKeyword() + "%");
        }
        if (!StringUtils.isEmpty(productQueryParam.getProductSn())) {
            criteria.andProductSnEqualTo(productQueryParam.getProductSn());
        }
        if (productQueryParam.getBrandId() != null) {
            criteria.andBrandIdEqualTo(productQueryParam.getBrandId());
        }
        if (productQueryParam.getProductCategoryId() != null) {
            //criteria.andProductClassifyIdEqualTo(productQueryParam.getProductCategoryId());
            //criteria.andProductClassifyIdEqualTo(productQueryParam.getProductCategoryId());
            criteria.andProductCategoryIdEqualTo(productQueryParam.getProductCategoryId());

        }
        List<PmsProduct> list=pmsProductMapper.selectByExample(pmsProductExample);
        System.out.println(list.size());
        //开始调试只有俩个数据是因为deletestatus为0表示未删除，而自动生成的测试数据只有俩个为0；
//        for (int i=0;i<pmsProductExample.getOredCriteria().size();i++)
//        { System.out.println(pmsProductExample.getOredCriteria().get(i).toString());}
        PageInfo<PmsProduct> pageInfo = new PageInfo<PmsProduct>(list);
        return pageInfo;

    }

    @Override
    public List<PmsProduct> list(String keyword) {
        PmsProductExample productExample = new PmsProductExample();
        PmsProductExample.Criteria criteria = productExample.createCriteria();
        criteria.andDeleteStatusEqualTo(0);
        if(!StringUtils.isEmpty(keyword)){
            criteria.andNameLike("%" + keyword + "%");
            productExample.or().andDeleteStatusEqualTo(0).andProductSnLike("%" + keyword + "%");
        }
        return pmsProductMapper.selectByExample(productExample);
    }

    @Override
    public int updatePublishStatus(List<Long> ids, Integer publishStatus) {
        PmsProduct record = new PmsProduct();
        record.setPublishStatus(publishStatus);
        PmsProductExample example = new PmsProductExample();
        //example.createCriteria().andProductIdIn(ids);
        example.createCriteria().andIdIn(ids);
        return pmsProductMapper.updateByExampleSelective(record, example);


    }

    @Override
    public int updateRecommendStatus(List<Long> ids, Integer recommendStatus) {
        PmsProduct record = new PmsProduct();
        record.setRecommandStatus(recommendStatus);
        PmsProductExample example = new PmsProductExample();
       // example.createCriteria().andProductIdIn(ids);
        example.createCriteria().andIdIn(ids);
        return pmsProductMapper.updateByExampleSelective(record, example);

    }

    @Override
    public int updateNewStatus(List<Long> ids, Integer newStatus) {
        PmsProduct record = new PmsProduct();
        record.setNewStatus(newStatus);
        PmsProductExample example = new PmsProductExample();
        //example.createCriteria().andProductIdIn(ids);
        example.createCriteria().andIdIn(ids);
        return pmsProductMapper.updateByExampleSelective(record, example);

    }

    @Override
    public int updateDeleteStatus(List<Long> ids, Integer deleteStatus) {
        PmsProduct record = new PmsProduct();
        record.setDeleteStatus(deleteStatus);
        PmsProductExample example = new PmsProductExample();
        //example.createCriteria().andProductIdIn(ids);
        //example.createCriteria().andIdIn(ids);
        example.createCriteria().andIdIn(ids);
        return pmsProductMapper.updateByExampleSelective(record, example);
    }

    @Override
    public PmsProductResult getUpdateInfo(Long id) {
        return productDao.getUpdateInfo(id);
    }

    @Override
    public int create(PmsProductParam productParam) {
        int count;
        //创建商品
        PmsProduct product = productParam;
        product.setId(null);
        pmsProductMapper.insertSelective(product);
        //根据促销类型设置价格：会员价格、阶梯价格、满减价格
        Long productId = product.getId();
        //会员价格
        System.out.println("1");
        relateAndInsertList(memberPriceDao, productParam.getMemberPriceList(), productId);
        //阶梯价格
        System.out.println("2");
        relateAndInsertList(productLadderDao, productParam.getProductLadderList(), productId);
        //满减价格
        System.out.println("3");
        relateAndInsertList(productFullReductionDao, productParam.getProductFullReductionList(), productId);
        //处理sku的编码
        System.out.println("4");
        handleSkuStockCode(productParam.getSkuStockList(),productId);
        //添加sku库存信息
        System.out.println("5");
        relateAndInsertList(skuStockDao, productParam.getSkuStockList(), productId);
        //添加商品参数,添加自定义商品规格
        System.out.println("6");
        relateAndInsertList(productAttributeValueDao, productParam.getProductAttributeValueList(), productId);
        //关联专题
        //relateAndInsertList(subjectProductRelationDao, productParam.getSubjectProductRelationList(), productId);
        //关联优选
        //relateAndInsertList(prefrenceAreaProductRelationDao, productParam.getPrefrenceAreaProductRelationList(), productId);
        count = 1;
        return count;
    }


    /**
     * 建立和插入关系表操作
     *
     * @param dao       可以操作的dao
     * @param dataList  要插入的数据
     * @param productId 建立关系的id
     */
    private void relateAndInsertList(Object dao, List dataList, Long productId) {
        try {
            System.out.println(dataList.toString());
            System.out.println("productId"+productId);
            if (CollectionUtils.isEmpty(dataList)) {
                return;
            }
            for (Object item : dataList) {
                Method setId = item.getClass().getMethod("setId", Long.class);
                setId.invoke(item, (Long) null);
                Method setProductId = item.getClass().getMethod("setProductId", Long.class);
                setProductId.invoke(item, productId);
            }
            System.out.println("d"+dataList.toString());
            Method insertList = dao.getClass().getMethod("insertList", List.class);
            insertList.invoke(dao, dataList);
        } catch (Exception e) {
            LOGGER.warn("创建产品出错:{}", e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }

    private void handleSkuStockCode(List<PmsSkuStock> skuStockList, Long productId) {
        if(CollectionUtils.isEmpty(skuStockList)) {
            return;
        }
        for(int i=0;i<skuStockList.size();i++){
            PmsSkuStock skuStock = skuStockList.get(i);
            if(StringUtils.isEmpty(skuStock.getSkuCode())){
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
                StringBuilder sb = new StringBuilder();
                //日期
                sb.append(sdf.format(new Date()));
                //四位商品id
                sb.append(String.format("%04d", productId));
                //三位索引id
                sb.append(String.format("%03d", i+1));
                skuStock.setSkuCode(sb.toString());
            }
        }
    }


}
