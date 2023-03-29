package com.example.demo.domain;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
public class OrderFood {

    @Id @GeneratedValue
    private Long id;

    private int count;

    private Long totalPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_id")
    private Food food;

    @Builder
    public OrderFood(int count, Long totalPrice, Order order, Food food) {
        this.count = count;
        this.totalPrice = totalPrice;
        this.order = order;
        this.food = food;
    }
}
