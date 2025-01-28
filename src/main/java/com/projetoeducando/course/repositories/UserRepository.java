package com.projetoeducando.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoeducando.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
