package learnParallelExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelExecution2 {
	
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
	public void googleBusiness() {
		
		driver.get("https://www.google.com/");
		
		Assert.assertTrue(driver.findElement(By.linkText("Business")).isDisplayed());
		
		System.out.println("googleBusiness "+ Thread.currentThread().getId());
		
		
	}
	
	@Test
	public void googleAdvertising() {
		
		driver.get("https://www.google.com/");
		
		Assert.assertTrue(driver.findElement(By.linkText("Advertising")).isDisplayed());
		
		System.out.println("googleAdvertising "+ Thread.currentThread().getId());
		
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		System.out.println("After Thread "+ Thread.currentThread().getId());

		driver.quit();
	}


}
