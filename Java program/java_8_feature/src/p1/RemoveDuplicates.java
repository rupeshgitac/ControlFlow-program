package p1;
// Remove duplicate using Set and stream
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 3);

		Set<Integer> duplicates = new HashSet<>();

		list.stream().filter(n -> duplicates.add(n)).forEach(System.out::println);
	}
}
