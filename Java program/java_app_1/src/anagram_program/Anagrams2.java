package anagram_program;

import java.util.Arrays;

public class Anagrams2 {
	public static void main(String[] args) {
		String s1 = "Keep";
		String s2 = "PEek";
		if (isAnagrams(s1, s2)) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
	}
	static boolean isAnagrams(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		} else {
			char ch1[] = s1.toLowerCase().toCharArray();
			char ch2[] = s2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (Arrays.equals(ch1, ch2)) {
				return true;
			} else {
				return false;
			}

		}
	}
}
