package javaInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateHashTable {
	
	static int count =0;

	public static void main(String[] args) {
		
		String[] str = {"MANGO", "APPLE", "MANGO", "GRAPES", "APPLE","MANGO", "MANGO", "MANGO", "1","1","1","2","3","3","GRAPES","@","@"};
		
		Map<String,Integer> mFruits = new HashMap<String,Integer>();
		
		for(String s : str) {
			
			Integer i = mFruits.get(s);
			
			if(i == null) {
				
				mFruits.put(s, 1);
			}
			
			else {
				
				mFruits.put(s, ++i);
			}
		}
		
		Set<Entry<String,Integer>> entry = mFruits.entrySet();
		
		for(Entry<String,Integer> e : entry) {
			
			if(e.getValue() > 1) {
				
				System.out.println(e.getKey() + " - "+ e.getValue() + " times ");
			}
		}

	}

}
