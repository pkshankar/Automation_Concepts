/* TreeSet maintains ascending order */

package javaConcepts;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetConcept {

	public static void main(String[] args) {

		TreeSet<Integer> tsInt = new TreeSet<Integer>();

		tsInt.add(100);

		tsInt.add(50);

		tsInt.add(123);

		tsInt.add(75);

		tsInt.add(345);

		Iterator<Integer> itr = tsInt.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

		TreeSet<String> tsStr = new TreeSet<String>();

		tsStr.add("INDIA");

		tsStr.add("NEPAL");

		tsStr.add("CHINA");

		Iterator<String> itrStr = tsStr.descendingIterator();

		while (itrStr.hasNext()) {

			System.out.println(itrStr.next());
		}

	}

}
