package java_Revision;

import java.util.Arrays;

public class FindMissingNumber {

	static int num;
	static int j = 0;

	public static void main(String[] args) {

		Integer arr[] = { 10,9,8,6,5,1,2,4,3 };

		System.out.println(findMissingNumber(arr));

	}

	public static Integer findMissingNumber(Integer numArr[]) {

		int missingNum = 0;
		Integer arr[] = new Integer[numArr.length + 1];

		Arrays.sort(numArr);
		int smallest = numArr[0];
		int largest = numArr[numArr.length - 1];
		for (int i = smallest; i <= largest; i++) {

			arr[j] = i;
			j++;
		}

		for (int j = 0; j < arr.length; j++) {

			if (arr[j] != numArr[j]) {

				missingNum = arr[j];
				break;
			}

		}
		return missingNum;

	}
}