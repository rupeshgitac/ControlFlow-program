package com.kodewala.constructors3;

//25.09.2026
class SuperUser { // extends Object

}

public class User extends SuperUser {

	String userName;
	String userId;
	String mobile;

	public User(String _userName, String _userId, String _mobile) {

		this(); // calling same class constructor i.e. User class constructor and it must be
				// first statement
		this.userName = _userName;
		this.userId = _userId;
		this.mobile = _mobile;
	}

	public User() {
		System.out.println("User()...no args constructor");
	}
}
