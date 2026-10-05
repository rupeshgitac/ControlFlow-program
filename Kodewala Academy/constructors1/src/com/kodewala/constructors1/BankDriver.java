package com.kodewala.constructors1;
// Practice
class BankAccount {

	static double interestRate = 7.5;

	int balance;
	String accountNumber;
	String accountHolder;
	String branch;

	public BankAccount(int _balance, String _accountNumber, String _accountHolder, String _branch) {
		// super();

		this.balance = _balance;
		this.accountNumber = _accountNumber;
		this.accountHolder = _accountHolder;
		this.branch = _branch;
	}
}

public class BankDriver {

	public static void main(String[] args) {

		BankAccount acc1 = new BankAccount(50000, "ACC101", "Ravi", "BTM Layout 1st Stage");
		BankAccount acc2 = new BankAccount(80000, "ACC102", "Suresh", "Electronic City");

		System.out.println("Account 1 : " + acc1.accountNumber + ", " + acc1.accountHolder + ", " + acc1.balance + ", "
				+ acc1.interestRate + ", " + acc1.branch);

		System.out.println("Account 2 : " + acc2.accountNumber + ", " + acc2.accountHolder + ", " + acc2.balance + ", "
				+ acc2.interestRate + ", " + acc2.branch);
	}
}
