package com.kodewala.constructors;

public class AccountHolder {

	int amount;  // instance variables(non-static variables)
	String acount;
	String name;
	String phoneNumber;

	public AccountHolder(int _amount, String _acount, String _name, String _phoneNumber) {
		super();
		this.amount = _amount;   // _amount--> local variables
		this.acount = _acount;
		this.name = _name;
		this.phoneNumber = _phoneNumber;
	}

}
