package learnComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountryName {

	public static void main(String[] args) {

		List<String> countryList = new ArrayList<>();
		countryList.add("INDIA");
		countryList.add("NEPAL");
		countryList.add("BANGLADESH");
		countryList.add("BHUTAN");
		countryList.add("CHINA");
		Collections.sort(countryList);
		System.out.println(countryList);
	}

}
