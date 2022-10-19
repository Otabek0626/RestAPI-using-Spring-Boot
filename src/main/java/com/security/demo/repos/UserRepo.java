package com.security.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.demo.models.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	

}
