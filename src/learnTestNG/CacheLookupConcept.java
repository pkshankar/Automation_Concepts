package learnTestNG;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CacheLookupConcept {

	WebDriver driver;

	@FindBy(name = "q")
	@CacheLookup
	WebElement searchBox;

	public CacheLookupConcept() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\MakeMyTrip_Framework\\Browser Drivers\\chromedriver_New.exe");

		driver = new ChromeDriver();

		PageFactory.initElements(driver, this);
	}

	@Test
	public void enterText() {

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		for (int i = 0; i < 1000; i++) {

			searchBox.sendKeys("Selenium");
			searchBox.clear();

		}

	}

}
