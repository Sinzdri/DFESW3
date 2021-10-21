package com.qa.main;
//Exercise - You are running a succesful cafe called QA-Cafe. With a list of orders, create methods with paramaters that can do the following:
//2 ArrayLists, one doneOrders and orders
//- Add a new order to an orders array
//- Move an existing order to a 'Done orders array'
//- Return the name of an order
//- Modify the order by index with a new name
//- Remove the order from either arrays
//- Print the length of either arrays
//- Clear either arrays

import java.util.ArrayList;
import java.util.List;

public class CafeObjectBased {
	public static
		List<String> orders = new ArrayList<>();
	public static	
		List<String> doneorders = new ArrayList<>();
	public static void addOrder(String order) {
		orders.add(order);
	}
//	public static void doneOrder(int x) {
//		doneorders.add(orders.get(x));
//		orders.remove(x);
//	}
	public static void doneOrder(String x) {
		int y = 0;
		int j = 0;
		for (String i : orders) {
			j++;
			if(i == x) {
				y = j;
			}
		}
		doneorders.add(orders.get(y-1));
		orders.remove(y-1);
	}
	public static String checkOrder(int x) {
		return orders.get(x);
	}
	public static void changeOrder(int x, String orderchange) {
		orders.set(x, orderchange);
	}
	public static void clearOrders(){
		orders.clear();
		doneorders.clear();		
	}
	public static void removeOrder(String x) {
		int y = 0;
		int j = 0;
		for (String i : orders) {
			j++;
			if(i == x) {
				y = j;
			}
		}
		orders.remove(y-1);
	}
	public static int lengthOrders() {
		System.out.println(orders.size());
		return orders.size();
	}
	public static int lengthDoneOrders() {
		System.out.println(doneorders.size());
		return doneorders.size();
	}
	public static String listOrders() {
		return orders.toString();
	}
	
}
