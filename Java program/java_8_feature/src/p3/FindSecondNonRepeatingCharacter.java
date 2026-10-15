package p3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindSecondNonRepeatingCharacter {

	public static void main(String[] args) {

		String str = "aabbcdeffg";

		Map<Character, Long> result = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));

		System.out.println(result); //{a=2, b=2, c=1, d=1, e=1, f=2, g=1}
		
		// 👉 Find Second non-repeating character
		Character secondNonRepeating = result.entrySet()
		        .stream()
		        .filter(e -> e.getValue() == 1)   // only unique characters
		        .map(Map.Entry::getKey)          // extract characters
		        .skip(1)                         // skip first unique
		        .findFirst()                     // take second unique
		        .orElse(null);

		System.out.println("Second Non-Repeating Character: " + secondNonRepeating); // d

	}
}
