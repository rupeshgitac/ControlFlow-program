package com.kodewala.oops.encapsulation;

public class Driver {

	public static void main(String[] args) {

		Payment payment = new Payment();

		// Directly modifying the data of Payment class
		payment.balance = 1000; // Here programmer is able to change balance
		// That's why Payment1 class is not well encapsulated
		// That's why we make variable private in encapsulation(see Driver2 class and
		// Payment2 class)
		System.out.println(payment.balance);
	}

}
