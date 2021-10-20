package com.qa.main;
//Fizzbuzz if multiple of 5 and 3, fizz if multiple of 3, buzz if multiple of 5
public class FizzBuzz {
	public static String fizzBuzz(int x){
		if (x % 3 == 0 && x % 5 == 0) {
			return "FizzBuzz";
		}
		else if (x % 3 == 0) {
			return "Fizz";
		}
		else if (x % 5 == 0) {
			return "Buzz";
		}
		else {
			return String.valueOf(x); //convert integer to string to be able to return "number" 
		}
	}
}
