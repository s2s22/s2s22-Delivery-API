package com.example.demo.domain;

import lombok.Builder;
import lombok.Data;

@Data
public class OrderFoodDto {

    private int count;

    private Long totalPrice;

    private Order order;

    private Food food;

    @Builder
    public OrderFood toEntity() {
        return OrderFood.builder()
                .count(count)
                .totalPrice(totalPrice)
                .order(order)
                .food(food)
                .build();
    }
}
