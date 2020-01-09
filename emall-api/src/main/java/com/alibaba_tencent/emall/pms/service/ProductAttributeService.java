package com.alibaba_tencent.emall.pms.service;

import com.alibaba_tencent.emall.pms.entity.ProductAttribute;
import com.alibaba_tencent.emall.vo.PageInfoVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商品属性参数表 服务类
 * </p>
 *
 * @author ChenYong
 * @since 2020-01-06
 */
public interface ProductAttributeService extends IService<ProductAttribute> {

    /**
     * @Desc: 查询某个属性分类下的所有属性和参数
     * @Param: cid
     * @Param: type
     * @Param: pageSize
     * @Param: pageNum
     * @Return: PageInfoVo
     * @Author: ChenYong
     * @Date: 2020-01-09 11:29
     */
    PageInfoVo getCategoryAttributes(Long cid, Integer type, Integer pageSize, Integer pageNum);
}
