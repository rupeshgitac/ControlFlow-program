package com.kodewala.oops.encapsulation;

// With encapsulation
public class StudentResult1 {

	public static void main(String[] args) {

		Student1 s1 = new Student1();

		s1.setMarks(90);

		System.out.println("Student marks: " + s1.getMarks());

		// Trying to assign invalid marks
		s1.setMarks(-65);

		System.out.println("Student marks: " + s1.getMarks());

	}

}
