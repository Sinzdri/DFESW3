package com.qa.garage;

import java.util.ArrayList;
import java.util.List;
import com.qa.vehicle.Vehicle;

public class Garage {
public List<Vehicle> garageVehicles = new ArrayList<>();
public void addVehicle(Vehicle vehicle){
	garageVehicles.add(vehicle);
	System.out.println(vehicle + "has been added to the garage");
}
public void removeVehicle(Vehicle x) {
	for (Vehicle i:garageVehicles) {
		if (i == x) {
			garageVehicles.remove(i);
			System.out.println(i.name + " with ID "+ x.vehicleID + " has been removed");
		}
	}
}
public void updateVehicle(Vehicle oldvehicle, Vehicle newvehicle) {
	int index = -1;
	for (Vehicle i:garageVehicles) {
		index ++;
		if (i == oldvehicle) {
			garageVehicles.set(index, newvehicle);
			System.out.println(oldvehicle + " has been updated to " + newvehicle);
			return;
		}
	}
	System.out.println("Please check your input, vehicle not found");
}
public void readVehicle(Vehicle x) {
	for (Vehicle i:garageVehicles) {
		if (i == x) {
			System.out.println(x.toString());
		}
	}
}
public void removeAllVehicles() {
	garageVehicles.clear();
	System.out.println("All vehicles have been removed");
}
public void fixVehicle(Vehicle x) {
	for (Vehicle i:garageVehicles) {
		if (i == x) {
			System.out.println(x.fixVehicle());
//			System.out.println(i.name + " with ID "+ i.vehicleID + " has been fixed");
//			System.out.println("The cost of repair was " + i.fixVehicle());
		}
	}

}
@Override
public String toString() {
	return "Garage [garageVehicles=" + garageVehicles + "]";
}
}
