package learnSelenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HandleDynamicGoogleSearch {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\Selenium_Concepts\\Browser_Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.name("q")).sendKeys("Football");

		List<WebElement> wDropDownValues = driver
				.findElements(By.xpath("//ul[@role='listbox']/descendant::div[@class='sbl1']/child::span"));

		System.out.println(wDropDownValues.size());

		for (int i = 0; i < wDropDownValues.size(); i++) {

			List<WebElement> list = driver
					.findElements(By.xpath("//ul[@role='listbox']/descendant::div[@class='sbl1']/child::span"));

			if (list.get(i).getText().equalsIgnoreCase("football Match today")) {

				list.get(i).click();

				break;
			}
		}
	}

}
