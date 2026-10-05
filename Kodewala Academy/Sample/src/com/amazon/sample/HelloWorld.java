package com.amazon.sample;

public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("HelloWorld from Eclipse...");
        
		//HellowWorld hl = new HellowWorld();
		doSomething();
		//hl.doNothing();
	}

	public static void doSomething() {
		System.out.println("Welcome from doSomething() method...");
	
		HelloWorld hl = new HelloWorld();
		hl.doNothing();
	}
	
	public void doNothing() {
		System.out.println("Welcome from doNothing() nonstatic method...");
		
	}
}
