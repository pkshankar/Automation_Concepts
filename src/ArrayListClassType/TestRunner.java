package ArrayListClassType;

import java.util.ArrayList;

public class TestRunner {

	public static void main(String[] args) {

		ArraylistOfUserDefinedType obj = new ArraylistOfUserDefinedType();

		int count = obj.addEmployeeDetails().size();

		for (int i = 0; i < count; i++) {

			System.out.println(obj.addEmployeeDetails().get(i).eName + " " + obj.addEmployeeDetails().get(i).eAge + " "
					+ obj.addEmployeeDetails().get(i).eDesignation);
		}

	}

}