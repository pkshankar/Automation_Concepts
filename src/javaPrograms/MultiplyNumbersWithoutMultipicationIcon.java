package javaPrograms;

public class MultiplyNumbersWithoutMultipicationIcon {

	public static void main(String[] args) {

		int num1 = 198;
		int num2 = 3456;

		System.out.println("PRODUCT OF " + num1 + " AND " + num2 + " WITHOUT * OPERATOR : " + findProduct(num1, num2));
		System.out.println("PRODUCT OF " + num1 + " AND " + num2 + " WITH * OPERATOR : " + (num1*num2));

	}

	public static int findProduct(int num1, int num2) {

		int sum = 0;

		for (int i = 0; i < num2; i++) {

			sum = sum + num1;

		}

		return sum;

	}

}
