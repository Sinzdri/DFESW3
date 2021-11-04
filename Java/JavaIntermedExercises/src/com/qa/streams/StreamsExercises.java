package com.qa.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Given the following List of names, using a stream, have it print "Hello " in front of each name besides "James".
//
//("Michael", "Dean", "James", "Chris")
//Given the following List of Integers, using a stream, have it reduce and print the product (all numbers multiplied together).
//
//(3, 4, 7, 8, 12)
//Starting with a list of numbers, use streams to do the following:
//
//Find the max value.
//Find the min value.
//Remove the odd numbers.
//Remove the even numbers.
//Find the sum of the list.
//Square every number in the list then remove the even numbers and then find the min value.
public class StreamsExercises {
	
	public static boolean notJames(String x) {
		if (x.equals("James")) {
		return false;
		}
		else {return true;}
	}
	public static void main(String[] args) {
	List<String> names = Arrays.asList("Michael", "Dean", "James", "Charles");
	
	List<String> newnames = names.stream().filter(e -> e != ("James")).collect(Collectors.toList());
	
	List<String> greetNames = newnames.stream().map(e -> "Hello " + e).collect(Collectors.toList());

	names.stream().filter(e -> e != ("James")).map(e -> "Hello " +e).collect(Collectors.toList()).forEach(x -> System.out.println(x));
	names.stream().map(n -> !"James".equalsIgnoreCase(n) ? "Hello ".concat(n) : n).forEach(System.out::println);
	List<Integer> numbers = Arrays.asList(3,4,7,8,12,15);
	
	Integer reduced = numbers.stream().reduce((a,  b) -> {
		return a * b;
	}).get();
	
	int reduced2 = numbers.stream().reduce((a, b) -> a*b).get();
//	int max2 = numbers.stream().max().getAsInt();
	int max = numbers.stream().max(Integer::compare).get();
	int min = numbers.stream().min((i, j) -> i.compareTo(j)).get();
	List<Integer> evennumbers = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
	List<Integer> oddnumbers = numbers.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
	int sum = numbers.stream().reduce((a, b) -> a+b).get();
	int minsquaredodd = numbers.stream()
						.map(x -> x*x)
						.filter(x -> x % 2 != 0)
						.min(Integer::compare)
						.get();
//	greetNames.forEach(System.out::println);
	System.out.println(reduced);
	System.out.println(reduced2);
	System.out.println(max);
	System.out.println(min);
	System.out.println(evennumbers);
	System.out.println(oddnumbers);
	System.out.println(sum);
	System.out.println(minsquaredodd);
	}

}
