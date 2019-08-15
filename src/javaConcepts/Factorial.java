package javaConcepts;

public class Factorial {

	static int fact = 1;

	public static void main(String[] args) {

		System.out.println("FACTORIAL IS " + calculateFactorial(0));

	}

	public static int calculateFactorial(int num) {

		for (int count = num; count >= 1; count--) {

			fact = fact * count;
		}

		return fact;

	}

}
