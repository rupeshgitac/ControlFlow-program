package com.kodewala.constructors7;

public class BankingApp {

	public static void main(String[] args) {

		SavingAccount acc = new SavingAccount("08075565473", "Kodewala", 1000000.0, 3.5);

		System.out.println(acc.accountNumber);
		System.out.println(acc.customerName);
		System.out.println(acc.balance);
		System.out.println(acc.interestRate);
	}

}
