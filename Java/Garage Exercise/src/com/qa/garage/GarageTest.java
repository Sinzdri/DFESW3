package com.qa.garage;

import com.qa.vehicle.Bus;
import com.qa.vehicle.Car;
import com.qa.vehicle.Helicopter;

public class GarageTest {
	public static void creategarage(){
		
//create and populate garage
	Garage storage = new Garage();
	Car Prius = new Car(5, "Prius", "Orange", true, false);
	Car Yaris = new Car(5, "Yaris", "Black", true, false);
	Helicopter Copter = new Helicopter(2, "Copter", "Gold", 5, 8);
	Bus Bus1 = new Bus(30, "Bus1", "White", 12, false);
	Bus Schoolbus = new Bus(30, "Schoolbus", "White", 12, false);
	storage.addVehicle(Prius);
	storage.addVehicle(Copter);
	storage.addVehicle(Bus1);
	storage.addVehicle(Schoolbus);
	storage.readVehicle(Prius);
	storage.updateVehicle(Prius, Yaris);
	storage.fixVehicle(Schoolbus);
	System.out.println(storage.toString());
	}
}
