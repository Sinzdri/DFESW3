package com.qa.main;

public class Main {
	public static void main(String[] args) {
//	Array.arrayNumbers();
//	Array.arrayNumbersSquared();
//	Array.arrayNumbersSquaredReverse();
	Order order1 = new Order("Small Espresso", "Small", "Chocolate");
//	CafeObjectBased.addOrder(order1);
	Cafe.addOrder("Small Espresso");
	Cafe.addOrder("Large Cold Brew");
	Cafe.addOrder("Medium Cappucinok");
	Cafe.addOrder("Medium Flat White");
	Cafe.addOrder("Large Choc Cookie Frappe");
	Cafe.addOrder("Small Caramel Iced Latte");
	Cafe.addOrder("Small Americano");
	Cafe.addOrder("Large Cafe Au Lait");
	Cafe.addOrder("Medium Strawberry Iced Tea");
	Cafe.lengthOrders();
	System.out.println(Cafe.listOrders());
	Cafe.removeOrder("Small Americano");
	Cafe.changeOrder(3, "Small Choc Frappe");
	Cafe.doneOrder("Small Espresso");
	Cafe.doneOrder("Large Cafe Au Lait");
	System.out.println(Cafe.listOrders());
	Cafe.lengthOrders();
	}
}
