package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleStaleElementException {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\Selenium_Concepts\\Browser_Drivers\\ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement wInputBox = driver.findElement(By.name("q"));

		wInputBox.sendKeys("qtp", Keys.ENTER);

		driver.navigate().back();
		
		/* After the back operation is performed, HTML DOM of the page changes and because of this 'wInputBox' cannot be used to perform any action on input search box
		 of google home page. User must create a new reference of the object which was refreshed during the page refresh operation if any action needs to performed on the
		 refreshed object */
		
		
		WebElement wSearchBox = driver.findElement(By.name("q"));

		wSearchBox.sendKeys("selenium", Keys.ENTER);

	}

}
