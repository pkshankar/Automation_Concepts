package javaPrograms;

import java.util.ArrayList;

public class GenericMethod {

	public static void main(String[] args) {

		System.out.println("DATA : " + printData(10));
		System.out.println("DATA : " + printData("JAVA"));
		System.out.println("DATA : " + printData(7.5));
		System.out.println("DATA : " + printData(true));

		ArrayList<Integer> alInt = new ArrayList<Integer>();
		alInt.add(10);
		alInt.add(20);
		alInt.add(30);

		ArrayList<String> alStr = new ArrayList<String>();
		alStr.add("JAVA");
		alStr.add("SELENIUM");
		alStr.add("WEBSERVICES");

		System.out.println("ARRAYLIST OF INTEGERS : " + printList(alInt));
		System.out.println("ARRAYLIST OF STRINGS : " + printList(alStr));

	}

	public static <E> E printData(E e) {

		return e;
	}

	public static <E> ArrayList<E> printList(ArrayList<E> e) {

		return e;
	}

}
