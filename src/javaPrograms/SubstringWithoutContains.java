package javaPrograms;

public class SubstringWithoutContains {

	public static void main(String[] args) {
		
		

	}

	public void contains(String actualString, String searchString) {
		
		int actualStringLength = actualString.length();
		
		boolean flag = false;
		
		for(int counter = 0; counter <= actualStringLength; counter++) {
			
			if(actualString.charAt(counter) == searchString.charAt(0)) {
				
				flag = true;
			}
		}
		
		
	}
}
