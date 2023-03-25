package com.example.demo.domain;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Category {

    @Id @GeneratedValue
    @Column(name = "category_id")
    private Long id;

    @Column(name = "category_name")
    private String name;

    @Builder
    public Category(Long id, String name, List<Food> foods) {
        this.id = id;
        this.name = name;
        this.foods = foods;
    }

    @OneToMany(mappedBy = "category")
    private List<Food> foods  = new ArrayList<>();

    public void setCategory(CategoryDto categoryDto) {
        this.name = categoryDto.getName();
    }
}
