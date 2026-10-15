package com.kodewala.oops.encapsulation;

public class Driver1 {

	public static void main(String[] args) {

		Payment1 payment1 = new Payment1(1000);

		payment1.doCredit(200); // Here programmer is able to change balance

		System.out.println(payment1.balance);

		// Directly modifying the data of Payment1 class
		payment1.balance = 200000; // Here programmer is also able to change balance
									// That's why Payment1 class is not well encapsulated
									// That's why we make variable private in encapsulation(see Driver2 class and Payment2 class)
		System.out.println(payment1.balance);
	}

}
