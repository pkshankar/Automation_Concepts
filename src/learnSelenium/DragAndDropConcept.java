package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkshank\\eclipse-workspace"
				+ "\\Java_Selenium_Concepts\\Browser_Drivers\\chromedriver.exe");

		WebDriver dr = new ChromeDriver();

		dr.get("https://jqueryui.com/droppable/");

		dr.manage().window().maximize();
		
		dr.manage().deleteAllCookies();

		dr.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		dr.switchTo().frame(0); 

		Actions action = new Actions(dr);
		
		// action.dragAndDrop(dr.findElement(By.id("draggable")), dr.findElement(By.id("droppable"))).build().perform();
		
		action.clickAndHold(dr.findElement(By.id("draggable"))).
		moveToElement(dr.findElement(By.id("droppable"))).release().build().perform();
		
		dr.quit();

	}

}
