package com.kodewala.constructors7;

public class FoodOrder extends Order {

	String restaurantName;
	String deliveryAddress;

	public FoodOrder(int orderId, String customerName, double amount, String restaurantName, String deliveryAddress) {

		super(orderId, customerName, amount);

		this.restaurantName = restaurantName;
		this.deliveryAddress = deliveryAddress;
	}
}
