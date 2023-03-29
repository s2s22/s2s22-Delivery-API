package com.example.demo.repository;

import com.example.demo.domain.Order;
import com.example.demo.domain.OrderFood;
import com.example.demo.domain.OrderFoodDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

    private final EntityManager em;

    public Order findById(Long orderId) {
        return em.find(Order.class, orderId);
    }

    public List<OrderFood> findAll() {
        return em.createQuery("select o from orderFood o")
                .getResultList();
    }

    public void save(OrderFoodDto orderFoodDto) {
        em.persist(orderFoodDto.toEntity());
    }

    public void deleteById(Long orderId) {
        em.createQuery("select o from orderFood o where o.order_id = :orderId")
                .setParameter("orderId", orderId);
    }
}
