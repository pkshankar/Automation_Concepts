package javaPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FewestDenominations {

	public static void main(String[] args) {
		
		int[] denominationArray = {1,2,5,10,20,50,100,200,500,2000};
		findFewestDenominations(denominationArray,70);
		

	}
	
	public static void findFewestDenominations(int[] den, int amount) {
		
		int denominationArrayLength = den.length;
		//System.out.println(denominationArrayLength);
		
		for(int i=denominationArrayLength-1; i>0; i--) {
			
			if(amount >den[i-1] && amount <= den[i]) {
				
				System.out.println(amount + " IS GREATER THAN " + den[i-1] + " AND LESSER THAN " + den[i]);
			}
			System.out.println(amount-den[i-1]);
		}
		
		
	}

}
