package com.ashok.beans;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrence2 {

	public static void main(String[] args) {
		String str = "java";
		Map<Character, Integer> map = new HashMap();
		char[] chars = str.toCharArray();
		for (char ch : chars) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				int value = map.get(ch);
				map.put(ch, value + 1);
			}
		} // end of for loop
		System.out.println(map);
	}
}
