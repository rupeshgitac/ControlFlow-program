package com.kodewala.string1;
// 07.10.2026 --> String
public class Driver {

	public static void main(String[] args) {

		// Create a String Object
		String firstName = "Kodewala";  //Object created in SCP firstName's address--> xyz321
		String lastName = "Kodewala";  // Object with content "Kodewala" already created
		                              //  and lastName refer to existing Object
                                     //   lastName is also pointing to address xyz321
		
		System.out.println(firstName == lastName); // '==' will compare the address of an object
	}

}
