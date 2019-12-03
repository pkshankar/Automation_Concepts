import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorConcept {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://freecrm.com/");
		// WebElement element = driver.findElement(By.name("q"));
		// flash(element, driver);
		// drawBorder(element, driver);
		// generateAlert(driver, "issue with element");
		//driver.manage().window().maximize();

		//WebElement element =  driver.findElement(By.name("btnI"));
		//clickElementByJS(element, driver);
		
		WebElement element = driver.findElement(By.xpath("//span[text()=' Register now']"));
		scrollIntoView(element, driver);
		//Thread.sleep(5000);
		//scrollPageDown(driver);
		 
		// clickElementByJS(element, driver);
		// refreshBrowserByJS(driver);
		// System.out.println(getTitleByJS(driver));
		//System.out.println(getPageInnerText(driver));

	}

	public static void flash(WebElement element, WebDriver driver) {

		// JavascriptExecutor js = ((JavascriptExecutor)driver);
		String bgColor = element.getCssValue("backgroundColor");
		for (int count = 0; count < 100; count++) {

			changeColor("rgb(0, 0, 255)", element, driver);
			changeColor(bgColor, element, driver);

		}

	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

		try {

			Thread.sleep(20);
		} catch (InterruptedException e) {

		}

	}

	public static void drawBorder(WebElement element, WebDriver driver) throws IOException {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		takeScreenshot(element, driver);

	}

	public static void takeScreenshot(WebElement element, WebDriver driver) throws IOException {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,
				new File("C:\\Users\\pkshank\\eclipse-workspace\\Automation_Concepts\\myFolder\\screenshot.png"));
	}

	public static void generateAlert(WebDriver driver, String message) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");
	}

	public static void clickElementByJS(WebElement element, WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);

	}

	public static void refreshBrowserByJS(WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}

	public static String getTitleByJS(WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}

	public static String getPageInnerText(WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		return js.executeScript("return document.documentElement.innerText;").toString();

	}
	
	public static void scrollPageDown(WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight )");
		//js.executeScript("window.scrollTo(0, 1000)");
		
		
	}
	
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
}
