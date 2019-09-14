package java_Revision;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateWordsInString {

	public static void main(String[] args) {

		//String str = "TESTING WITH SELENIUM AND SELENIUM WITH TESTING INDIA IS A SPACE SUPERPOWER AND INDIA WILL SOON BECOME A DEVELOPED NATION";
		String str = "Prime Minister Narendra Modi will visit the U.S. between September 21 and September 27 during which he will address the annual U.N. General Assembly session and have a series of bilateral and multilateral engagements in New York, the Ministry of External Affairs said on September 12.";
		String strArr[] = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < strArr.length; i++) {

			if (map.get(strArr[i]) == null) {

				map.put(strArr[i], 1);
			} else {

				map.put(strArr[i], map.get(strArr[i]) + 1);
			}
		}

		System.out.println(map);

		for (Map.Entry<String, Integer> newMap : map.entrySet()) {

			if (newMap.getValue() > 1) {

				System.out.println(newMap.getKey() + " - " + newMap.getValue());
			}
		}

	}

}
