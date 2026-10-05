package com.kodewala.constructors1;

public class User {

	public static void main(String[] args) {

		Product pr = new Product("Iphone 18 Pro", 165000, "16 GB RAM and 512 GB Storage", 5);

		System.out.println("Product name is : " + pr.productName);
		System.out.println("Product price is : " + pr.price);
		System.out.println("Product description is : " + pr.description);
		System.out.println("Product quantity is : " + pr.quantity);

	}
}
