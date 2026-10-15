package p5;
import java.util.Arrays;
// Non-zero left, zero right
import java.util.List;
import java.util.stream.Stream;

public class MoveZeroToEnd {
	
public static void main(String[] args) {
	
	List<Integer> numbers = Arrays.asList(1,5,0,4,5,0,5,8,0,9,7,0,2,0);
	
	List<Integer> result = Stream.concat(numbers.stream().filter(n-> n != 0), numbers.stream().filter(n-> n == 0)).toList();
	
	System.out.println("Non-zero left, zero right: " +result);
}
}

// Output==> Non-zero left, zero right: [1, 5, 4, 5, 5, 8, 9, 7, 2, 0, 0, 0, 0, 0]
