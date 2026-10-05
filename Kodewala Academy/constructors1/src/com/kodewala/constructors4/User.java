package com.kodewala.constructors4;

//25.09.2026
class SuperUser extends Object {

	SuperUser() {
		super(); // Calling super(parent) class no args constructor
		// Execute remaining steps if any
		// ....
	}
}

public class User extends SuperUser {

	String userName;
	String userId;
	String mobile;

	public User(String _userName, String _userId, String _mobile) {
		super(); // Calling super(parent) class constructor
		// First line of constructor either super() or this()
		// If we are not writing super() or this() then compiler add super() with no
		// args by default
		this.userName = _userName;
		this.userId = _userId;
		this.mobile = _mobile;
	}

	public User() {
		System.out.println("User()...no args constructor");
	}
}
