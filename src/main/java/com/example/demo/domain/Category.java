package com.example.demo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Category {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @Builder
    public Category(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "category")
    private List<Food> foods  = new ArrayList<>();

}
