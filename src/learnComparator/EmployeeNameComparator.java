package learnComparator;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<EmployeeData> {

	@Override
	public int compare(EmployeeData empData1, EmployeeData empData2) {

		return empData1.getEmpName().compareTo(empData2.getEmpName());
	}

}
