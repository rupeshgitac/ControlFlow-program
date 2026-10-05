package com.kodewala.constructors2;

class Invoice extends Object {

	static int gst = 18;

	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	String customerName;

	public Invoice(int _amount, String _itemName, String _billingAddress, String _customerId, String _customerName) {
		super();
		this.amount = _amount;
		this.itemName = _itemName;
		this.billingAddress = _billingAddress;
		this.customerId = _customerId;
		this.customerName = _customerName;
	}

}

public class Driver {

	public static void main(String[] args) {

		//Invoice.gst = 28;  // Here we can change static variable value

		Invoice inv = new Invoice(180000, "Iphone 18 pro", "Kodewala BTM 2nd Stage Bangalore", "C4321", "Kodewala");
		Invoice inv2 = new Invoice(65000, "OPPO Reno", "Electronic City Bangalore", "C5698", "Suraj");

		System.out.println("1st invoice : " + inv.itemName + ", "+ inv.amount + ", " + inv.customerId + ", " + inv.gst);
		System.out.println("2nd invoice : " + inv2.itemName + ", "+ inv2.amount + ", " + inv2.customerId + ", " + inv2.gst);

	}

}
