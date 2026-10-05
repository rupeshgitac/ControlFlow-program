package com.kodewala.constructors4;

//Practice
class Person {

	public Person() {
		System.out.println("Person Constructor");
	}
}

class Employee extends Person {

	public Employee() {
		super();
		System.out.println("Employee Constructor");
	}

	public static void main(String[] args) {

		Employee emp = new Employee();
	}
}
