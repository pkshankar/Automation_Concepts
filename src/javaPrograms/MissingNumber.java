/*
 * {1,2,4,7}
 * 
 * OUTPUT : 3,5,6
 * 
 * */

package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {

		int numArr[] = { 1, 2, 5 };

		System.out.println("MISSING NUMBER : " + findMissingNumber(numArr));
	}

	public static int findMissingNumber(int numArr[]) {

		Arrays.sort(numArr);
		int smallest = numArr[0];
		int largest = numArr[numArr.length - 1];
		int missingNumSum = 0;
		int actualNumSum = 0;
		for (int counter = 0; counter < numArr.length; counter++) {

			missingNumSum = missingNumSum + numArr[counter];
		}

		for (int counter = smallest; counter <= largest; counter++) {

			actualNumSum = actualNumSum + counter;
		}

		return (actualNumSum - missingNumSum);

	}

}
