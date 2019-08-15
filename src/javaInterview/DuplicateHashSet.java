package javaInterview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateHashSet {

	public static void main(String[] args) {

		//HASHSET
		
		String[] str = {"MANGO", "APPLE", "MANGO", "GRAPES", "APPLE","MANGO", "MANGO", "MANGO", "1","1","1","2","3","3","GRAPES","@","@"};
		
		Set<String> sFruitObj = new HashSet<String>();
		
		Set<String> sFruits = new HashSet<String>();
		
		for(String s : str) {
			
			if(sFruitObj.add(s) == false) {
				
				sFruits.add(s);
			}
		}
		
		System.out.println("DUPLICATE ELEMENTS "+ sFruits);

	}

}
