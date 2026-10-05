package com.kodewala.constructors4;

// Practice
class Student2 {

	Student2() {
		System.out.println("Student no-args constructor");
	}

	Student2(String name) {
		super();
		System.out.println("Student parameterized constructor");
		System.out.println("Name: " + name);
	}

	public static void main(String[] args) {
		Student2 s = new Student2("Kodewala");
	}
}