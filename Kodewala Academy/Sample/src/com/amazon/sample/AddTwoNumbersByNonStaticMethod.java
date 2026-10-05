package com.amazon.sample;

//run using command line arguments
public class AddTwoNumbersByNonStaticMethod {

	public int sumOfTwoNumbers(int num1, int num2) { // non-static method

		return num1 + num2;

	}

	public static void main(String[] args) {

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		AddTwoNumbersByNonStaticMethod add = new AddTwoNumbersByNonStaticMethod();

		int result = add.sumOfTwoNumbers(num1, num2);

		System.out.println("sum is : " + result);
	}

}
