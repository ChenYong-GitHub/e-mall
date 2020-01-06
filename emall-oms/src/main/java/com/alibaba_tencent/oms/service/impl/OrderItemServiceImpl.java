package com.alibaba_tencent.oms.service.impl;

import com.alibaba_tencent.emall.oms.entity.OrderItem;
import com.alibaba_tencent.oms.mapper.OrderItemMapper;
import com.alibaba_tencent.emall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author ChenYong
 * @since 2020-01-06
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
