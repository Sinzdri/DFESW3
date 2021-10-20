package com.qa.main;
//Given 3 numbers, calculate sum of unique numbers
public class UniqueSum {
	public static int uniqueSum(int x, int y, int z) {
		if (x == y && x == z) {
			return 0;
		}
		else if (x == y) {
			return z;
		}
		else if (x == z) {
			return y;
		}
		else if (y == z) {
			return x;
		}
		else return x + y + z;
	}
}
