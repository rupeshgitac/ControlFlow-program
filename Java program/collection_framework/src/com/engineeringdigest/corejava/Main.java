package com.engineeringdigest.corejava;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1); // 0 index
		list.add(5); // 1 index
		list.add(80); // 2 index
		
		System.out.println(list.get(2));
		System.out.println(list.size());
		
		// print all list at same time==>for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// print all list at same time==>for each loop
		for(int x : list) {
			System.out.println(x);
		}
		
		// cotains() method-->it will check list contains the given number or not
		System.out.println(list.contains(5)); // true--> 5 is available in the list 
		System.out.println(list.contains(50)); // false--> 50 is not available in the list

		// remove() method
//		list.remove(2);
//		for(int x : list) {
//			System.out.println(x);
//		}
//		
//		// insert in between the list
//		list.add(2, 50); // at 2nd index will be 50 and 80 move to the third index
//		for(int x : list) {
//			System.out.println(x);
//		}
		
		// set() method--> it will replace the given index number
		list.set(2, 50);
		for(int x : list) {
			System.out.println(x);
		}
		System.out.println(list); // [1, 5, 50]


	}
}
