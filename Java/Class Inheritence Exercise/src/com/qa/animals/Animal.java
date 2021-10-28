package com.qa.animals;

public abstract class Animal {
//Define attributes
	private String name;
	private int weight;
	private boolean extinct;

//methods
	public void whatAmI(){
		System.out.println("I am a generic animal");
	}


@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + ", extinct=" + extinct + "]";
	}


	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isExtinct() {
		return extinct;
	}

	public void setExtinct(boolean extinct) {
		this.extinct = extinct;
	}

//constructor
	public Animal(String name, int weight, boolean extinct) {
		this.name = name;
		this.weight = weight;
		this.extinct = extinct;
	}

	

	
}
