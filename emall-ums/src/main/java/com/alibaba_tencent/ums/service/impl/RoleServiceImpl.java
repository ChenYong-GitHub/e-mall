package com.alibaba_tencent.ums.service.impl;

import com.alibaba_tencent.api.ums.entity.Role;
import com.alibaba_tencent.api.ums.mapper.RoleMapper;
import com.alibaba_tencent.api.ums.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户角色表 服务实现类
 * </p>
 *
 * @author ChenYong
 * @since 2020-01-06
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
