package com.example.demo.repository;

import com.example.demo.domain.Food;
import com.example.demo.domain.FoodDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
@Slf4j
public class FoodRepository {

    private final EntityManager em;

    @Autowired
    ModelMapper modelMapper;

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

    public Food findById(Long foodId) {
        return em.find(Food.class, foodId);
    }

    public void edit(Long foodId, FoodDto updateDto) {
        Food byId = findById(foodId);
        Food updateFood = em.merge(updateDto.toEntity());

        log.info("영속성 {}" , byId);
        log.info("영속성2 {}" , updateFood);
    }

    public void deleteById(Long foodId) {
        em.createQuery("delete from Food f where f.food_id = :foodId", Food.class)
                .setParameter("foodId", foodId);
    }

}
