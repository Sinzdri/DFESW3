package com.qa.main;

import java.util.Random;
//Dice method exercises
public class Dice {
	public static int d3() {
		return new Random().nextInt(4);
	}
	public static int d4() {
		return new Random().nextInt(5);
	}
	public static int d6() {
		return new Random().nextInt(7);
	}
	public static int d8() {
		return new Random().nextInt(9);
	}
	public static int d10() {
		return new Random().nextInt(11);
	}
	public static int bunchOfDice() {
		return d6() + d6() + d6() + d6();
	}
	public static int bunchOfDice2() {
		return d10() + d10() + d3() + d3();
	}
	public static int bunchOfDice3() {
		return d3() + d4() + d6() + d8() + d10();
	}
	//Sum of 4d6 drop smallest dice
	public static int bunchOfDice4() {
		int result1 = d6();
		int result2 = d6();
		int result3 = d6();
		int result4 = d6();
		int [] resultArray = {result1, result2, result3, result4};
		int[] newresultArray = removeLowest(resultArray);
		int sum = 0;
		for (int i : newresultArray)
		    sum = sum + i;
		return sum;
		}
		
	 public static int[] removeLowest( int... resultArray ) {
	            // Iterate to find lowest value
	            int lowest = resultArray[ 0 ];

	            for ( int i = 1; i < resultArray.length; i++ ) {

	                if ( resultArray[ i ] < lowest ) {
	                    lowest = resultArray[ i ];
	                }
	            }
	            // Build a new array without lowest value
	            int[] newArray = new int[ resultArray.length - 1 ];

	            for ( int i = 0, j = 0; i < resultArray.length; i++ ) {

	                if ( resultArray[ i ] == lowest ) {
	                    continue;//Skip lowest array index
	                }

	                newArray[ j++ ] = resultArray[ i ];
	            }

	            return newArray;
	        }
	 //alternative 4d6 drop 1
//	 			public static int FourD6IgnoringSmallest() {
//	 		        int result = 0;
//	 		    // get the first die result
//	 		        int FirstD6 = SingleDiceRoll.D6();
//	 		    // loop 3 times and compare
//	 		        for (int i=0; i < 3; i++) {
//	 		      // get the second die result
//	 		            int SecondD6 = SingleDiceRoll.D6();
//	 		      // compare results 
//	 		      // add larger result to results
//	 		      // set smaller result as firstD6 variable
//	 		      if (FirstD6 < SecondD6) {
//	 		                result += SecondD6;
//	 		            } else {
//	 		                result += FirstD6;
//	 		                FirstD6 = SecondD6;
//	 		            }
//	 		        }
//	 		        return result;			
					
}


