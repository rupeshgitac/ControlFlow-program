package com.kodewala.string1;

class User {

	String firstName;

	public User(String firstName) {
		super();
		this.firstName = firstName;
	}

}

public class Driver1 {

	public static void main(String[] args) {

		String city1 = "Bangalore"; // one Object is created --> abc123

		String city2 = "Bangalore"; // use the existing --> abc123

		String city3 = "Bangalore"; // use the existing --> abc123

		String city4 = "Bangalore"; // use the existing --> abc123

		String city5 = "Bangalore"; // use the existing --> abc123

		System.out.println(city1 == city2); // true

		System.out.println(city1.equals(city2)); // true --> equals() method compare content in case of String

		User user1 = new User("Kodewala");
		User user2 = new User("Kodewala");

		System.out.println(user1.equals(user2)); // false --> because in case of non String, equals() method does not compare content
		                                         // here is User class(which is non String) that's why it is giving false

	}

}
