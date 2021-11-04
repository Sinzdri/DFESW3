package com.qa.vehicle;

public abstract class Vehicle {
	private int numberOfSeats;
	private String name;
	private String colour;
	private boolean repairStatus = false;
	private static int counter = 0;	//using counter to track how many objects created of class
	private int vehicleID = 0;
	
//methods
	public int fixVehicle(){
		if (repairStatus == true) {
			System.out.println("This vehicle is already repaired");
			return 0;
		}
		else{
			repairStatus = true;
			return fixCost();
		}
	}					//todo - improve method implementation, return more information
	public int fixCost() {
		return 1000 * numberOfSeats; 
	}

	
	@Override
	public String toString() {
		return "Vehicle [numberOfSeats=" + numberOfSeats + ", name=" + name + ", colour=" + colour + ", repairStatus="
				+ repairStatus + ", vehicleID=" + vehicleID + "]";
	}
		
	public Vehicle(int numberOfSeats, String name, String colour) {
		counter ++;	//increment counter
		this.numberOfSeats = numberOfSeats;
		this.name = name;
		this.colour = colour;
		vehicleID = counter;	//set user id to counter value, this way each new user has a unique ID.
	}
	


	
}
