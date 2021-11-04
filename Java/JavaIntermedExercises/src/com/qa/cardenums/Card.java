package com.qa.cardenums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Card {
	private final Rank RANK;
	private final Suit SUIT;
	
	public static Rank randomRank () {
	List<Rank> ranks = Arrays.asList(Rank.values());		//randomly selects a rank from RANK enums, using array list shuffling and streaming
	Collections.shuffle(ranks);
	return ranks.stream().findFirst().get();
	}
	
	public static Rank randomRank2 () {
		return Rank.values()[new Random().nextInt(Rank.values().length)];
		}
	
	
	public static Suit randomSuit () {
	List<Suit> suits = Arrays.asList(Suit.values());
	Collections.shuffle(suits);
	return suits.stream().findFirst().get();
	}
	
	public static Suit randomSuit2 () {
		return Suit.values()[new Random().nextInt(Suit.values().length)];
		}
	
	public Card(Rank rank, Suit suit) {
		this.RANK = rank;
		this.SUIT = suit;
	}
	
	public Card() {
		this.RANK = randomRank();
		this.SUIT = randomSuit();
	}

	@Override
	public String toString() {
		return "Card [RANK=" + RANK + ", SUIT=" + SUIT + "]";
	}
	
	
	

}
