package com.programmigtechie.order_service.service;

import com.programmigtechie.order_service.dto.OrderRequest;
import com.programmigtechie.order_service.entity.Order;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    public void placeOrder(OrderRequest orderRequest) {
    Order order = new Order();
    order.setOrderNumber(UUID.randomUUID().toString());
    }
}
