/*
 *  JAVA IS JAVA FOR JAVA
 * */

package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountOccurenceWord {

	public static void main(String[] args) {

		String str = "JAVA FOR SELENIUM AND IS SELENIUM FOR JAVA";
		str = str.toUpperCase();
		String findCountStr = "SELENIUM";
		System.out.println(findCountStr + " OCCURS " + countOccurence(str).get(findCountStr) + " TIMES");

	}

	public static Map<String, Integer> countOccurence(String str) {

		String strArr[] = str.split(" ");
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		int counter = 1;
		for (int i = 0; i < strArr.length; i++) {

			if (!wordMap.containsKey(strArr[i])) {

				wordMap.put(strArr[i], counter);

			}

			else {

				wordMap.put(strArr[i], wordMap.get(strArr[i])+1);
			}
		}

		return wordMap;
	}

}
