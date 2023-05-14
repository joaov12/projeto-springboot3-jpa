package com.joaovitor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaovitor.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}