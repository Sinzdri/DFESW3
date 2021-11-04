package com.qa.cardenums;

public class Main {
	public static void main(String[] args) {
		Dealer Bob = new Dealer("Bob");	//create dealer instance Bob
		Bob.deal(); // Use dealer method 
		Bob.deal();
		Bob.deal();
		Bob.deal();
		System.out.println(Bob.dealaCard().toString());
//		Card card = new Card(Rank.FIVE, Suit.CLUBS);	create predefined card as test
//		System.out.println(card.toString());	
	}
	
	
}
