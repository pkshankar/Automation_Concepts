package javaInterview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	static int counter = 1;

	public static void main(String[] args) {

		String[] str = {"MANGO", "APPLE", "MANGO", "GRAPES", "APPLE","MANGO", "MANGO", "MANGO", "1","1","1","2","3","3","GRAPES","@","@"};

		/* USING HASHSET */

		Set<String> sObj = new HashSet<String>();

		for (String s : str) {

			if (sObj.add(s) == false) {

				System.out.println(s);
			}
		}

		System.out.println("****************************");

		/* USING HASHMAP */

		Map<String, Integer> mObj = new HashMap<String, Integer>();

		for (String s : str) {

			Integer counter = mObj.get(s);

			if (counter == null) {

				mObj.put(s, 1);
			}

			else {

				mObj.put(s, ++counter);
			}
		}

		Set<Entry<String, Integer>> entry = mObj.entrySet();

		for (Entry<String, Integer> e : entry) {

			if (e.getValue() > 1) {

				System.out.println(e.getKey() + " OCCURRENCE " + e.getValue());
			}
		}

	}

}
