package p1;
// Print duplicate using stream api
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PrintDuplicatesUsingStreamApi {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 3);

		List<Integer> duplicates = list.stream()
				                       .filter(n -> Collections.frequency(list, n)>1)
				                       .distinct()
				                       .collect(Collectors.toList());
		System.out.println(duplicates);
	}
}
