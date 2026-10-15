package p3;
// Find Occurrence of character
import java.util.Map;
import java.util.stream.Collectors;

public class OccurrenceOfCharacter {

	public static void main(String[] args) {

		String str = "hello";

		Map<Character, Long> result = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		System.out.println(result);

	}
}
