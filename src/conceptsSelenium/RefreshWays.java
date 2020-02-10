package conceptsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshWays {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\MakeMyTrip_Framework\\Browser Drivers\\chromedriver_New.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(3000);
		//driver.navigate().refresh();
		//driver.get(driver.getCurrentUrl());
		//driver.navigate().to(driver.getCurrentUrl());
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.F5);

	}

}
