package com.kodewala.twelve.october;

public class Question31 {

	public static void main(String[] args) {

		String s1 = "Java";

		String s2 = new String("Java");

		s2.intern();

		System.out.println(s1 == s2);

	}

}
