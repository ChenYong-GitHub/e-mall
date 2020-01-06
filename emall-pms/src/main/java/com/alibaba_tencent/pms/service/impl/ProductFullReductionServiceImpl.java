package com.alibaba_tencent.pms.service.impl;

import com.alibaba_tencent.emall.pms.entity.ProductFullReduction;
import com.alibaba_tencent.emall.pms.mapper.ProductFullReductionMapper;
import com.alibaba_tencent.emall.pms.service.ProductFullReductionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品满减表(只针对同商品) 服务实现类
 * </p>
 *
 * @author ChenYong
 * @since 2020-01-06
 */
@Service
public class ProductFullReductionServiceImpl extends ServiceImpl<ProductFullReductionMapper, ProductFullReduction> implements ProductFullReductionService {

}
