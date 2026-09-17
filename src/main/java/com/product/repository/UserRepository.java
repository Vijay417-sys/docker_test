package com.product.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.entity.User;

public interface UserRepository  extends JpaRepository<User, Integer>{
	Optional<User> findByEmail(String email);
	

}
