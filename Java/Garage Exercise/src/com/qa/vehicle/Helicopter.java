package com.qa.vehicle;

public class Helicopter extends Vehicle{
//attributes
	private int propellorSpeed;
	private int numberOfWindows;

//methods
@Override
	public int fixCost(){
	return 500*(numberOfSeats+propellorSpeed+numberOfWindows);
	}


@Override
public String toString() {
	return "Helicopter [propellorSpeed=" + propellorSpeed + ", numberOfWindows=" + numberOfWindows + ", numberOfSeats="
			+ numberOfSeats + ", name=" + name + ", colour=" + colour + ", repairStatus=" + repairStatus
			+ ", vehicleID=" + vehicleID + "]";
}

//constructor
public Helicopter(int numberOfSeats, String name, String colour, int propellorSpeed,
		int numberOfWindows) {
	super(numberOfSeats, name, colour);
	this.propellorSpeed = propellorSpeed;
	this.numberOfWindows = numberOfWindows;
}

}
