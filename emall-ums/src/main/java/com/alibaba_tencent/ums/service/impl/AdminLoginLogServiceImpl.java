package com.alibaba_tencent.ums.service.impl;

import com.alibaba_tencent.api.ums.entity.AdminLoginLog;
import com.alibaba_tencent.api.ums.mapper.AdminLoginLogMapper;
import com.alibaba_tencent.api.ums.service.AdminLoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户登录日志表 服务实现类
 * </p>
 *
 * @author ChenYong
 * @since 2020-01-06
 */
@Service
public class AdminLoginLogServiceImpl extends ServiceImpl<AdminLoginLogMapper, AdminLoginLog> implements AdminLoginLogService {

}
