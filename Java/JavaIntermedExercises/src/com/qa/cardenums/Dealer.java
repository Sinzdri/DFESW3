package com.qa.cardenums;

import java.util.Random;

public class Dealer {
	private String name;
	private int points = 0;
	public void deal() {		//define method to deal card
		Card card = new Card();			//creates new card with no contructor arguments, so random
		System.out.println(card.toString());
	}
	
	public Card deal2() {
		return new Card();
	}
	
	public Card dealaCard() {
        return new Card(Rank.values()[new Random().nextInt(Rank.values().length)],	//create new card 
                Suit.values()[new Random().nextInt(Suit.values().length)]);
    }
	
	public Dealer(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
}
