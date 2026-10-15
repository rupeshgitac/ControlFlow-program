package p3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingCharacter {

	public static void main(String[] args) {

		String str = "swiss";

		Map<Character, Long> result = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));

		System.out.println(result);  // {s=3, w=1, i=1}

		// 👉 Find first non-repeating character
        Character firstNonRepeating = result.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println("First Non-Repeating Character: " + firstNonRepeating); // w
	}
}
