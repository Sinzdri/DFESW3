package com.qa.main;
//Given a cost and an amount, work out the change given in specific coinage.
public class Coins {
	public static void changeGiven(double x, double y) {
		int noteten = 0;
		int notefive = 0;
		int coinpound = 0;
		int coinfifty = 0;
		int cointwenty = 0;
		int cointen = 0;
		int coinfive = 0;
		int cointwo = 0;
		int coinone = 0;
		double change = 100*(x - y);
		while (change/1000 >= 1) {
			noteten ++;
			change -= 1000;
		}
		while (change/500 >= 1){
			notefive ++;
			change -= 500;
		}
		while (change/100 >= 1) {
			coinpound ++;
			change -= 100;
		}
		while (change/50 >= 1) {
			coinfifty ++;
			change -= 50;
		}
		while (change/20 >= 1) {
			cointwenty ++;
			change -= 20;
		}
		while (change/10 >= 1) {
			cointen ++;
			change -= 10;
		}
		while (change/5 >= 1) {
			coinfive ++;
			change -= 5;
		}
		while (change/2 >= 1) {
			cointwo ++;
			change -= 2;
		}
		coinone = (int) change;
//		String[] stringArray = {"Ten pound notes","Five pound notes","£1 coins","50p coins","20p coins","10p coins","5p coins",
//				"2p coins","penny coins"};
//		
//		int[] coinArray = {noteten,notefive,coinpound,coinfifty,cointwenty,cointen,coinfive,cointwo,coinone};
//		int j = 0;
//		for (int i : coinArray) {
//			j ++;
//			if (i > 0)
//				System.out.println(stringArray[j-1]);
//				System.out.println(i);
//		}
		System.out.println("Change given is " + noteten + " £10 note, " + notefive + " £5 note, " + 
		 coinpound + " £1 coins, " + coinfifty + " 50p coins, " + cointwenty + " 20p coins, " + cointen + " 10p coins, "
		 + coinfive + " 5p coins, " + cointwo + " 2p coins and " + coinone + " penny coin");
	}
}
