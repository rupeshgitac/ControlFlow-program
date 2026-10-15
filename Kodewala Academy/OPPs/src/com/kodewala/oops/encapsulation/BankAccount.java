package com.kodewala.oops.encapsulation;

public class BankAccount {

	// Private data members
	private String accountHolderName;
	private long accountNumber;
	private double balance;

	// Constructor
	public BankAccount(String accountHolderName, long accountNumber, double balance) {

		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// Getter method for account holder name
	public String getAccountHolderName() {
		return accountHolderName;
	}

	// Getter method for account number
	public long getAccountNumber() {
		return accountNumber;
	}

	// Getter method for balance
	public double getBalance() {
		return balance;
	}

	// Fund transfer method
	public void transferFund(double amount) {

		if (amount <= 0) {
			System.out.println("Amount must be positive.");
		} else if (amount > balance) {
			System.out.println("Insufficient balance.");
		} else {
			balance = balance - amount;

			System.out.println("Fund transferred successfully.");
			System.out.println("Transferred amount: " + amount);
			System.out.println("Remaining balance: " + balance);
		}
	}
}