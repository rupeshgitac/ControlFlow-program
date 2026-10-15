package com.kodewala.string2;

public class DriverEx {

	public static void main(String[] args) {

		String s1 = new String("Kodewala");
		String s2 = new String("Kodewala");

		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true

	}

}
