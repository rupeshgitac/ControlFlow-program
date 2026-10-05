package com.kodewala.constructors7;

public class ElectronicProduct extends Product {

	int waranty;

	public ElectronicProduct(String _name, int _price, String _prodictId, int _waranty) {
		super(_name, _price, _prodictId); // initialize default field
		this.waranty = _waranty;
	}
}
