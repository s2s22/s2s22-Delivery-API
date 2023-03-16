package com.example.demo.domain;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Getter
@NoArgsConstructor
public class Food {

    @Id
    private Long id;
    private String name;

    private Long quantity; //재고

    private BigDecimal price; //가격

    @Builder
    public Food(String name, Long quantity, BigDecimal price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
