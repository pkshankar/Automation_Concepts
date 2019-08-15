package javaInterview;

public class SwapStrings {

	public static void main(String[] args) {

		String a = "lets play football";

		String b = "this evening";

		System.out.println("BEFORE SWAP");

		System.out.println("value of a: " + a);

		System.out.println("value of b: " + b);

		a = a + b;

		b = a.substring(0, a.length() - b.length());

		a = a.substring(b.length());

		System.out.println("**********************************************");

		System.out.println("AFTER SWAP");

		System.out.println("value of a: " + a);

		System.out.println("value of b: " + b);

	}

}
