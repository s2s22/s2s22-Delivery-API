package com.example.demo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class CategoryDto {

    private String name;


    @Builder
    public CategoryDto(String name) {
        this.name = name;
    }

    public Category toEntity() {
        return Category.builder().name(name).build();
    }
}
