package com.qa.enums;

public class EnumExercise {
	public enum Vehicles{
		
		CAR(60),
		BIKE(10),
		TRAIN(100),
		PLANE(200),
		BOAT(30);
		private final int speed;
		Vehicles veh[] = Vehicles.values();
		Vehicles(int speed){
			this.speed = speed;
		}
		
	}
}
