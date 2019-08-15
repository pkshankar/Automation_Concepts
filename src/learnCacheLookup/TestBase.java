package learnCacheLookup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestBase {
	
	public static WebDriver driver;
	
	
	public void initialization() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\" + "eclipse-workspace\\Automation_Concepts\\Browser_Drivers\\chromedriver.exe");

		System.setProperty("webdriver.chrome.logfile", "Logfile.txt");

		driver = new ChromeDriver();

		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	

}
