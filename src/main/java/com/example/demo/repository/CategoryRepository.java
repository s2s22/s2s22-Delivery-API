package com.example.demo.repository;

import com.example.demo.domain.Category;
import com.example.demo.domain.CategoryDto;
import com.example.demo.domain.Food;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class CategoryRepository {

    private final EntityManager em;

    @Transactional
    public void save(CategoryDto categoryDto) {
        em.persist(categoryDto.toEntity());
    }

    public Category findById(Long categoryId) {
        return em.createQuery("select c from Category c where c.id = :categoryId ", Category.class)
                .setParameter("categoryId", categoryId)
                .getSingleResult();

    }
}
