package com.alibaba_tencent.ums.service.impl;

import com.alibaba_tencent.emall.ums.entity.Admin;
import com.alibaba_tencent.ums.mapper.AdminMapper;
import com.alibaba_tencent.emall.ums.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author ChenYong
 * @since 2020-01-06
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
