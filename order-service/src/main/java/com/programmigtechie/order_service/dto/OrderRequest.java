package com.programmigtechie.order_service.dto;

import com.programmigtechie.order_service.entity.Order;
import com.programmigtechie.order_service.entity.OrderLineItem;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private List<OrderLineItemDto> orderLineItemListDto;
}
