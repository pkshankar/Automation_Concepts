package javaConcepts;

public class CheckPalindrome {

	static int counter = 0;

	static String rev = "";

	public static void main(String[] args) {

		boolean bCheckPalindrome = isPalindrome("malayalam");

		if (bCheckPalindrome) {

			System.out.println("LOGIC 1: PALINDROME");

		} else {

			System.out.println("LOGIC 1: NOT A PALINDROME");
		}

		String str = reverseString("12121");

		if (str.equalsIgnoreCase("12121")) {

			System.out.println("LOGIC 2: PALINDROME");

		}

		else {

			System.out.println("LOGIC 2: NOT A PALINDROME");

		}

	}

	/* LOGIC 1 TO CHECK WHETHER A STRING IS PALINDROME */

	public static boolean isPalindrome(String str) {

		int lengthOfString = str.length();

		if (lengthOfString % 2 == 0 || lengthOfString % 2 != 0) {

			for (int count = 0; count < (int) (lengthOfString / 2); count++) {

				if (str.charAt(count) == str.charAt(lengthOfString - count - 1)) {

					counter = counter + 1;

					if (counter == ((int) (lengthOfString / 2))) {

						return true;
					}

				} else {

					return false;
				}

			}
		}

		return false;
	}

	/* LOGIC 2 TO CHECK WHETHER A STRING IS PALINDROME */

	public static String reverseString(String str) {

		int lengthOfString = str.length();

		for (int count = lengthOfString - 1; count >= 0; count--) {

			rev = rev + str.charAt(count);
		}

		return rev;

	}

}
