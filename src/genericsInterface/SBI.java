package genericsInterface;

public class SBI<E, T> implements FinancialInstitution<E, T> {

	@Override
	public void printBankCustomerDetails(E e, T t) {

		System.out.println("BANK CUSTOMER DETAILS : " + e + " : " + t);

	}

}
