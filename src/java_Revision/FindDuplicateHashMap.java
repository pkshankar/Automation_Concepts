package java_Revision;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateHashMap {

	public static void main(String[] args) {

		String strArr[] = { "JAVA", "SELENIUM", "JAVA" };
		findDuplicateElement(strArr);

	}

	public static void findDuplicateElement(String arr[]) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (map.get(arr[i]) == null) {

				map.put(arr[i], 1);
			} else {

				map.put(arr[i], map.get(arr[i]) + 1);

			}

		}
		for (Entry<String, Integer> set : map.entrySet()) {

			if (set.getValue() > 1) {

				System.out.println(set.getKey());
			}
		}

	}
}
