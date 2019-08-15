package javaConcepts;

public class CheckArmstrongNumber {

	static double sum = 0;

	public static void main(String[] args) {

		if (isArmstrongNumber("28116440335967")) {

			System.out.println("ARMSTRONG NUMBER");

		} else {

			System.out.println("NOT AN ARMSTRONG NUMBER");
		}

	}

	public static boolean isArmstrongNumber(String str) {

		int lengthOfString = str.length();

		for (int count = 0; count < lengthOfString; count++) {

			int num = Character.getNumericValue(str.charAt(count));

			sum = sum + Math.pow(num, lengthOfString);
		}

		if (sum == Double.parseDouble(str)) {

			return true;
		}

		else

			return false;

	}

}
