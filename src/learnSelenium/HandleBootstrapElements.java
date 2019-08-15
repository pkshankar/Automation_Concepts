package learnSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootstrapElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\Selenium_Concepts\\Browser_Drivers\\ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();

		List<WebElement> list = driver.findElements(By.xpath("//label[@class='checkbox']/input[@type='checkbox']"));

		for (int i = 0; i < list.size(); i++) {

			if (!list.get(i).isSelected()) {

				list.get(i).click();
			}

		}

	}

}
