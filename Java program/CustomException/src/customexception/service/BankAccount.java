package customexception.service;

import customexception.InsufficientBalanceException;

public class BankAccount {

	private long accountNumber;
	private double balance;

	public BankAccount(long accountNumber, double balance) {
		// super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public boolean withdraw(double amount) {
		try {
			if (this.balance >= amount) {
				this.balance = this.balance - amount;
				System.out.println(amount + " has been withdrawn");
				System.out.println("The remaining balance is: " + this.balance);
				return true;
			} else {
				throw new InsufficientBalanceException("Error :Insufficient Balance");
			}
		} catch (InsufficientBalanceException ex) {
			ex.printStackTrace();
			return false;
		}

	}

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount(10001, 10000);
		System.out.println(bankAccount.withdraw(12000));
	}

}
