package com.alibaba_tencent.ums.service.impl;

import com.alibaba_tencent.api.ums.entity.Permission;
import com.alibaba_tencent.api.ums.mapper.PermissionMapper;
import com.alibaba_tencent.api.ums.service.PermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户权限表 服务实现类
 * </p>
 *
 * @author ChenYong
 * @since 2020-01-06
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

}
