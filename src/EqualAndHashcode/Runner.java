package EqualAndHashcode;

import java.util.HashMap;
import java.util.Map;

public class Runner {

	public static void main(String[] args) {

		Employee e1 = new Employee("John", 35);
		Employee e2 = new Employee("Peter", 42);
		Employee e3 = new Employee("Zuke", 23);
		Employee e4 = new Employee("John", 35);

		Map<Employee, String> map = new HashMap<Employee, String>();
		map.put(e1, "Director");
		map.put(e2, "VP");
		map.put(e3, "Executive");
		map.put(e4, "Director");

		for (Map.Entry<Employee, String> m : map.entrySet()) {

			System.out.println(m.getKey().getEmpName() + " : " + m.getKey().getEmpAge() + " : " + m.getValue());
		}
	}

}
