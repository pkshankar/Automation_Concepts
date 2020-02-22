package stringCustomSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSort {

	public static void main(String[] args) {

		List<String> strlist = new ArrayList<>();
		strlist.add("INDIA");
		strlist.add("NEPAL");
		strlist.add("BANGLADESH");
		strlist.add("BHUTAN");
		strlist.add("CHINA");

		System.out.println("DEFAULT STRING SORTING");
		System.out.println("-----------------------");
		Collections.sort(strlist);
		for (String s : strlist) {
			System.out.println(s);
		}

		StringCustomSort strCustomSort = new StringCustomSort();
		System.out.println("CUSTOM STRING SORTING - BASED ON 1ST INDEX");
		System.out.println("-----------------------");
		Collections.sort(strlist,strCustomSort);
		for (String s : strlist) {
			System.out.println(s);
		}

	}

}
