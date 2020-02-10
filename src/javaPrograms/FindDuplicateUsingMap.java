package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateUsingMap {

	public static void main(String[] args) {

		String[] str = { "INDIA", "CHINA", "UK", "INDIA", "INDIA", "UK", "INDIA", "INDIA", "INDIA", "CHINA", "UK" };
		Map<String, Integer> myMap = findDuplicateElement(str);
		for (Map.Entry<String, Integer> m : myMap.entrySet()) {

			if (m.getValue() > 1) {

				System.out.println(m.getKey() + " OCCURS " + m.getValue() + " TIMES");
			}
		}
	}

	public static Map<String, Integer> findDuplicateElement(String strArr[]) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		int counter = 1;

		for (String s : strArr) {

			if (!map.containsKey(s)) {

				map.put(s, counter);

			}

			else {

				map.put(s, map.get(s) + 1);

			}

		}

		return map;
	}

}
