package com.example.demo.controller;

import com.example.demo.domain.Delivery;
import com.example.demo.domain.DeliveryDto;
import com.example.demo.service.DeliveryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("delivery")
@RequiredArgsConstructor
public class DeliveryController {

    private final DeliveryService deliveryService;
    @GetMapping("{deliveryId}")
    public Delivery findById(@PathVariable Long deliverId) {
        return deliveryService.findById(deliverId);
    }

    @PostMapping("save")
    public void save(@PathVariable Long orderId, DeliveryDto deliveryDto){
        deliveryService.save(orderId, deliveryDto);
    }
}
