package javaInterview;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		
		String str = "!@#$%^&*(SHANKAR*(&%$#@! IS&*^&_+*&^% AN&^%$^*() INDIAN^*() BY$%&&* BIRTH";
		
		str = str.replaceAll("[^a-zA-Z0-9\\s]", "");
		
		System.out.println(str);
		
		

	}

}
