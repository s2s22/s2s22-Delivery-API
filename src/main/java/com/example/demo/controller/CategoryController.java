package com.example.demo.controller;

import com.example.demo.domain.Category;
import com.example.demo.domain.CategoryDto;
import com.example.demo.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping("/save")
    public void save(CategoryDto categoryDto) {
        categoryService.save(categoryDto);
    }

    @GetMapping("/{categoryId}")
    public Category findById(@PathVariable Long categoryId) {
        return categoryService.findById(categoryId);
    }
}
