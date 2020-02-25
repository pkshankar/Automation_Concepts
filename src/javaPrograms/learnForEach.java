package javaPrograms;

import java.util.ArrayList;
import java.util.List;

public class learnForEach {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		strList.add("INDIA");
		strList.add("NEPAL");
		strList.add("BHUTAN");
		strList.forEach((countries) -> System.out.println(countries));
	}

}
