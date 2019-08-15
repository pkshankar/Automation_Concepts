package learnSelenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	int x;

	@BeforeSuite
	public void beforeSuite() {

		System.out.println("Before Suite");
	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("Before Method");
	}

	@Test
	public void test1() {

		System.out.println("Test1 "+ x);
	}

	@Test
	public void test2() {

		System.out.println("Test2");
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("After Method");
	}

	@AfterSuite
	public void afterSuite() {

		System.out.println("After Suite");
	}

	@BeforeClass
	public void beforeClass() {

		System.out.println("Before Class");
	}

	@AfterClass
	public void afterClass() {
		
		x = 100;

		System.out.println("After Class");
	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {

		System.out.println("After Test");
	}
	
	@Test
	public void test3() {

		System.out.println("Test3");
	}

}
