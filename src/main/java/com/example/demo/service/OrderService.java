package com.example.demo.service;

import com.example.demo.domain.Food;
import com.example.demo.domain.Order;
import com.example.demo.domain.OrderFood;
import com.example.demo.domain.OrderFoodDto;
import com.example.demo.repository.FoodRepository;
import com.example.demo.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final FoodRepository foodRepository;

    public Order findById(Long orderId) {
        return orderRepository.findById(orderId);
    }

    public List<OrderFood> findAll(){
        return orderRepository.findAll();
    }

    public void save(OrderFoodDto orderFoodDto) {
        Order order = orderRepository.findById(orderFoodDto.getOrder().getId());
        Food food = foodRepository.findById(orderFoodDto.getFood().getId());

        orderFoodDto.setOrder(order);
        orderFoodDto.setFood(food);

        orderRepository.save(orderFoodDto);
    }

    public void deleteById(Long orderId) {
        orderRepository.deleteById(orderId);
    }
}
