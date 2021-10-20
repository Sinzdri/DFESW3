package com.qa.main;
//Given 2 integer values greater than 0, return whichever is closest to 21 
//without going over 21. If they both go over 21 then return 0.
public class Blackjack {
	public static int blackJack(int x, int y) {
		if (x > 21 && y > 21) {
			return 0;
		}
		else {
			if (x > y && x <= 21) {
				return x;
			}
			else if (y <= 21) {
				return y;
			}
			else return x;
			}
	}

}
