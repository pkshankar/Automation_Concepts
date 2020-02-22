package learnComparator;

public class EmployeeData{
	
	private String empName;
	private Integer empAge;
	private String empDept;
	
	public EmployeeData(String empName, Integer empAge, String empDept) {
		
		this.empName = empName;
		this.empAge = empAge;
		this.empDept = empDept;
	}

	public String getEmpName() {
		return empName;
	}

	public Integer getEmpAge() {
		return empAge;
	}

	public String getEmpDept() {
		return empDept;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empAge=" + empAge + ", empDept=" + empDept + "]";
	}
	
	
	
	

}
