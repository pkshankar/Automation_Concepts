package learnTestNG;

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

public class DataProviderTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/account/create?specId=yidReg");

	}

//	@DataProvider
//	public Object[][] getData() throws Exception {
//
//		Object[][] yahooRegDetails = YahooUtil.getDataTwoDArray();
//		return yahooRegDetails;
//
//	}

	@DataProvider
	public Iterator<String[]> getData() throws Exception {

		ArrayList<String[]> al = YahooUtil.getDataArrayList();
		return al.iterator();
	}

	@Test(dataProvider = "getData")
	public void createYahooAccount(String firstName, String lastName, String emailAddress, String password) {

		driver.findElement(By.id("usernamereg-firstName")).sendKeys(firstName);
		driver.findElement(By.id("usernamereg-lastName")).sendKeys(lastName);
		driver.findElement(By.id("usernamereg-yid")).sendKeys(emailAddress);
		driver.findElement(By.id("usernamereg-password")).sendKeys(password);

	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
