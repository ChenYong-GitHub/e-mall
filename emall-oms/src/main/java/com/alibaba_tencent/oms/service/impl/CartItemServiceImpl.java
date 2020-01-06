package com.alibaba_tencent.oms.service.impl;

import com.alibaba_tencent.api.oms.entity.CartItem;
import com.alibaba_tencent.api.oms.mapper.CartItemMapper;
import com.alibaba_tencent.api.oms.service.CartItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author ChenYong
 * @since 2020-01-06
 */
@Service
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements CartItemService {

}
