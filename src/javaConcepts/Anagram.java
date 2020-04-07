package javaConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {

	public static void main(String[] args) {

		if (isAnagram("listen", "silent"))
			System.out.println("ANAGRAM");
		else
			System.out.println("NOT ANAGRAM");

	}

	public static boolean isAnagram(String str1, String str2) {

		boolean flag = true;
		int str1Length = str1.length();
		int str2Length = str2.length();
		if (str1Length != str2Length) {

			flag = false;

		}

		else {

			List<Character> charList1 = getCharList(str1);
			List<Character> charList2 = getCharList(str2);
			if (charList1.equals(charList2)) {

				flag = true;
			}

			else {

				flag = false;
			}

		}

		return flag;
	}

	public static List<Character> getCharList(String str) {

		List<Character> list = new ArrayList<Character>();

		for (int i = 0; i < str.length(); i++) {

			list.add(str.charAt(i));
		}

		Collections.sort(list);
		return list;
	}

}
