package javaConcepts;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableConcept {

	public static void main(String[] args) {

		Hashtable<Integer, String> htObj = new Hashtable<Integer, String>();

		htObj.put(1, "INDIA");

		htObj.put(5, "CHINA");

		htObj.put(2, "RUSSIA");

		htObj.put(3, "BRITAIN");

		htObj.put(4, "SWEDEN");

		Enumeration<String> e = htObj.elements();

		while (e.hasMoreElements()) {

			System.out.println(e.nextElement());
		}

	}

}
