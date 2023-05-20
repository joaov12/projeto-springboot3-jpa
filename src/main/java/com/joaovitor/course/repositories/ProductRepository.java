package com.joaovitor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaovitor.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}