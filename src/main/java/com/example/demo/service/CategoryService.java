package com.example.demo.service;

import com.example.demo.domain.Category;
import com.example.demo.domain.CategoryDto;
import com.example.demo.domain.Food;
import com.example.demo.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public void save(CategoryDto categoryDto){
        categoryRepository.save(categoryDto);
    }

    public Category findById(Long categoryId) {
        return categoryRepository.findById(categoryId);
    }
}
