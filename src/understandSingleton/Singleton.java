package understandSingleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Singleton {

	private static Singleton singleton = null;

	private Singleton() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

	public static Singleton getInstance() {

		if (singleton == null) {

			singleton = new Singleton();
		}

		return singleton;
	}

}
