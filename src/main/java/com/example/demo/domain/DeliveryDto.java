package com.example.demo.domain;

import lombok.Builder;
import lombok.Data;

@Data
public class DeliveryDto {

    private Order order;

    private OrderStatus orderStatus;

    @Builder
    public Delivery toEntity() {
        return Delivery.builder()
                .orderStatus(orderStatus)
                .order(order)
                .build();
    }
}
