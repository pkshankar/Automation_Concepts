package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkshank\\eclipse-workspace"
				+ "\\Java_Selenium_Concepts\\Browser_Drivers\\chromedriver.exe");

		WebDriver dr = new ChromeDriver();

		dr.get("https://html.com/input-type-file/");

		dr.manage().window().maximize();

		dr.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		dr.findElement(By.id("fileupload")).sendKeys("C:\\Users\\pkshank\\Desktop\\test.txt");


	}

}
