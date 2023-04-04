package com.example.demo.service;

import com.example.demo.domain.Delivery;
import com.example.demo.domain.DeliveryDto;
import com.example.demo.domain.Order;
import com.example.demo.domain.OrderStatus;
import com.example.demo.repository.DeliveryRepository;
import com.example.demo.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeliveryService {

    private final DeliveryRepository deliveryRepository;
    private final OrderRepository orderRepository;

    public Delivery findById(Long deliveryId) {
        return deliveryRepository.findById(deliveryId);
    }
    public void save(Long orderId, DeliveryDto deliveryDto) {
        Order order = orderRepository.findById(orderId);
        deliveryDto.setOrder(order);
        deliveryDto.setOrderStatus(OrderStatus.DELIVERY);
        deliveryRepository.save(deliveryDto);
    }

}
