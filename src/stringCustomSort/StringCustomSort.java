package stringCustomSort;

import java.util.Comparator;

public class StringCustomSort implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {

		if (str1.charAt(1) > str2.charAt(1))
			return 1;
		else if (str1.charAt(1) < str2.charAt(1))
			return -1;
		else
			return 0;

	}

}
