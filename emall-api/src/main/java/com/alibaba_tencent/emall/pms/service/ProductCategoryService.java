package com.alibaba_tencent.emall.pms.service;

import com.alibaba_tencent.emall.pms.entity.ProductCategory;
import com.alibaba_tencent.emall.vo.product.PmsProductCategoryWithChildrenItem;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 产品分类 服务类
 * </p>
 *
 * @author ChenYong
 * @since 2020-01-06
 */
public interface ProductCategoryService extends IService<ProductCategory> {

    /**
     * @Desc: 查询当前菜单及其子菜单
     * @Param:
     * @Return:
     * @Author: ChenYong
     * @Date: 2020-01-09 11:38
     */
    List<PmsProductCategoryWithChildrenItem> listCatelogWithChilder(Integer id);
}
