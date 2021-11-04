package com.qa.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] args) {
		//define array lists to test stream methods on
		List<String> names = Arrays.asList("Fred", "Charles", "Charlotte", "Jess");
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		//Foreach
		names.stream().forEach(n -> System.out.println(n));
		
		//Filter
		names.stream().filter(e -> e.startsWith("F")).forEach(System.out::println);
		List<String> newnames = names.stream().filter(e -> e.startsWith("C")).collect(Collectors.toList());
		
		//Map
		List<String> greetNames = names.stream().map(e -> "Hello " + e).collect(Collectors.toList());
		greetNames.forEach(System.out::println);
		numbers.stream().map(i -> i * i).forEach(n -> System.out.println(n));
		
		//Reduce
		Integer reduced = numbers.stream().reduce((a,  b) -> {
			System.out.println(a + " " + b);
			return a + b;
		}).get();
		
		//Sorted
		names.stream().sorted().forEach(n -> System.out.println(n));
		System.out.println(names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
	}
}
