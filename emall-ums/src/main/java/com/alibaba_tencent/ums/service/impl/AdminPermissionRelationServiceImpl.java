package com.alibaba_tencent.ums.service.impl;

import com.alibaba_tencent.api.ums.entity.AdminPermissionRelation;
import com.alibaba_tencent.api.ums.mapper.AdminPermissionRelationMapper;
import com.alibaba_tencent.api.ums.service.AdminPermissionRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限) 服务实现类
 * </p>
 *
 * @author ChenYong
 * @since 2020-01-06
 */
@Service
public class AdminPermissionRelationServiceImpl extends ServiceImpl<AdminPermissionRelationMapper, AdminPermissionRelation> implements AdminPermissionRelationService {

}
