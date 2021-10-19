package com.qa.main;

public class Returns {
	public static char charMethod() {
		return 'a'; 
	}
	public static float floatMethod() {
		return 1.0f;
	}
	public static boolean booleanMethod() {
		return true;
	}
	public static double doubleMethod() {
		return 1.0;
	}
	public static String stringMethod() {
		return "This is a string";
	}
	Turtle mrBubbles = new Turtle(7, 37, true, "Purple", "Catfish");
	public static String turtleDetails() {
		Turtle mrBubbles = new Turtle(7, 37, true, "Purple", "Catfish");
		return mrBubbles.toString();
	}
	public static Turtle turtleMethod() {
		Turtle mrBubbles = new Turtle(7, 37, true, "Purple", "Catfish");
		return mrBubbles;
	}
}
