package learnTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardSoftAssert {
	
	SoftAssert softAssert = new SoftAssert();

	@Test
	public void assertionsConcept() {

		System.out.println("Assertions line 1");

		System.out.println("Assertions line 2");

		softAssert.assertTrue(false); /* Soft Assertion */

		System.out.println("Assertions line 3");
		
		Assert.assertTrue(false); /* Hard Assertion */

		System.out.println("Assertions line 4");
		
		softAssert.assertAll();
	}

}
