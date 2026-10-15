package com.kodewala.control.flow2;

public class EcommercePayment {

	public static void main(String[] args) {

		EcommercePayment ecmp = new EcommercePayment();

		ecmp.makePayment("COD");
	}

	public void makePayment(String paymentMethod) {

		switch (paymentMethod) {

		case "UPI":
			System.out.println("Payment using UPI");
			break;
		case "CARD":
			System.out.println("Payment using Credit/Debit card");
			break;
		case "NETBANKING":
			System.out.println("Payment using Net Banking");
			break;
		case "COD":
			System.out.println("Cash on delevery selected");
			break;
		default:
			System.out.println("Invalid payment method");
			break;
		}
	}

}
