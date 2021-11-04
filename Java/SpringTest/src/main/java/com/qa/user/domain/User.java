package com.qa.user.domain;

public class User {
	private String firstname;
	private String lastname;
	private int age;
	private boolean adminstatus = false;
	
	public User(String firstname, String lastname, int age) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.setAge(age);		//use setter in constructor to ensure valid input
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0 && age <= 150)				//validiate input
			this.age = age;
		else System.out.println("Invalid age: " + age);
	}
	
	public boolean isAdminstatus() {
		return adminstatus;
	}

	public void setAdminstatus(boolean adminstatus) {
		this.adminstatus = adminstatus;
	}
	
}
