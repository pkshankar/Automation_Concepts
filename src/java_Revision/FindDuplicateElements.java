package java_Revision;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElements {

	public static void main(String[] args) {

		String dupStrArr[] = { "JAVA", "SELENIUM", "JAVA", "NEPAL", "NEPAL", "CHILE", "NEPAL", "BHUTAN", "SELENIUM", "INDIA", "INDIA", "INDIA","JAVA", "INDIA" };
		// findDuplicateUsingHashSet(dupStrArr);

		findDuplicatesUsingHashMap(dupStrArr);

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

	/* APPROACH 2 - USING HASHMAP */

	public static void findDuplicatesUsingHashMap(String[] strArr) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < strArr.length; i++) {

			if (map.get(strArr[i]) == null) {

				map.put(strArr[i], 1);
			} else {

				map.put(strArr[i], map.get(strArr[i]) + 1);
			}

		}
		
		System.out.println(map);

		Set<Map.Entry<String, Integer>> newMap = map.entrySet();

		for (Entry<String, Integer> entry : newMap) {

			if (entry.getValue() > 1) {

				System.out.println(entry.getKey() + " HAS " + entry.getValue() + " OCURRENCES");
			}
		}
	}

}
