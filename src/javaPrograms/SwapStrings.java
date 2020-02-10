package javaPrograms;

public class SwapStrings {

	public static void main(String[] args) {

		String str1 = "HELLO IS";
		String str2 = "JAVA FOR";
		System.out.println("BEFORE SWAP STR1 : " + str1);
		System.out.println("BEFORE SWAP STR2 : " + str2);
		swapStrWithoutTemp(str1, str2);
	}

	public static void swapStrWithoutTemp(String str1, String str2) {

		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("AFTER SWAP STR1 : " + str1);
		System.out.println("AFTER SWAP STR2 : " + str2);
	}

}
