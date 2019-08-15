package learnSelenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotConcept {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkshank\\eclipse-workspace"
				+ "\\Java_Selenium_Concepts\\Browser_Drivers\\chromedriver.exe");

		WebDriver dr = new ChromeDriver();

		dr.manage().window().maximize();

		dr.manage().deleteAllCookies();

		dr.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		dr.get("https://www.google.com/");
		
		File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C:\\Users\\pkshank\\eclipse-workspace\\Java_Selenium_Concepts\\src\\Screenshots\\google.png"));

	}

}
