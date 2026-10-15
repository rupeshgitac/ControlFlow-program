package com.kodewala.oops.encapsulation;

public class Driver2 {

	public static void main(String[] args) {

		Payment2 payment2 = new Payment2(1000);

		payment2.doCredit(200); // Here programmer is able to change balance

		// System.out.println(payment2.balance);

		// We cannot directly modifying the data of Payment2 class
		// payment2.balance = 200000; // Here programmer is not able to change balance
		// Now Payment2 class is well encapsulated
	
		// System.out.println(payment2.balance);

		System.out.println(payment2.getBalance());
	}

}
