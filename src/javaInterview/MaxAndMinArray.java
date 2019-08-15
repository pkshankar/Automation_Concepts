/* FIND THE SMALLEST, SECOND LARGEST AND LARGEST ELEMENT IN AN ARRAY */

package javaInterview;

import java.util.Arrays;

public class MaxAndMinArray {

	public static void main(String[] args) {

		int num[] = {1,2,-1,-90,100};

		MaxAndMinArray.findMax(num);

		System.out.println("SMALLEST NUMBER : " + MaxAndMinArray.findMax(num)[0]);

		System.out.println("LARGEST NUMBER : " + MaxAndMinArray.findMax(num)[1]);

		System.out.println("SECOND LARGEST NUMBER : " + MaxAndMinArray.findMax(num)[2]);

	}

	public static int[] findMax(int max[]) {

		int resArray[] = new int[3];

		Arrays.sort(max);

		resArray[1] = max[max.length - 1];

		resArray[0] = max[0];

		resArray[2] = max[max.length - 2];

		return resArray;
	}

}
