package com.alibaba_tencent.pms.service.impl;

import com.alibaba_tencent.emall.pms.entity.ProductAttribute;
import com.alibaba_tencent.emall.vo.PageInfoVo;
import com.alibaba_tencent.pms.mapper.ProductAttributeMapper;
import com.alibaba_tencent.emall.pms.service.ProductAttributeService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品属性参数表 服务实现类
 * </p>
 *
 * @author ChenYong
 * @since 2020-01-06
 */
@Service
public class ProductAttributeServiceImpl extends ServiceImpl<ProductAttributeMapper, ProductAttribute> implements ProductAttributeService {

    @Autowired
    private ProductAttributeMapper productAttributeMapper;

    @Override
    public PageInfoVo getCategoryAttributes(Long cid, Integer type, Integer pageSize, Integer pageNum) {

        QueryWrapper<ProductAttribute> queryWrapper = new QueryWrapper<ProductAttribute>()
                .eq("product_attribute_category_id", cid)
                .eq("type", type);

        IPage<ProductAttribute> page = productAttributeMapper.selectPage(new Page<>(pageNum.longValue(), pageSize.longValue()), queryWrapper);

        return PageInfoVo.getVo(page, pageSize.longValue());
    }
}
