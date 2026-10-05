package com.kodewala.constructors7;

public class Driver {

	public static void main(String[] args) {

		ElectronicProduct electronicProduct = new ElectronicProduct("Iphone 18", 180000, "PR0321", 2);

		System.out.println(electronicProduct.name);
		System.out.println(electronicProduct.price);
		System.out.println(electronicProduct.prodictId);
		System.out.println(electronicProduct.waranty);

	}

}
