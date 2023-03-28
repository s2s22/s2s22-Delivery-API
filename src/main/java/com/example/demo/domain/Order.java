package com.example.demo.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "orders")
public class Order {

    @Id @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "order")
    private List<OrderFood> orderFoods = new ArrayList<>();
}
