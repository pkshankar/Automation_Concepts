package learnSelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropertiesFile {

	static WebDriver dr;

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\pkshank\\eclipse-workspace\\Java_Selenium_Concepts\\src\\seleniumConcepts\\test.properties");

		prop.load(fis);

		if (prop.getProperty("browser").equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkshank\\eclipse-workspace"
					+ "\\Java_Selenium_Concepts\\Browser_Drivers\\chromedriver.exe");

			dr = new ChromeDriver();

		}

		else if (prop.getProperty("browser").equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\pkshank\\eclipse-workspace\\Java_Selenium_Concepts\\Browser_Drivers\\geckodriver.exe");

			dr = new FirefoxDriver();

		}
		
		dr.get(prop.getProperty("url"));
		
		dr.findElement(By.id(prop.getProperty("Search_box_id"))).sendKeys(prop.getProperty("text"));
		
		dr.findElement(By.xpath(prop.getProperty("Search_click_xpath"))).click();
		
		dr.quit();

	}

}
