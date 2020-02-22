package learnComparator;

import java.util.Comparator;

public class EmployeeDeptComparator implements Comparator<EmployeeData> {

	@Override
	public int compare(EmployeeData empData1, EmployeeData empData2) {

		return empData1.getEmpDept().compareTo(empData2.getEmpDept());
	}

}
