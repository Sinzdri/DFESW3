package com.qa.animals;

public class Cat {
	
	//First define attributes
	int age;
	boolean isHairShort = true;
	String hairColour = "Ginger";
	String favouriteFood;
	
	//Methods - CAN DOS
	
	public void scratch() {
		System.out.println("I scwatch");
	}
	public int catdoesmath(int a, int b) {
		return a + b;
	}
	public void doesathing(int a) {
		while (a > 1) {
			System.out.println("Cat does a thing" + a);
			a = a - 1;
		}
	}
}
