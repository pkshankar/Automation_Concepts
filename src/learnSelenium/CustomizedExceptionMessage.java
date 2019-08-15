package learnSelenium;

public class CustomizedExceptionMessage {

	public static void main(String[] args) throws Exception {

		try {

			int i = 10 / 0;

			System.out.println(i);
		}

		catch (Exception e) {

			throw new Exception("Divide by zero not allowed");
			
			//e.printStackTrace();

		}

	}

}
