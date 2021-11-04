package com.qa.maps;

import java.util.HashMap;

public class Maps {
	public static void main(String[] args) {
		HashMap<Integer, String> animals = new HashMap<Integer,String>();
		
		animals.put(1, "Tiger");
		animals.put(2, "Capybara");
		animals.put(3, "Rabbit");
		animals.put(4, "Hippo");

		animals.forEach((x, i) -> System.out.println(x + " " + i));
		System.out.println(animals.values());
		for (String e: animals.values()) {
			System.out.println("Value: " + e);
		}
		for (Integer i: animals.keySet()) {
			System.out.println("Key: " + i);
		}
		for (Integer i: animals.keySet()) {
			System.out.println(String.format("Key: %d, Value %s", i, animals.get(i)));
		}
	}
}
