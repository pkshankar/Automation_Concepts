package javaInterview;

public class ReverseString {

	static String myStr = "";

	public static void main(String[] args) {
		
		System.out.println(Integer.parseInt(ReverseString.reverseString("10090"))+10);

	}

	public static String reverseString(String str) {

		for (int i = 1; i <= str.length(); i++) {

			myStr = myStr + str.charAt(str.length() - i);
		}

		return myStr;
	}

}
