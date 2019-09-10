package java_Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMultipleMissingNumbers {

	public static void main(String[] args) {

		Integer numArr[] = { 1, 3, 5, 9, 12 };
		List<Integer> al1 = new ArrayList<Integer>(Arrays.asList(numArr));

		System.out.println(findMultipleMissingNumbers(al1));

	}

	public static List<Integer> findMultipleMissingNumbers(List<Integer> al2) {

		List<Integer> l2 = new ArrayList<Integer>();
		Collections.sort(al2);
		int smallest = al2.get(0);
		int largest = al2.get(al2.size() - 1);
		for (int i = smallest; i <= largest; i++) {

			if (!al2.contains(i)) {

				l2.add(i);
			}

		}

		return l2;
	}
}
