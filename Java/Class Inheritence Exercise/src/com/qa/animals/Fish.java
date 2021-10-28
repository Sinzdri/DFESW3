package com.qa.animals;

public class Fish extends Animal {
//define attributes
	private boolean inWater;
	private String colour;

//methods
	public void swim(){
		System.out.println("Swim swim swim");
	}	
	public void whatAmI() {
		System.out.println("I am a fish");
	}
	
//getters and setters
	public boolean isInWater() {
		return inWater;
	}
	public void setInWater(boolean inWater) {
		this.inWater = inWater;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
//constructor
	public Fish(String name, int weight, boolean extinct, boolean inWater, String colour) {
		super(name, weight, extinct);
		this.inWater = inWater;
		this.colour = colour;
	}
	
}
