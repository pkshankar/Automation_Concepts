package javaPrograms;

public class OccurenceOfChar {

	public static void main(String[] args) {

		String inputStr = "This is Eclipse";

		System.out.println("INDEX : " + findOccurence(inputStr));

	}

	public static int findOccurence(String str) {

		/* FIND 3RD OCCURENCE OF 'i' */

		return str.indexOf('i', str.indexOf('i', str.indexOf('i') + 1) + 1);
	}

}
