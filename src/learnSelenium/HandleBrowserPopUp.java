package learnSelenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkshank\\eclipse-workspace"
				+ "\\Java_Selenium_Concepts\\Browser_Drivers\\chromedriver.exe");

		WebDriver dr = new ChromeDriver();

		dr.manage().window().maximize();

		dr.get("https://www.naukri.com/");

		dr.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Set<String> wId = dr.getWindowHandles();

		Iterator<String> itr = wId.iterator();

		String parentW = itr.next();

		String childW1 = itr.next();

		String childW2 = itr.next();

		String childW3 = itr.next();

		dr.switchTo().window(childW1);

		System.out.println(dr.getTitle());

		dr.close();

		dr.switchTo().window(parentW);

		System.out.println(dr.getTitle());

		dr.switchTo().window(childW2);

		System.out.println(dr.getTitle());

		dr.close();

		dr.switchTo().window(parentW);

		System.out.println(dr.getTitle());

		dr.switchTo().window(childW3);

		System.out.println(dr.getTitle());

		dr.close();

		dr.switchTo().window(parentW);

		System.out.println(dr.getTitle());

		dr.quit();

	}

}
