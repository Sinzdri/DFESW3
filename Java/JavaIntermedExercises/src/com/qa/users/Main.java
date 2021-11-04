package com.qa.users;

public class Main {
public static void main(String[] args) throws Exception {
	Person Bob = new Person("Bob", "Bobson", "bob@bobnet.com", 1763457689L);
	Person TestBob = new Person("Bob");

	
	System.out.println(Bob.getLastName());
	System.out.println(TestBob.getLastName());
	System.out.println(Bob.getId());
	System.out.println(TestBob.getId());
	System.out.println(Bob.isThereALastName());
	System.out.println(TestBob.isThereALastName());
	System.out.println(Bob.getEmail());
//	System.out.println(TestBob.getEmail());
	System.out.println(Bob.getPhonenumber());
	System.out.println(TestBob.getPhonenumber());

}
}
