package javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {

		String[] str = { "JAVA", "AUTOMATION", "TESTING","JAVA","TESTING","JAVA","JAVA","JAVA" };
		Set<String> set = findDuplicateElement(str);
		if(set.size() != 0) {
			
			System.out.println("DUPLICATE ELEMENT/S IS/ARE : " + set);
		}
		
		else {
			
			System.out.println("GIVEN ARRAY HAS NO DUPLICATE ELEMENT");
		}
	}

	public static Set<String> findDuplicateElement(String[] strArr) {

		Set<String> originalSet = new HashSet<String>();
		Set<String> duplicateElementSet = new HashSet<String>();
		for (String s : strArr) {

			if (!originalSet.add(s)) {

				duplicateElementSet.add(s);
			}
		}

		return duplicateElementSet;

	}

}
