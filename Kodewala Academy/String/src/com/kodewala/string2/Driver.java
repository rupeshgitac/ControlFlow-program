package com.kodewala.string2;

public class Driver {

	public static void main(String[] args) {

		String s1 = "Kodewala"; // SCP --> 123qwe

		String s2 = new String("Academy"); // one object in scp + one in heap --> 432vcx

		System.out.println(s1 == s2); // 123qwe == 432vcx --> false

		String s3 = new String("Kodewala");

		String s4 = new String("KodewalA");

		System.out.println(s4 == s3); // false

		System.out.println(s4.equals(s3)); // false

	}

}
