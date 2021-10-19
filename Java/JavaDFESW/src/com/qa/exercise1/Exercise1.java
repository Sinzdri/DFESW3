package com.qa.exercise1;


public class Exercise1 {
	    public static void main(String[] args) {
	        boolean amIHappy = false; // A boolean names amIHAppy is being declared and assigned false
	        int weight = 20; // integer value for weight attribute
	        String name = "Billy Bob"; // define name
	        Dog goodBoy = new Dog(name, weight); //New object goodBoy of class Dog
	        int x = weight - 10; //  
	        if (x < 15) goodBoy.bark();  //use method bark if a small dog
	        while (x < 3) { 
	            goodBoy.play(); //use method play if x if small
	        }
	        int[] numList = {1,2,3,4,5,6}; //define a list of numbers
	        System.out.println("How are you"); //print a string
	        System.out.println("My " + name + " is doing great" //print a string including defined name, string concatination
	                + " how's yours");
	        String num = "305"; 
	        int z = Integer.parseInt(num); //convert string of numbers to integer value
	    }
	    
}
