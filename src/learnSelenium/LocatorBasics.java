package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LocatorBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkshank\\eclipse-workspace"
				+ "\\Java_Selenium_Concepts\\Browser_Drivers\\chromedriver.exe");

		WebDriver dr = new ChromeDriver();

		dr.get("https://www.amazon.in/");

		dr.manage().window().maximize();

		dr.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Actions action = new Actions(dr);

		action.moveToElement(dr.findElement(By.id("nav-link-accountList"))).build().perform();

		dr.findElement(By.linkText("Start here.")).click();

		// dr.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("John");

		dr.findElement(By.cssSelector("input[id='ap_customer_name']")).sendKeys("Peter");

		Select selectCountryCode = new Select(dr.findElement(By.id("auth-country-picker")));

		selectCountryCode.selectByVisibleText("ID +62");

		dr.quit();

	}

}
