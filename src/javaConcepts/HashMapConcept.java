package javaConcepts;


import java.util.HashMap;
import java.util.Map;


public class HashMapConcept {

	public static void main(String[] args) {

		HashMap<String, String> hMap = new HashMap<String, String>();

		hMap.put("10", "INDIA");

		hMap.put("5", "U.S");

		hMap.put("30", "China");

		hMap.put("40", "Russia");

		hMap.put("50", "Britain");
		
		hMap.put("60", "Britain");

		for (Map.Entry<String, String> hMapData : hMap.entrySet()) {

			System.out.println(hMapData.getKey() + " " + hMapData.getValue());
		}

	}

}
