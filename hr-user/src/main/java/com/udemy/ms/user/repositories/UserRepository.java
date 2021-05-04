package com.udemy.ms.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.ms.user.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
