package com.example.demo.domain;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;

@Data
public class FoodDto {

    //화면에서 필요한게 뭐가있을까?
    //이름
    // 수량, 재고
    //가격은
    //수량은...주문에 들어가야할거같다...

    private String name;

    private Long quantity; //재고

    private BigDecimal price; //가격


    @Builder
    public FoodDto(String name, Long quantity, BigDecimal price) {

        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    //dto -> entity
    public Food toEntity() {
        return Food.builder().name(name)
                .quantity(quantity)
                .price(price)
                .build();
    }

}
