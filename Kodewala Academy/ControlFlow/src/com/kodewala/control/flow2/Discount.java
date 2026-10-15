package com.kodewala.control.flow2;

public class Discount {

	public void discountApi(String customerType, double purchaseAmount) {

		double discountPercentage = 0;
		double discountAmount = 0;

		if (purchaseAmount >= 1000) {

			switch (customerType) {

			case "Gold":
				discountPercentage = 20;
				break;

			case "Silver":
				discountPercentage = 10;
				break;

			case "Regular":
				discountPercentage = 5;
				break;

			default:
				System.out.println("Invalid customer type");
				return;
			}

			discountAmount = purchaseAmount * discountPercentage / 100;

			if (discountAmount > 2500) {
				discountAmount = 2500;
			}

			System.out.println("Customer Type : " + customerType);
			System.out.println("Purchase Amount : " + purchaseAmount);
			System.out.println("Discount Percentage : " + discountPercentage + "%");
			System.out.println("Discount Amount : " + discountAmount);
			System.out.println("Final Amount : " + (purchaseAmount - discountAmount));

		} else {

			System.out.println("Minimum purchase should be ₹1000");
			System.out.println("No discount available");
		}
	}
}
