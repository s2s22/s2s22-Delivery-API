package com.example.demo.domain;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Getter
@NoArgsConstructor
public class Food {

    @Id @GeneratedValue
    @Column(name = "food_id")
    private Long id;
    @Column(name = "food_name")
    private String name;

    @Column(name = "food_quantity")
    private Long quantity; //재고

    @Column(name = "food_price")
    private BigDecimal price; //가격

    @Builder
    public Food(String name, Long quantity, BigDecimal price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
