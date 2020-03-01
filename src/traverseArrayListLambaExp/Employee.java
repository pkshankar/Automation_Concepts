package traverseArrayListLambaExp;

public class Employee implements Comparable<Employee> {

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empDesignation == null) ? 0 : empDesignation.hashCode());
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}

//	public int hashCode() {
//
//		return this.getEmpId();
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empDesignation == null) {
			if (other.empDesignation != null)
				return false;
		} else if (!empDesignation.equals(other.empDesignation))
			return false;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}

	@Override
	public int compareTo(Employee emp) {

		if (this.getEmpId() > emp.getEmpId()) {

			return 1;
		}

		else if (this.getEmpId() < emp.getEmpId()) {

			return -1;

		}

		else {

			return 0;
		}

	}

}
