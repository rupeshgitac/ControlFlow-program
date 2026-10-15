package com.kodewala.sb;

public class Driver1 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Kodewala"); // StringBuilder Object --> mutable

		for (int i = 0; i < 10; i++) {

			sb.append(" Academy " + i); // same object is being modified, no new object is created
		}

		System.out.println(sb); // Kodewala Academy --> Here No new object is created because StringBuilder is
								// mutable so StringBuilder is modifying the existing object
								// in case of String new object is created because String is immutable, String
								// does not modify the existing object,it will create new object
	}

}
