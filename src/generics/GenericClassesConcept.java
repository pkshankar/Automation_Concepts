package generics;

public class GenericClassesConcept {

	public static void main(String[] args) {
		
		Employee<Integer, String> emp1 = new Employee<Integer, String>();
		emp1.setEmpId(100);
		emp1.setEmpName("Jon");
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getEmpName());
		
	}

}
