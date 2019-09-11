package java_Revision;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElements {

	public static void main(String[] args) {

		String dupStrArr[] = { "JAVA", "SELENIUM", "JAVA" };
		findDuplicateUsingHashSet(dupStrArr);

	}

	/* APPROACH 1 - USING HASHET */

	public static void findDuplicateUsingHashSet(String[] strArr) {

		Set<String> set = new HashSet<String>();
		Set<String> newSet = new HashSet<String>();
		System.out.println("DUPLICATE ELEMENTS IS/ARE");
		System.out.println("*************************");
		for (int i = 0; i < strArr.length; i++) {

			if (!set.add(strArr[i])) {

				newSet.add(strArr[i]);
			}
		}

		System.out.println(newSet);

	}

	/* APPROACH 1 - USING HASHMAP */

	public static void findDuplicateUsingHashMap(String[] strArr) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < strArr.length; i++) {

			map.put(strArr[i], i + 1);

		}
	}

}
