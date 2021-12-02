package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;

@Service
public class UserServiceImpl implements UserService{

	
	
	//fake user list
	
	List<User> userList = List.of(new User(1,"ram","12343232"),
			new User(2,"shaym","12343232"),
			new User(3,"mohan","12343232"));
	
	
	@Override
	public User getUser(long id) {
		
		return	this.userList.stream().filter(user->user.getUserId()==id).findAny().orElse(null);
		
		}

}
