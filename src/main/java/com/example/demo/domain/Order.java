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

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;

    //취소
    public void cancelOrder() {
        this.orderStatus = OrderStatus.CANCEL;
        for(int i =0;i <orderFoods.size(); i++) {
            if(orderFoods.get(i).getId() == this.id) {
                Long addQuantity = orderFoods.get(i).getFood().getQuantity();
                //재고올려줘야....
            }
        }

    }
}
