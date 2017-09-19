package stringManipulation;

import java.util.Arrays;

public class PermutationString {

	public String sort(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}

	public boolean permutation(String s, String t) {
		if (s.length() != t.length())
			return false;

		return this.sort(s).equals(this.sort(t));
	}
}
