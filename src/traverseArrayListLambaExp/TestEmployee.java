package traverseArrayListLambaExp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		Employee emp6 = new Employee(198, "Hilter", "Executive");

		List<Employee> listEmployee = new ArrayList<>();
		listEmployee.add(emp1);
		listEmployee.add(emp2);
		listEmployee.add(emp3);
		listEmployee.add(emp4);
		listEmployee.add(emp5);
		listEmployee.add(emp6);

		Comparator<Employee> empIdComparator = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {

				if (o1.getEmpId() > o2.getEmpId())
					return 1;
				else if (o1.getEmpId() < o2.getEmpId())
					return -1;
				else
					return 0;
			}

		};

		Comparator<Employee> empNameComparator = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {

				return o1.getEmpName().compareTo(o2.getEmpName());

			}

		};

		Comparator<Employee> empDesignationComparator = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {

				return o1.getEmpDesignation().compareTo(o2.getEmpDesignation());

			}

		};

		//Collections.sort(listEmployee, empIdComparator);
		//Collections.sort(listEmployee, empNameComparator);
		Collections.sort(listEmployee, empDesignationComparator);
		
		listEmployee.forEach(emp -> {

			System.out.println(emp.getEmpId() + " : " + emp.getEmpName() + " : " + emp.getEmpDesignation());
		});

		// Collections.sort(listEmployee);

//		listEmployee.forEach(emp -> {
//
//			System.out.println(emp.getEmpId() + " : " + emp.getEmpName() + " : " + emp.getEmpDesignation());
//		});
//		// USING FOR EACH
//
//		listEmployee.forEach(emp -> {
//
//			System.out.println(emp.getEmpId() + " : " + emp.getEmpName() + " : " + emp.getEmpDesignation());
//		});
//
//		System.out.println("***********************************************************************");
//		// USING LIST ITERATOR
//		ListIterator<Employee> listIteratorEmployee = listEmployee.listIterator(listEmployee.size());
//		while (listIteratorEmployee.hasPrevious()) {
//
//			Employee e = listIteratorEmployee.previous();
//			System.out.println(e.getEmpId() + " : " + e.getEmpName() + " : " + e.getEmpDesignation());
//		}
//
//		System.out.println("***********************************************************************");
//		// USING FOR EACH REMAINING
//		Iterator<Employee> itrEmp = listEmployee.iterator();
//		itrEmp.forEachRemaining(emp -> {
//
//			System.out.println(emp.getEmpId() + " : " + emp.getEmpName() + " : " + emp.getEmpDesignation());
//		});

//		System.out.println(emp5.equals(emp6));
//		System.out.println("emp5 hashcode : " + emp5.hashCode());
//		System.out.println("emp6 hashcode : " + emp6.hashCode());

	}
}
