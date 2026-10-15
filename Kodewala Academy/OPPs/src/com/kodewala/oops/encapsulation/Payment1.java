package com.kodewala.oops.encapsulation;

// This class is not well encapsulated because programmer is able to change balance in Driver1 class that's why we need to make variable private in encapsulation
public class Payment1 {

	public int balance; // Data or Variable

	public Payment1(int balance) {
		super();
		this.balance = balance;
	}

	// setter
	public void doDebit(int _amount) {

		// modifying the data
		balance = balance - _amount;
	}

	public void doCredit(int _amount) {

		if (_amount > 0) {
			// modifying the data
			balance = balance + _amount;
		}
	}

	public int getBalance() {

		return balance;
	}

}
