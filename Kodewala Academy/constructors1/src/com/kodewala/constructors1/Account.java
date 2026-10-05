package com.kodewala.constructors1;

public class Account {

	int amount;
	String name;

// If developer is not providing any constructor then compiler will create no args constructor which is called default constructor
	public Account() {
		System.out.println("Inside Account");
	}

	public Account(int _amount, String _name) {

		System.out.println("Account(int _amount, String _name)");
		this.amount = _amount;
		this.name = _name;
	}

}
