package com.kodewala.twelve.october;

public class Question30 {

	public static void main(String[] args) {

		String s = new String("Ja") + new String("va");

		s.intern();

		String s1 = "Java";

		System.out.println(s == s1);

	}

}
