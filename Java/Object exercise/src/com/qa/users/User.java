package com.qa.users;
//Exercise - create basic class with a few attributes
public class User {		
//Attributes, private to encapsulate class
	private String firstname; 
	private String surname;
	private int age;
	private boolean admin = false;
	private static int counter = 0;	//using counter to track how many objects created of class
	private int userid = 0;
		
//Methods
	public void listName() {
		System.out.println("User name is " + firstname + " " + surname);
	}
	public void adminCheck() {
		if (admin == true) {
			System.out.println("This user has admin privilages");
		}
		else {System.out.println("This user does not have admin access");}
	}
	public void ageVerification(){
		if (age <= 12) {
			System.out.println("This user needs parental authorisation");
		}
		else {System.out.println("This user is authorised");}
	}

	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", surname=" + surname + ", age=" + age + ", admin=" + admin
				+ ", userid=" + userid + "]";
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0) {
			System.out.println("That was not a valid age");	//Basic restriction to prevent invalid inputs with setters
		}
		else {this.age = age;}
	}
	public boolean isAdmin() {
		return admin;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}

//CONSTRUCTORS



	public User(String firstname, String surname, int age, boolean admin)	{
		counter ++;	//increment counter
		this.firstname = firstname;
		this.surname = surname;
		this.age = age;
		this.admin = admin;
		userid = counter;	//set user id to counter value, this way each new user has a unique ID.
		}

}
