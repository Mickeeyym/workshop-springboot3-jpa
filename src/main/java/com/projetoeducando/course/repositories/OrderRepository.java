package com.projetoeducando.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoeducando.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
