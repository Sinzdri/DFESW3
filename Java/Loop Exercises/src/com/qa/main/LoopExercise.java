package com.qa.main;

import java.util.Random;
//Task - Create a new class and method that do the following:
//- Using a while loop start with a beginning total (300), 
//subtract an amount of money from it (45) until the total goes less than another value (87)
//When the total goes below the set value, print out "You're spending too much money!"
//Edit to withdraw random value and have inputs for start total and minimum value
public class LoopExercise {
	public static void loopExercise(int x, int y) {
		while (x>y) {
			x -= new Random().nextInt(101);
			System.out.println(x);
		}
		System.out.println("You're spending too much money");
	}
	public static void loopExercisedowhile(int x, int y) {
		do {
			x -= new Random().nextInt(101);
			System.out.println(x);
		} while (x>y);
		System.out.println("You're spending too much money");
	}
}
