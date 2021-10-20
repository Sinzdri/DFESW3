package com.qa.main;

public class Flowchart {
	public static void flowChart() {
		int A = 100;
		while (A<=200) {
			System.out.println(A);
			A++;
		}
	}
	public static void flowChartFor() {
		for( int A = 100; A <= 200; A++) {
			System.out.println(A);
		}
	}
	public static void flowChart2() {
		for(int A = 100; A < 200; A++) {
			if (A%2 == 0) {
				System.out.println("-");
			}
			else System.out.println("*");
		}
	}
//	Create a method that can print out the numbers 1-10 10 times each.
	public static void numbers() {
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.println(j);
			}
		}
	}
//	Create a method to print the numbers 1 to 10 as many times as the value of that number.
	public static void numbers2() {
		for(int i = 1; i <= 10; i++) {
			for(int j = i; j <= 10; j++) {
				System.out.println(j);
			}
		}
	}
	
	
}
