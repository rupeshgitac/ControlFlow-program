package com.kodewala.twelve.october;

public class Question26 {

	public static void main(String[] args) {

		String a = "Java";

		String b = "Ja";

		String c = b + "va";

		System.out.println(a == c); // false

		System.out.println(a == c.intern()); // true

	}

}
