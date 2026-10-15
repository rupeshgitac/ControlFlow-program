package p2;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {

		String str1 = "Ram";
		String str2 = "arm";

		// ✅ Optional: Length check (fast failure)
		if (str1.length() != str2.length()) {
			System.out.println("Given strings are NOT anagram");
			return;
		}

		// ✅ Convert both strings to same case to avoid case-sensitive issue
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// Convert strings to char array
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();

		// Sort both arrays
		Arrays.sort(c1);
		Arrays.sort(c2);

		// Compare sorted arrays
		if (Arrays.equals(c1, c2)) {
			System.out.println("Given strings are anagram");
		} else {
			System.out.println("Given strings are NOT anagram");
		}
	}
}
