package com.qa.optionals;

import java.util.Optional;

public class Optionals {
	public static void main(String[] args) {
		

		Optional<Integer> number = Optional.of(10);
		Optional<Integer> nullNumber = Optional.empty();
		System.out.println("Our value: " + number.get());
		
		String item;
		if (Math.random() >= 0.5) {
			
			item = "Hello";
		}
		else {
			item = null;
		}
		System.out.println(item);
		Optional.of(item);
		if(number.isPresent()) {
			System.out.println(number);
			System.out.println(number.get());
		}
		if(nullNumber.isPresent()) {
			System.out.println(number);
		}
		number.ifPresent(System.out::println);
	}
}
