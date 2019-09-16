package java_Revision;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindBrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\Enrich_Automation_Framework\\Browser Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		for (int i = 0; i < allLinks.size(); i++) {

			if (allLinks.get(i).getAttribute("href") != null) {

				activeLinks.add(allLinks.get(i));

			}
		}

		for (int j = 0; j < activeLinks.size(); j++) {

			HttpURLConnection conn = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href"))
					.openConnection();
			conn.connect();
			conn.getResponseMessage();
			System.out.println(conn.getResponseMessage() + " - " + activeLinks.get(j).getAttribute("href"));
			conn.disconnect();
		}

	}

}
