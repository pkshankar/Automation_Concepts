package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountChar {

	public static void main(String[] args) {

		String inputStr = "GOOGLLLLLEE";

		
		Map<Character, Integer> myMap = countCharacters(inputStr);
		for (Entry<Character, Integer> entry : myMap.entrySet()) {

			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	public static Map<Character, Integer> countCharacters(String str) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int counter = 1;
		for (int i = 0; i < str.length(); i++) {

			if (!map.containsKey(str.charAt(i))) {

				map.put(str.charAt(i), counter);
			}

			else {

				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}
		}

		return map;

	}

}
