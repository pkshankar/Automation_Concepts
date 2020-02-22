package learnComparator;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<EmployeeData> {

	@Override
	public int compare(EmployeeData empData1, EmployeeData empData2) {

		if (empData1.getEmpAge() > empData2.getEmpAge())
			return 1;
		else if (empData1.getEmpAge() < empData2.getEmpAge())
			return -1;
		else
			return 0;
	}

}
