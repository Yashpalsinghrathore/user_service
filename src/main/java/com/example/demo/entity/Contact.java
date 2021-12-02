package com.example.demo.entity;

public class Contact {

	long cId;
	public long getcId() {
		return cId;
	}
	public void setcId(long cId) {
		this.cId = cId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	String email;
	String contactName;
	long userId;
	public Contact(long cId, String email, String contactName, long userId) {
		super();
		this.cId = cId;
		this.email = email;
		this.contactName = contactName;
		this.userId = userId;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
}
