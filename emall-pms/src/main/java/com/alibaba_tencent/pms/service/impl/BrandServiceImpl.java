package com.alibaba_tencent.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba_tencent.emall.pms.entity.Brand;
import com.alibaba_tencent.emall.pms.service.BrandService;
import com.alibaba_tencent.emall.vo.PageInfoVo;
import com.alibaba_tencent.pms.mapper.BrandMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author ChenYong
 * @since 2020-01-06
 */
@Slf4j
@Service
@Component
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public PageInfoVo brandPageInfo(String keyword, Integer pageNum, Integer pageSize) {
        QueryWrapper<Brand> name = null;

        if (StringUtils.isNotBlank(keyword)) {
            name = new QueryWrapper<Brand>().like("name", keyword);
        }

        IPage<Brand> brandIPage = baseMapper.selectPage(new Page<>(pageNum.longValue(), pageSize.longValue()), name);

        PageInfoVo pageInfoVo = new PageInfoVo(
                brandIPage.getTotal(),
                brandIPage.getPages(),
                pageSize.longValue(),
                brandIPage.getRecords(),
                brandIPage.getCurrent());

        return pageInfoVo;
    }
}
