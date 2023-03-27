package com.example.demo.domain;

import javax.persistence.*;

public class OrderFood {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private  Order order;
}
