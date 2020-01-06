package com.alibaba_tencent.oms.service.impl;

import com.alibaba_tencent.api.oms.entity.OrderSetting;
import com.alibaba_tencent.api.oms.mapper.OrderSettingMapper;
import com.alibaba_tencent.api.oms.service.OrderSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单设置表 服务实现类
 * </p>
 *
 * @author ChenYong
 * @since 2020-01-06
 */
@Service
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingMapper, OrderSetting> implements OrderSettingService {

}