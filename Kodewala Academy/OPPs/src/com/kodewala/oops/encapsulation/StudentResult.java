package com.kodewala.oops.encapsulation;

// without encapsulation
public class StudentResult {

	public static void main(String[] args) {

		Student s = new Student();

		s.marks = 90;

		System.out.println("Student marks: " + s.marks);

		// Anyone an assign an invalid value
		s.marks = -50; // Here is problem Java allows us to assign -100 because the variable is
						// declared as public.But a student's marks should not be negative.The program
						// does not prevent this invalid assignment. (see class Student1 class and StudentResult1 class with encapsulation)

		System.out.println("Student marks: " + s.marks);

	}

}
