package com.kodewala.oops.encapsulation;

public class FundTransfer {

	public static void main(String[] args) {

		// Create a bank account
		BankAccount account = new BankAccount("Kodewala", 63970567890L, 10000);

		// Display account details
		System.out.println("Account Holder: " + account.getAccountHolderName());

		System.out.println("Account Number: " + account.getAccountNumber());

		System.out.println("Current Balance: " + account.getBalance());

		System.out.println("-----------------------");

		// Transfer a valid amount
		account.transferFund(3000);

		System.out.println("-----------------------");

		// Try a negative amount
		account.transferFund(-500);

		System.out.println("-----------------------");

		// Try an amount greater than the balance
		account.transferFund(20000);

		System.out.println("-----------------------");

		// Display final balance
		System.out.println("Final Balance: " + account.getBalance());
	}
}
