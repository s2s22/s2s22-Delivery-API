package com.example.demo.repository;

import com.example.demo.domain.Food;
import com.example.demo.domain.FoodDto;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;


@Repository

public class FoodRepository {



    private final EntityManager em;

    public FoodRepository(EntityManager em) {
        this.em = em;
    }

    public Food findAll() {
        return  new Food();
    }

    public void save(FoodDto foodDto) {

        //여기서 fooddto -> food로 변경해야...
        em.persist(foodDto.toEntity());
    }

}
