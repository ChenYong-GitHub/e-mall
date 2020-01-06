package com.alibaba_tencent.oms.service.impl;

import com.alibaba_tencent.emall.oms.entity.Order;
import com.alibaba_tencent.emall.oms.mapper.OrderMapper;
import com.alibaba_tencent.emall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author ChenYong
 * @since 2020-01-06
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
