package javaPrograms;

public class ReverseString {

	static String reversedStr="";

	public static void main(String[] args) {

		String str = "JAVA";

		System.out.println("ORIGINAL STRING : " + str);
		System.out.println("REVERSED STRING : " + stringReverse(str));

	}

	public static String stringReverse(String str) {

		int strLength = str.length();
		for (int counter = strLength - 1; counter >= 0; counter--) {

			reversedStr = reversedStr + str.charAt(counter);
		}

		return reversedStr;
	}
}
