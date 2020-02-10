package learnTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGParent {

	@BeforeSuite
	public void beforeSuite() {

		System.out.println("BEFORE SUITE");
	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("BEFORE TEST");
	}

	@BeforeClass
	public void beforeClass() {

		System.out.println("BEFORE CLASS");

	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("BEFORE METHOD");
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("AFTER METHOD");
	}

	@AfterClass
	public void afterClass() {

		System.out.println("AFTER CLASS");
	}

	@AfterTest
	public void afterTest() {

		System.out.println("AFTER TEST");
	}

	@AfterSuite
	public void afterSuite() {

		System.out.println("AFTER SUITE");
	}
}
