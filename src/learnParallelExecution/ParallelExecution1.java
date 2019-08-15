package learnParallelExecution;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ParallelExecution1 {

	
	static WebDriver driver;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\Browser_Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("Before Thread "+ Thread.currentThread().getId());

	}

	@Test
	public void gmailLinkTest() {

		driver.get("https://www.google.com/");

		Assert.assertTrue(driver.findElement(By.linkText("Gmail"))
				.isDisplayed()); 
		
		
		System.out.println("gmailLinkTest "+ Thread.currentThread().getId());

	}

	@Test
	public void facebookForgottenAccountTest() {

		driver.get("https://www.facebook.com/");

		Assert.assertTrue(driver.findElement(By.linkText("Forgotten account?"))
				.isDisplayed()); 

		System.out.println("facebookForgottenAccountTest "+ Thread.currentThread().getId());
	}

	@Test
	public void rediffHomeLinkTest() {

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		Assert.assertTrue(driver.findElement(By.linkText("Home"))
				.isDisplayed()); 
		
		System.out.println("rediffHomeLinkTest "+ Thread.currentThread().getId());

	}

	@AfterMethod
	public void tearDown() {
		
		System.out.println("After Thread "+ Thread.currentThread().getId());

		driver.quit();
	}

}
