import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorRepeat {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement element = driver.findElement(By.name("q"));
		flash(element, driver);

	}

	public static void flash(WebElement element, WebDriver driver) {

		//JavascriptExecutor js = ((JavascriptExecutor) driver);
		
		String bgColor = element.getCssValue("backgroundColor");
		for (int count = 0; count < 1000; count++) {

			changeColor("rgb(255, 0, 0)", element, driver);
			changeColor(bgColor, element, driver);
		}
	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
		try {

			Thread.sleep(30);
		} catch (Exception e) {

		}
	}

}
