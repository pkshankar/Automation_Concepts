package conceptsSelenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\MakeMyTrip_Framework\\Browser Drivers\\chromedriver_New.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("ALL LINKS : " + allLinks.size());
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		for(WebElement w : allLinks) {
			
			if(w.getAttribute("href")!=null && (!w.getAttribute("href").contains("javascript"))) {
				
				activeLinks.add(w);
			}
		}
		
		System.out.println("ACTIVE LINKS : " + activeLinks.size());
		
		for(WebElement we : activeLinks) {
			
			HttpURLConnection conn = (HttpURLConnection)new URL(we.getAttribute("href")).openConnection();
			conn.connect();
			conn.getResponseMessage();
			if(conn.getResponseMessage().equals("OK")) {
				
				System.out.println(we.getText());
			}
			conn.disconnect();
		}
		
		
	}

}
