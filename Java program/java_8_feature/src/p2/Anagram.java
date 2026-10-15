package p2;
// Anagram program
import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {

		String str1 = "Ram";
		String str2 = "arm";

		char[] c1 = str1.toCharArray(); //[r,a,m]
		char[] c2 = str2.toCharArray(); //[a,r,m]

		Arrays.sort(c1); // [a,m,r]
		Arrays.sort(c2); // [a,m,r]

		if (Arrays.equals(c1, c2) == true) {
			System.out.println("Given string are anagram");
		} else {
			System.out.println("Given string are not anagram");
		}

	}
}
