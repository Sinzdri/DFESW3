package com.qa.main;
//Create the tax class, it contains 2 methods.
//
//Method 1 - which takes a salary and works out the percentage by which the salary will be taxed.
//
//Method 2 - which works out the exact amount that the user will be taxed using a similar process to that in the first method. That amount should be returned and output to the console.
//
//These 2 methods should be able to work independently, so it is fine in this case if some of the code is repeated.*
//
//The salaries are taxed as below:
//
//0 - 14,999 : 0% tax
//15,000 - 19,999 : 10% tax
//20,000 - 29,999 : 15% tax
//30,000 - 44,999 : 20% tax
//45,000+ : 25% tax
//Finally combine the 2 methods so that the second method utilizes the first method to return the correct result.
public class Taxes {
	public static int taxBracket(int x) {
		if (x < 15000)
			return 0;
		else if (x < 20000)
			return 10;
		else if (x < 30000)
			return 15;
		else if (x < 45000)
			return 20;
		else return 25;
	}
//	public static int exactTax(int x) {
//		if (x < 15000)
//			return 0;
//		else if (x < 20000)
//			return (x/100)*10;
//		else if (x < 30000)
//			return (x/100)*15;
//		else if (x < 45000)
//			return (x/100)*20;
//		else return (x/100)*25;
//	}
	public static int exactTax(int x) {
		int bracket = taxBracket(x);
		if (bracket == 0) {
			return 0;
		}
		else return (x/100)*bracket;
	}
}
