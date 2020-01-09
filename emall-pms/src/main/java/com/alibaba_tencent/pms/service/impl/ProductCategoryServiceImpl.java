package com.alibaba_tencent.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba_tencent.emall.pms.entity.ProductCategory;
import com.alibaba_tencent.emall.vo.product.PmsProductCategoryWithChildrenItem;
import com.alibaba_tencent.pms.mapper.ProductCategoryMapper;
import com.alibaba_tencent.emall.pms.service.ProductCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 产品分类 服务实现类
 * </p>
 *
 * @author ChenYong
 * @since 2020-01-06
 */
@Component
@Service
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements ProductCategoryService {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Override
    public List<PmsProductCategoryWithChildrenItem> listCatelogWithChilder(Integer id) {

        return null;
    }
}
