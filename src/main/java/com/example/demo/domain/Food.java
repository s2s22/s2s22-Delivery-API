package com.example.demo.domain;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @Builder
    public Food(String name, Long quantity, BigDecimal price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void updateFood(String name , Long quantity, BigDecimal price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
