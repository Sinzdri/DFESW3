package com.qa.main;

import com.qa.animals.Birds;
import com.qa.animals.Fish;

public class Main {
public static void main(String[] args) {
	Birds owl = new Birds("Owl", 10, false, true, 3);
	Fish dogfish = new Fish("Dogfish", 5, false, true, "brown");
	owl.fly();
	System.out.println(owl.toString());
	dogfish.swim();
}
}
