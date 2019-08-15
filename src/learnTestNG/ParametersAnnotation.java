package learnTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersAnnotation {

	WebDriver driver;

	@Test
	@Parameters({ "url", "uname", "pwd" })
	public void yahooLogin(String webUrl, String userName, String passWord) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\Selenium_Concepts\\Browser_Drivers\\ChromeDriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get(webUrl);

		System.out.println(driver.getTitle());

		driver.findElement(By.id("login1")).sendKeys(userName);

		driver.findElement(By.id("password")).sendKeys(passWord);

		driver.findElement(By.name("proceed")).click();

		driver.quit();

	}

}
