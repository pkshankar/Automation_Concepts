package javaPrograms;

public class ElementsIsolation {

	public static void main(String[] args) {

		String str = "ae@io#b$u123";
		separateElements(str);

	}

	public static void separateElements(String str) {

		String strChar = str.replaceAll("[^a-zA-Z]", "");
		System.out.println("ONLY CHARACTERS : " + strChar);
		String strNum = str.replaceAll("[^0-9]", "");
		System.out.println("ONLY NUMBERS : " + strNum);
		String strSplChar = str.replaceAll("[a-zA-Z0-9]", "");
		System.out.println("ONLY SPECIAL CHARACTERS : " + strSplChar);

	}

}
