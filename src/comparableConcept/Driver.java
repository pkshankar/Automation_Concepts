/* @Author: P K Shankar */

package comparableConcept;

import java.util.ArrayList;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {

		ArrayList<Employee> empObj = new ArrayList<Employee>();

		empObj.add(new Employee(100, "Tom", "Finance"));

		empObj.add(new Employee(50, "Peter", "Marketing"));

		empObj.add(new Employee(105, "Derek", "It"));

		empObj.add(new Employee(509, "Justin", "Housekeeping"));

		empObj.add(new Employee(304, "Roland", "Admin"));

		empObj.add(new Employee(809, "Zibralter", "Hr"));

		Collections.sort(empObj);

		for (Employee empSorted : empObj) {

			System.out.println(empSorted);
		}

	}

}
