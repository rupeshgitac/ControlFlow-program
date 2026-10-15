package com.kodewala.string4;

public class Driver1 {

	public static void main(String[] args) {

		String s3 = new String("Hello"); // Object created in (heap + scp)===>  scp = Hello, heap = Hello
											// s3 pointing to heap object(s3 --> Hello)
		String s4 = s3.concat("World"); // World is created in SCP but no one(no reference) is pointing to World
		                    // HelloWorld is created in heap and s4 is pointing to HelloWorld

		System.out.println(s3); // Hello
		System.out.println(s4); // HelloWorld
	}

}

// So total 4 Object are created