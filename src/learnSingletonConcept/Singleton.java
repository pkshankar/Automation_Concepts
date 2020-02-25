package learnSingletonConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Singleton {

	private static Singleton singleton = null;
	private WebDriver driver;

	private Singleton() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\Browser_Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

	public static Singleton getInstance() {

		if (singleton == null) {

			singleton = new Singleton();
		}

		return singleton;

	}

}
