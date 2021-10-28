package com.qa.main;

public class Runner {
public static void main(String[] args) {
	int x = Integer.parseInt(args[0]);
	int y = Integer.parseInt(args[1]);
	int z = 0;
	if (args[2].equals("add")) {
		z = x+y;
		}
	if (args[2].equals("subtract")) {
		z = x-y;
		}
	if (args[2] == "multiply") {
		z= x*y;
		}
	if (args[2] == "divide") {
		z = x/y;
		}
	System.out.println(z);
//	else System.out.println("Please input a valid argument (format x y operation");
//	

}
}
