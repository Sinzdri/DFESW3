package com.qa.vehicle;

public class Car extends Vehicle {
//attributes	
	public boolean automatic;
	public boolean fourwd;
	
//methods
@Override
	public int fixCost(){
	int x = 0;
	if (automatic == false) {
		x = 500*(numberOfSeats);
	}
	else{
		x = 600*(numberOfSeats);	
	}
	if (fourwd == true) {
		x += 100*(numberOfSeats);
	}
	return x;
	}


@Override
public String toString() {
	return "Car [automatic=" + automatic + ", fourwd=" + fourwd + ", numberOfSeats=" + numberOfSeats + ", name=" + name
			+ ", colour=" + colour + ", repairStatus=" + repairStatus + ", vehicleID=" + vehicleID + "]";
}

//getters and setters


//constructor
public Car(int numberOfSeats, String name, String colour, boolean automatic, boolean fourwd) {
	super(numberOfSeats, name, colour);
	this.automatic = automatic;
	this.fourwd = fourwd;
}



}
