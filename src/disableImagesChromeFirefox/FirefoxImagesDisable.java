package disableImagesChromeFirefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FirefoxImagesDisable {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\Browser_Drivers\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		disableImagesonFirefox(options);
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://www.amazon.com");
		driver.manage().window().fullscreen();

	}

	public static void disableImagesonFirefox(FirefoxOptions options) {

		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("permissions.default.image", 2);
		options.setProfile(profile);
		options.setCapability(FirefoxDriver.PROFILE, profile);

	}

}
