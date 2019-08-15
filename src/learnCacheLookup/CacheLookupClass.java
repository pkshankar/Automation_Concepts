package learnCacheLookup;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CacheLookupClass extends TestBase {

	PageFactoryClass pageFactoryClass;

	@BeforeMethod
	public void setUp() {

		initialization();
		pageFactoryClass = new PageFactoryClass();

	}

	@Test(priority=1)
	public void withoutCacheLookup() {

		long timeTaken = pageFactoryClass.withoutCacheLookup();
		System.out.println("WITHOUT CACHE LOOKUP - TIME TAKEN - " + timeTaken);

	}

	@Test(priority=2)
	public void withCacheLookup() {

		long timeTaken = pageFactoryClass.withCacheLookup();
		System.out.println("WITH CACHE LOOKUP - TIME TAKEN - " + timeTaken);

	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
