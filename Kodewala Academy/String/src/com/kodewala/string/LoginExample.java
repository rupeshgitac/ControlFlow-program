package com.kodewala.string;

//Practice
public class LoginExample {

	public static boolean validateUsername(String enteredUsername) {

		String registeredUsername = "kodewala123";

		if (enteredUsername.equals(registeredUsername)) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {

		String username = "kodewala123";

		boolean result = validateUsername(username);

		if (result) {
			System.out.println("Login username is correct");
		} else {
			System.out.println("Invalid username");
		}
	}
}