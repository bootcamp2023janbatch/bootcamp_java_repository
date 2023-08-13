package com.estore.bean;

import java.io.Serializable;

public class Customer implements Serializable{
	int id;
	String name;
	String email;
	public Customer(int id, String name, String email) {
		
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public Customer() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	public String sayHello() {
		return "Hello, "+name;
	}
}
