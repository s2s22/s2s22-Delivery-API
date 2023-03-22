package com.example.demo.controller;

import com.example.demo.domain.Food;
import com.example.demo.domain.FoodDto;
import com.example.demo.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/food")
public class FoodController {

    private final FoodService foodService;

    @Autowired //생성자 사용해서 DI
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    //음식 조회
    @GetMapping("/foods")
    public Food findAll() {
        return new Food();
    }

    //음식 등록
    @PostMapping("/save")
    public void save(FoodDto foodDto) { //수정 view에서 받아오는 데이터 dto로
         foodService.save(foodDto);
    }

    //음식수정
    @PutMapping("/{foodId}")
    public Food edit(String foodId) {
        return new Food();
    }

    //음식 삭제
    @DeleteMapping("/{foodId}")
    public void delete(String foodId) {

    }
}
