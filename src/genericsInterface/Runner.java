package genericsInterface;

import org.apache.poi.hdgf.streams.StringsStream;

public class Runner {

	public static void main(String[] args) {

		SBI<String, Integer> customerName = new SBI<>();
		customerName.printBankCustomerDetails("Peter", 123);
	

	}

}
