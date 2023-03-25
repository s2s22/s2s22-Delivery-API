package com.example.demo.controller;

import com.example.demo.domain.CategoryDto;
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

    @GetMapping("/foods")
    public List<Food> findAll() {
        return foodService.findAll();
    }

    @PostMapping("/save")
    public void save(FoodDto foodDto, @RequestParam("categoryId") String categoryId) {
         foodService.save(foodDto, categoryId);
    }

    @PutMapping("/{foodId}")
    public Food edit(String foodId) {
        return new Food();
    }

    @DeleteMapping("/{foodId}")
    public void deleteById(String foodId) {
        foodService.deleteById(foodId);
    }

    @GetMapping("/{foodId}")
    public Food findById(@PathVariable String foodId) {
        return foodService.findById(foodId);
    }
}
