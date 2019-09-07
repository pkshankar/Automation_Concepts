package specialLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByChained;

public class MoreLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		driver.manage().window().maximize();
//		driver.findElement(new ByAll(By.name("email"), By.xpath("//input[@type='text']"))).sendKeys("Shankar");

//		driver.findElement(new ByIdOrName("email")).sendKeys("Shankar");

		driver.findElement(new ByChained(By.xpath("//div[@class='ui left icon input']"),
				By.xpath("//i[@class='user icon']"), By.xpath("//input[@type='text']"))).sendKeys("Shankar");

	}

}
