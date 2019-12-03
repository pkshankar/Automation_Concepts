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

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\MakeMyTrip_Framework\\Browser Drivers\\chromedriver_New.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("ALL LINKS : " + allLinks.size());
		List<WebElement> activeLinks = new ArrayList();
		for (int i = 0; i < allLinks.size(); i++) {

			if (allLinks.get(i).getAttribute("href") != null) {
				System.out.println(allLinks.get(i).getAttribute("href"));
				activeLinks.add(allLinks.get(i));
			}
		}

		System.out.println("ACTIVE LINKS : " + activeLinks.size());
		for (int j = 0; j < activeLinks.size(); j++) {

			HttpURLConnection con = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href"))
					.openConnection();
			con.connect();
			System.out.println(activeLinks.get(j).getAttribute("href")+"----------"+con.getResponseMessage());
			con.disconnect();
		}

	}

}
