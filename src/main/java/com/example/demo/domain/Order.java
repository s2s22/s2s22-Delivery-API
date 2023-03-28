package com.example.demo.domain;

import javax.lang.model.element.Name;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public class Order {

    @Id @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "order")
    private List<OrderFood> orderFood = new ArrayList<>();
}
