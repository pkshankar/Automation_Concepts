package java_Revision;

public class FindPrimeNumber {

	static boolean flag;
	static int count = 0;

	public static void main(String[] args) {

		if (isPrime(29)) {

			System.out.println("PRIME NUMBER");
		} else {

			System.out.println("NOT A PRIME NUMBER");
		}

	}

	public static boolean isPrime(int num) {

		boolean flag = false;

		if (num <= 0) {

			return flag;

		} else if (num > 0) {

			for (int i = 1; i <= num; i++) {

				if (num % i == 0) {

					count = count + 1;
				}

				if (count == 2 && i == num) {

					flag = true;
				}

			}

		}
		return flag;

	}

	public static boolean checkPrime(int num) {

		if (num <= 1) {

			return false;

		} else {

			for (int j = 2; j < num; j++) {

				if (num % j == 0) {

					return false;
				}

			}
		}
		return true;
	}

}
