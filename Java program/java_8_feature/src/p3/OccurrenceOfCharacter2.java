package p3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurrenceOfCharacter2 {

	public static void main(String[] args) {

		String str = "hello";

		Map<Character, Long> result = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));

		System.out.println(result);

	}
}
