package findBrokenLinksAndImages;

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
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksAndImages {

	public static void main(String[] args) {

		List<WebElement> listActiveLinks = new ArrayList<WebElement>();
		List<WebElement> listActiveImages = new ArrayList<WebElement>();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts" + "\\Browser_Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		List<WebElement> listAllLinks = driver.findElements(By.tagName("a")); // finding all links and adding to a list
																				// of webelement

		List<WebElement> listAllImages = driver.findElements(By.tagName("img"));

		System.out.println("NO. OF LINKS ON AMAZON HOME PAGE: " + listAllLinks.size());
		System.out.println("NO. OF IMAGES ON AMAZON HOME PAGE: " + listAllImages.size());

		// find those links whose href attribute is not blank

		for (WebElement w : listAllLinks) {

			if (w.getAttribute("href") != null && (!w.getAttribute("href").contains("javascript"))) {

				listActiveLinks.add(w);

			}
		}

		// find those images whose src attribute is not blank

		for (WebElement w : listAllImages) {

			if (w.getAttribute("src") != null && (!w.getAttribute("src").contains("javascript"))) {

				listActiveImages.add(w);

			}
		}

		// finding links which are not broken

		System.out.println("LINKS");

		for (int i = 0; i < listAllLinks.size(); i++) {

			try {
				HttpURLConnection connection = (HttpURLConnection) new URL(listAllLinks.get(i).getAttribute("href"))
						.openConnection();

				connection.connect();
				System.out.println(
						connection.getResponseMessage() + " -------" + listAllLinks.get(i).getAttribute("href"));
				connection.disconnect();

			} catch (MalformedURLException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

		// finding links which are not broken

		System.out.println("**************************************************************");

		System.out.println("IMAGES");

		for (int j = 0; j < listActiveImages.size(); j++) {

			try {
				HttpURLConnection conn = (HttpURLConnection) new URL(listActiveImages.get(j).getAttribute("src"))
						.openConnection();
				conn.connect();
				System.out
						.println(conn.getResponseMessage() + " -------" + listActiveImages.get(j).getAttribute("src"));
				conn.disconnect();

			} catch (MalformedURLException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

		driver.quit();

	}

}
