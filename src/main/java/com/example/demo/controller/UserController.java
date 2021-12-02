package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Contact;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public User getUserById(@PathVariable("userId") long userId)
	{
		User user = userService.getUser(userId);
		
		List<Contact> listOfContact = restTemplate.getForObject("http://localhost:9002/contact/user/"+user.getUserId(), List.class);
		
		user.setContact(listOfContact);
		
		return user;
	}
	
}
