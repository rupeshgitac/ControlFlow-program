package com.amazon.sample;
//run using command line arguments
public class AddTwoNumber {

	public static void main(String[] args) {

		String firstNumber = args[0];
		String sectNumber = args[1];

		int firstNumberInt = Integer.parseInt(firstNumber);
		int sectNumberInt = Integer.parseInt(sectNumber);

		System.out.println(firstNumberInt + sectNumberInt);
	}
}
