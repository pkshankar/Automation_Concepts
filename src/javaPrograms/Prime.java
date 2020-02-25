package javaPrograms;

public class Prime {

	public static void main(String[] args) {

		int num = 29;

		if (checkPrime(num))
			System.out.println(num + " IS PRIME");
		else
			System.out.println(num + " IS NOT PRIME");

	}

	public static boolean checkPrime(int num) {

		boolean flag = true;

		if (num <= 1) {

			flag = false;

		}

		else {

			for (int i = 2; i < num; i++) {

				if (num % i == 0) {

					flag = false;
					break;
				}

			}
		}

		return flag;
	}

}
