package javaConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumbers {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(5);
		list.add(3);
		list.add(3);
		list.add(-198);
		List<Integer> reqList = findMissingNumber(list);
		System.out.println("MISSING NUMBERS ARE : " + reqList);

	}

	public static List<Integer> findMissingNumber(List<Integer> intArr) {

		List<Integer> fullList = new ArrayList<>();
		List<Integer> missingList = new ArrayList<>();
		Collections.sort(intArr);
		int smallestNum = intArr.get(0);
		int largestNum = intArr.get(intArr.size() - 1);
		for (int i = smallestNum; i <= largestNum; i++) {

			fullList.add(i);
		}

		for (int j = 0; j < fullList.size(); j++) {

			if (!intArr.contains(fullList.get(j))) {

				missingList.add(fullList.get(j));
			}
		}
		return missingList;
	}

}
