package com.kodewala.sb;

public class Driver {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Kodewala"); // StringBuilder Object --> mutable

		sb.append(" Academy");

		System.out.println(sb); // Kodewala Academy --> Here No new object is created because StringBuilder is mutable so StringBuilder is modifying the existing object 
		                        // in case of String new object is created because String is immutable, String does not modify the existing object,it will create new object
	}              

}
