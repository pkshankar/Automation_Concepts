package java_Revision;

public class CheckPalindrome {

	public static void main(String[] args) {

		int num = 908998091;
		System.out.println(isPalindrome(num));

	}

	public static boolean isPalindrome(int num) {

		String str1 = String.valueOf(num);
		String str2 = "";
		for (int i = str1.length() - 1; i >= 0; i--) {

			str2 = str2 + str1.charAt(i);
		}

		if (!str1.equals(str2)) {

			return false;
		}

		else {

			return true;
		}

	}

}

