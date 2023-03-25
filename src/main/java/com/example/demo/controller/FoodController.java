package com.example.demo.controller;

import com.example.demo.domain.Food;
import com.example.demo.domain.FoodDto;
import com.example.demo.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/food")
public class FoodController {

    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    //음식 전체 조회
    @GetMapping("/foods")
    public List<Food> findAll() {
        return foodService.findAll();
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

    //특정 음식 조회
    public Food find(String foodId) {
        return foodService.find(foodId);
    }
}
