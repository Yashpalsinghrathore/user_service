package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

	private long userId;
	private String userName;
	private String phone;
	
	List<Contact> contact = new ArrayList();

	public User(long userId, String userName, String phone, List<Contact> contact) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.phone = phone;
		this.contact = contact;
	}
	public User(long userId, String userName, String phone) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.phone = phone;
		
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<Contact> getContact() {
		return contact;
	}
	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
}
