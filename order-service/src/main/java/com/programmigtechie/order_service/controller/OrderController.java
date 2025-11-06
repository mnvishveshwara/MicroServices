package com.programmigtechie.order_service.controller;

import com.programmigtechie.order_service.dto.OrderRequest;
import com.programmigtechie.order_service.entity.Order;
import com.programmigtechie.order_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
    @Autowired
    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String PlaceOrder(@RequestBody OrderRequest orderRequest) {
        log.info("In PlaceOrder Order Controller: {}" , orderRequest);
        orderService.PlaceOrder(orderRequest);
        return "Order Placed successfully";
    }
}
