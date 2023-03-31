package com.example.demo.controller;

import com.example.demo.domain.Order;
import com.example.demo.domain.OrderFood;
import com.example.demo.domain.OrderFoodDto;
import com.example.demo.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("order")
public class OrderController {

    private final OrderService orderService;

    @GetMapping("{orderId}")
    public Order findById(@PathVariable Long orderId){
        return orderService.findById(orderId);
    }

    @GetMapping("orders")
    public List<OrderFood> findAll(){
        return orderService.findAll();
    }

    @PostMapping("save")
    public void save(OrderFoodDto orderFoodDto){
        orderService.save(orderFoodDto);
    }

    @DeleteMapping("{orderId}")
    public void deleteById(Long orderId) {
        orderService.deleteById(orderId);
    }

    @PutMapping("{orderId}")
    public void edit(@PathVariable Long id, OrderFoodDto orderFoodDto) {

    }
}
