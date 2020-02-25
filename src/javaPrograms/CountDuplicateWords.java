package javaPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountDuplicateWords {

	public static void main(String[] args) {

		Map<String, Integer> countDuplicateMap = countDuplicateString("Hey java is java best language is java");

		System.out.println("COUNT DUPLICATE - STRING INPUT");
		for (Map.Entry<String, Integer> m : countDuplicateMap.entrySet()) {

			if (m.getValue() > 1) {

				System.out.println(m.getKey() + " APPEARS " + m.getValue() + " TIMES");
			}
		}

		System.out.println("********************************");
		System.out.println("COUNT DUPLICATE - FILE INPUT");

		File file = new File("C:\\Users\\pkshank\\Desktop\\test.txt");
		Map<String, Integer> countDuplicateMapFile = countDuplicateFile(file);
		for (Map.Entry<String, Integer> m : countDuplicateMapFile.entrySet()) {

			if (m.getValue() > 1) {

				System.out.println(m.getKey() + " APPEARS " + m.getValue() + " TIMES");
			}
		}

	}

	public static Map<String, Integer> countDuplicateString(String str) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		int counter = 1;
		String[] strArr;
		strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {

			if (!map.containsKey(strArr[i])) {
				map.put(strArr[i], counter);
			}

			else {

				map.put(strArr[i], map.get(strArr[i]) + 1);
			}

		}

		return map;
	}

	public static Map<String, Integer> countDuplicateFile(File file) {

		Scanner sc = null;
		int counter = 1;
		Map<String, Integer> map = new HashMap<String, Integer>();

		try {
			sc = new Scanner(file);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		while (sc.hasNext()) {

			String str = sc.next();
			if (!map.containsKey(str)) {

				map.put(str, counter);
			}

			else {

				map.put(str, map.get(str) + 1);
			}

		}

		return map;

	}

}
