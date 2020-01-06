package com.alibaba_tencent.pms.service.impl;

import com.alibaba_tencent.emall.pms.entity.ProductCategoryAttributeRelation;
import com.alibaba_tencent.pms.mapper.ProductCategoryAttributeRelationMapper;
import com.alibaba_tencent.emall.pms.service.ProductCategoryAttributeRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品的分类和属性的关系表，用于设置分类筛选条件 服务实现类
 * </p>
 *
 * @author ChenYong
 * @since 2020-01-06
 */
@Service
public class ProductCategoryAttributeRelationServiceImpl extends ServiceImpl<ProductCategoryAttributeRelationMapper, ProductCategoryAttributeRelation> implements ProductCategoryAttributeRelationService {

}
