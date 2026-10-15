package com.kodewala.control.flow2;

public class BankCustomer {

	public static void main(String[] args) {

		// Creating object of DiscountService
		Discount discountService = new Discount();

		// Calling discountApi() method
		discountService.discountApi("Gold", 10000);
	}

}
