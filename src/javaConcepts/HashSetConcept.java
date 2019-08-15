/*HashSet does not maintain insertion order whereas LinkedHashSet maintains insertion order */

package javaConcepts;

import java.util.Iterator;
import java.util.HashSet;

public class HashSetConcept {

	public static void main(String[] args) {

		HashSet<Integer> hsInt = new HashSet<Integer>();

		hsInt.add(100);

		hsInt.add(80);

		hsInt.add(67);

		hsInt.add(50);

		hsInt.add(345);

		hsInt.add(89);

		hsInt.add(150);

		Iterator<Integer> itrInt = hsInt.iterator();

		while (itrInt.hasNext()) {

			System.out.println(itrInt.next());

		}

	}

}
