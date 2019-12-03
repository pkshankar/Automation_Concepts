import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorRevision {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://freecrm.com/");
		// WebElement element = driver.findElement(By.xpath("//a[@title='free crm
		// home']"));
		// WebElement element = driver.findElement(By.xpath("//span[text()='Log In']"));
		// flashElement(element, driver);
		// drawBorder(element, driver);
		// generateAlertByJs(driver,"OOPS !! Error encountered");
		// clickElementByJs(element, driver);
		// refreshBrowserByJs(driver);
		// System.out.println(getPageTitleByJs(driver));
		//System.out.println(getPageInnerTextByJs(driver));
		//scrollDownByJs(driver);
		WebElement element = driver.findElement(By.xpath("//span[text()=' Register now']"));
		scrollIntoViewByJs(element, driver);

	}

	public static void flashElement(WebElement element, WebDriver driver) {

		String bgColor = element.getCssValue("backgroundColor");
		for (int count = 0; count < 10; count++) {

			changeColor("rgb(255,140,0)", element, driver);
			changeColor(bgColor, element, driver);

		}
	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
		try

		{

			Thread.sleep(200);
		} catch (Exception e) {

		}
	}

	public static void drawBorder(WebElement element, WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border= '3px solid red'", element);
	}

	public static void generateAlertByJs(WebDriver driver, String message) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");
	}

	public static void clickElementByJs(WebElement element, WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}

	public static void refreshBrowserByJs(WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeAsyncScript("history.go(0)");
	}

	public static String getPageTitleByJs(WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		return js.executeScript("return document.title;").toString();
	}

	public static String getPageInnerTextByJs(WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		return js.executeScript("return document.documentElement.innerText;").toString();
	}
	
	public static void scrollDownByJs(WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollIntoViewByJs(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
}
