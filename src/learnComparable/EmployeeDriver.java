package learnComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDriver {

	public static void main(String[] args) {

		Employee empObj1 = new Employee("John", "IT Services", 28);
		Employee empObj2 = new Employee("Peter", "Library", 23);
		Employee empObj3 = new Employee("Zuck", "Maintenance", 35);
		Employee empObj4 = new Employee("Seren", "Admin", 32);
		Employee empObj5 = new Employee("Amy", "Housekeeping", 36);

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(empObj1);
		employeeList.add(empObj2);
		employeeList.add(empObj3);
		employeeList.add(empObj4);
		employeeList.add(empObj5);

		Collections.sort(employeeList);

		for (Employee e : employeeList) {

			System.out.println(e);
		}
	}

}
