package com.kodewala.constructors7;

public class SavingAccount extends BankAccount {

	double interestRate;

	public SavingAccount(String accountNumber, String customerName, double balance, double interestRate) {

		super(accountNumber, customerName, balance);

		this.interestRate = interestRate;

	}
}
