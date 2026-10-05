package com.kodewala.control.flow1;

public class MakeMyTrip {

	public static void main(String[] args) {

		double fare = 12000;

		MmtDiscount mmtDiscount = new MmtDiscount();

		double discount = mmtDiscount.calculateDiscount(fare);

		double finalFare = fare - discount;

		System.out.println("Fare = " + fare);
		System.out.println("Discount = " + discount);
		System.out.println("Final Fare = " + finalFare);
	}
}
