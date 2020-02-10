/*
 * {3,5,9,7}
 *
 * OUTPUT : 4,6,8
 * 
 * */

package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNumbers {

	public static void main(String[] args) {

		Integer originalArr[] = { 1, 3, 4,7 };
		List<Integer> list = findMissingNumbers(originalArr);
		if (list.size() != 0) {

			System.out.println("MISSING NUMBER/S IS/ARE : " + list);
		}

		else {

			System.out.println("NO NUMBER IS MISSING");
		}

	}

	public static List<Integer> findMissingNumbers(Integer[] intArr) {

		Arrays.sort(intArr); // ASCENDING ORDER
		int smallestNum = intArr[0];
		int largestNum = intArr[intArr.length - 1];
		List<Integer> fullNumList = new ArrayList<Integer>();
		List<Integer> missingNumList = new ArrayList<Integer>();

		for (int i = smallestNum; i <= largestNum; i++) {

			fullNumList.add(i);
		}

		/* CONVERT ORIGINAL ARRAY TO ARRAYLIST */

		List<Integer> originalList = Arrays.asList(intArr);

		for (int j = 0; j < fullNumList.size(); j++) {

			if (!originalList.contains(fullNumList.get(j))) {

				missingNumList.add(fullNumList.get(j));

			}
		}

		return missingNumList;
	}
}
