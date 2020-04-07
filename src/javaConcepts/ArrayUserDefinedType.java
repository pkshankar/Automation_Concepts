package javaConcepts;

class Employee {

	private int empId;
	private String empName;
	private String empDesignation;

	public Employee(int empId, String empName, String empDesignation) {

		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

}

public class ArrayUserDefinedType {

	public static void main(String[] args) {

//		Employee employee = new Employee(176, "Jon Peter", "Senior Director");
//		System.out.println(employee.getEmpId() + " : " + employee.getEmpName() + " : " + employee.getEmpDesignation());

		Employee[] employee = new Employee[3];

		employee[0] = new Employee(176, "Jon Peter", "Senior Director");
		employee[1] = new Employee(183, "Som Ved", "Vice President");
		employee[2] = new Employee(124, "Shawn Mike", "Junior Engineer");

		for (int i = 0; i < employee.length; i++) {

			System.out.println(employee[i].getEmpId() + " : " + employee[i].getEmpName() + " : "
					+ employee[i].getEmpDesignation());
		}

	}

}
