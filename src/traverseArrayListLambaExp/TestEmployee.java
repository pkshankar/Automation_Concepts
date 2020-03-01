package traverseArrayListLambaExp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestEmployee {

	public static void main(String[] args) {

		Employee emp1 = new Employee(142, "Johnson", "Senior Director");
		Employee emp2 = new Employee(167, "Peter", "Senior Vice President");
		Employee emp3 = new Employee(201, "Swan", "Senior Director");
		Employee emp4 = new Employee(119, "Shelgun", "Junior Engineer");
		Employee emp5 = new Employee(198, "Hilter", "Executive");

		List<Employee> listEmployee = new ArrayList<>();
		listEmployee.add(emp1);
		listEmployee.add(emp2);
		listEmployee.add(emp3);
		listEmployee.add(emp4);
		listEmployee.add(emp5);

		// USING FOR EACH

		listEmployee.forEach(emp -> {

			System.out.println(emp.getEmpId() + " : " + emp.getEmpName() + " : " + emp.getEmpDesignation());
		});

		System.out.println("***********************************************************************");
		// USING LIST ITERATOR
		ListIterator<Employee> listIteratorEmployee = listEmployee.listIterator(listEmployee.size());
		while (listIteratorEmployee.hasPrevious()) {

			Employee e = listIteratorEmployee.previous();
			System.out.println(e.getEmpId() + " : " + e.getEmpName() + " : " + e.getEmpDesignation());
		}

		System.out.println("***********************************************************************");
		// USING FOR EACH REMAINING
		Iterator<Employee> itrEmp = listEmployee.iterator();
		itrEmp.forEachRemaining(emp -> {

			System.out.println(emp.getEmpId() + " : " + emp.getEmpName() + " : " + emp.getEmpDesignation());
		});

	}

}
