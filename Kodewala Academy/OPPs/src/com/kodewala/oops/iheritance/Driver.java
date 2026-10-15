package com.kodewala.oops.iheritance;

class Employee {

	String name = "Amit";
	String address = "Bangalore";

	private String empCode = "IC1234";

	public void markIn(String empID) {
		System.out.println("Marking IN " + empID);
	}
}

class Manager extends Employee {

	public void doSomething() {

		System.out.println(name);
		System.out.println(address);
		//System.out.println(empCode); // private member cannot be accessed outside the class
	}
}

public class Driver {

	public static void main(String[] args) {

		Manager mn = new Manager();
		mn.doSomething();
		mn.markIn("OC4132");
	}

}
