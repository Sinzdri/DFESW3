package com.qa.main;

import com.qa.users.User;

public class Main {
public static void main(String[] args) {
	User Fred = new User("Fred", "Baker", 24, false);
	User Charles = new User("Charles", "Baker", 22, false);
	User Alice = new User("Alice", "Baker", 27, true);
	System.out.println(Fred);
	Fred.ageVerification();
	Fred.adminCheck();
	Fred.listName();
	System.out.println(Charles);
	System.out.println(Alice);
	Fred.setSurname("Renamed");
	System.out.println(Fred.getSurname());
	Fred.setAge(-5);
}
}
