package disableImagesChromeFirefox;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeImagesDisable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\Browser_Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		disbleImagesOnChrome(options);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.com");
		driver.manage().window().fullscreen();
		

	}

	public static void disbleImagesOnChrome(ChromeOptions options) {

		HashMap<String, Object> hMap1 = new HashMap<String, Object>();
		hMap1.put("images", 2);
		HashMap<String, Object> hMap2 = new HashMap<String, Object>();
		hMap2.put("profile.default_content_setting_values", hMap1);
		options.setExperimentalOption("prefs", hMap2);

	}

}
