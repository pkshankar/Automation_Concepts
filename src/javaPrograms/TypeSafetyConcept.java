package javaPrograms;

import java.util.ArrayList;

public class TypeSafetyConcept {

	public static void main(String[] args) {

		ArrayList al = new ArrayList<>();
		al.add("Java");
		al.add(10);
		for (int i = 0; i < al.size(); i++) {

			System.out.println((String) al.get(i));
		}

	}

}
