package com.example.demo.repository;

import com.example.demo.domain.CategoryDto;
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

}
