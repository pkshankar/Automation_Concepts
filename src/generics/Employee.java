package generics;

public class Employee<E, T> {

	private E empId;
	private T empName;

	public E getEmpId() {
		return empId;
	}

	public void setEmpId(E empId) {
		this.empId = empId;
	}

	public T getEmpName() {
		return empName;
	}

	public void setEmpName(T empName) {
		this.empName = empName;
	}

}
