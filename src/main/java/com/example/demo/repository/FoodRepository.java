package com.example.demo.repository;

import com.example.demo.domain.Food;
import com.example.demo.domain.FoodDto;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class FoodRepository {

    private final EntityManager em;

    public FoodRepository(EntityManager em) {
        this.em = em;
    }

    public List<Food> findAll() {
        return  em.createQuery("select f form f", Food.class)
                .getResultList();
    }

    public void save(FoodDto foodDto) {

        //여기서 fooddto -> food로 변경해야...
        em.persist(foodDto.toEntity());
    }

    public Food findById(String foodId) {
        return em.find(Food.class, foodId);
    }

    public void edit(String foodId, FoodDto foodDto) {
        Food food = findById(foodId);
        food.updateFood(foodDto); //영속성에 의해 em 처리없이 자동 update문 생성
    }

    public void deleteById(String foodId) {
        em.createQuery("delete from Food f where f.food_id = :foodId", Food.class)
                .setParameter("foodId", foodId);
    }

}
