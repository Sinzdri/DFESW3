package com.qa.animals;

public class Turtle {
	
	//First define attributes
	int age;
	boolean intheOcean = true;
	String Colour = "Purple";
	String favouriteFood;
	int speed;
	
	//Methods - CAN DOS, GIVE DESCRIPTIVE NAMES
	
	public void dance() {
		System.out.println("I dance");
	}
	public void speeding(boolean policeTurtle) {
		if (speed > 35 && policeTurtle == false) {System.out.println("Slow down");
		}
		else System.out.println("You are not speeding");
	}
	public void drawaturtle() {
		int x = 5;
		while (x > 5) {
			System.out.println("X");
			x = x - 1;
		}
		
	}
	public void doesathing(int a) {
		while (a > 1) {
			System.out.println("Turtle does a thing" + a);
			a = a - 1;
		}
	}
	
	
	@Override
	public String toString() {
		return "Turtle [age=" + age + ", intheOcean=" + intheOcean + ", Colour=" + Colour + ", favouriteFood="
				+ favouriteFood + ", speed=" + speed + "]";
	}
	//CONSTRUCTORS
	public Turtle(int age, int speed, boolean intheOcean, String Colour, String favouriteFood)	{
		this.age = age;
		this.intheOcean = intheOcean;
		this.Colour = Colour;
		this.favouriteFood = favouriteFood;
		this.speed = speed;
	}
}
