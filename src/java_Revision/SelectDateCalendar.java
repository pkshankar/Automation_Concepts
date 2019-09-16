package java_Revision;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectDateCalendar {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		int counter = 0;
		ArrayList<String> monthList = new ArrayList<String>();
		ArrayList<String> yearList = new ArrayList<String>();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\src\\java_Revision\\months.properties");
		prop.load(fis);
		String date = "27-September-2019";
		String dateArr[] = date.split("-");

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\Enrich_Automation_Framework\\Browser Drivers\\geckodriver.exe");

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a/i[@class='icon ir datePicker'])[1]")).click();
		while (driver.findElement(By.xpath("//a[@data-handler='next']")).isDisplayed()) {

		}
		
	}
	
}