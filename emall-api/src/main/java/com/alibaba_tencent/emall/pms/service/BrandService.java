package com.alibaba_tencent.emall.pms.service;

import com.alibaba_tencent.emall.pms.entity.Brand;
import com.alibaba_tencent.emall.vo.PageInfoVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 品牌表 服务类
 * </p>
 *
 * @author ChenYong
 * @since 2020-01-06
 */
public interface BrandService extends IService<Brand> {

    /**
     * @Desc: 商品分页查询
     * @Param:
     * @Return:
     * @Author: ChenYong
     * @Date: 2020-01-09 10:46
     */
    PageInfoVo brandPageInfo(String keyword, Integer pageNum, Integer pageSize);
}
