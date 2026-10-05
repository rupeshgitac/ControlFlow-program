package com.kodewala.constructors7;

// Practice
class Person {

	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Employee extends Person {

	int salary;

	Employee(String name, int age, int salary) {

		super(name, age);

		this.salary = salary;
	}
}

public class DriverEx {

	public static void main(String[] args) {

		Employee e = new Employee("Ajay", 25, 50000);

		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.salary);
	}
}
