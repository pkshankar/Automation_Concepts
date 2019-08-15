package comparatorConcept;

import java.util.Comparator;

public class CustIdSort implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {

		if (c1.getCustId() > c2.getCustId())

			return 1;

		else if (c1.getCustId() < c2.getCustId())

			return -1;

		else
			return 0;
	}

}
