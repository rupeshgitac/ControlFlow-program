package p1;
// Remove duplicate using stream api
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesUsingStreamApi {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 3);

		List<Integer> unique =
		        list.stream()
		            .distinct()
		            .collect(Collectors.toList());

		System.out.println(unique);
	}
}
