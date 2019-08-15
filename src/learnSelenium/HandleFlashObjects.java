package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class HandleFlashObjects {

	public static void main(String[] args) throws FindFailed {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\Selenium_Concepts\\Browser_Drivers\\ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/watch?v=P9ZWOWm7i0k");

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Screen s = new Screen();
		
		Pattern pauseImg = new Pattern("C:\\Users\\pkshank\\eclipse-workspace\\Selenium_Concepts\\src\\Screenshots\\Pause.PNG");
		
		s.wait(pauseImg, 2000);
		
		s.click();
		
		//s.click();


	}

}
