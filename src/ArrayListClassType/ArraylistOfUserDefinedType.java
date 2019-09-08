package ArrayListClassType;

import java.util.ArrayList;

public class ArraylistOfUserDefinedType {

	ArrayList<Employee> alEmp = new ArrayList<Employee>();

	public ArrayList<Employee> addEmployeeDetails() {

		alEmp.add(new Employee("John", 25, "Senior Developer"));
		alEmp.add(new Employee("Rick", 29, "Product Manager"));
		alEmp.add(new Employee("Shawn", 43, "President"));

		return alEmp;
	}
}
