package com.kodewala.control.flow2;

public class EcommerceOrder {

	public void orderStatus(String status) {

		switch (status) {

		case "PLACED":
			System.out.println("Order has been placed");
			break;
		case "CONFIRMED":
			System.out.println("Order has been confirmed");
			break;
		case "SHIPPED":
			System.out.println("Order has been shipped");
			break;
		case "DELIVERED":
			System.out.println("Order has been delivered");
			break;
		case "CANCELLED":
			System.out.println("Order has been cancelled");
			break;
		default:
			System.out.println("Invalid order status");
			break;
		}
	}

	public static void main(String[] args) {

		EcommerceOrder emc = new EcommerceOrder();

		emc.orderStatus("CANCELLED");
	}

}
