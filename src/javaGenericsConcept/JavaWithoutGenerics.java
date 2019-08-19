package javaGenericsConcept;

import java.util.Arrays;

public class JavaWithoutGenerics {

	public static Integer[] sortList(Integer[] i) { /* THIS METHOD SORTS ONLY INTEGER ARRAY */

		Arrays.sort(i);
		return i;
	}

	/* METHOD OVERLOADING NEEDS TO BE IMPLEMENTED IN ORDER TO SORT A DOUBLE ARRAY */

	public static Double[] sortList(Double[] d) {

		Arrays.sort(d);
		return d;
	}

	/* METHOD OVERLOADING NEEDS TO BE IMPLEMENTED IN ORDER TO SORT A STRING ARRAY */

	public static String[] sortList(String[] str) {

		Arrays.sort(str);
		return str;
	}

	public static void main(String[] args) {

		Integer[] num = { 2, 6, 3, 8, 1 };
		Integer[] intArr = sortList(num);
		for (Integer num2 : intArr) {

			System.out.println(num2);
		}

		System.out.println("**************************************************");

		Double[] num3 = { 4.5, 1.2, 6.7, 3.4, 9.1 };
		Double[] doubArr = sortList(num3);
		for (Double num4 : doubArr) {

			System.out.println(num4);
		}

		System.out.println("**************************************************");

		String[] str = { "INDIA", "NEPAL", "BHUTAN", "RUSSIA", "PERU" };
		String[] strArr = sortList(str);
		for (String s : strArr) {

			System.out.println(s);
		}

	}

}
