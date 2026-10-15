package com.kodewala.string5;

public class Driver {

	public static void main(String[] args) {

		String s1 = "This " + "is from " + "Kodewala Academy Bangalore";

		// String s1 = "This is from Kodewala Academy Bangalore";  // scp
		System.out.println(s1);

		String s2 = "Kodewala"; // scp
		String s3 = "Academy"; // scp

		String s4 = s2 + s3; // heap --> new StringBuilder();==> heap --> KodewalaAcademy
		
		System.out.println(s4);
		
		String s5 = "KodewalaAcademy"; // scp --> KodewalaAcademy
		
		System.out.println(s5 == s4); // false, hence proved s4 is created in heap and s5 is created in scp
		
		System.out.println(s5 == s4.intern()); // true
                                      
	}

}
