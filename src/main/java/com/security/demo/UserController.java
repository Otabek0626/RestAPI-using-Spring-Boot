package com.security.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.demo.models.User;
import com.security.demo.repos.UserRepo;

@RestController
public class UserController {
	@Autowired
    private UserRepo repo;
	
	@PostMapping("/users")
	public User createUser(User user) {
		repo.save(user);
		return user;
	}
	
	@GetMapping("/users")
    public List<User> listAllUsers() {
		
        return repo.findAll();
    }
}
