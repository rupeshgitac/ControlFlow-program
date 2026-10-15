package com.kodewala.oops.encapsulation;

public class Payment2 {

	private int balance; // Data or Variable

	public Payment2(int balance) {
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

	// getter
	public int getBalance() {

		return balance;
	}

}
