package learnComparable;

public class Employee implements Comparable<Employee> {

	private String empName;
	private String empDept;
	private Integer empAge;

	public Employee(String empName, String empDept, Integer empAge) {

		this.empName = empName;
		this.empDept = empDept;
		this.empAge = empAge;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empDept=" + empDept + ", empAge=" + empAge + "]";
	}

	public Integer getEmpAge() {
		return empAge;
	}

	@Override
	public int compareTo(Employee employee) {

		//return this.getEmpName().compareTo(employee.getEmpName());
		return this.getEmpAge().compareTo(employee.getEmpAge());
		

	}

}
