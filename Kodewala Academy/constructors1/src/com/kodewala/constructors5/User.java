package com.kodewala.constructors5;

public class User {

	String name;
	String type;
	String country;

	User(String _name, String _type, String _country) {
		this.name = _name;
		this.type = _type;
		this.country = _country;
	}

	public User() {
		// System is setting/initializing default values
		this("user123541", "guest_user", "IN"); // calling User class constructor
	}
}
