package comparatorConcept;

import java.util.Comparator;

public class CustNameSort implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		
		return (c1.getCustName().compareTo(c2.getCustName()));
		
	}

}
