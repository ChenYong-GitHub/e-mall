package com.alibaba_tencent.pms.service.impl;

import com.alibaba_tencent.emall.pms.entity.ProductAttributeCategory;
import com.alibaba_tencent.emall.vo.PageInfoVo;
import com.alibaba_tencent.pms.mapper.ProductAttributeCategoryMapper;
import com.alibaba_tencent.emall.pms.service.ProductAttributeCategoryService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品属性分类表 服务实现类
 * </p>
 *
 * @author ChenYong
 * @since 2020-01-06
 */
@Service
public class ProductAttributeCategoryServiceImpl extends ServiceImpl<ProductAttributeCategoryMapper, ProductAttributeCategory> implements ProductAttributeCategoryService {

    @Autowired
    private ProductAttributeCategoryMapper productAttributeCategoryMapper;

    @Override
    public PageInfoVo roductAttributeCategoryPageInfo(Integer pageNum, Integer pageSize) {

        IPage<ProductAttributeCategory> page = productAttributeCategoryMapper.selectPage(new Page<>(pageNum.longValue(), pageSize.longValue()), null);

        return PageInfoVo.getVo(page, pageSize.longValue());
    }
}
