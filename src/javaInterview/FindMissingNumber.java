/* 1 MISSING NUMBER AND NO DUPLICATES IN THE ARRAY */

package javaInterview;

public class FindMissingNumber {

	static int sum1, sum2 = 0;

	public static void main(String[] args) {

		int[] intArr = { -1,0,1, 3, 4, 5, 6, 7,8, 9};

		System.out.println("MISSING NUMBER IS " + FindMissingNumber.findMissingNumber(intArr));

	}

	public static int findMissingNumber(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			sum1 = sum1 + arr[i];

		}

		for (int j = -1; j <= 9; j++) {

			sum2 = sum2 + j;

		}

		return (sum2 - sum1);

	}

}
