package com.qa.vehicle;

public class Bus extends Vehicle {
//attributes
	public int numberOfWheels;
	public boolean schoolBus;

//methods
@Override
	public int fixCost(){
	if (schoolBus == true) {
		return 500*(numberOfSeats+numberOfWheels);
	}
	else{
		return 1000*(numberOfSeats+numberOfWheels);	
	}
	}





public Bus(int numberOfSeats, String name, String colour, int numberOfWheels, boolean schoolBus) {
	super(numberOfSeats, name, colour);
	this.numberOfWheels = numberOfWheels;
	this.schoolBus = schoolBus;
}

}
