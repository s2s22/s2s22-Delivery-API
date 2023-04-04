package com.example.demo.domain;

import com.example.demo.repository.FoodRepository;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Slf4j
public class FoodDto {

    //화면에서 필요한게 뭐가있을까?
    //이름
    // 수량, 재고
    //가격은
    //수량은...주문에 들어가야할거같다...

    private Long id;

    private String name;

    private Long quantity; //재고

    private BigDecimal price; //가격

    private Category category;

    @Builder
    public FoodDto(FoodDto foodDto) {
        this.name = foodDto.getName();
        this.quantity = foodDto.getQuantity();
        this.price = foodDto.getPrice();
        this.category = foodDto.getCategory();
    }

    //dto -> entity
    public Food toEntity() {
        return Food.builder()
                .name(name)
                .price(price)
                .quantity(quantity)
                .category(category)
                .build();
    }

}
