package com.example.demo.domain;

import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Delivery {

    @Id @GeneratedValue
    private Long id;

    private OrderStatus orderStatus;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    @Builder
    public Delivery(OrderStatus orderStatus, Order order) {
        this.orderStatus = orderStatus;
        this.order = order;
    }
}
