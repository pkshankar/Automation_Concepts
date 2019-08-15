package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForwardSimulation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkshank\\eclipse-workspace"
				+ "\\Java_Selenium_Concepts\\Browser_Drivers\\chromedriver.exe");

		WebDriver dr = new ChromeDriver();

		dr.manage().window().maximize();

		dr.manage().deleteAllCookies();

		dr.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		dr.get("https://www.google.com/");
		
		System.out.println(dr.getTitle());
		
		dr.navigate().to("https://www.amazon.in/");
		
		System.out.println(dr.getTitle());
		
		dr.navigate().back();
		
		System.out.println(dr.getTitle());
		
		dr.navigate().forward();
		
		System.out.println(dr.getTitle());



	}

}
