package com.kodewala.constructors1.practice;

public class User {

	public static void main(String[] args) {

		// a. Create product with all attributes
		Product pr1 = new Product("Iphone 18 Pro", 165000.0, "16 GB RAM and 512 GB Storage", 5);

		// b. Create product with product name and description
		Product pr2 = new Product("Mobile", "Samsung Mobile Phone");

		// c. Create product without any attributes
		Product pr3 = new Product();

		// d. Print attributes of each object
		pr1.printProductDetails();
		pr2.printProductDetails();
		pr3.printProductDetails();
	}
}
