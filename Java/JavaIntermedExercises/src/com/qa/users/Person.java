package com.qa.users;

import java.util.Optional;

public class Person {
	//attributes
	static int counter = 0;
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private Long phonenumber;
	
	
	//getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return Optional.ofNullable(lastName).orElse("Last name not found");
	}
	
	public boolean isThereALastName() {
		return Optional.ofNullable(lastName).isPresent();
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() throws Exception {
		return Optional.ofNullable(email).orElseThrow(() -> new Exception("Email not found"));
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhonenumber() throws Exception {
		return Optional.ofNullable(phonenumber).orElseThrow(() -> new Exception("Phone number not found"));
	}

	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}
	
//	public String setSpaghetti() {
//		return Optional.ofNullable(lastName).map(lastName -> )
//	}
	
	

	//constructor
	public Person(String firstName, String lastName, String email, Long phonenumber) {
		counter ++;
		id = (long)counter;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phonenumber = phonenumber;
	}
	public Person(String firstName) {
		counter ++;
		id = (long)counter;
		this.firstName = firstName;
	}
	
		
}
