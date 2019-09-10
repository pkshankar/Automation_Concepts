package java_Revision;

public class StringReverse {

	public static void main(String[] args) {

		System.out.println("REVERSED STRING IS: " + reverseString("RAKNAHS"));

	}

	public static String reverseString(String str1) {

		String str2 = "";
		for (int i = str1.length() - 1; i >= 0; i--) {

			str2 = str2 + str1.charAt(i);
		}

		return str2;

	}
}
