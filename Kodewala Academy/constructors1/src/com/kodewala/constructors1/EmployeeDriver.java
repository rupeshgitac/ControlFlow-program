package com.kodewala.constructors1;
// Practice
class Employee {

	static String companyName = "Amazon";

	int salary;
	String employeeId;
	String employeeName;
	String department;

	public Employee(int _salary, String _employeeId, String _employeeName, String _department) {
		super();

		this.salary = _salary;
		this.employeeId = _employeeId;
		this.employeeName = _employeeName;
		this.department = _department;
	}
}

public class EmployeeDriver {

	public static void main(String[] args) {

		Employee emp1 = new Employee(250000, "E101", "Rahul", "IT");
		Employee emp2 = new Employee(150000, "E102", "Amit", "HR");

		System.out.println("Employee 1 : " + emp1.employeeName + ", " + emp1.employeeId + ", " + emp1.salary + ", "
				+ emp1.companyName);

		System.out.println("Employee 2 : " + emp2.employeeName + ", " + emp2.employeeId + ", " + emp2.salary + ", "
				+ emp2.companyName);
	}
}
