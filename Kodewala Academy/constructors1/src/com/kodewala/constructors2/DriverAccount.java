package com.kodewala.constructors2;

class Account {

	static String bankName = "SBI";

	String accountNumber;
	String customerName;
	double balance;

	Account(String accountNumber, String customerName, double balance) {
		super();

		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
	}
}

public class DriverAccount {

	public static void main(String[] args) {

		Account a1 = new Account("A101", "Rahul", 50000);
		Account a2 = new Account("A102", "Amit", 70000);

		System.out.println(a1.customerName + " - " + a1.bankName);
		System.out.println(a2.customerName + " - " + a2.bankName);

		/*Account.bankName = "HDFC";

		System.out.println(a1.customerName + " - " + a1.bankName);
		System.out.println(a2.customerName + " - " + a2.bankName);*/
	}
}
