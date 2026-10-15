package com.kodewala.twelve.october;

public class Question28 {

	public static void main(String[] args) {

		String s1 = new String("Spring");

		String s2 = s1.intern();

		System.out.println(s1 == s2); // false

		System.out.println(s2 == "Spring"); // true

	}

}
