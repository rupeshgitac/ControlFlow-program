package com.kodewala.twelve.october;

public class Question23 {

	public static void main(String[] args) {

		String s1 = "Java";

		String s2 = new String("Java");

		String s3 = s2.intern();

		System.out.println(s1 == s2); // false

		System.out.println(s1 == s3); // true

		System.out.println(s2 == s3); // false

	}

}
