package com.shoppingcart.shoppingcart.service.order;

import com.shoppingcart.shoppingcart.dto.OrderDto;
import com.shoppingcart.shoppingcart.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
