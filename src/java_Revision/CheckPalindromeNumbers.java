package java_Revision;

public class CheckPalindromeNumbers {

	public static void main(String[] args) {

		if (isPalindrome(121)) {

			System.out.println("IS A PALINDROME");
		} else {

			System.out.println("NOT A PALINDROME");
		}

	}

	public static boolean isPalindrome(int num) {

		String str1 = String.valueOf(num);
		String str2 = "";
		for (int i = str1.length() - 1; i >= 0; i--) {

			str2 = str2 + str1.charAt(i);
		}

		if (str1.equals(str2)) {

			return true;
		} else {

			return false;
		}

	}

}
