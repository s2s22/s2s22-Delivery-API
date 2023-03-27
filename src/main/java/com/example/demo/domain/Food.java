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
    private Long id;
    private String name;

    private Long quantity; //재고

    private BigDecimal price; //가격

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @Builder
    public Food(Long id, String name, Long quantity, BigDecimal price, Category category) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }

}
