package javaConcepts;

public class PrintPrimeNumbers {

	public static void main(String[] args) {

		printPrime(11);

	}

	public static void printPrime(int num) {

		for (int i = 2; i <= num; i++) {

			boolean b = checkPrime(i);

			if (b) {

				System.out.println(i);
			}
		}
	}

	public static boolean checkPrime(int i) {

		for (int j = 2; j < i; j++) {

			if (i % j == 0) {

				return false;
			}
		}

		return true;
	}

}
