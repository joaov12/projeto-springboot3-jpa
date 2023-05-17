package com.joaovitor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaovitor.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}