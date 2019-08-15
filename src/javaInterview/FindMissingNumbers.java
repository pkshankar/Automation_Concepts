/* MULTIPLE MISSING NUMBERS AND DUPLICATES IN THE ARRAY */

package javaInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMissingNumbers {

	static int i = 0;

	static ArrayList<Integer> al = new ArrayList<Integer>();

	public static void main(String[] args) {

		Integer[] numArr = { 100, 100, 90, 101, 90, 91, 92, 98, 92 };

		al = FindMissingNumbers.findMissingNumbers(numArr);

		System.out.println("MISSING NUMBERS ARE");

		System.out.println("--------------------");

		for (Integer i : al) {

			System.out.println(i);
		}

	}

	public static ArrayList<Integer> findMissingNumbers(Integer arr[]) {

		Set<Integer> sObj = new HashSet<Integer>(Arrays.asList(arr));

		List<Integer> lObj = new ArrayList<Integer>(sObj);

		Collections.sort(lObj);

		Integer iSmallest = lObj.get(0);

		Integer iLargest = lObj.get(lObj.size() - 1);

		for (int i = iSmallest + 1; i <= iLargest; i++) {

			if (!lObj.contains(i)) {

				al.add(i);

			}
		}

		return al;

	}

}
