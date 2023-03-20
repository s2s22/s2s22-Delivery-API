package com.example.demo.service;

import com.example.demo.domain.Food;
import com.example.demo.domain.FoodDto;
import com.example.demo.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)

public class FoodService {

    private final FoodRepository foodRepository;

    @Autowired //생성자 사용해서 DI
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }


    public Food findAll() {
        return foodRepository.findAll();
    }

    //dto를 위한 저장구현
    @Transactional
    public void save(FoodDto foodDto) {
        foodRepository.save(foodDto);
    }
}
