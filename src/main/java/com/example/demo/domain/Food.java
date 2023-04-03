package com.example.demo.domain;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@Slf4j
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
    public Food(String name, Long quantity, BigDecimal price, Category category) {
        log.info("값 {}" , quantity);
            this.name = name;
            this.quantity = quantity;
            this.price = price;
            this.category = category;
        }

    }



