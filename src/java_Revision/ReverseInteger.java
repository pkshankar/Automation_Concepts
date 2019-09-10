package java_Revision;

public class ReverseInteger {

	public static void main(String[] args) {

		System.out.println(reverseInteger(9087145));

	}

	public static int reverseInteger(int num) {

		String str1 = String.valueOf(num);
		String str2 = "";
		for (int i = str1.length() - 1; i >= 0; i--) {

			str2 = str2 + str1.charAt(i);
		}

		return Integer.parseInt(str2);

	}

}
