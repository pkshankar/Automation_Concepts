package javaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapByValue {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("JAVA", 2);
		map.put("C#", 20);
		map.put("SELENIUM", 19);
		map.put("PYTHON", 3);
		map.put("JAVASCRIPT", 54);
		sortMapValue(map);
	}

	public static void sortMapValue(Map<String, Integer> hMap) {

		Set<Entry<String, Integer>> set = hMap.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
		Comparator<Entry<String, Integer>> valueComparator = new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

				return o1.getValue().compareTo(o2.getValue());

			}

		};
		Collections.sort(list, valueComparator);
		Collections.reverse(list);
		System.out.println(list);

	}

}
