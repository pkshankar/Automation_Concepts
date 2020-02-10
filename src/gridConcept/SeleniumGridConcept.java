package gridConcept;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridConcept {

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();
		//DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.MAC);
		

		ChromeOptions options = new ChromeOptions();
		options.merge(cap);

		String hubUrl = "http://10.207.184.38:4444/wd/hub";
		//System.out.println(hubUrl);

		WebDriver driver = new RemoteWebDriver(new URL(hubUrl), cap);
		
		driver.get("www.google.com");
		
//			String URL = "http://www.DemoQA.com";
//		 String Node = "http://10.207.184.38:4444/wd/hub";
//		 DesiredCapabilities cap = DesiredCapabilities.firefox();
//		 
//		 WebDriver driver = new RemoteWebDriver(new URL(Node), cap);
//		 
//		 driver.navigate().to(URL);
//		 
//		 driver.quit();
	}

}
