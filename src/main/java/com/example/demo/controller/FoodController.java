package com.example.demo.controller;

import com.example.demo.domain.Food;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/food")
public class FoodController {


    //음식 조회
    @GetMapping("/foods")
    public Food findAll() {
        return new Food();
    }

    //음식 등록
    @PostMapping("/save")
    public String save(Food food) {
        return "음식아이디";
    }

    //음식수정
    @PutMapping("/{foodId}/edit")
    public Food edit(String foodId) {
        return new Food();
    }

    //음식 삭제
    @DeleteMapping("/{foodId}/delete")
    public void delete(String foodId) {

    }
}
