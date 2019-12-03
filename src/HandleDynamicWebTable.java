import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicWebTable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pkshank\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");
		driver.findElement(By.name("email")).sendKeys("shankarpk89@gmail.com");
		driver.findElement(By.name("password")).sendKeys("freecrm@Pks89");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();
		driver.navigate().refresh();
		// Thread.sleep(5000);
		clickElement("Suresh Jain", driver);
		clickElement("Shankar P K", driver);
		
		//td[text()=" + "'" + name + "'" + "]/parent::tr/child::td[1]/child::div/input

	}

	public static void clickElement(String name, WebDriver driver) {

		//System.out.println(name);
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();",
				driver.findElement(By.xpath("//td[text()="+"'"+name+"'"+"]/parent::tr/child::td[1]/child::div/input")));

	}

}
