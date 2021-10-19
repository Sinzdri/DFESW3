package com.qa.main;

import com.qa.animals.Turtle;

public class Main {
	public static void main(String[] args) {
	Turtle mrBubbles = new Turtle(7, 37, true, "Purple", "Catfish");
	mrBubbles.speeding(false);
	System.out.println(mrBubbles.toString());
	Turtle petturtle = new Turtle(4, 22, false, "Green", "Turtlefood");
	System.out.println(petturtle.toString());
	petturtle.speeding(false);
	}
}
