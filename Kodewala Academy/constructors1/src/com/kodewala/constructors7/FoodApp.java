package com.kodewala.constructors7;

public class FoodApp {

	public static void main(String[] args) {

		FoodOrder fo = new FoodOrder(3115, "Kodewala", 450.0, "Domino", "BTM 2nd Stage Bagalore");

		System.out.println(fo.orderId);
		System.out.println(fo.customerName);
		System.out.println(fo.amount);
		System.out.println(fo.restaurantName);
		System.out.println(fo.deliveryAddress);
	}
}
