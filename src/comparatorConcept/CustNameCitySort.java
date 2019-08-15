package comparatorConcept;

import java.util.Comparator;

public class CustNameCitySort implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {

		if (c1.getCustName().compareTo(c2.getCustName()) > 0) {

			return 1;
		}

		else if (c1.getCustName().compareTo(c2.getCustName()) < 0) {

			return -1;
		}

		else

			return (c1.getCustCity().compareTo(c2.getCustCity()));

	}

}
