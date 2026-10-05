package com.kodewala.constructors1.practice;

public class Product {

	// Instance variables
	String productName;
	double price;
	String description;
	int quantity;

	// 1. Constructor with all attributes
	public Product(String productName, double price, String description, int quantity) {

	
		this.productName = productName;
		this.price = price;
		this.description = description;
		this.quantity = quantity;
	}

	// 2. Constructor with product name and description
	public Product(String productName, String description) {

		this.productName = productName;
		this.description = description;
	}

	// 3. No-argument constructor
	public Product() {
	}

	// Method to print attributes
	public void printProductDetails() {

		System.out.println("Product Name : " + productName);
		System.out.println("Price        : " + price);
		System.out.println("Description  : " + description);
		System.out.println("Quantity     : " + quantity);
		System.out.println("-------------------------");
	}
}
