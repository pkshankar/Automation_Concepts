package learnDataProvider;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Registration {

	WebDriver driver;

	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\Browser_Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://register.rediff.com/commonreg/index.php");

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	@DataProvider
	public Iterator<String[]> getTestData() throws FileNotFoundException, IOException {
		
		ArrayList<String[]> al = FetchDataExcel.dataGet();
		
		return al.iterator();
		
		
	}

	@Test(dataProvider = "getTestData")
	public void rediffMailRegistrationTest(String fName, String emailId, String pWord, String rPwd) {

		driver.findElement(By.id("fullname")).sendKeys(fName);

		driver.findElement(By.id("emailid")).sendKeys(emailId);

		driver.findElement(By.id("pass")).sendKeys(pWord);

		driver.findElement(By.id("repass")).sendKeys(rPwd);

	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
