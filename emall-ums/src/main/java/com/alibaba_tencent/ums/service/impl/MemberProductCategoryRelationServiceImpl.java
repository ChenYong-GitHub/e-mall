package com.alibaba_tencent.ums.service.impl;

import com.alibaba_tencent.api.ums.entity.MemberProductCategoryRelation;
import com.alibaba_tencent.api.ums.mapper.MemberProductCategoryRelationMapper;
import com.alibaba_tencent.api.ums.service.MemberProductCategoryRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员与产品分类关系表（用户喜欢的分类） 服务实现类
 * </p>
 *
 * @author ChenYong
 * @since 2020-01-06
 */
@Service
public class MemberProductCategoryRelationServiceImpl extends ServiceImpl<MemberProductCategoryRelationMapper, MemberProductCategoryRelation> implements MemberProductCategoryRelationService {

}
