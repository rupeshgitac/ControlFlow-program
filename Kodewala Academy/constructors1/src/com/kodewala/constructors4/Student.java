package com.kodewala.constructors4;

// Practice
class Student {

	Student() {
		System.out.println("Student no-args constructor");
	}

	Student(String name) {
		this();
		System.out.println("Student parameterized constructor");
		System.out.println("Name: " + name);
	}

	public static void main(String[] args) {
		Student s = new Student("Kodewala");
	}
}