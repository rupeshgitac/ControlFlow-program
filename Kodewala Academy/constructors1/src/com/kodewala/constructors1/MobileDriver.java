package com.kodewala.constructors1;

// Practice
class MobilePhone {

	static String operatingSystem = "Android";

	String brand;
	String model;
	int price;
	String color;

	public MobilePhone(String _brand, String _model, int _price, String _color) {

		this.brand = _brand;
		this.model = _model;
		this.price = _price;
		this.color = _color;
	}
}

public class MobileDriver {

	public static void main(String[] args) {

		MobilePhone phone1 = new MobilePhone("Samsung", "S25 Ultra", 130000, "Black");

		MobilePhone phone2 = new MobilePhone("OnePlus", "13", 70000, "Blue");

		System.out.println("Phone 1 : " + phone1.brand + ", " + phone1.model + ", " + phone1.price + ", " + phone1.color
				+ ", " + phone1.operatingSystem);

		System.out.println("Phone 2 : " + phone2.brand + ", " + phone2.model + ", " + phone2.price + ", " + phone2.color
				+ ", " + phone2.operatingSystem);
	}
}