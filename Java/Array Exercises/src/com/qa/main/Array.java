package com.qa.main;
//Exercise - Create an array of numbers 1 - 10
//Print out the number * 2 ( 2 -> 4, 3 ->6)
//Print out the squared value of each of the numbers (2 -> 4, 3 -> 9)
//Have a second array created with 10 numbers 1,1,1,1,1.. when you square the number from the first array, modify the 2nd array to have the squared number
public class Array {
	public static void arrayNumbers(){
	 int[] numbers = {1,2,3,4,5,6,7,8,9,10};
	 for (int i=0; i < numbers.length; i++) {
		 System.out.println(numbers[i]*2);
	 }
	}
	public static void arrayNumbersSquared(){
		 int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		 int[] numbers2 = {1,1,1,1,1,1,1,1,1,1};
		 for (int i=0; i < numbers.length; i++) {
			 System.out.println(numbers[i]*numbers[i]);
			 numbers2[i] = numbers[i]*numbers[i];
		 }
		 for (int i=0; i < numbers2.length; i++) {
			 System.out.println(numbers2[i]+" ");
		 }
		}
	public static void arrayNumbersSquaredReverse(){
		 int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		 int[] numbers2 = {1,1,1,1,1,1,1,1,1,1};
		 int j = 9;
		 for (int i=0; i < numbers.length; i++) {
			 System.out.println(numbers[i]*numbers[i]);
			 numbers2[j] = numbers[i]*numbers[i];
			 j--;
		 }
		 for (int i=0; i < numbers2.length; i++) {
			 System.out.println(numbers2[i]+" ");
		 }
		}

}
