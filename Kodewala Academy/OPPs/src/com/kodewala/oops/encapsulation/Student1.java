package com.kodewala.oops.encapsulation;

public class Student1 {

	private int marks;

	// Setter method
	public void setMarks(int marks) {

		if (marks >= 0 && marks <= 100) {
			this.marks = marks;
		} else {
			System.out.println("Invalid marks!");
		}

	}

	// Getter method
	public int getMarks() {
		return marks;
	}
}
