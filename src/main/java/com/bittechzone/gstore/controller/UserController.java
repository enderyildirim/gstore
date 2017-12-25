package com.bittechzone.gstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bittechzone.gstore.model.User;
import com.bittechzone.gstore.service.UserService;

@Controller
@RequestMapping(path = "/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(path = "/save")
	public @ResponseBody User saveNewUser(@RequestParam String firstName, @RequestParam String lastName) {
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		userService.save(user);
		return user;
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		return userService.getAllFirstNameSorted();
	}
	
}