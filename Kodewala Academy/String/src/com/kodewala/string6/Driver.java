package com.kodewala.string6;

class AccountMgmt { // This class cannot become parent

	int UPI_LIMIT = 100000; // Constant in java

	final public void doSomething1() {
		// some function.......android
	}

	public void doSomething2() {
		// some function.......android
	}

}

class Account extends AccountMgmt {

	@Override
	public void doSomething2() {
		// some function.......Iphone
	}
}

public class Driver {

	public static void main(String[] args) {

	}

}
