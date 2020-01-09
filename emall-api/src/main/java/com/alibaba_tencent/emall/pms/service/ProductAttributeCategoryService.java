package com.alibaba_tencent.emall.pms.service;

import com.alibaba_tencent.emall.pms.entity.ProductAttributeCategory;
import com.alibaba_tencent.emall.vo.PageInfoVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 产品属性分类表 服务类
 * </p>
 *
 * @author ChenYong
 * @since 2020-01-06
 */
public interface ProductAttributeCategoryService extends IService<ProductAttributeCategory> {

    /**
     * @Desc: 分页查询所有的属性分类
     * @Param:  pageNum, pageSize
     * @Return: PageInfoVo
     * @Author: ChenYong
     * @Date: 2020-01-09 11:20
     */
    PageInfoVo roductAttributeCategoryPageInfo(Integer pageNum, Integer pageSize);
}
