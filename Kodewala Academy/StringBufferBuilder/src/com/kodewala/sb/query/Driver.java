package com.kodewala.sb.query;

public class Driver {

	public static void main(String[] args) {

		QueryGenerator generator = new QueryGenerator();

		StringBuilder result = generator.generateQuery(0, null);

		System.out.println(result);

	}

}
