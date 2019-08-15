package failedCasesScreenshots;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class TestCases {

	static WebDriver driver;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\Browser_Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test
	public void gmailLinkTest() {

		driver.get("https://www.google.com/");

		driver.findElement(By.linkText("mail"))
				.isDisplayed(); /* This test case will fail as link text is 'Gmail' not 'mail' */

	}

	@Test
	public void facebookForgottenAccountTest() {

		driver.get("https://www.facebook.com/");

		driver.findElement(By.linkText("Forgotten account?"))
				.isDisplayed(); /*
								 * This test case will fail as link text is 'Forgotten account?' not 'Forgot
								 * account?'
								 */

	}

	@Test
	public void rediffHomeLinkTest() {

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.linkText("ome"))
				.isDisplayed(); /* This test case must pass */

	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
