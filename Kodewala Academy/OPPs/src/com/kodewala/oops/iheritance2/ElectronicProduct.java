package com.kodewala.oops.iheritance2;

public class ElectronicProduct extends Product {

	boolean isWarranty;
	int warrantyInYears;
	
	public ElectronicProduct(String productName, String description, int quantity, String status, boolean isWarranty,
			int warrantyInYears) {
		super(productName, description, quantity, status);
		this.isWarranty = isWarranty;
		this.warrantyInYears = warrantyInYears;
	}
	
}
