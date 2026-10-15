package com.kodewala.string3;

public class Driver {

	public static void main(String[] args) {

		String s = "Kodewala"; // SCP
		// in case I want to change s

		String s2 = s.concat(" Academy"); // trying to change the Object
		// Object created in heap with content (Kodewala Academy)
       // Note--> (Kodewala Academy) is not created in SCP, it is created in heap only
		// In SCP--> (Kodewala) and (Acedemy) only
		System.out.println(s2);

	}

}
