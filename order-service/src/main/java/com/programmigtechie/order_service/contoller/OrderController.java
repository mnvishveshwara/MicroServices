package com.programmigtechie.order_service.contoller;

import com.programmigtechie.order_service.dto.OrderRequest;
import com.programmigtechie.order_service.entity.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @PostMapping
    public String PlaceOrder(@RequestBody OrderRequest orderRequest) {
        return "Order Placed successfully";
    }
}
