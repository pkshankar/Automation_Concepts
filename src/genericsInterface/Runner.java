package genericsInterface;

public class Runner {

	public static void main(String[] args) {

		SBI<String, Integer> customerName = new SBI<>();
		customerName.printBankCustomerDetails("Peter", 123);

	}

}
