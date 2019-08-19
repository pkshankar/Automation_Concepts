package javaGenericsConcept;

import java.util.Arrays;

public class JavaWithGenerics {

	public static <E> void sortList(E[] arr) { /*
												 * THIS IS A GENERIC SORT METHOD, HENCE CAN BE USED TO SORT ARRAYS OF
												 * DIFFERENT TYPES
												 */

		Arrays.sort(arr);
		for (E e : arr) {

			System.out.println(e);
		}

	}

	public static void main(String[] args) {

		Integer[] i = { 4, 2, 1, 6, 3 };
		Double[] d = { 2.4, 1.2, 4.5, 6.1, 3.1 };
		String[] s = { "INDIA", "NEPAL", "BHUTAN", "RUSSIA", "PERU" };

		sortList(i);

		System.out.println("**************************");

		sortList(d);

		System.out.println("**************************");

		sortList(s);

		System.out.println("**************************");

	}

}
