package com.alibaba_tencent.emall.pms.service;

import com.alibaba_tencent.emall.pms.entity.Product;
import com.alibaba_tencent.emall.vo.PageInfoVo;
import com.alibaba_tencent.emall.vo.product.PmsProductParam;
import com.alibaba_tencent.emall.vo.product.PmsProductQueryParam;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author ChenYong
 * @since 2020-01-06
 */
public interface ProductService extends IService<Product> {

    /**
     * @Desc:
     * @Param:  
     * @Return: 
     * @Author: ChenYong
     * @Date: 2020-01-09 11:39 
     */
    void saveProduct(PmsProductParam productParam);

    /**
     * @Desc: 根据复杂查询条件返回分页数据
     * @Param:  productQueryParam
     * @Return: PageInfoVo
     * @Author: ChenYong
     * @Date: 2020-01-09 11:40
     */
    PageInfoVo productPageInfo(PmsProductQueryParam productQueryParam);
}
