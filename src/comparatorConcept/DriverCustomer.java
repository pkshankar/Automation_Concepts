/* P K Shankar */

package comparatorConcept;

import java.util.ArrayList;
import java.util.Collections;

public class DriverCustomer {

	public static void main(String[] args) {

		ArrayList<Customer> alCust = new ArrayList<Customer>();

		alCust.add(new Customer(101, "Eon", "London"));

		alCust.add(new Customer(546, "Alan", "Pretoria"));
		
		alCust.add(new Customer(67, "Eon", "Nevada"));

		alCust.add(new Customer(94, "Alan", "Queensland"));

		alCust.add(new Customer(231, "Graeme", "Seoul"));

		alCust.add(new Customer(999, "Yurup", "Pyongyang"));

		alCust.add(new Customer(907, "Swanty", "Delhi"));
		
		alCust.add(new Customer(107, "Graeme", "Tokyo"));

		alCust.add(new Customer(899, "Yurup", "Melbourne"));

		alCust.add(new Customer(916, "Swanty", "New York"));


		Collections.sort(alCust, new CustIdSort());

		System.out.println("SORTING BY CUSTOMER ID");

		for (Customer custArrayList : alCust) {

			System.out.println(custArrayList);
		}

		System.out.println("************************");

		System.out.println("SORTING BY CUSTOMER NAME");

		Collections.sort(alCust, new CustNameSort());

		for (Customer custArrayList : alCust) {

			System.out.println(custArrayList);
		}

		System.out.println("************************");

		System.out.println("SORTING BY CUSTOMER CITY");

		Collections.sort(alCust, new CustCitySort());

		for (Customer custArrayList : alCust) {

			System.out.println(custArrayList);
		}

		
		System.out.println("************************");

		System.out.println("SORTING BY CUSTOMER NAME, IF NAME IS SAME THEN SORT BY CUSTOMER CITY");

		Collections.sort(alCust, new CustNameCitySort());

		for (Customer custArrayList : alCust) {

			System.out.println(custArrayList);
		}

	}

}
