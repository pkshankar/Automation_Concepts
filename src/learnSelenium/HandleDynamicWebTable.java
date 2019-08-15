package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleDynamicWebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\Selenium_Concepts\\Browser_Drivers\\ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://ui.freecrm.com/");

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shankarpk89@gmail.com");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("freecrm@Pks89");

		driver.findElement(By.xpath("//div[text()='Login']")).click();

		driver.findElement(By.xpath("//span[text()='Contacts']")).click();

		Actions mouseMovement = new Actions(driver);

		WebElement wElement1 = driver.findElement(By.xpath(
				"//td[text()='zubair bablu']/preceding-sibling::td/child::div/child::input[@name='id' and @type='checkbox']"));

		mouseMovement.moveToElement(wElement1).click().build().perform();
		
		WebElement wElement2 = driver.findElement(By.xpath(
				"//td[text()='Suresh Jain']/preceding-sibling::td/child::div/child::input[@name='id' and @type='checkbox']"));

		mouseMovement.moveToElement(wElement2).click().build().perform();


	}

}
