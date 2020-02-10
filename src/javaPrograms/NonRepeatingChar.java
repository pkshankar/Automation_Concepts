package javaPrograms;

public class NonRepeatingChar {

	public static void main(String[] args) {

		String str = "INDIAFORINDIANSFIRST";

		System.out.println("FIRST NON REPEATING CHARACTER IS : " + findFirstNonRepeatingCharacter(str));
		System.out.println("LAST NON REPEATING CHARACTER IS : " + findLastNonRepeatingCharacter
				(str));
	}

	public static char findFirstNonRepeatingCharacter(String str) {

		str = str.toUpperCase();
		char chr = 0;
		for (int i = 0; i < str.length(); i++) {

			if (!str.substring(i + 1).contains(Character.toString((str.charAt(i))))) {

				chr = str.charAt(i);

				break;
			}

		}

		return chr;

	}

	public static char findLastNonRepeatingCharacter(String str) {

		str = str.toUpperCase();
		char chr = 0;
		for (int i = 0; i < str.length(); i++) {

			if (!str.substring(0, str.length() - i - 1)
					.contains(Character.toString((str.charAt(str.length() - i - 1))))) {

				chr = str.charAt(str.length() - i - 1);

				break;
			}

		}

		return chr;

	}

}
