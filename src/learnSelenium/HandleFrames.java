package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkshank\\eclipse-workspace"
				+ "\\Java_Selenium_Concepts\\Browser_Drivers\\chromedriver.exe");

		WebDriver dr = new ChromeDriver();

		dr.get("https://www.toolsqa.com/iframe-practice-page/");

		dr.manage().window().maximize();

		dr.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		dr.switchTo().frame(dr.findElement(By.id("IF1")))
				.findElement(By.xpath("//span[text()='Software Testing Tutorial']")).click();
		
		System.out.println(dr.findElement(By.xpath("//h1[text()='Software Testing Tutorial']")).getText());
		
		dr.switchTo().parentFrame();
		
		System.out.println(dr.getTitle());
		
		System.out.println(dr.switchTo().frame(dr.findElement(By.id("IF2"))).findElement(By.xpath("//h3[text()='Interactions']")).getText());
		
		dr.switchTo().parentFrame();
		
		System.out.println(dr.getTitle());
		
		dr.quit();

	}

}
