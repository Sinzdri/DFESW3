package com.qa.animals;

public class Birds extends Animal{
//attributes
	private boolean canFly;
	private int wingSpan;
//methods
	public void fly() {
		if (canFly == true) {
			System.out.println(getName() + " is flying");
		}
		else {System.out.println("Not all birds can fly");
	}
	}
	public void whatAmI() {
		System.out.println("I am a bird");
	}

	
@Override
	public String toString() {
		return "Birds [canFly=" + canFly + ", wingSpan=" + wingSpan + "]";
	}

	//getters and setters
	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	public int getWingSpan() {
		return wingSpan;
	}
	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}
//constructor
	public Birds(String name, int weight, boolean extinct, boolean canFly, int wingSpan) {
		super(name, weight, extinct);
		this.canFly = canFly;
		this.wingSpan = wingSpan;
	}
}

