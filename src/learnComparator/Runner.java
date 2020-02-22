package learnComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		List<EmployeeData> employeeList = new ArrayList<>();

		EmployeeData empObj1 = new EmployeeData("John", 28, "IT Services");
		EmployeeData empObj2 = new EmployeeData("Peter", 23, "Library");
		EmployeeData empObj3 = new EmployeeData("Zuck", 35, "Maintenance");
		EmployeeData empObj4 = new EmployeeData("Seren", 32, "Admin");
		EmployeeData empObj5 = new EmployeeData("Amy", 36, "Housekeeping");

		employeeList.add(empObj1);
		employeeList.add(empObj2);
		employeeList.add(empObj3);
		employeeList.add(empObj4);
		employeeList.add(empObj5);

//		EmployeeNameComparator empNameComparator = new EmployeeNameComparator();
//		Collections.sort(employeeList, empNameComparator);
//		EmployeeAgeComparator empAgeComparator = new EmployeeAgeComparator();
//		Collections.sort(employeeList, empAgeComparator);
//		EmployeeDeptComparator empDeptComparator = new EmployeeDeptComparator();
//		Collections.sort(employeeList, empDeptComparator);

		/* ANONYMOUS INNER CLASS */
		Comparator<EmployeeData> empNameComp = new Comparator<EmployeeData>() {

			@Override
			public int compare(EmployeeData o1, EmployeeData o2) {

				return o1.getEmpName().compareTo(o2.getEmpName());
			}

		};

		Collections.sort(employeeList, empNameComp);
		for (EmployeeData e : employeeList) {
			System.out.println(e);
		}
	}

}
