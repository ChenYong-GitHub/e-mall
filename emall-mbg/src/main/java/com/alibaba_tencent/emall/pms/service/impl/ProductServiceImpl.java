package com.alibaba_tencent.emall.pms.service.impl;

import com.alibaba_tencent.emall.pms.entity.Product;
import com.alibaba_tencent.emall.pms.mapper.ProductMapper;
import com.alibaba_tencent.emall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author ChenYong
 * @since 2020-01-06
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
