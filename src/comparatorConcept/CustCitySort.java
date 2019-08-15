package comparatorConcept;

import java.util.Comparator;

public class CustCitySort implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {

		return (c1.getCustCity().compareTo(c2.getCustCity()));

	}

}
