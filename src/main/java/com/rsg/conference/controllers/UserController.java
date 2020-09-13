package com.rsg.conference.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rsg.conference.models.User;

@RestController
public class UserController {
	@GetMapping("/user")
	public User getUser(@RequestParam(value = "firstname", defaultValue = "Ravi") String firstname,
			@RequestParam(value = "lastname", defaultValue = "Sharma") String lastname,
			@RequestParam(value = "age", defaultValue = "25") int age) {
		User user = new User();
		user.setFirstName(firstname);
		user.setLastName(lastname);
		user.setAge(age);
		return user;
	}
	@PostMapping("/user")
	public User postUser(@RequestBody User user){
		user.setAge(80);
		return user;	
	}
}
