package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowserChrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\Selenium_Concepts\\Browser_Drivers\\ChromeDriver.exe");

		ChromeOptions options = new ChromeOptions();

		options.addArguments("window-size=1400,800");

		options.addArguments("headless");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");

		System.out.println(driver.getTitle());

		driver.navigate().to("https://www.amazon.in/");

		System.out.println(driver.getTitle());

		driver.navigate().back();

		System.out.println(driver.getTitle());

		driver.navigate().forward();

		System.out.println(driver.getTitle());

	}

}
