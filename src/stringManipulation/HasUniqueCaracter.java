package stringManipulation;

public class HasUniqueCaracter {

	public static boolean isUniqueCharsSimple(String message) {
		if (message.length() > 128)
			return false;

		boolean[] charset = new boolean[128];
		for (int i = 0; i < message.length(); i++) {
			int val = message.charAt(i);

			if (charset[val])
				return false;

			charset[val] = true;
		}

		return true;
	}
}
