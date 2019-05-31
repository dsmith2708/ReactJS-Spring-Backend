package com.qa.user.manager.api;

public class User {
	private long id;
	
	private String name;
	
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
