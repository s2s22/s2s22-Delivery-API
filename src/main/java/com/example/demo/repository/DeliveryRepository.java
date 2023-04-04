package com.example.demo.repository;

import com.example.demo.domain.Delivery;
import com.example.demo.domain.DeliveryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class DeliveryRepository {

    private final EntityManager em;

    public Delivery findById(Long deliveryId) {
        return em.createQuery("select d from delivery d", Delivery.class)
                .getSingleResult();
    }

    public void save(DeliveryDto deliveryDto) {
        em.persist(deliveryDto.toEntity());
    }
}
