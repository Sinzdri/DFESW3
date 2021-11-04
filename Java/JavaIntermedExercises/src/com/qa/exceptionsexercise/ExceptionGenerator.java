package com.qa.exceptionsexercise;

public class ExceptionGenerator {
	public static int divideNumbers(int x,int y) {
		int result = 0; //create result variable
		try { 
			if (y > x) { //if checks if y > x, throw custom exception
			throw new DivisionByLargerNumber("You shouldn't divide an int by too large a number");
			}
			
			result = x/y;

			} catch (NumberFormatException e) { //throws an exception if wrong format entered
				System.out.println("Enter an integer");
				e.printStackTrace();
			}
			catch (ArithmeticException e) {	//throws exception if divide by 0
				System.out.println("Don't enter zero");
				e.printStackTrace();
			}
			catch (DivisionByLargerNumber e) {
				e.printStackTrace();
			}
			catch (Exception e) { //fall back general exception
				System.out.println("No idea what you did to get here tbh");
				e.printStackTrace();
			}
		
		
	return result; //need to return an integer
		}	
	}
	
		
