package hashMapAdvance;

import java.util.HashMap;
import java.util.Map;

public class Employee {

	String eName;
	String eDesignation;
	String eLocation;

	public Employee(String eName, String eDesignation, String eLocation) {

		this.eName = eName;
		this.eDesignation = eDesignation;
		this.eLocation = eLocation;

	}

	public static void main(String[] args) {

		HashMap<Integer, Employee> hm = getEmployeeDetails();
		for (Map.Entry<Integer, Employee> empMap : hm.entrySet()) {

			System.out.println(empMap.getKey() + "   " + empMap.getValue().eName + " " + empMap.getValue().eDesignation
					+ " " + empMap.getValue().eLocation);
		}

	}

	public static HashMap<Integer, Employee> getEmployeeDetails() {

		HashMap<Integer, Employee> hMap = new HashMap<Integer, Employee>();
		hMap.put(135102, new Employee("SHANKAR", "SR. SOFTWARE ENGINEER", "GURGAON SEZ"));
		hMap.put(123091, new Employee("JUNTY", "PRESIDENT", "BENGALURU"));
		hMap.put(213651, new Employee("ZIKAR", "DIRECOR", "CHENNAI"));

		return hMap;

	}

}
