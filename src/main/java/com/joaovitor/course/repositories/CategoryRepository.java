package com.joaovitor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaovitor.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}