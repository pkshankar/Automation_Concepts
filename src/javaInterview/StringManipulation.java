package javaInterview;

import java.util.ArrayList;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "The rains have started here";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('a')); //1st occurrence of 'a'
		
		System.out.println(str.indexOf('a', str.indexOf('a')+1)); //2nd occurrence of 'a'
		
		System.out.println(str.indexOf('a',str.indexOf('a', str.indexOf('a')+1)+1 ));
		
		System.out.println(str.indexOf("HAVE"));
		
		System.out.println(str.substring(4));
		
		System.out.println(str.substring(4, 9));
		
		String s = "GOOGLLLLLEE";
		
		int counter =0;
		
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i) == 'L') {
				
				counter = counter + 1;
				
			}
		}
		
		String s1 = "ae@io#b$u123";
		
		//output - characters - aeiobu
		//output - special characters - @#$
		//output - numbers - 123
		ArrayList<String> alString = new ArrayList<String>();
		
		alString.add(s1.replaceAll("[^a-z]", ""));
		
		alString.add(s1.replaceAll("[a-z0-9]", ""));
		
		alString.add(s1.replaceAll("[^0-9]", ""));
		
		System.out.println(alString);
		
	
		
		
		
		

	}

}
