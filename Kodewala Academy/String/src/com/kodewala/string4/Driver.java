package com.kodewala.string4;
// 09.10.2026
public class Driver {

	public static void main(String[] args) {

		String s1 = "Kodewala"; // Object created in SCP(String Constant Pool)
		String s2 = "Academy"; // Object created in SCP(String Constant Pool)

		String s3 = new String("academy");  // Object created in heap + scp
		                                    // s3 pointing to heap object
		
		System.out.println(s3.equals(s2)); // false

	}

}
