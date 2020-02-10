package javaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {

//		if (checkPrime(4)) {
//
//			System.out.println("PRIME");
//
//		} else {
//
//			System.out.println("NOT PRIME");
//		}
		
		printPrime();
	}

	public static void printPrime() {

		int limit = 2;

		for (int i = 2; i <= limit; i++) {

			if (checkPrime(i)) {

				System.out.println(i);

			}

		}
	}

	public static boolean checkPrime(int num) {

		int limit = (int) (num / 2);
		int counter = 1;
		boolean flag = true;
		for (int i = 2; i <= limit; i++) {

			if (num % i == 0) {

				flag = false;
				break;
				
			} else {

				counter = counter + 1;
			}

			if (counter == i) {

				return flag;
			}
		}

		return flag;
	}

}
