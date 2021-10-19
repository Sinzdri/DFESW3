package com.qa.main;

public class Calculator {
	public static int addNumbers(int x, int y) {
		return x + y;
	}
	public static int subtractNumbers(int x, int y) {
		return x - y;
	}
	public static int multiplyNumbers(int x, int y) {
		return x * y;
	}
	public static int divideNumbers(int x, int y) {
		return x / y;
	}
	public static int powerNumbers(int x, int y) {
		int result = x;
		while (y > 1){
		result = result * x;
		y = y - 1;}
		return result;
	}
}
