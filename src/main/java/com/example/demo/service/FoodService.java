package com.example.demo.service;

import com.example.demo.domain.Food;
import com.example.demo.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class FoodService {

    private final FoodRepository foodRepository;

    @Autowired //생성자 사용해서 DI
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }


}
