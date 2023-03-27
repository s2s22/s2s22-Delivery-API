package com.example.demo.service;

import com.example.demo.domain.Category;
import com.example.demo.domain.CategoryDto;
import com.example.demo.domain.Food;
import com.example.demo.domain.FoodDto;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
@Slf4j
public class FoodService {

    private final FoodRepository foodRepository;
    private final CategoryRepository categoryRepository;

    public List<Food> findAll() {
        return foodRepository.findAll();
    }

    public Food findById(Long foodId) {
        return foodRepository.findById(foodId);
    }

    @Transactional
    public void save(FoodDto foodDto) {

        foodRepository.save(foodDto);
    }
    public void deleteById(Long foodId) {
        foodRepository.deleteById(foodId);
    }

    @Transactional
    public void edit(Long foodId, FoodDto foodDto) {
        foodRepository.edit(foodId, foodDto);
    }
}
